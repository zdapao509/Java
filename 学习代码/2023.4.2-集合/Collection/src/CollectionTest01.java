/*
集合概述：

    1.什么是集合，集合的作用：

        数组就是一个集合，集合实际上就是一个容器，可以用来容纳其他类型的数据。

        集合为什么说在开发中应用较多？

            集合是一个容器，是一个载体，可以一次容纳多个对象，在实际开发中，假设连接数据库。数据库中有10条记录，那么假设

            将这10条记录查询出来，在java程序中会将10条数据封装成10个java对象，然后将10个java对象放在某一个集合中，

            当集合传到前端，然后遍历集合，将一个数据一个数据展现出来

     2.集合不能直接存储基本数据类型，另外集合也不能直接存储java对象，存储的是java对象的内存地址。或者说存的是java引用

            list.add(100)-------这并不是直接存基本数据类型，这是java中的自动装箱机制，将100装箱成Integer引用

        注意：集合在java中本身是一个容器，是一个对象，集合中任何时候存储的都是  引用


     3.在java中每一个不同的集合，底层会对应不同的数据结构，往不同的集合中存储元素，等于将数据放到了不同的数据结构中

        数据结构：数据存储的结构。不同的数据结构存储数据的方式不同。比如：数组。二叉树。链表。哈希表。

        new ArrayList()  创建一个集合对象，底层是数组
        new LinkedList()  创建一个集合对象，底层是链表
        new TreeSet()  创建一个集合对象，底层是二叉树


     4.所有的集合类和集合接口都在  java.util  包下

     5.总结：

        所有的实现类：

            ArrayList:底层是数组，
            LinkedList：底层是双向链表
            Vector：底层是数组，线程安全的，效率比较低，使用比较少
            HashSet：底层是HashMap,放到HashSet集合中的元素等同于放到HashMap集合的key部分了
            TreeSet：底层是TreeMap，放到TreeSet集合中放的元素等同于放到TreeMap集合的key部分了
            HashMap:底层是哈希表
            Hashtable：底层是哈希表，只不过是线程安全的，效率比较低，使用较少
            Properties：线程安全的，并且key和value只能存储字符串String
            TreeMap:底层是二叉树，TreeMap集合的key可以按照大小顺序排序

        List集合存储元素的特点：

            有序可重复，

            有序：存进去的顺序和取出的顺序相同，每一个元素都有下标

            可重复：存进去1，可以在存一个1

        Set集合存储元素的特点：

            无序，不可重复，

            无序：存进去的顺序和取出去的顺序不一定相同。另外Set集合中元素没有下标

            不可重复：存进去1，不能在存1

       SortedSet(SortedMap) 集合存储元素的特点：

            首先是无序不可重复的，但是，SortedSet集合中的元素时可排序的。

            无序：存进去的顺序和取出的顺序不一定相同。另外Set集合中元素没有下标

            不可重复：存进去1，不能再存1

            可排序：可以按照大小顺序排序

       Map集合中的key，就是一个Set集合。

            往Set集合中放数据，实际上放到了Map集合的key部分

* */

public class CollectionTest01 {
}
