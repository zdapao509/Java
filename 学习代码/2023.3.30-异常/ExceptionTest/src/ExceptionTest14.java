/*
final  finally  finalize 的区别：

    final关键字：

        final修饰的类无法继承；

        final修饰的方法无法被覆盖

        final修饰的变量不能重新赋值

    finally关键字：

        和try一起联合使用

        finally语句块中的代码是必须执行的

    finalize标识符：

        是Object类中的方法名

        这个方法是由垃圾回收器GC负责调用的
* */

public class ExceptionTest14 {
    public static void main(String[] args) {

        final int i=100;//变量无法重新赋值

        try{

        }finally {//异常处理机制

        }

//        finalize是Object类中的一个方法，作为方法名出现。所以finalize是标识符

    }
}
