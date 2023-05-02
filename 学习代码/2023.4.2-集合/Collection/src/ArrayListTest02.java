/*
ArrayList的构造方法：
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List list1=new ArrayList();//默认初始化容量是10
        List list2=new ArrayList(100);//指定初始化容量100

        Collection cc=new HashSet();//创建一个Hashset集合-------无序不可重复

        cc.add(100);
        cc.add(200);
        cc.add(300);
        cc.add(400);


//        通过此构造方法将Hashset集合转换成list集合
        List mylist=new ArrayList(cc);
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
