import java.io.*;

/*
序列化和反序列化：

    序列化：Serialize  java对象存储到文件中，将java对象的状态保存下来的过程

    反序列化：DeSerialize  将硬盘上的数据重新恢复到内存当中，恢复成java对象


注意：java.io.NotSerializableException: Student  这个类的对象不支持序列化


参与序列化和反序列化的时候，类必须实现Serializable接口


注意：通过源代码发现：Serializable只是一个标志接口

            public interface Serializable {
            }

        这个接口中什么都没有，那么他的作用是什么？

        起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊的待遇

        Serializable这个标志接口是给java虚拟机参考的，java虚拟机看到这个接口之后，会为该类自动生成一个序列化版本号


java中有两种接口：普通接口+标志接口（没有方法）



序列化版本号有什么用？

    如果将一个类的对象进行序列化，用ObjectOutputStream进行对象的序列化，可以正常的反编译。

    之后，我对原始的类进行修改，然后再记性反编译的话（源代码改动了，需要重新编译，编译之后生成了全新的字节码文件，

    并且class文件再次运行的时候，java虚拟机生成的序列化版本号也会发生相应的改变），就会出现找不到类的错误：

    java.io.InvalidClassException: Student;
        local class incompatible:
            stream classdesc serialVersionUID = 6845409090868647, ----》修改之后
            local class serialVersionUID = -5792170941352848116----》修改之前保存的序列化的结果


     这是因为：java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号

     如果没有手动将这个序列化版本号写出来的话，java虚拟机就会自动生成一个序列化版本号

     建议将序列化版本号手动写出来，不建议自己生成。


java语言中采用什么机制来区分两个类的？

        第一：首先通过类名进行对比，类名不一样，肯定不是一个类

        第二：如果类名一样，再怎么进行类的区别？  靠序列化版本号进行区分

        如果两个人都写了同样的一个类，但是这两个类的内部确实有些不同，这个时候，序列化版本号就起作用了，

        对于java虚拟机来说，java虚拟机是可以区分这两个类的，因为这两个类都实现了Serializable接口，

        都有默认的序列化版本号，这个号不一样，所以区分开了，这是自动生成序列化版本号的好处。


自动生成序列化版本号的坏处：

    一旦代码生成，不能进行后续的修改。

    只要一修改，必然会重新编译，此时会生成全新的序列化版本号，这两个版本号是不一样的，所以，java虚拟机认为这是一个全新的类，这样就不好了。

    所以建议自己手写一个序列化版本号，这样，再修改也还是被认为是同一个类，还能进行反编译


最终结论：

    凡是一个类实现了Serializable接口，建议给该类提供一个固定不变的序列化版本号，

    这样，以后这个类即使代码修改了，但是版本号不变，java虚拟机会认为是同一个类

* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
//        创建对象
        Student s=new Student("张三",25);


        ObjectOutputStream oos=null;
        try {
//        序列化
            oos=new ObjectOutputStream(new FileOutputStream("ObjectOutputStreamTest01"));

//            序列化对象
            oos.writeObject(s);

//            刷新
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Student implements Serializable {//java虚拟机看到Serializable接口之后，会为该类自动生成一个序列化版本号。

//    手动添加序列化版本号：----一般自己手写
//    private static final long serialVersionUID=1L;//java虚拟机识别到一个类的时候先通过类名，然后通过序列号进行对比是不是一个类

//    IDEA可以自动生成序列化版本号：
    @Serial
    private static final long serialVersionUID = -5792170941352848116L;//具有全球唯一性

    // 没有手动写出来，java虚拟机会默认提供这个序列化版本号
    private String name;
    private int age;

//    当我添加一个新的属性进来，相当于修改了原来的类：
    int no;

    public Student(){}
    public Student(String name,int age) {
        this.age=age;
        this.name=name;
//        this.name="****";----添加了序列号之后，就算再在这里进行修改，还是能进行反编译
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public String toString(){
        return this.name+":"+this.age;
    }
}