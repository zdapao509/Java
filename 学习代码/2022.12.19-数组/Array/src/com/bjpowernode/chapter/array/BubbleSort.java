package com.bjpowernode.chapter.array;
/*
 ð�������㷨

 ԭʼ���飺 2 1 5 3 8 0------------һ��6������ѭ��5�αȽ�-------���Կ��ɣ�ÿ�ζ������������ұߣ���ô6������ÿ�η�һ������5�Σ��Ϳ���������
                                            ��ÿһ��ѭ�����棬�������Ƚϡ�����һ��ʼ��6�����������Ƚϣ���Ҫ5�Ρ�
                                            5�����������Ƚϣ���Ҫ4�Ρ�

 ��һ��ѭ����
   1 2 5 3 8 0 ��һ�αȽϣ�����
   1 2 5 3 8 0 �ڶ��αȽϣ�������
   1 2 3 5 8 0 �����αȽϣ�����
   1 2 3 5 8 0 ���ĴαȽϣ�������
   1 2 3 5 0 8 ����αȽϣ�����

 �ڶ���ѭ����
   1 2 3 5 0 ��һ�αȽϣ�������
   1 2 3 5 0 �ڶ��αȽϣ�������
   1 2 3 5 0 �����αȽϣ�������
   1 2 3 0 5 ���ĴαȽϣ�����

 ������ѭ����
   1 2 3 0 ��һ�αȽϣ�������
   1 2 3 0 �ڶ��αȽϣ�������
   1 2 0 3 �����αȽϣ�����

 ���Ĵ�ѭ����
   1 2 0 ��һ�αȽϣ�������
   1 0 2 �ڶ��αȽϣ�����

 �����ѭ����
   0 1 ��һ�αȽϣ�����



* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={15,6,8,4,0,41};
        /*int count=0;
        for (int i = 0; i < arr.length-1; i++) {�������ַ�ʽi��0��ʼ
            for (int j = 0; j < arr.length-1-i; j++) {�����Ƚ�--��Ҫ�Ĵ�����ԭʼ����ĳ��ȼ�һ�Σ�5��������4��
                count++;
                if (arr[j] > arr[j+1]) {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

//        iֱ�Ӵ����ֵ��ʼ���ӷ���
        int count=0;
        int count2=0;
        for (int i = arr.length-1; i >0 ; i--) {//6������ֻҪѭ��5�ξ���
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j] >arr[j+1] ) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count2++;
                }
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("�Ƚϴ�����"+count);
        System.out.println("����������"+count2);
    }
}
