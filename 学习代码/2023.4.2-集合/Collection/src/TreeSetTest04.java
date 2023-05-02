/*
自己指定排序规则；

    比如：按照年龄比较，如果年龄相同，按照姓名比较
* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        Set<Test> test=new TreeSet<>();
        test.add(new Test(15,"zwei"));
        test.add(new Test(16,"aaa"));
        test.add(new Test(15,"aweo"));
        test.add(new Test(0,"xioazi"));

        Iterator<Test> it=test.iterator();
        while(it.hasNext()){
            Test t=it.next();
            System.out.println(t);
        }
    }
}

class Test implements Comparable<Test>{
    int age;
    String name;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + "  :  " + this.age;
    }
/*
CompareTo方法的返回值类型很重要。

    返回=0 代表相同，value会覆盖；

    返回《0  会继续在左子树上面找

    返回>0  会继续在右子树上面找
* */
    public int compareTo(Test t) {
        if(this.age==t.age){
            return this.name.compareTo(t.name);
        }else{
            return this.age-t.age;
        }
    }
}