/*
HashSet集合：

    无序不可重复


    存储时的顺序和取出时的顺序是不同的

    放到HashSet集合中的元素实际上是放到HashMap集合的key部分了
* */

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
//        演示HashSet集合的特点
        Set<String> strs=new HashSet<>();
        strs.add("123");
        strs.add("456");
        strs.add("123");
        strs.add("abc");
        for(String str:strs){
            System.out.println(str);
        }

        int a=Integer.MAX_VALUE;
        System.out.println(a);

        /*
            123
            abc
            456
        * */
    }
}
