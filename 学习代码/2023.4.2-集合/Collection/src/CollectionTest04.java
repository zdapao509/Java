/*
关于集合中的迭代遍历
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest04 {
    public static void main(String[] args) {
//        创建集合对象
        Collection e=new ArrayList();
//        添加元素:
        e.add(100);
        e.add(200);
        e.add(300);
//        迭代集合：
        Iterator it=e.iterator();
//        遍历集合
        while(it.hasNext()){
            Object obj=it.next();
//            存进去的时候是什么类型，输出来就是什么类型。只是在输出的时候，调用println方法，这个方法调用了String.valueOf()方法，将对象转换成了字符串
            if(obj instanceof Integer){
                System.out.println("***************");
            }

            System.out.println(obj);
        }


        Collection c=new HashSet();//无序，不重复
        c.add(20);
        c.add(56);
        c.add(36);
        c.add(20);
        Iterator a=c.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}
