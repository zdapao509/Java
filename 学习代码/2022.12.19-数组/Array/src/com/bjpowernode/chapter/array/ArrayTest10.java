package com.bjpowernode.chapter.array;
/*
���ڶ�ά������Ԫ�صģ����͸�
a[��ά������һά������±�][һά������±�]
a[0][0]:��ʾ��һ������ĵ�һ��Ԫ��
ע�⣺����a[0][0]��˵�����е�a[0]��һ�����壬�����[0]��ǰ���a[0]ִ��֮��Ľ��Ȼ�����±�0
* */
public class ArrayTest10 {
    public static void main(String[] args) {
//        ��ά����
        int[][] aa={
                {100,20,30},
                {15,56},
                {50,656,556,4161,34}
        };
//        ��ȡ�����϶�ά�����еĵ�һ��һά����
        int[] a1=aa[0];
        int a=a1[0];
        System.out.println(a);
//        �ϳɣ�
        System.out.println(aa[0][0]);
//        �ڶ���һά�����еĵ�һ��Ԫ�أ�
        System.out.println(aa[1][0]);
//        �ģ�
        aa[0][2]=10;
        System.out.println(aa[0][2]);
//        ע�ⲻҪԽ�磺java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(aa[0][3]);
    }
}
