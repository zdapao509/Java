package com.bjpowernode.chapter.array;
//��һ�������ϣ�������������һ�������ʱ��Ҫ��ô������
public class ArrayTest03 {
    public static void main(String args[]) {//ע�⿴�����������д��String������java�ı�׼д����д��args������C++�ı�׼д��������java��Ҳ��������д
        System.out.println("123");
//        ��̬��ʼ����������
        String[] aa={"123789","zjhia"};
        ArrayTest(aa);

        int[] bb= {1,2,3,45,65,789};
        ArrayTest(bb);

//        ��̬��ʼ����������
        String[] cc=new String[10];
        ArrayTest(cc);

        ArrayTest(new String[15]);

        ArrayTest(new int[5]);
    }

    public static void ArrayTest(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void ArrayTest(int[] aa){//��������
        for (int i = 0; i < aa.length;i++) {
            System.out.println(aa[i]);
        }
    }
}
