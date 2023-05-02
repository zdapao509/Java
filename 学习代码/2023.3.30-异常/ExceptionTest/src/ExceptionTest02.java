/*
java语言中，异常以什么形式存在？

    java 中异常以类的形式存在，每一个异常类都可以创建实例化对象


* */

public class ExceptionTest02 {
    public static void main(String[] args) {
//        通过异常类实例化异常对象：
        NumberFormatException nfe=new NumberFormatException("数字格式化异常");
        System.out.println(nfe);//java.lang.NumberFormatException: 数字格式化异常

        NullPointerException npe=new NullPointerException("空指针异常");
        System.out.println(npe);//java.lang.NullPointerException: 空指针异常
    }
}
