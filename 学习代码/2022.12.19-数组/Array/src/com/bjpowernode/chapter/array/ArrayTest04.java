package com.bjpowernode.chapter.array;
//��һ�������Ĳ����������ʱ�����ǿ��Բ��������ķ�ʽ��ֵ
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        printArray(a);

        int[] aa=new int[5];
        printArray(aa);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        printArray(new int[6]);

//        ��û�������﷨��
//        printArray({1,2,3,4});---------------java: �Ƿ��ı��ʽ��ʼ

        System.out.println("***************************************");
        printArray(new int[]{2,3,4,567,8});//����֧�������﷨------------���ֱ�Ӵ���һ����̬����Ļ����﷨��������д
    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
