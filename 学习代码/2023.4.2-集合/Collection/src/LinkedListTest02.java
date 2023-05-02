import java.util.LinkedList;
import java.util.List;

/*
LinkedList集合底层也是有下标的

注意：ArrayList之所以检索效率比较高，是因为底层数组发挥的作用，不是因为下标的原因。

linkedList照样有下标，但是实际检索、查找某个元素的时候效率比较低，因为只能从头节点开始，一个一个的遍历

LinkedList集合有初始化容量吗？没有

    最初这个链表中没有任何元素，first和last引用都是null；不管是LinkedList还是ArrayList，写代码不需要具体关心哪一个集合，因为是面向接口编程，调用方法都是接口中的方法

LinkedList集合是双向链表；对于链表数据结构来说，随机增删效率高，检索效率较低。链表中的元素在空间存储上，内存地址不连续
* */
public class LinkedListTest02 {
    public static void main(String[] args) {
        List list =new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List list2=new LinkedList();//表示底层调用的是 双向链表

        list2.add("123");
        list2.add("465");
        list2.add("798");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
    }
}
