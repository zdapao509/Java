/*
HashSet���ϣ�

    ���򲻿��ظ�


    �洢ʱ��˳���ȡ��ʱ��˳���ǲ�ͬ��

    �ŵ�HashSet�����е�Ԫ��ʵ�����Ƿŵ�HashMap���ϵ�key������
* */

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {
    public static void main(String[] args) {
//        ��ʾHashSet���ϵ��ص�
        Set<String> strs=new HashSet<>();
        strs.add("123");
        strs.add("456");
        strs.add("123");
        strs.add("abc");
        for(String str:strs){
            System.out.println(str);
        }

        int a=Integer.MAX_VALUE;
        System.out.println(a);

        /*
            123
            abc
            456
        * */
    }
}
