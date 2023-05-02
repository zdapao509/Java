/*
深入：
    Collection集合的contains方法:    boolean contains(Object o)

    判断集合中是否包含某个对象 o ？

        如果包含，返回true

    contains方法是用来判断集合中是否有包含某个元素的方法，底层里面是怎么判断集合中是否包含某个元素呢？

        调用了equals方法，进行比对。返回true就表示包含这个元素
* */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection a = new ArrayList();

        String s1 = new String("abc");
        String s2 = new String("def");

        a.add(s1);
        a.add(s2);

        System.out.println(a.contains("abc"));//true

        String s3="abc";
        System.out.println(a.contains(s3));//true------------
        // 这里注意：集合的contains方法是比较最终的字符串是不是相等，不是比较的内存地址，因为这里调用了equals方法

        String s4=new String("abc");
        System.out.println(a.contains(s4));//true


    }
}