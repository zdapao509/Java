/*
java.util.Map�ӿ��г��õķ�����

    1.Map��Collectionû�м̳й�ϵ

    2.Map������key��value�ķ�ʽ�洢���ݣ���ֵ��

        key��value���������������ͣ����洢�����ڴ��ַ

        key��������λ��value��key��һ������Ʒ

     3.Map�г��õķ���

        V put(K key, V value) �򼯺�����Ӽ�ֵ��

        V get(Object key)  ͨ��key��ȡvalue

        void clear���� ���Map����

        Boolean containsKey(Object key)   �ж�Map���Ƿ����ĳ��key

        boolean containsValue(Object value)   �жϼ������Ƿ����ĳ��value

        boolean isEmpty()  �жϼ����ǲ��ǿյ�

        Set<K> keySet����  ��ȡ���������е�key�����еļ���һ��set���ϣ�

        V remove��Object key��ͨ��key ɾ����ֵ��

        int size()  ��ȡMap�����м�ֵ�Եĸ���

        Collection<V>  values()   ��ȡMap���������е�value ,����һ��Collection

        Set<Map.Entry<K,V>>  entrySet()       ������Mapת����Set����

            �ٶ�������һ�����ϣ�Map���ϣ�

                key      value
                -----------------
                1        zhangshan
                2        lisi
                3        wnagwu

                Set set=map1.entrySet();

                set���϶���-----------ע�⣺Map����ͨ��entrySet()����ת���ɵ����Set���ϣ�Set������Ԫ�ص������� Map.Entry �ࣻ��� Map.Entry ��һ���ڲ��࣬��Map����ڲ�
                                        Map.Entry ���Ϻ�String����һ��������һ�����͵����֣�ֻ������Map.Entry�Ǿ�̬�ڲ��࣬��Map���е��ڲ���
                    1=zhangsan---------һ������������ڴ��ַ���Ǵ�ģ�Map.Entry �������
                    2=lisi
                    3=wnagwu

* */
public class MapTest01 {
    public static void main(String[] args) {
        MapTest01.InnerClass.m1();
        InnerClass m2=new InnerClass();//ͬһ��������Ͳ��ð�ǰ��� MapTest01.  ����
        m2.m2();

        MyMap.MyEntry.m1();
        MyMap.MyEntry<String,Integer> m3=new MyMap.MyEntry<String,Integer>();//��ͬ�����Ҫ����
        m3.m2("�ַ���");
//        m3.m2(132);//java: �����ݵ�����: int�޷�ת��Ϊjava.lang.String
    }


//  ����һ����̬�ڲ���
    public static class InnerClass{
        public static void m1(){
            System.out.println("��̬�ڲ����е�m1����ִ����");
        }
        public void m2(){
            System.out.println("��̬�ڲ����ʵ������m2ִ����");
        }
    }
}

class MyMap{
    public static class MyEntry<K,V>{
        public static void m1(){
            System.out.println("��̬�ڲ��� MyEntry<K,V> �е�m1����ִ����");
        }
        public void m2(K k){
            System.out.println("��̬�ڲ��� MyEntry<K,V> ��ʵ������m2ִ����");
        }
    }
}
