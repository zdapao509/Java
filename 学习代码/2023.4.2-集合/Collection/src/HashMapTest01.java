/*
HashMap集合：

    1.HashMap集合底层是哈希表、散列表的数据结构

    2.哈希表是一个怎样的数据结构？

        哈希表是一个数组和单向链表的结合体

        数组：在查询方面效率很高，在随机增删方面的效率很低

        单向链表：在随机增删方面的效率很高，在查询方面的效率很低

        哈希表将两种数据结构融合在一起，充分发挥他们各自的优点

    3.HashMap集合底层的源代码：

        public class HashMap{

            //HashMap底层实际上就是一个数组。一维数组
            Node<K,V>[] table;

            //静态内部类HashMap.Node

            static class Node<K,V>{
                final int hash;  //哈希值，他是key的hashCode（）方法的执行结果，hash值通过哈希函数、算法可以得到数组的下标
                final K key;  //存储到Map集合中的那个key
                V value；//存储到Map集合中的那个value
                Node<K,V> next;  //下一个节点的内存地址
            }
        }

        哈希表，散列表：一维数组，这个数组中每一个元素是一个单向链表；数组和链表的结合体


    4.最主要掌握的是：

        map.put(k,v)  实现原理

            第一步：先将 k,v 封装到 Node对象当中；

            第二步：底层会调用k 的hashCode（）方法，得出hash值

            第三步：通过哈希函数、哈希算法将hash值转换成数组的下标，下标位置上如果没有任何元素，就把Node 添加到这个位置上，

                    如果说下标对应的位置上有链表，此时会拿着k和链表上的每一个节点中的k 进行equals，如果所有的equals方法都返回false ，那么这个节点将被添加到链表的末尾，

                    如果有一个equals方法反回了true，那么这个节点的value将会被覆盖


        v=map.get(k);  实现原理

            先调用k 的hashCode（）方法得出哈希值，通过哈希算法转换成数组下标，通过数组下标快速定位到某个位置上，

            如果这个位置上什么都没有，返回null，；

            如果这个位置上有单项链表，那么就会拿着参数 k 和单向链表上面的每个节点中的 k 进行equals比较，如果所有的equals方法返回false，那么get方法返回null

            只要其中有一个节点的k 和参数 k equals的时候返回true ，那么此时这个节点的value 就是我们要找的value ，get方法最终返回这个要找的value


     5.为什么哈希表的随机增删、查询的效率都很高？

        增删是在链表上完成；

        查询也不需要都扫描，只需要进行部分扫描


        重点是：HashMap集合的key 会先后调用两个方法：    hashCode()  以及  equals（）  那么这两个方法都要重写

     6.注意：哈希表中同一个单向链表上的所有节点的hash相同(其哈希值可以不同，但是经过哈希算法，变的相同)，因为他们的数组下标是一样的，

        但同一个链表上的k和k的equals方法返回的是false，即他们都不是相等的

        hashCode（）方法需要重写 ，在重写时，如果返回一个固定值，就会导致哈希表变成一个单向链表，不具备数组的优势------称为：散列分部不均匀

        如果所有的hash都不一样的话，哈希表就变成一个数组，不具备单向链表随机增删效率高的优势------称为：散列分部不均匀

        散列分部均匀需要你写的hashCode方法时有一定技巧


     7.HashMap集合的key部分特点：

        无序，不可重复。

        为什么无序？       因为不一定挂到哪一个单向链表上，

        不可重复怎么保证？      equals方法会保证，HashMap集合的key不可重复，如果key重复了，value会覆盖

        放在HashMap集合key部分的元素其实就是放到了 HashSet 集合中

        所以，放在HashSet 集合中的元素也需要同时重写hashCode() + equals 方法


     8.重点：放在HashMap集合key 部分的元素以及放在HashSet集合中的元素，需要同时重写hashCode方法以及equals方法

     9.HashMap集合中的默认初始化容量是16，默认加载因子是0.75

        这个默认加载因子是党HashMap集合底层数组的容量达到75%的时候，数组开始扩容；

        重点：

            记住：HashMap集合初始化容量必须是2的倍数，这是官方推荐的，因为达到了散列均匀，为了提高HashMap集合的存取效率，所必须的；
* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();//Integer 是key ;它的hashCode（）方法和equals方法都重写了

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
