/*
1.TreeSet���ϵײ�ʵ������һ��TreeMap

2.TreeMap���ϵײ���һ��������

3.�ŵ�TreeSet�����е�Ԫ�أ���ͬ�ڷŵ�TreeMap ����key������

4.TreeSet�����е�Ԫ�أ����򣬲����ظ������ǿ��԰���Ԫ�صĴ�С�Զ�����      ��Ϊ�����򼯺�

* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
//        ����һ��TreeSet����
        Set<String> ts=new TreeSet<String>();

//        ���Ԫ��
        ts.add("a");
        ts.add("e");
        ts.add("d");
        ts.add("b");
        ts.add("c");
        ts.add("d");

//        ������
        Iterator<String> it=ts.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
            /*  a
                b
                c
                d
                e
            * */
        }

//        ����һ��TreeSet����
        Set<Integer> ts1=new TreeSet<>();

//        ���Ԫ��
        ts1.add(15);
        ts1.add(4);
        ts1.add(5);
        ts1.add(75);
        ts1.add(47);
        ts1.add(1);

//        ������
        for(Integer s:ts1){
            System.out.println(s);
            /*
            1
            4
            5
            15
            47
            75
            * */
        }

    }
}
