/*
HashMap����key value��������Ϊ null �

    ����

        ����Ҫע�⣺HashMap���ϵ�key��nullֵֻ����һ����



Hashtable ��key��value ������Ϊnull  ��
Hashtable���ϵĳ�ʼ�������� 11 ��
Hashtable���������ǣ� ԭ����*2+1



Hashtable��HashMapһ�����ײ㶼�ǹ�ϣ�����ݽṹ
* */

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapTest03 {
    public static void main(String[] args) {
        Map map=new HashMap();

        map.put(null,null);
        System.out.println(map.size());//1       key����Ϊnull

        System.out.println(map.get(null));//  null

        map.put(null,2000);
        System.out.println(map.size());//1

        System.out.println(map.get(null));//  2000


//        Hashtable ��key��value ������Ϊnull  ��Hashtable���ϵ����ʻ������� 11 �����������ǣ� ԭ����*2+1

        Map map1=new Hashtable();
//        map1.put(null,100);//java.lang.NullPointerException
//        map1.put(100,null);//java.lang.NullPointerException
    }
}
