/*
TreeSet集合特点：

    无序不可重复，但是存储的元素可以自动按照大小排序-----称为：可排序集合


    无序：这里的无序指的是：存进去的顺序和取出来的顺序不同，并且没有下标
*/

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
//        创建集合
        Set<String> strs=new TreeSet<>();

        strs.add("A");
        strs.add("x");
        strs.add("b");
        strs.add("A");
        for (String ele:strs){
            System.out.println(ele);
        }

        /*
        A
        b
        x

        * */
    }
}
