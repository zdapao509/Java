package com.bjpowernode.chapter.array;
/*
��ά����ı���
* */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] str={
                {"��","��","��"},
                {"����","�ڵ�"},
                {"x","y","z"}
        };
        for (int i = 0; i < str.length; i++) {//ȡ���Ĺ��ɾ����ⲿѭ�������б仯���ڲ�ѭ������ÿһ�е��ڲ��仯
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();//����
        }
    }
}
