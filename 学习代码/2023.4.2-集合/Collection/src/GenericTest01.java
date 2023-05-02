/*
泛型机制：JDK5.0的新特性

泛型这种语法机制，只在程序编译阶段起作用，只是给编译器参考的。运行阶段泛型没用


使用泛型的好处：

    集合中存储的元素类型统一了

    从集合中取出来的元素类型是泛型的指定类型，不需要进行大量的向下转型

泛型的缺点是什么？

    导致集合中存储的元素缺乏多样性

    大多数业务中，集合中元素的类型还是统一的，所以这种泛型特性被大家所认可


* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
//        如果不用泛型机制存在的问题：
        List list1=new ArrayList();
        list1.add(new Animal());
        list1.add(new Cat());
        list1.add(new Bird());

//        调用集合中的Animal元素的move方法：
        Iterator it=list1.iterator();
        while(it.hasNext()){
            Object obj=it.next();//注意：it.next在没有使用泛型机制的时候，只能返回Object类型
//            obj.move();-----Cannot resolve method 'move' in 'Object'---Object类中没有move方法
            if(obj instanceof Animal){
                Animal a=(Animal) obj;   //向下转型
                a.move();
            }
        }

        List<Animal> list2=new ArrayList<Animal>();
//        list2.add("123");调用反省机制之后，不能在向集合中添加其他类型的元素
//        List<Cat> list2=new ArrayList<Cat>();---------只有父类型的泛型才能放子类，子类型不能放父类
        list2.add(new Animal());
        list2.add(new Cat());
        list2.add(new Bird());

        Iterator<Animal> it1=list2.iterator();//这里注意：迭代器迭代的是Aniaml类型，如果不加<Animal>，下面的Animal a = it1.next();就会报错，因为迭代的结果就需要是Object

        while(it1.hasNext()){
            Animal a = it1.next();
            a.move();
        }


//        JDK8.0之后的新特性：
        List<Animal> list3=new ArrayList<>();//第二个<>符号具有自主推理的能力，不需要填写
        list3.add(new Animal());
        list3.add(new Cat());
        list3.add(new Bird());

        Iterator<Animal> it4=list3.iterator();

        while(it4.hasNext()){
            Animal a=it4.next();
            a.move();
        }


//
        List<String> list5=new ArrayList<>();
        list5.add("01234567");
        list5.add("*-*++564");
        Iterator<String> it5=list5.iterator();
        while(it5.hasNext()){
            String a=it5.next();
            String newString=a.substring(3);
            System.out.println(newString);

        }
    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫爪老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟飞");
    }
}
