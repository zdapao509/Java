package com.bjpowernode.chapter.array;
import java.util.Arrays;
/*
Arrays�����ࣺ����ֱ�ӵ���ʹ��;
�������еķ������Ǿ�̬�ģ�����ֱ�ӵ��á�

    java.util.Arrays
* */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] a={5,56,4,8,35,0};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        int index=Arrays.binarySearch(a,8);//�������Ҫ�飬ĳ�����������ǲ�����ĳ��Ԫ�أ��Ϳ���ֱ�ӵ��ö��ַ�+��Ŀ������ж�
        System.out.println(index==-1?"����������":"8�������е�λ�ã�"+index);
    }
}
