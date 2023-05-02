/*
紫色字体：实例变量

关于java.util.Collection接口中的常用方法，

    1.Collection中能存放什么元素？

        没有使用泛型之前，Collection中可以存放Object的所有子类型。使用了泛型之后，Collection中只能存放某个具体的类型

        Collection中什么都可以存，只要是Object的子类就行，集合中不能直接存基本数据类型，也不能存java对象，只能存java对象的内存地址

    2.Collection中的常用方法：

        boolean add(Object e)  向集合中添加元素

        int size();   获取集合中元素的个数

        void clear();  清空集合

        boolean contains（Object o） 判断当前集合中是否包含元素 o   ,包含返回True

        remove()  删除集合中的某个元素

        isEmpty（） 删除集合中的某个元素

        Object[] toArray()  把集合转换成数组
* */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
//        创建一个集合对象：
//        Collection c=new Collection();注意，Collection是一个接口，是完全抽象的，不能进行实例化
//        多态机制：
        Collection e=new ArrayList();
//        测试用Collection中的常用方法：
        e.add(100);//注意这里的100不是基本数据类型，是用了jdk5的新特性，自动装箱，实际上是一个内存地址：Integer a=new Integer(100)
        e.add(3.14);//自动装箱
        e.add(new Object());//内存地址
        e.add(true);//自动装箱
        e.add(new Student());


//        获取集合中元素个数
        System.out.println(e.size());

//        清空集合：
        e.clear();
        System.out.println(e.size());

//        判断集合中是否包含某一个元素：
        e.add("张");
        e.add(1);
        System.out.println(e.contains(1));
        System.out.println(e.contains(2));

//        删除集合中的某个元素
        e.remove(1);
        System.out.println(e.size());


//        判断集合中是否为空
        System.out.println(e.isEmpty());//false
        e.clear();
        System.out.println(e.isEmpty());

//        把集合转换成数组
        e.add(100);
        e.add("zhang");
        e.add("张");
        e.add(new Student());
        Object[] objs=e.toArray();
        for (int i=0;i< objs.length;i++){
            System.out.println(objs[i]);
            Object o=objs[i];
            System.out.println(o+"*********************");
        }
    }
}

class Student{

}
