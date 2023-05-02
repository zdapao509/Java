/*
map集合的遍历

* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest03 {
    public static void main(String[] args) {
//        第一种方式：获取所有的key,通过遍历key,来遍历value
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhangsan ");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(2,"zhaoliu");
        System.out.println(map);//{1=zhangsan , 2=zhaoliu, 3=wangwu}

        Set<Integer> set=map.keySet();//返回集合中所有的key,返回的类型是：Set<Integer>  因为集合定义的时候，就是Integer类型的
//        遍历set，通过遍历set中的key来获取value

//        可以通过迭代器：
        Iterator<Integer> it=set.iterator();
        while(it.hasNext()){
//            取出其中一个的key
            Integer a=it.next();
//            通过key来获取value；利用Map的get函数
            System.out.println(a+"="+map.get(a));
        }

//        可以通过增强for循环：
        for(Integer ele:set){
            System.out.println(ele+"="+map.get(ele));
        }

        System.out.println("******************************************");


//        第二种方法：通过Set<Map.Entry<K,V>>  set=map.entrySet()     将集合Map转换成Set集合  集合去直接调用
//
//        ------这种方式的使用率比较高，因为获取key和value都是直接从node对象中获取的属性值，此种方式适合于大数据量


        Set<Map.Entry<Integer,String>> ent=map.entrySet();

//        采用迭代器进行遍历：
        Iterator<Map.Entry<Integer,String>> iterator=ent.iterator();

        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            Integer integer=entry.getKey();
            String str=entry.getValue();
            System.out.println(integer+"="+str);
        }

//        采用增强for循环：
        System.out.println("******************************************");
        for(Map.Entry<Integer,String> ele:ent){
            System.out.println(ele.getKey()+"="+ele.getValue());
        }
    }
}
