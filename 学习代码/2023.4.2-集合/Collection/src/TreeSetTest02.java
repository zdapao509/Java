/*
1.TreeSet集合底层实际上是一个TreeMap

2.TreeMap集合底层是一个二叉树

3.放到TreeSet集合中的元素，等同于放到TreeMap 集合key部分了

4.TreeSet集合中的元素，无序，不可重复。但是可以按照元素的大小自动排序      称为可排序集合

* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
//        创建一个TreeSet集合
        Set<String> ts=new TreeSet<String>();

//        添加元素
        ts.add("a");
        ts.add("e");
        ts.add("d");
        ts.add("b");
        ts.add("c");
        ts.add("d");

//        遍历：
        Iterator<String> it=ts.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
            /*  a
                b
                c
                d
                e
            * */
        }

//        创建一个TreeSet集合
        Set<Integer> ts1=new TreeSet<>();

//        添加元素
        ts1.add(15);
        ts1.add(4);
        ts1.add(5);
        ts1.add(75);
        ts1.add(47);
        ts1.add(1);

//        遍历：
        for(Integer s:ts1){
            System.out.println(s);
            /*
            1
            4
            5
            15
            47
            75
            * */
        }

    }
}
