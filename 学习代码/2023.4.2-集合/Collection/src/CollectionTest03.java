import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
���ڼ����б���������ר��**********
* */
public class CollectionTest03 {
    public static void main(String[] args) {
//        ע�⣺ ���µĵ�����������ʽ�����е�Collectionͨ�õķ���
//        ��Map�����в����ã������е�Collection�Լ�������ʹ��
//        �������϶���
        Collection e=new ArrayList();
        e.add("������");
        e.add(100);
        e.add("abc");
        e.add(new Object());

//        �Լ���Collection���б���������
//        ��һ������ȡ���϶���ĵ��������� Iterator
        Iterator it=e.iterator();
//        �ڶ�����ͨ�����ϻ�ȡ�ĵ���������ʼ��������������
        /*
        �������������ǵ���������Iterator�еķ�����

            boolean hasNext();�������Ԫ�أ����Ե���������true

            Object next���������ص�������һ��Ԫ��

        * */
        while(it.hasNext()){
            Object objs=it.next();
            System.out.println(objs);
        }
    }
}
