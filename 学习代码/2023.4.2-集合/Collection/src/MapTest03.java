/*
map���ϵı���

* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
    public static void main(String[] args) {
//        ��һ�ַ�ʽ����ȡ���е�key,ͨ������key,������value
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan ");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(2,"zhaoliu");
        System.out.println(map);//{1=zhangsan , 2=zhaoliu, 3=wangwu}

        Set<Integer> set=map.keySet();//���ؼ��������е�key,���ص������ǣ�Set<Integer>  ��Ϊ���϶����ʱ�򣬾���Integer���͵�
//        ����set��ͨ������set�е�key����ȡvalue

//        ����ͨ����������
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
//            ȡ������һ����key
            Integer a=it.next();
//            ͨ��key����ȡvalue������Map��get����
            System.out.println(a+"="+map.get(a));
        }

//        ����ͨ����ǿforѭ����
        for(Integer ele:set){
            System.out.println(ele+"="+map.get(ele));
        }

        System.out.println("******************************************");


//        �ڶ��ַ�����ͨ��Set<Map.Entry<K,V>>  set=map.entrySet()     ������Mapת����Set����  ����ȥֱ�ӵ���
//
//        ------���ַ�ʽ��ʹ���ʱȽϸߣ���Ϊ��ȡkey��value����ֱ�Ӵ�node�����л�ȡ������ֵ�����ַ�ʽ�ʺ��ڴ�������


        Set<Map.Entry<Integer,String>> ent=map.entrySet();

//        ���õ��������б�����
        Iterator<Map.Entry<Integer,String>> iterator=ent.iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            Integer integer=entry.getKey();
            String str=entry.getValue();
            System.out.println(integer+"="+str);
        }

//        ������ǿforѭ����
        System.out.println("******************************************");
        for(Map.Entry<Integer,String> ele:ent){
            System.out.println(ele.getKey()+"="+ele.getValue());
        }
    }
}
