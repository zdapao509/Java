/*
TreeSet�����ص㣺

    ���򲻿��ظ������Ǵ洢��Ԫ�ؿ����Զ����մ�С����-----��Ϊ�������򼯺�


    �������������ָ���ǣ����ȥ��˳���ȡ������˳��ͬ������û���±�
*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
//        ��������
        Set<String> strs=new TreeSet<>();

        strs.add("A");
        strs.add("x");
        strs.add("b");
        strs.add("A");
        for (String ele:strs){
            System.out.println(ele);
        }

        /*
        A
        b
        x

        * */
    }
}
