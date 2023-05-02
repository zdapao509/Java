package com.bjpowernode.chapter.array;
/*
* 一个关于多态的问题：
* Object[]是一个万能的口袋，可以装任何-------->引用数据类型的数据
* */
public class Question {
    public static void main(String[] args) {
        Object[] a=new String[4];
        Object c=new String[4];
        Object b=new int[5];//这里不理解，为什么不能写成Object[] b=new int[5];？？？？？？
        /*
        理解这里为什么Object[] b=new int[5]不成立，这是因为：
        int[] arr=new int[5];----------这里初始化的时候，每个元素放的值是默认值---->0
        OObject[] a=new Object[4];--------这里的初始化默认值是------------------>null
        所以，这里存储生成数据的默认值类型是不一样的，导致了不能进行上面的赋值
        但是：
        String[] arr=new String[5];--------->默认值也是null
        所以Object[] a=new String[4];------这一句是成立的
        * */
        Object d=5;
        Object e=new Object();

        System.out.println(a.getClass());//class [Ljava.lang.String;
        System.out.println(b.getClass());//class [I
        System.out.println(c.getClass());//class [Ljava.lang.String;
        System.out.println(d.getClass().toString());//class java.lang.Integer
        System.out.println(e.getClass());//class java.lang.Object

        Object[] arr={new Husband(),new Wife(),"abc"};
//        这里的“abc”是一个字符串类型的兑现那个，字符串在java中有优待，不需要new，也是一个对象，
//        “abc”是一个java对象，属于String类型
    }
}

class Husband{}
class Wife{}