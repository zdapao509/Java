/*
ArrayList�Ĺ��췽����
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List list1=new ArrayList();//Ĭ�ϳ�ʼ��������10
        List list2=new ArrayList(100);//ָ����ʼ������100

        Collection cc=new HashSet();//����һ��Hashset����-------���򲻿��ظ�

        cc.add(100);
        cc.add(200);
        cc.add(300);
        cc.add(400);


//        ͨ���˹��췽����Hashset����ת����list����
        List mylist=new ArrayList(cc);
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
