/*
�ص㣺�����е�remove����

    �����Ͻṹ�����ı��ʱ�򣬵������������»�ȡ��

    ������ǵ�����ǰ�ϵĵ�����������֣�

        �쳣��java.util.ConcurrentModificationException


    �ڵ���Ԫ�صĹ����У�һ��Ҫʹ�õ�������remove��������Ҫʹ�ü����Դ���remove����
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest07 {
    public static void main(String[] args) {
        Collection a=new ArrayList();
        Iterator it=a.iterator();//ע�⣺����ĵ�����ָ����Ǽ�����û��Ԫ��״̬�µĵ�������һ��ע�⣬���ϵĽṹ�����˱仯���������������»�ȡ��
        // ���ѭ��ǰ��ĵ����������»�ȡ�Ļ����ͻ���֣�java.util.ConcurrentModificationException

        a.add(1);
        a.add(2);
        a.add(3);

//        ��ȡ��������
        Iterator it2=a.iterator();
        while(it2.hasNext()){
//            Integer o=it.next();-------ע�⣺next�����ķ���ֵ���ͱ�����Object����
            Object obj=it2.next();
            System.out.println(obj);
        }

        Collection b=new ArrayList();
        b.add(1);
        b.add(2);
        b.add(3);

        Iterator it3=b.iterator();

        while(it3.hasNext()){

            Object obj=it3.next();

            /*b.remove(obj);//ע�⣺���������remove����ɾ�������е�Ԫ�أ��ı��˼��ϵĽṹ��

            �����remove�����Ǽ��ϵķ��������ǵ������ķ���;���ַ���û��֪ͨ��������ֱ��ɾ���˼����е�Ԫ�أ����µ������еĿ��գ������������ڽ�ԭ�����������ո���һ�ݣ�

                                                                                                                �ͼ����е�ԭ״̬��ͬ��ֱ�ӱ���

            // ����Ӧ�����»�ȡ����������������»�ȡ���������ͻᱨ��java.util.ConcurrentModificationException*/

            it3.remove();//��������õ�������remove����ɾ��Ԫ�أ��Ͳ�������������⣬ɾ�����ǵ�����ָ��ĵ�ǰԪ�أ�������ȥɾ��ʱ�����Զ����µ������������¼��ϣ�ɾ�������е�Ԫ�أ�

            System.out.println(obj);
        }

        System.out.println(b.size());//0
    }
}
