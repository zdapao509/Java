package com.bjpowernode.chapter.array;
/*
* ��������ݣ�����ȱ�㣬����һ��ȷ�������ɱ�
*
*   ����һά��������ݣ�
*
*   ��java�����У����鳤��һ��ȷ���˾Ͳ��ɱ䣬��ô����������ô�죿
*
*       �������ˣ���Ҫ����
*          Java�ж����������ǣ�
*
*               ���½�һ�������������飬Ȼ��С�����������е�����һ��һ���Ŀ����������鵱�С�
*
* ���ۣ��������ݵ�Ч�ʽϵͣ���Ϊ�漰�����������⣬�������Ժ�Ŀ�������ע�⣬�����ٽ�����������ݡ�
*
*       �����ڴ��������ʱ��Ԥ��һ�¶೤���ʣ����Լ�����������ݴ��������Ч�ʡ�
*
* */
public class ArrayTest08 {
    public static void main(String[] args) {
//        java������ô���п������أ�
//        System.arraycopy();

//        ����Դ������������п�����
        int[] ints={1,23,12,2,15};
//        ����Ŀ�꣨���������Ŀ�������ϣ�
        int[] dest=new int[20];
//        ����JDK System���е�arraycopy��������ɿ���
        System.arraycopy(ints,1,dest,4,3);//����ĵ�һ�������ŵ���Դ���飬�ڶ���������Դ�����д��ĸ������и��ƣ�
        // �����������ŵ���Ŀ�����飬���ĸ������Ǹ��Ƶ�Ŀ�������еĵڼ������������������Ҫ���Ƽ�����

//        ����Ŀ������dest��
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        System.out.println("*****************************");

//        ��ints�е���ȫ��������dest�����У�
        System.arraycopy(ints,0,dest,0,ints.length);

//        ����Ŀ������dest��
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

//        �������������������������ͣ�Ҳ���Խ��п���
        String[] str={"hahah","hihi ","ijiji"};
        String[] newStr=new String[20];
        System.arraycopy(str,0,newStr,0,str.length);
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }

//        Object���ͣ�ע�����︴�Ƶ��Ƕ�����ڴ��ַ
        Object[] obj={new Object(),new Object()};
        Object[] objects=new Object[20];
        System.arraycopy(obj,0,objects,0,obj.length);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
