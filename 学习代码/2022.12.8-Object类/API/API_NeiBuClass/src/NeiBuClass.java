/*
匿名内部类：

    1.什么是内部类？

        内部类：在类的内部又定义了一个新的类。被称为内部类

        注意：内部类是可以用public private protected 默认访问权限修饰的

    2.内部类的分类：

        静态内部类：类似于静态变量

        实例内部类：类似于实例变量

        局部内部类：类似于局部变量

    3.使用内部类编写的代码，可读性差。能不用尽量不用

    4.匿名内部类是局部内部类的一种

        因为这个类没有名字而得名，叫做匿名内部类

    5.学习匿名内部类是方便以后读懂别人的代码，能理解别人的语法

        不建议使用匿名内部类：原因：1.因为一个类没有名字。没有办法重复使用；；2.代码太乱，可读性太差

    6.不理解就算了，记住这个写法就行

    7.IDEA中纠正错误的快捷键：alt+回车
* */

public class NeiBuClass {

    static String country;//静态变量
    static class Inner1{//该类在类的内部，称之为内部类，由于前面有static修饰，所以称之为“静态内部类”

    }

    int age;//实例变量
    class Inner2{//没有static修饰，所以叫实例内部类

    }

    public void doSome(){
        //局部变量
        int i=100;
        //局部内部类
        class Inner3{

        }
    }

    public void doOther(){
        //doSome方法中的局部内部类Inner3，在doOther中不能使用
    }

    public static void main(String[] args) {
        Mymath aa=new Mymath();

        //注意：这里没有使用匿名内部类，表示这个类名是有的，类名是：MyMathComputer
        aa.mysum(new MyMathComputer(),20,30);

        //当我现在要是用匿名内部类的时候，我下面的接口Computer的实现MyMathComputer类就不用写了，转而使用下面的代码：语法如下：
        aa.mysum(new Computer(){
            public int sum(int a,int b){
                return a+b;
            }
        },10,20);//这里的{}代表对接口的实现

        /*上面代码中的这一块就是匿名内部类创建的对象

        new Computer(){
            public int sum(int a,int b){
                return a+b;
            }
        }


        使用匿名内部类，表示这个类MyMathComputer没有名字了；
        这个接口表面上看上去好像是可以直接new了，实际上并不是接口可以直接new了
        后面的{}代表了对接口的实现

        不建议使用匿名内部类：原因：因为一个类没有名字。没有办法重复使用，另外，代码太乱，可读性太差
        * */


    }
}

interface Computer{
    //抽象方法
    int sum(int a,int b);
}

//以下的实现类是为了实现接口中的sum方法，以便后面的类调用上面的接口的时候，能用到其中的sum方法，
// 而如果我使用的是匿名内部类的话 ，这下面的实现类：MyMathComputer就可以省略
class MyMathComputer implements Computer{
    public int sum(int a,int b){
        return a+b;
    }
}

class Mymath {
    public void mysum(Computer a,int x,int y){
        int ret=a.sum(x,y);
        System.out.println(x+"+"+y+"="+ret);
    }

}


