/*
���ڼ����еĵ�������
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest04 {
    public static void main(String[] args) {
//        �������϶���
        Collection e=new ArrayList();
//        ���Ԫ��:
        e.add(100);
        e.add(200);
        e.add(300);
//        �������ϣ�
        Iterator it=e.iterator();
//        ��������
        while(it.hasNext()){
            Object obj=it.next();
//            ���ȥ��ʱ����ʲô���ͣ����������ʲô���͡�ֻ���������ʱ�򣬵���println�������������������String.valueOf()������������ת�������ַ���
            if(obj instanceof Integer){
                System.out.println("***************");
            }

            System.out.println(obj);
        }


        Collection c=new HashSet();//���򣬲��ظ�
        c.add(20);
        c.add(56);
        c.add(36);
        c.add(20);
        Iterator a=c.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        }
    }
}
