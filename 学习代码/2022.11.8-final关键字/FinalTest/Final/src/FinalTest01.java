/*final关键字：
		1.final是java语言中的一个关键字

		2.final表示最终的，不可变的

		3.final可以修饰变量以及方法，还有类等。

		*4.final修饰的变量？

			final修饰的局部变量，一旦被赋值，不能重新赋值。

			final修饰的变量只能赋一次值。


		*5.final修饰的方法？

			final修饰的方法无法被覆盖，被重写

		*6.final修饰的类？

				final修饰的类无法继承

		7.final控制不了能不能调用的问题。final管的是啥？

				final修饰的表示最后的，不能变的，不能改的。

		*/

public class FinalTest01 {
    public static void main(String[] args) {
        System.out.println(123);

        int a=100;
        a=200;

        final int b=200;
//        b=300;//错误：java: 无法为最终变量b分配值

        final int c;
        c=500;
//        c=200;  错误：java: 可能已分配变量c
    }
}


//final class A{
//
//}
//
//class B extends A{
//
//}


//class MyString extends String{
////java: 无法从最终java.lang.String进行继承
//}

class C
{
    public void ABC(){
        System.out.println("C中的方法");//final public void ABC()     java: D中的ABC()无法覆盖C中的ABC()   被覆盖的方法为final
    }

}

class D extends C{
    public void ABC(){
        System.out.println("D中的方法");
    }
    public void doOther(){}

    public static void main(String[] args) {
        C c=new D();
//        c.doOther();  这句报错了，因为编译器报错了，编译器认为c是C类，C类中没有doOther方法
//        符号:   方法 doOther()
//        位置: 类型为C的变量 c
        if (c instanceof D){//如果C指向的对象确实是一个D类型，name就可以进行向下转型
            D d1=(D)c;
            d1.doOther();
        }
    }
}