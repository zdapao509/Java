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
public class MapTest01 {
    public static void main(String[] args) {
        MapTest01.InnerClass.m1();
        InnerClass m2=new InnerClass();//同一个类下面就不用吧前面的 MapTest01.  加上
        m2.m2();

        MyMap.MyEntry.m1();
        MyMap.MyEntry<String,Integer> m3=new MyMap.MyEntry<String,Integer>();//不同的类就要加上
        m3.m2("字符串");
//        m3.m2(132);//java: 不兼容的类型: int无法转换为java.lang.String
    }


//  声明一个静态内部类
    public static class InnerClass{
        public static void m1(){
            System.out.println("静态内部类中的m1方法执行了");
        }
        public void m2(){
            System.out.println("静态内部类的实例方法m2执行了");
        }
    }
}

class MyMap{
    public static class MyEntry<K,V>{
        public static void m1(){
            System.out.println("静态内部类 MyEntry<K,V> 中的m1方法执行了");
        }
        public void m2(K k){
            System.out.println("静态内部类 MyEntry<K,V> 的实例方法m2执行了");
        }
    }
}
