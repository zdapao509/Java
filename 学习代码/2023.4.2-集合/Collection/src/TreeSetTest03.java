/*
对于自定义的类型来说：TreeSet可以排序嘛?

    以下程序中对于Person类型来说，无法排序，因为没有指定Person对象之间的比较规则，所以谁大谁小并没有说明，因此不能进行比较

以下程序报错：

    Exception in thread "main" java.lang.ClassCastException: class Person cannot be cast to class java.lang.

    Comparable (Person is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')

出现这个报错的原因是：Person 没有实现java.util.Comparable 类
* */

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1=new Person(10);
        Person p2=new Person(50);
        Person p3=new Person(20);
        Person p4=new Person(25);

//        创建TreeSet集合，
        TreeSet<Person> person=new TreeSet<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);

//        遍历
        for(Person p:person){
            System.out.println(p);
        }
    }
}

/*
class Person{
    int a;
    public Person(int a){
        this.a=a;
    }
}*/


class Person implements Comparable<Person>{
    int a;
    public Person(int a){
        this.a=a;
    }

//    实现比较接口的时候，需要实现该接口中的抽象方法。这个方法是用来指定比较的规则的，按照什么进行比较
//    k.compareTo(t.kay)
//    拿着参数k 和集合中的每一个 k 进行比较，返回值可能是 >0  ,=0  ,<0
//    比较规则制定之后，可以按照年龄进行升序，也可以按照年龄进行降序
    public int compareTo(Person c){
        //此时this 就是当前 对象 的内存地址，在上面的TreeSet排序的时候，就是p1
        //这里的 c 就是要对比的对象的内存地址 ，也就是 p2；
//        p1 和 p2  进行比较的时候，就是this和c 进行比较

        return this.a-c.a;//按照这种方式进行比较，返回负值代表当前的值比后面的值小，当前值不变，后面的值依旧保持在后面，完成排序，如果后面的值小，那就把大的值放到后面，完成排序
//        return c.a-this.a;
    }


//    重写以下toString方法：
    public String toString(){
        return "this.a="+a;
    }
}
