/*
Vector底层是一个数组：

    初始化容量是10

    怎么扩容的？

        扩容之后是原始容量的2倍  10---20---40---80

        ArrayList集合扩容的特点： ArrayList集合扩容容量是原容量的1.5倍

    Vector中所有的方法都是线程同步的，都带有synchronized关键字，是线程安全的，效率比较低，使用较少了

    怎么将一个线程不安全的ArrayList集合转换成线程安全的呢？

        使用结合工具类：java.util.Collections;

        注意:java.util.Collection  是集合接口

            java.util.Collections  是集合工具类



* */

import java.util.*;

class VectorTest01 {
     public static void main(String[] args) {
//         创建一个Vector集合：
         List vector=new Vector();//最好是用多态

//         添加元素
//         默认容量是10:
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);

         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
//
//         for (int i = 0; i < vector.size(); i++) {
//             System.out.println(vector.get(i));
//         }

         Iterator it=vector.iterator();
         while(it.hasNext()){
             Object obj=it.next();
             System.out.println(obj);
         }


//         将一个线程不安全的List转换成线程安全的：
         List myList=new ArrayList();
//         转成线程安全的
         Collections.synchronizedList(myList);//集合工具类将非线程安全的转换为线程安全的

         myList.add("1111");
         myList.add("2222");
     }
}
