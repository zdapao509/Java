package com.bjpowernode.chapter.array;
/*
* ��������Ĭ��ֵ��
*
* ��������    Ĭ��ֵ
* byte       0
* short      0
* int        0
* long       0L
* float      0.0F
* double     0.0
* boolean    false
* char       \u0000
* ������������  null
*
*
* ʲôʱ����þ�̬��ʼ���ķ�ʽ��ֵ��ʲôʱ����ö�̬��ʼ���ķ�ʽ��ֵ��
*
*   ���㴴�������ʱ��ȷ�������д洢��Щ�����Ԫ�ص�ʱ�򣬲��þ�̬��ʼ���ķ�ʽ
*
*   ���㴴�������ǣ���ȷ�������д洢��Щ�����Ԫ�ص�ʱ�򣬿��Բ��ö�̬��ʼ���ķ�����Ԥ�ȷ����ڴ�ռ�
* */
public class ArrayTest02 {
    public static void main(String[] args) {
//        ����/����һ�����飬���ö�̬��ʼ���ķ�ʽ����
        int[] a=new int[4];//��������Ϊ4��int���飬�����е�ÿ��Ԫ�ص�Ĭ��ֵ����0
//        �������飺
        for(int i=0;i<4;i++){
            System.out.println("�±�Ϊ��"+i+"�����ǣ�"+a[i]);
        }

//        ����һ��object���͵����飬���ö�̬��ʼ���ķ�ʽ
        Object[] objs=new Object[4];//ע�ⴴ�������ʱ��������һ���ǵô�
        for(int i=0;i<4;i++){
            System.out.println(objs[i]);
        }

//        ����һ���ַ������͵Ķ���
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        String[] strs=new String[3];
        for(int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
        }

//        ���þ�̬��ʼ���ķ�ʽ
        String[] strs1={"100","zzzzz"};
        for(int i=0;i< strs1.length;i++){
            System.out.println(strs1[i]);
        }

//        �洢Object,���þ�̬��ʼ����
        Object o1=new Object();
        Object o2=new Object();
        Object o3=new Object();
        Object[] obj={o1,o2,o3};
        Object[] obj1={new Object(),new Object(),new Object()};//��ȻҲ������������
        for (int i = 0; i <obj.length ; i++) {
            System.out.println(obj[i]);
            /*
            * ��������ͬ�ڣ�
            * Object o=obj[i];
            * System.out.println(o.toString());Ҳ����˵�������obj[i]���Զ�����toString����
            * */
        }
    }
}
