package com.bjpowernode.chapter.array;
/*
�����㷨��ð������		ѡ������

�����㷨�����ַ�����

���ϵ��㷨java���Ѿ���װ���ˣ�ֱ�ӵ��á������ࣺArrays-----------java.util.Arrays;  ������һ��sort��������������

������ķ����󲿷ֶ��Ǿ�̬�ģ�ֱ�ӵ���
* */
import java.util.Arrays;

/*
ʹ�����µ�SUN��˾�ṩ�����鹤���ࣺjava.util.Arrays;
* */
public class ArrayTest13 {
    public static void main(String[] args) {
        int[] arr={15,45,61,34,84,1,58,83,79,45,41};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
