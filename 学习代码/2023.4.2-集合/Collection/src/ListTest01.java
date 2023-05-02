/*
List接口中常用方法：

    1.List集合存储元素特点：有序（有下标，从0开始，以一递增）可重复（存储1，还能再存1）

    2.List是Collection的子接口，方法更多：

        只列出List的常用方法：

            void add(int index,Object element)  //在指定下标位置添加元素。

            Object get(int index);           根据下标获取元素

            int indexOf(Object o);         获取指定元素第一次出现的索引-----如果没有指定元素，返回-1

            int lastIndexOf(Object o)     获取指定元素最后一次出现的索引-----如果没有指定元素，返回-1

            Object remove(int index)       删除指定位置的下标

            Object set(int index , Object element)       将对应下标位置的元素修改


List集合有自己特有的遍历方式：通过下标遍历：-----------不需要迭代器的hasnext 和next方法

* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        myList.add(1,"hello");//在指定下标位置添加元素。下标为1的地方加元素hello。后面的往后移动

        Iterator it=myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


//        根据下标获取元素：
        Object obj=myList.get(2);
        System.out.println(obj);

        System.out.println("集合的大小："+myList.size());//size算的是集合中元素的个数，不是集合的长度

//        因为有下标，所以，List集合有自己特有的遍历方式：通过下标遍历：-----------不需要迭代器的hasnext 和next方法
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


//        获取指定对象在集合中第一次出现的索引：
        System.out.println(myList.indexOf("hello"));//1


//        获取指定元素最后一次出现的索引-----如果没有指定元素，返回-1
        System.out.println(myList.lastIndexOf("C"));//3


//        删除指定位置的下标
        myList.remove(1);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("*******************************");

//        替换指定位置的元素
        myList.set(1,"hahahah");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
