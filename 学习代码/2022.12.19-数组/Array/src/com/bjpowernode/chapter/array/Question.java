package com.bjpowernode.chapter.array;
/*
* һ�����ڶ�̬�����⣺
* Object[]��һ�����ܵĿڴ�������װ�κ�-------->�����������͵�����
* */
public class Question {
    public static void main(String[] args) {
        Object[] a=new String[4];
        Object c=new String[4];
        Object b=new int[5];//���ﲻ��⣬Ϊʲô����д��Object[] b=new int[5];������������
        /*
        �������ΪʲôObject[] b=new int[5]��������������Ϊ��
        int[] arr=new int[5];----------�����ʼ����ʱ��ÿ��Ԫ�طŵ�ֵ��Ĭ��ֵ---->0
        OObject[] a=new Object[4];--------����ĳ�ʼ��Ĭ��ֵ��------------------>null
        ���ԣ�����洢�������ݵ�Ĭ��ֵ�����ǲ�һ���ģ������˲��ܽ�������ĸ�ֵ
        ���ǣ�
        String[] arr=new String[5];--------->Ĭ��ֵҲ��null
        ����Object[] a=new String[4];------��һ���ǳ�����
        * */
        Object d=5;
        Object e=new Object();

        System.out.println(a.getClass());//class [Ljava.lang.String;
        System.out.println(b.getClass());//class [I
        System.out.println(c.getClass());//class [Ljava.lang.String;
        System.out.println(d.getClass().toString());//class java.lang.Integer
        System.out.println(e.getClass());//class java.lang.Object

        Object[] arr={new Husband(),new Wife(),"abc"};
//        ����ġ�abc����һ���ַ������͵Ķ����Ǹ����ַ�����java�����Ŵ�������Ҫnew��Ҳ��һ������
//        ��abc����һ��java��������String����
    }
}

class Husband{}
class Wife{}