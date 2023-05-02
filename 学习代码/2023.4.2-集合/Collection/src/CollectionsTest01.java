import java.util.*;

/*
Collections工具类：

    java.util.Collection  集合接口

    java.util.Collections  集合工具类，方便集合的操作

* */
public class CollectionsTest01 {
    public static void main(String[] args) {
//        ArrayList集合不是线程安全的
        List<String> list=new ArrayList<>();

//        变成线程安全的
        Collections.synchronizedList(list);

//        排序：
        list.add("x");
        list.add("a");
        list.add("z");
        list.add("y");

        Collections.sort(list);

        for(String ele:list){
            System.out.println(ele);
            /*
            a
            x
            y
            z
            * */
        }

//        对List集合中的元素排序，需要保证List集合中的元素实现了：Comparable接口
        List<er> li=new ArrayList<>();
        li.add(new er(19));
        li.add(new er(15));
        li.add(new er(17));
        li.add(new er(5));

        Collections.sort(li);//reason: no instance(s) of type variable(s) T exist so that er conforms to Comparable<? super T>

        for(er ele:li){
            System.out.println(ele);
            /*
             ****   5
             ****   15
             ****   17
             ****   19
             * */
        }

//        对于set集合怎么进行排序？   直接用ArrayList类的构造方法，将set集合转成list集合  再进行排序
        Set<String> tr=new HashSet<>();

        tr.add("s");
        tr.add("y");
        tr.add("a");

        List<String> o=new ArrayList<>(tr);
        Collections.sort(o);

        for(String s:o){
            System.out.println(s);
            /*
            a
            s
            y
            * */
        }

//        如果不愿意将list集合中的元素进行实现Comparable接口，也可以通过

    }
}


class er implements Comparable<er>{
    int a;

    public er(int a){
        this.a=a;
    }


    public int compareTo(er e){
        return this.a-e.a;
    }


    public String toString(){
        return "   ****   "+a;
    }
}
