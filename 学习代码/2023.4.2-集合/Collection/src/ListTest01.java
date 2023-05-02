/*
List�ӿ��г��÷�����

    1.List���ϴ洢Ԫ���ص㣺�������±꣬��0��ʼ����һ���������ظ����洢1�������ٴ�1��

    2.List��Collection���ӽӿڣ��������ࣺ

        ֻ�г�List�ĳ��÷�����

            void add(int index,Object element)  //��ָ���±�λ�����Ԫ�ء�

            Object get(int index);           �����±��ȡԪ��

            int indexOf(Object o);         ��ȡָ��Ԫ�ص�һ�γ��ֵ�����-----���û��ָ��Ԫ�أ�����-1

            int lastIndexOf(Object o)     ��ȡָ��Ԫ�����һ�γ��ֵ�����-----���û��ָ��Ԫ�أ�����-1

            Object remove(int index)       ɾ��ָ��λ�õ��±�

            Object set(int index , Object element)       ����Ӧ�±�λ�õ�Ԫ���޸�


List�������Լ����еı�����ʽ��ͨ���±������-----------����Ҫ��������hasnext ��next����

* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List myList=new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        myList.add(1,"hello");//��ָ���±�λ�����Ԫ�ء��±�Ϊ1�ĵط���Ԫ��hello������������ƶ�

        Iterator it=myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


//        �����±��ȡԪ�أ�
        Object obj=myList.get(2);
        System.out.println(obj);

        System.out.println("���ϵĴ�С��"+myList.size());//size����Ǽ�����Ԫ�صĸ��������Ǽ��ϵĳ���

//        ��Ϊ���±꣬���ԣ�List�������Լ����еı�����ʽ��ͨ���±������-----------����Ҫ��������hasnext ��next����
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


//        ��ȡָ�������ڼ����е�һ�γ��ֵ�������
        System.out.println(myList.indexOf("hello"));//1


//        ��ȡָ��Ԫ�����һ�γ��ֵ�����-----���û��ָ��Ԫ�أ�����-1
        System.out.println(myList.lastIndexOf("C"));//3


//        ɾ��ָ��λ�õ��±�
        myList.remove(1);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("*******************************");

//        �滻ָ��λ�õ�Ԫ��
        myList.set(1,"hahahah");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
