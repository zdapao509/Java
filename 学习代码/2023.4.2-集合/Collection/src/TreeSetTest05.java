import java.util.Comparator;
import java.util.TreeSet;

/*
自定义比较规则的时候，方法不止一种：放在TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式

    第一种：放在集合中的元素实现java.lang.Comparable接口

    第二种：使用比较器的方式，比较器Comparator;   在构造TreeSet集合和TreeMap集合的时候，给他传一个比较器对象，Comparator接口的设计符合OGP原则


 Comparator接口和Comparable接口怎么选择呢？

    当比较规则不会发生改变的时候，或者比较规则只有一个的时候，建议Comparable接口，直接实现，在对应的元素的类里面直接实现他的compareTo方法

    当比较规则有很多的时候，我想让这种元素按照不同的规则进行比较的时候，可以采用Comparator 匿名内部类进行频繁切换
* */
public class TreeSetTest05 {
    public static void main(String[] args) {

//        创建TreeSet集合的时候，需要使用这个比较器

//        TreeSet<tnt> treeSet=new TreeSet<>();//java.lang.ClassCastException   这样不行，没有通过构造方法传递一个比较器进去

        TreeSet<tnt> treeSet=new TreeSet<>(new tntComparator());

        treeSet.add(new tnt(100));
        treeSet.add(new tnt(50));
        treeSet.add(new tnt(150));

        for(tnt t:treeSet){
            System.out.println(t);
            /*
            tnt: 50
            tnt: 100
            tnt: 150
            * */
        }

//        当然，也可以不用自己定义比较类，可以直接用 匿名内部类 的方法实现  传递一个比较器进去----------匿名内部类，没有名字。直接new接口
        TreeSet<tnt> tt=new TreeSet<>(new Comparator<tnt>(){
            public int compare(tnt t1,tnt t2){
                return t1.num-t2.num;
            }
        });
        tt.add(new tnt(500));
        tt.add(new tnt(200));
        tt.add(new tnt(300));

        for(tnt t:tt){
            System.out.println(t);
            /*
            tnt: 200
            tnt: 300
            tnt: 500
            * */
        }


    }
}

class tnt{
    int num;
    public tnt(int num){
        this.num=num;
    }

    public String toString(){
        return "tnt: "+ num;
    }
}
/*
需要单独编写一个比较器：

    比较实现：java.util.Comparator接口，Comparable 是java.lang下面的，，Comparator 是java.util包下的
* */

class tntComparator implements Comparator<tnt> {
//    需要制定比较规则
    public int compare(tnt t1,tnt t2){
        return t1.num-t2.num;
    }
}
