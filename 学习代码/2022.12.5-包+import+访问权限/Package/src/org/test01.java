package org;

import com.helloworld.Package.test;

import java.util.Scanner;

public class test01 {

    private int id;

    public int age;
    protected int weight;

    String name;

    public static void main(String[] args) {
        System.out.println("���");
        java.util.Scanner s=new java.util.Scanner(System.in);
        String ss=s.next();
        System.out.println("��������ǣ�"+ss);
        Scanner aa=new Scanner(System.in);
        test te=new test();//�ڹ��߰��У����ò�ͬ�������classʱ��ֱ�����룬Ȼ��ѡ��import class�ͺã��ȽϷ��㡣

        User01 user01=new User01();
        System.out.println(user01.weight);//��˵����ͬһ�������棬���Է��ʲ�ͬ�������protected�����ε�����
    }


}

//--------------------------------------------------------
class User01{
//    private int id;
    public int age;
    protected int weight;
    String name;
}