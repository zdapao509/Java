import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
    1.Map和Collection没有继承关系
    2.Map集合以key和value的方式存储数据：键值对

        key和value都是引用数据类型；都存储的是内存地址

        key起到主导地位，value是key的一个附属品

     3.Map中常用的方法

        V put(K key, V value) 向集合中添加键值对

        V get(Object key)  通过key获取value

        void clear（） 清空Map集合

        Boolean containsKey(Object key)   判断Map中是否包含某个key

        boolean containsValue(Object value)   判断集合中是否包含某个value

        boolean isEmpty()  判断集合是不是空的

        Set<K> keySet（）  获取集合中所有的key（所有的键是一个set集合）

        V remove（Object key）通过key 删除键值对

        int size()  获取Map集合中键值对的个数

        Collection<V>  values()   获取Map集合中所有的value ,返回一个Collection

        Set<Map.Entry<K,V>>  entrySet()       将集合Map转换成Set集合

            假定现在有一个集合：Map集合：

                key      value
                -----------------
                1        zhangshan
                2        lisi
                3        wnagwu

                Set set=map1.entrySet();

                set集合对象：-----------注意：Map集合通过entrySet()方法转换成的这个Set集合，Set集合中元素的类型是 Map.Entry 类；这个 Map.Entry 是一个内部类，在Map类的内部
                                        Map.Entry 集合和String类型一样，都是一种类型的名字，只不过，Map.Entry是静态内部类，是Map类中的内部类
                    1=zhangsan---------一个这个东西的内存地址就是存的：Map.Entry 类的数据
                    2=lisi
                    3=wnagwu

* */
public class MapTest02 {
    public static void main(String[] args) {
//        创建map集合
        Map<Integer,String> map=new HashMap<>();
//        向map集合中添加键值对
        map.put(1,"zhangsan");//这里的 1  自动装箱成了 Integer
        map.put(2,"lisi");
        map.put(3,"wangwu");

//        通过key获取value
        String value=map.get(1);
        System.out.println(value);

//        获取键值对的数量
        System.out.println(map.size());

//        通过键key删除对应的key-value
        map.remove(1);
        System.out.println("键值对的数量变成了："+map.size());

//        判断集合中的key是否包含了某个key
        System.out.println(map.containsKey(2));//true

//        判断集合中的value是否包含某个value
        System.out.println(map.containsValue("wangwu"));//true

//        注意：contains方法底层都是调用的equals方法进行对比的，所以自定义的类型需要重写equals方法

//        判断集合中的key是否包含了某个key
        System.out.println(map.containsKey(new Integer(2)));//true

        // --------即使这里的2  还有下面的  “wangwu”  都是新创建的对象，但是String Integer都已经重写了equals方法，所以任然是包括的

//        判断集合中的value是否包含某个value
        System.out.println(map.containsValue(new String("wangwu")));//true

        System.out.println("****************************");

//        获取所有的value
        Collection<String> values=map.values();
        for (String ele:values) {
            System.out.println(ele);
        }
        System.out.println("-------------------------------");

//        清空map集合：
        map.clear();
        System.out.println(map.size());

//        判断集合是否为空
        System.out.println(map.isEmpty());//true
    }
}
