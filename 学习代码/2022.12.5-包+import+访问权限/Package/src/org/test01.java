package org;

import com.helloworld.Package.test;

import java.util.Scanner;

public class test01 {

    private int id;

    public int age;
    protected int weight;

    String name;

    public static void main(String[] args) {
        System.out.println("你好");
        java.util.Scanner s=new java.util.Scanner(System.in);
        String ss=s.next();
        System.out.println("你输入的是："+ss);
        Scanner aa=new Scanner(System.in);
        test te=new test();//在工具包中，调用不同包下面的class时，直接输入，然后选择import class就好，比较方便。

        User01 user01=new User01();
        System.out.println(user01.weight);//这说明在同一个包下面，可以访问不同类里面的protected中修饰的属性
    }


}

//--------------------------------------------------------
class User01{
//    private int id;
    public int age;
    protected int weight;
    String name;
}