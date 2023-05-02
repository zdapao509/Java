/*
可以一次性序列化多个对象吗？

    可以的，可以将对象放在集合中 ，序列化集合

提示：

    参与序列化的ArrayList集合以及集合中的元素User类都需要实现Sreializable接口


关于transient关键字：

    游离状态，不参与序列化过程。属性一旦接了这个关键字的时候，在进行序列化的时候，该属性不进行序列化

* */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> user=new ArrayList<>();
        user.add(new User("zhang",10));
        user.add(new User("lisi",50));
        user.add(new User("wangwu",100));

        for (User u:user) {
            System.out.println(u);
            /*
            zhang:10
            lisi:50
            wangwu:100
            * */
        }

        ObjectOutputStream ois=null;
        try {
//            创建输出流对象
            ois=new ObjectOutputStream(new FileOutputStream("ObjectOutputStreamTest02"));

//            序列化一个集合，集合对象中放了很多其他对象
            ois.writeObject(user);

//            刷新
            ois.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class User implements Serializable{
    private transient String name;//游离状态，不参与序列化
    private int no;
    public User(){}
    public User(String name,int no) {
        this.name=name;
        this.no=no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getNo(){
        return no;
    }
    public void setNo(int no) {
        this.no=no;
    }
    public String toString(){
        return this.name+":"+no;
    }
}
