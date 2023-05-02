/*
测试contains方法

     放在集合中的类型要重写equals方法
* */


import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest06 {
    public static void main(String[] args) {
//        创建集合对象：
        Collection e=new ArrayList();
//        创建用户对象：
        User a1=new User("jack");
        User a2=new User("jack");

        e.add(a1);
//        判断e中是否包含a2：
        System.out.println(e.contains(a2));//true

        //如果上面的User类不重写equals方法，这里就会是false：
        // 原因：字符串类型重写了equals方法，比较的是字符串本身。但是这里得对象，并没有重写equals方法，
        // 所以，当contains方法调用equals方法的时候，调的是Object的equals方法，比较的是两个内存地址

        e.remove(a2);
        System.out.println(e.size());//0----------这里remove方法调用了equals方法，所以，删除a2等同于删除a1。----User中的equals方法已经被重写了


//        重写之后，为true


        Integer a3=new Integer(10);
        Integer a4=new Integer(10);

        e.add(a3);
        System.out.println(e.contains(a4));//true       注意：包装类中重写了equals方法



//        创建一个集合对象：
        Collection x=new ArrayList();
//        创建字符创对象：
        String s1=new String("hello");
        x.add(s1);
//        创建字符串对象：
        String s2=new String("hello");
        x.remove(s2);//注意：这里的remove方法底层调用了equals方法，目的是不仅仅比较对象的内存地址，而是保存的真实的值是不是相等。
        // 这里的s2和s1是指向字符串常量池中的同一个地址的，所以s2就是s1，所以删除s2就是删除s1。
        System.out.println(x.size());//0
    }
}

class User{
    private String name;
    public User(){}
    public User(String name){
        this.name=name;
    }

//    切记：加入集合中的对象，一定要重写equals方法：---------集合比较的时候就会调用equals方法

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof User)) return false;
        if(obj==this) return true;
        User a=(User)obj;
        return a.name.equals(this.name);
    }
}
