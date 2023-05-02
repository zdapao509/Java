import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
1.向Map集合中存和取时，都先调用key的hashCode方法，然后再调用equals方法！

    equals方法可能调用，也可能不调用；

    拿put<K,V>举例：  什么时候equals方法不会调用？

        K.hashCode()方法返回哈希值，哈希值经过哈希算法转换成数组下标。数组下标位置上如果是null，equals方法不会执行。

    拿get<K>举例，什么时候equals不会调用？

        K.hashCode()方法返回哈希值，哈希值经过哈希算法转换成数组下标。数组下标位置上如果是null，equals方法不会执行。


2.注意：如果一个类的equals方法重写了，那么hashCode()方法必须重写，并且equals方法返回如果是true，hashCode（）方法返回值必须一样（也可以不一样，只是进过哈希算法之后便一样了）。

    equals方法返回true表示两个对象相同，在同一个单向链表上比较，那么对于同一个单向链表上的节点来说，他们的哈希值都是相同的，所以hashCode()方法的返回值也应该相同

3.注意：hashCode方法和equals方法必须同时生成

4.放在HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法

5.对于哈希表数据结构来说：

    如果a b 的哈希值相同，那他们一定放在一个单链表上

    但是两者不相同的时候，由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生 哈希碰撞  --------也就是两个哈希值不相等的key，可以放在同一个单向链表中

* */
public class HashMapTest02 {
    public static void main(String[] args) {
        Students s1=new Students("zhangsan",1);
        Students s2=new Students("zhangsan",2);

//        重写equals方法之前：
//        System.out.println(s1.equals(s2));//比较的是内存地址，不相等

//        重写equals方法之后：
        System.out.println(s1.equals(s2));//比较的是名字属性,相等-------这里equals方法已经返回true了，代表s1 s2是相同的，
        // 所以往HashSet集合中放的时候，只能放一个，因为set集合无序不可重复

//        没有重写hashCode方法之前：
        System.out.println("s1的hashCode="+s1.hashCode());//381259350
        System.out.println("s2的hashCode="+s2.hashCode());//284720968

//        没有重写hashCode时，如果把他们添加到HashSet集合中的话，即使是同一个对象，也还是会都添加进去，因为hash值计算的下标是不相等的
        Set<Students> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());//2------两个相同的元素都添加进去了

        // ----------重写hashCode之后，这里就变成了1，也就是两个name相等的对象被认为是同一个对象，所以只添加一个


    }
}

class Students{
    private String name;
    private int no;
    public Students(){}
    public Students(String name,int no){
        this.name=name;
        this.no=no;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setNo(int no){
        this.no=no;
    }
    public int getNo(){
        return no;
    }


//    重写equals方法
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Students)) return false;
        if(obj==this) return true;
        Students stu=(Students) obj;
//        return this.name.equals(stu.name);
        return Objects.equals(name,stu.name);
    }


//    重写hashCode方法：
    public int hashCode(){
        return Objects.hash(name);
    }
}
