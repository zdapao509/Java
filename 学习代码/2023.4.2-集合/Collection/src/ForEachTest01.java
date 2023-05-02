/*
JDK5.0的新特性：增强for循环  或者叫foreach

增强for循环的缺点:

    没有下标；在需要使用下标的位置，不建议使用增强for循环

* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr={10,23,56,4685,45,131};
//        遍历数组：
        for(int i:arr){
            System.out.println(i);
        }

        List<String> a=new ArrayList<>();
        a.add("123");
        a.add("张");
        a.add("weimign");

//        第一种遍历方式：迭代器：
        Iterator<String> s=a.iterator();
        while(s.hasNext()){
            String aa=s.next();
            System.out.println(aa);
        }

//        第二种迭代方式：直接get方法
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

//        第三种方法：增强for循环
        for(String s1:a){
            System.out.println(s1);
        }
    }
}
