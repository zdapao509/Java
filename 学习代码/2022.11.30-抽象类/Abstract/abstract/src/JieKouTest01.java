/*
接口：

    1.接口也是一种引用数据类型，编译之后也生成一个class字节码文件。

    2.接口是完全抽象的，（抽象类是半抽象）或者说接口是特殊的抽象类

    3.接口是怎么定义的，语法是什么？

        [修饰符列表] interface 接口名{}

    4.接口支持多继承，一个接口可以继承多个接口.接口与接口之间用继承；类与接口之间用实现。

    5.接口中只允许出现两部分内容：  一部分是：常量。  一部分是：抽象方法，接口中没有其他内容了，只有以上两个部分。

    6.接口中的所有元素都是public修饰的，都是公开的；

    7.接口中的抽象方法定义时，public abstract修饰符可以省略；

    8.接口中的方法都是抽象方法，所以接口中的方法不能有方法体；

    9.接口中的常量的public static final 可以省略。---------接口中随便写一个变量就是常量，值不能改变的就是常量
* */

public class JieKouTest01 {
    public static void main(String[] args) {
        System.out.println(math.pi);

        //math.pi=3.154;//错误： java: 无法为最终变量pi分配值

    }
}

//定义接口
interface A{}

interface B{}

interface C extends A{}

interface D extends A,B{}//接口支持多继承，一个接口可以继承多个接口------------注意这里是，接口和接口之间支持多继承，用extends实现继承过程

//class E extends A,B{}//报错： java: 需要'{'---------类与接口之间是不能进行多继承的，可以多实现

interface math{
    public static final int a =10;//常量：这里的public static final是可以省略的

    double pi=3.1415926;//这是一个常量，前面自动加：public static final

    /*以下这样的定义方式是不被允许的，常量只能一行定义好。
    int a;
    a=10;
     */

    public abstract int sum(int a,int b);//抽象方法-----------形式参数、实际参数

    int subx(int a,int b);//接口当中既然都是抽象方法，那么在写代码的时候，public abstract可以省略；也就是这个方法还是抽象方法
                            // ------实际执行的时候，这里的语法又变成了：public abstract int subx(int a,int b);


    /*int anxi(){//这样写是错误的： java: 接口抽象方法不能带有主体-----------即接口中的方法是不能有主体的

    }*/

}

//class G{}
//class H{}
//class J extends G{},H{}---------表明，常规类的继承是不能多继承的，
