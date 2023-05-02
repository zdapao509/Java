/*
HashMap���ϣ�

    1.HashMap���ϵײ��ǹ�ϣ��ɢ�б�����ݽṹ

    2.��ϣ����һ�����������ݽṹ��

        ��ϣ����һ������͵�������Ľ����

        ���飺�ڲ�ѯ����Ч�ʺܸߣ��������ɾ�����Ч�ʺܵ�

        ���������������ɾ�����Ч�ʺܸߣ��ڲ�ѯ�����Ч�ʺܵ�

        ��ϣ���������ݽṹ�ں���һ�𣬳�ַ������Ǹ��Ե��ŵ�

    3.HashMap���ϵײ��Դ���룺

        public class HashMap{

            //HashMap�ײ�ʵ���Ͼ���һ�����顣һά����
            Node<K,V>[] table;

            //��̬�ڲ���HashMap.Node

            static class Node<K,V>{
                final int hash;  //��ϣֵ������key��hashCode����������ִ�н����hashֵͨ����ϣ�������㷨���Եõ�������±�
                final K key;  //�洢��Map�����е��Ǹ�key
                V value��//�洢��Map�����е��Ǹ�value
                Node<K,V> next;  //��һ���ڵ���ڴ��ַ
            }
        }

        ��ϣ��ɢ�б�һά���飬���������ÿһ��Ԫ����һ�������������������Ľ����


    4.����Ҫ���յ��ǣ�

        map.put(k,v)  ʵ��ԭ��

            ��һ�����Ƚ� k,v ��װ�� Node�����У�

            �ڶ������ײ�����k ��hashCode�����������ó�hashֵ

            ��������ͨ����ϣ��������ϣ�㷨��hashֵת����������±꣬�±�λ�������û���κ�Ԫ�أ��Ͱ�Node ��ӵ����λ���ϣ�

                    ���˵�±��Ӧ��λ������������ʱ������k�������ϵ�ÿһ���ڵ��е�k ����equals��������е�equals����������false ����ô����ڵ㽫����ӵ������ĩβ��

                    �����һ��equals����������true����ô����ڵ��value���ᱻ����


        v=map.get(k);  ʵ��ԭ��

            �ȵ���k ��hashCode���������ó���ϣֵ��ͨ����ϣ�㷨ת���������±꣬ͨ�������±���ٶ�λ��ĳ��λ���ϣ�

            ������λ����ʲô��û�У�����null����

            ������λ�����е���������ô�ͻ����Ų��� k �͵������������ÿ���ڵ��е� k ����equals�Ƚϣ�������е�equals��������false����ôget��������null

            ֻҪ������һ���ڵ��k �Ͳ��� k equals��ʱ�򷵻�true ����ô��ʱ����ڵ��value ��������Ҫ�ҵ�value ��get�������շ������Ҫ�ҵ�value


     5.Ϊʲô��ϣ��������ɾ����ѯ��Ч�ʶ��ܸߣ�

        ��ɾ������������ɣ�

        ��ѯҲ����Ҫ��ɨ�裬ֻ��Ҫ���в���ɨ��


        �ص��ǣ�HashMap���ϵ�key ���Ⱥ��������������    hashCode()  �Լ�  equals����  ��ô������������Ҫ��д

     6.ע�⣺��ϣ����ͬһ�����������ϵ����нڵ��hash��ͬ(���ϣֵ���Բ�ͬ�����Ǿ�����ϣ�㷨�������ͬ)����Ϊ���ǵ������±���һ���ģ�

        ��ͬһ�������ϵ�k��k��equals�������ص���false�������Ƕ�������ȵ�

        hashCode����������Ҫ��д ������дʱ���������һ���̶�ֵ���ͻᵼ�¹�ϣ����һ�������������߱����������------��Ϊ��ɢ�зֲ�������

        ������е�hash����һ���Ļ�����ϣ��ͱ��һ�����飬���߱��������������ɾЧ�ʸߵ�����------��Ϊ��ɢ�зֲ�������

        ɢ�зֲ�������Ҫ��д��hashCode����ʱ��һ������


     7.HashMap���ϵ�key�����ص㣺

        ���򣬲����ظ���

        Ϊʲô����       ��Ϊ��һ���ҵ���һ�����������ϣ�

        �����ظ���ô��֤��      equals�����ᱣ֤��HashMap���ϵ�key�����ظ������key�ظ��ˣ�value�Ḳ��

        ����HashMap����key���ֵ�Ԫ����ʵ���Ƿŵ��� HashSet ������

        ���ԣ�����HashSet �����е�Ԫ��Ҳ��Ҫͬʱ��дhashCode() + equals ����


     8.�ص㣺����HashMap����key ���ֵ�Ԫ���Լ�����HashSet�����е�Ԫ�أ���Ҫͬʱ��дhashCode�����Լ�equals����

     9.HashMap�����е�Ĭ�ϳ�ʼ��������16��Ĭ�ϼ���������0.75

        ���Ĭ�ϼ��������ǵ�HashMap���ϵײ�����������ﵽ75%��ʱ�����鿪ʼ���ݣ�

        �ص㣺

            ��ס��HashMap���ϳ�ʼ������������2�ı��������ǹٷ��Ƽ��ģ���Ϊ�ﵽ��ɢ�о��ȣ�Ϊ�����HashMap���ϵĴ�ȡЧ�ʣ�������ģ�
* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();//Integer ��key ;����hashCode����������equals��������д��

        map.put(1,"zhangsan");
        map.put(4,"lisi");
        map.put(2,"wangwu");
        map.put(3,"zhaoliu");
        map.put(1,"awei");

        System.out.println(map.size());//4

        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> it=set.iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> ent=it.next();

            System.out.println(ent.getKey()+"="+ent.getValue());

            /*
            1=awei
            2=wangwu
            3=zhaoliu
            4=lisi

            * */
        }
    }
}
