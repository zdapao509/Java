/*
Properties 属性类对象的相关方法：

    Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型；

    Properties 被称为属性类对象

    Properties 是线程安全的
* */

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
//        创建一个Properties对象：
        Properties pro=new Properties();

//        要掌握Properties的存取方法
//        pro.put("a","hahah");经过测试，这样存也行
        pro.setProperty("a","haha");
        pro.setProperty("b","niganma");
        pro.setProperty("c","aiyou");
        pro.setProperty("d","quququ");

//        通过key获取value
//        System.out.println(pro.get("a"));经过测试，这样取也行
        String a=pro.getProperty("a");
        String b=pro.getProperty("b");
        String c=pro.getProperty("c");
        String d=pro.getProperty("d");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
