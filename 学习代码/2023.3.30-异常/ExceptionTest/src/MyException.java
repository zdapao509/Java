/*
SUN公司提供的JDK 内置的异常肯定是不够用的，在实际开发中，需要自定义相关的异常

自定义异常的两个步骤：

    1.编写异常类Exception或者RuntimeException

    2.提供两个构造方法，一个无参数的，一个有参数的构造方法
* */

public class MyException extends Exception{
    public MyException(){}

    public MyException(String s){
        super(s);
    }

}
