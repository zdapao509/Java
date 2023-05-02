/*
以下代码报错的原因：
    编写代码时没有对异常进行处理
* */

public class ExceptionTest04 {
    public static void main(String[] args) {
        /*
        由于doSome方法声明位置上有：throws ClassNotFoundException--------类没有找到异常，这个类的直接父类是：Exception，属于编译时异常
        在调用这个方法时必须先对这个异常进行处理，不处理就会报错。
        * */
//        dosome();//编译时异常：Unhandled exception: java.lang.ClassNotFoundException
    }

    public static void dosome() throws ClassNotFoundException{
        System.out.println("----------------");
    }
}


