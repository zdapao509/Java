/*
Vector�ײ���һ�����飺

    ��ʼ��������10

    ��ô���ݵģ�

        ����֮����ԭʼ������2��  10---20---40---80

        ArrayList�������ݵ��ص㣺 ArrayList��������������ԭ������1.5��

    Vector�����еķ��������߳�ͬ���ģ�������synchronized�ؼ��֣����̰߳�ȫ�ģ�Ч�ʱȽϵͣ�ʹ�ý�����

    ��ô��һ���̲߳���ȫ��ArrayList����ת�����̰߳�ȫ���أ�

        ʹ�ý�Ϲ����ࣺjava.util.Collections;

        ע��:java.util.Collection  �Ǽ��Ͻӿ�

            java.util.Collections  �Ǽ��Ϲ�����



* */

import java.util.*;

class VectorTest01 {
     public static void main(String[] args) {
//         ����һ��Vector���ϣ�
         List vector=new Vector();//������ö�̬

//         ���Ԫ��
//         Ĭ��������10:
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);

         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
         vector.add(1);
//
//         for (int i = 0; i < vector.size(); i++) {
//             System.out.println(vector.get(i));
//         }

         Iterator it=vector.iterator();
         while(it.hasNext()){
             Object obj=it.next();
             System.out.println(obj);
         }


//         ��һ���̲߳���ȫ��Listת�����̰߳�ȫ�ģ�
         List myList=new ArrayList();
//         ת���̰߳�ȫ��
         Collections.synchronizedList(myList);//���Ϲ����ཫ���̰߳�ȫ��ת��Ϊ�̰߳�ȫ��

         myList.add("1111");
         myList.add("2222");
     }
}
