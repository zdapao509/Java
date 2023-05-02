/*
继承和实现都存在的话，代码应该怎么写？
    extends关键字在前面；
    implements 关键词在后面；

* */



public class JieKouTest04 {
    public static void main(String[] args) {
        //创建对象：表面看Animal01类没起作用
        Flyable f=new Cat01();
        f.fly();

        Flyable ff=new Pig();
        ff.fly();

        Animal01 a=new Cat01();//如果只有这一句，那就是没有问题的，符合多态语法
        //a.fly();//但是加这一句就会报错，多态在编译阶段，先要到Animal01类型里面找fly方法,显然，Animal01类里面没有这个方法，报错了---------除非Animal01类里面也有方法fly
    }
}

//--------------------------------------

//父类，动物类
class Animal01{

}

//可飞翔的接口（是一对翅膀）
//能插拔的就是接口；没有接口你无法插拔
//内存条插到主板上，他们之间有接口，内存条可以更换；
//接口通常提取的是行为动作

interface Flyable{
    void fly();
}

//子类：猫
//Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变的可以飞翔
class Cat01 extends Animal01 implements Flyable{
    public void fly(){
        System.out.println("一只会飞的猫");
    }
}


//子类：蛇类、
//如果你不想让子类飞，可以不实现这个Flyable 的接口；
//没有实现这个接口表示你没有翅膀，没有给你插翅膀，你不能飞；
class Snake extends Animal01{}

//子类：猪
//如果想飞就给他插翅膀，也就是实现这个方法
class Pig extends Animal01 implements Flyable{
    public void fly(){
        System.out.println("一直会飞的猪");
    }
}

//子类：没有继承Animal01类的话：
class Fish implements Flyable{
    public void fly(){
        System.out.println("鱼鱼鱼");
    }
}

//实际上代码是有继承老祖宗类Object的
class Fish01 extends Object implements Flyable{
    public void fly(){
        System.out.println("继承了老祖宗的类");
    }

}



