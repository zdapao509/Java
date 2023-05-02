/*
HashMap集合key value部分允许为 null 嘛？

    允许：

        但是要注意：HashMap集合的key的null值只能有一个，



Hashtable 的key和value 不允许为null  ；
Hashtable集合的初始化容量是 11 ；
Hashtable集合扩容是： 原容量*2+1



Hashtable和HashMap一样，底层都是哈希表数据结构
* */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest03 {
    public static void main(String[] args) {
        Map map=new HashMap();

        map.put(null,null);
        System.out.println(map.size());//1       key允许为null

        System.out.println(map.get(null));//  null

        map.put(null,2000);
        System.out.println(map.size());//1

        System.out.println(map.get(null));//  2000


//        Hashtable 的key和value 不允许为null  ；Hashtable集合的舒适化容量是 11 ；集合扩容是： 原容量*2+1

        Map map1=new Hashtable();
//        map1.put(null,100);//java.lang.NullPointerException
//        map1.put(100,null);//java.lang.NullPointerException
    }
}
