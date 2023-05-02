/*
��ɫ���壺ʵ������

����java.util.Collection�ӿ��еĳ��÷�����

    1.Collection���ܴ��ʲôԪ�أ�

        û��ʹ�÷���֮ǰ��Collection�п��Դ��Object�����������͡�ʹ���˷���֮��Collection��ֻ�ܴ��ĳ�����������

        Collection��ʲô�����Դ棬ֻҪ��Object��������У������в���ֱ�Ӵ�����������ͣ�Ҳ���ܴ�java����ֻ�ܴ�java������ڴ��ַ

    2.Collection�еĳ��÷�����

        boolean add(Object e)  �򼯺������Ԫ��

        int size();   ��ȡ������Ԫ�صĸ���

        void clear();  ��ռ���

        boolean contains��Object o�� �жϵ�ǰ�������Ƿ����Ԫ�� o   ,��������True

        remove()  ɾ�������е�ĳ��Ԫ��

        isEmpty���� ɾ�������е�ĳ��Ԫ��

        Object[] toArray()  �Ѽ���ת��������
* */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest02 {
    public static void main(String[] args) {
//        ����һ�����϶���
//        Collection c=new Collection();ע�⣬Collection��һ���ӿڣ�����ȫ����ģ����ܽ���ʵ����
//        ��̬���ƣ�
        Collection e=new ArrayList();
//        ������Collection�еĳ��÷�����
        e.add(100);//ע�������100���ǻ����������ͣ�������jdk5�������ԣ��Զ�װ�䣬ʵ������һ���ڴ��ַ��Integer a=new Integer(100)
        e.add(3.14);//�Զ�װ��
        e.add(new Object());//�ڴ��ַ
        e.add(true);//�Զ�װ��
        e.add(new Student());


//        ��ȡ������Ԫ�ظ���
        System.out.println(e.size());

//        ��ռ��ϣ�
        e.clear();
        System.out.println(e.size());

//        �жϼ������Ƿ����ĳһ��Ԫ�أ�
        e.add("��");
        e.add(1);
        System.out.println(e.contains(1));
        System.out.println(e.contains(2));

//        ɾ�������е�ĳ��Ԫ��
        e.remove(1);
        System.out.println(e.size());


//        �жϼ������Ƿ�Ϊ��
        System.out.println(e.isEmpty());//false
        e.clear();
        System.out.println(e.isEmpty());

//        �Ѽ���ת��������
        e.add(100);
        e.add("zhang");
        e.add("��");
        e.add(new Student());
        Object[] objs=e.toArray();
        for (int i=0;i< objs.length;i++){
            System.out.println(objs[i]);
            Object o=objs[i];
            System.out.println(o+"*********************");
        }
    }
}

class Student{

}
