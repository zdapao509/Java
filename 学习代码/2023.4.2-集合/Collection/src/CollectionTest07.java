/*
重点：集合中的remove方法

    当集合结构发生改变的时候，迭代器必须重新获取。

    如果还是调用以前老的迭代器，会出现：

        异常：java.util.ConcurrentModificationException


    在迭代元素的过程中，一定要使用迭代器的remove方法，不要使用集合自带的remove方法
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest07 {
    public static void main(String[] args) {
        Collection a=new ArrayList();
        Iterator it=a.iterator();//注意：这里的迭代器指向的是集合中没有元素状态下的迭代器。一定注意，集合的结构发生了变化，迭代器必须重新获取，
        // 如果循环前面的迭代器不重新获取的话，就会出现：java.util.ConcurrentModificationException

        a.add(1);
        a.add(2);
        a.add(3);

//        获取迭代器：
        Iterator it2=a.iterator();
        while(it2.hasNext()){
//            Integer o=it.next();-------注意：next方法的返回值类型必须是Object类型
            Object obj=it2.next();
            System.out.println(obj);
        }

        Collection b=new ArrayList();
        b.add(1);
        b.add(2);
        b.add(3);

        Iterator it3=b.iterator();

        while(it3.hasNext()){

            Object obj=it3.next();

            /*b.remove(obj);//注意：这里调用了remove方法删除集合中的元素，改变了集合的结构，

            这里的remove方法是集合的方法，不是迭代器的方法;这种方法没有通知迭代器，直接删除了集合中的元素，导致迭代器中的快照（迭代器类似于将原集合内容拍照复制一份）

                                                                                                                和集合中的原状态不同，直接报错

            // 所以应该重新获取迭代器。如果不重新获取迭代器，就会报错：java.util.ConcurrentModificationException*/

            it3.remove();//但是如果用迭代器的remove方法删除元素，就不会出现上述问题，删除的是迭代器指向的当前元素；迭代器去删除时。会自动更新迭代器，并更新集合（删除集合中的元素）

            System.out.println(obj);
        }

        System.out.println(b.size());//0
    }
}
