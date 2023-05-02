/*
final修饰的变量，如果这个变量是一个引用，会怎么样

    重点：final修饰的变量只能赋值一次

    显然：引用也是变量

final修饰的引用：

    该引用只能指向1个对象，并且只能永远指向该对象，无法再指向其他对象。

    在该方法执行过程中，该引用指向对象之后，该对象不会被垃圾回收器回收。直到当前的方法结束，才会释放空间

    虽然final的引用指向对象A后，不能再重新指向对象B，但是对象A内部的数据，是可以被修改的。
* */
public class FinalTest02 {
    int a;
    public static void main(String[] args) {

//        System.out.println("a:"+a);这里注意：静态方法，不能访问实例变量；成员变量：实例变量+静态变量

        Person P1=new Person(30);
        System.out.println(P1.age);

        final Person P2=new Person(40);
//        P2=new Person(35);错误：java: 无法为最终变量P2分配值
        //代码不管怎么变，p也是一个变量；只不过这里他有一个特殊的名字：引用
//        P2=null;这里，就算是null也不能再赋给P2
        P2.age=56;
        System.out.println(P2.age);
    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}