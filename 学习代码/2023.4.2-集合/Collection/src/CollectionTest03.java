import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合中遍历、迭代专题**********
* */
public class CollectionTest03 {
    public static void main(String[] args) {
//        注意： 以下的迭代、遍历方式是所有的Collection通用的方法
//        在Map集合中不能用，在所有的Collection以及子类中使用
//        创建集合对象
        Collection e=new ArrayList();
        e.add("张威明");
        e.add(100);
        e.add("abc");
        e.add(new Object());

//        对集合Collection进行遍历、迭代
//        第一步：获取集合对象的迭代器对象 Iterator
        Iterator it=e.iterator();
//        第二步：通过以上获取的迭代器对象开始迭代，遍历集合
        /*
        以下两个方法是迭代器对象Iterator中的方法：

            boolean hasNext();如果仍有元素，可以迭代，返回true

            Object next（）；返回迭代的下一个元素

        * */
        while(it.hasNext()){
            Object objs=it.next();
            System.out.println(objs);
        }
    }
}
