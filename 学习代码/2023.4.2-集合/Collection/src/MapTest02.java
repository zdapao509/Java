import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
public class MapTest02 {
    public static void main(String[] args) {
//        ����map����
        Map<Integer,String> map=new HashMap<>();
//        ��map��������Ӽ�ֵ��
        map.put(1,"zhangsan");//����� 1  �Զ�װ����� Integer
        map.put(2,"lisi");
        map.put(3,"wangwu");

//        ͨ��key��ȡvalue
        String value=map.get(1);
        System.out.println(value);

//        ��ȡ��ֵ�Ե�����
        System.out.println(map.size());

//        ͨ����keyɾ����Ӧ��key-value
        map.remove(1);
        System.out.println("��ֵ�Ե���������ˣ�"+map.size());

//        �жϼ����е�key�Ƿ������ĳ��key
        System.out.println(map.containsKey(2));//true

//        �жϼ����е�value�Ƿ����ĳ��value
        System.out.println(map.containsValue("wangwu"));//true

//        ע�⣺contains�����ײ㶼�ǵ��õ�equals�������жԱȵģ������Զ����������Ҫ��дequals����

//        �жϼ����е�key�Ƿ������ĳ��key
        System.out.println(map.containsKey(new Integer(2)));//true

        // --------��ʹ�����2  ���������  ��wangwu��  �����´����Ķ��󣬵���String Integer���Ѿ���д��equals������������Ȼ�ǰ�����

//        �жϼ����е�value�Ƿ����ĳ��value
        System.out.println(map.containsValue(new String("wangwu")));//true

        System.out.println("****************************");

//        ��ȡ���е�value
        Collection<String> values=map.values();
        for (String ele:values) {
            System.out.println(ele);
        }
        System.out.println("-------------------------------");

//        ���map���ϣ�
        map.clear();
        System.out.println(map.size());

//        �жϼ����Ƿ�Ϊ��
        System.out.println(map.isEmpty());//true
    }
}
