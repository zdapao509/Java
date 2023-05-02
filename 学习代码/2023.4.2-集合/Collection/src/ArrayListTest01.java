/*
ArrayList集合：

    1.默认初始化容量是10（底层是先创建一个长度为0的数组，然后当添加第一个元素的时候，初始化容量是10）

    2.集合底层是一个Object[]数组

    3.构造方法：

        new Arraylist();

        new ArrayList(20);

    4.ArrayList集合的扩容:

        原容量的1.5倍

        ArrayList集合底层是数组，怎么优化？

            尽可能减少扩容。因为数组扩容效率较低，建议在使用ArrayList集合的时候预估集合的元素个数，给定一个初始化容量

    5.数组的优点：

        检索效率比较高。（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，知道下标，通过数学表达式计算出元素的内存地址，所以检索效率最高）

    6.数组缺点：

        随机增删元素效率较低，且无法存储大容量的数据。（很难找到一块连续且很大的内存空间）

    7.向数组末尾添加元素，效率很高，不受影响

    8.集合中应用最多的集合：
`
        ArrayList集合；因为往数组末尾添加元素，效率不收影响。另外我们的检索查找某个元素的操作比较多

    9.ArrayList是非线程安全的，不是线程安全的集合
* */

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {

//        初始化容量是10
//        数组的c初始长度:10

        List a1=new ArrayList();

        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);

//        这里集合的size()方法是获取当前集合中元素的个数。不是获取集合的容量
        System.out.println(a1.size());

        a1.add(11);
        System.out.println(a1.size());

        List a2=new ArrayList(20);
        System.out.println(a2.size());//0
    }
}
