/*
* 抽象类：
*
*       1.抽象类中不一定有抽象方法，抽象方法必须出现在抽象类中。
*
*       2.重要结论：一个非抽象的类继承一个抽象的类的时候，必须将抽象类中的抽象方法实现了。这是java语法强制规定的，必须的，不然编译器就报错了。
*
*           这里的覆盖或者说重写，也可以叫做实现（对抽象的实现）
*
*       3.抽象类也不能多继承
*
*
* 写代码的时候： 能用多态就用多态！！！！！
* */

public class AbstractTest02 {

    public static void main(String[] args) {
        //这里能否使用多态创建对象？  父类型引用指向子类的对象
        Animal a=new Bird();//向上转型（自动类型转换）
        //这里就是面向抽象编程
        //以后你都是调用的a.xxxx
        //a的类型是Animal。Animal是抽象的
        //面向抽象编程，不要面向具体编程，降低程序的耦合度，提高程序的扩展能力；
        //这种编程思想称之为OCP原则；

        a.move();
        //这句话执行的时候，编译阶段：move()方法是Animal类的；  运行阶段：move（）方法是Bird的
    }
}

abstract class Animal{
    public abstract void move();//抽象方法
}

//子类：非抽象类
class Bird extends Animal{//错误： java: Bird不是抽象的, 并且未覆盖Animal中的抽象方法move()

    //需要将从父类中继承过来的抽象方法进行覆盖或者重写；或者也可以叫做“实现”
    //把抽象方法实现了；
    public void move(){
        System.out.println("Bird在飞翔");
    }
}

/*
* 分析：
*
*   Animal是父类，是一个抽象类，存在抽象方法move（）；
*
*   Bird是子类，是非抽象类，在继承Animal父类的过程中。将抽象方法继承了过来；这个时候就会报错，因为子类是非抽象类，不允许出现抽象方法；必须利用重写将其覆盖
* */

//子类：抽象类
abstract class Cat extends Animal{//如果子类是抽象的话，那么Animal中继承过来的抽象方法也可以不去重写，覆盖，实现---------允许这样写；但是这个子类就没有办法实例化了，非抽象类
}