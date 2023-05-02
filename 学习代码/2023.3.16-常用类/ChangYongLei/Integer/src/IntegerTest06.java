/*
Integer常用的方法：

常见的异常：
    类型转换异常：ClassCastException
    空指针异常：NullPointerException
    数组下标越界异常：ArrayIndexOutOfBoundsException
    数组格式化异常：NumberFormatException

* */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a=new Integer(100);
//        Integer b=new Integer("张");//编译没问题，符合语法；运行时报错，不是一个 数字 不可以包装成一个Integer类。
//        java.lang.NumberFormatException


//        重点方法：
//        静态方法： 传参String类型，返回int：
//        parseInt（String s）-----------将字符串类型的 数字 转换为整形的 数字
        int retValue=Integer.parseInt("123");
        System.out.println(retValue+100);//223

//        int retValue1=Integer.parseInt("zhnag");//java.lang.NumberFormatException 数组格式化异常

        double doubleValue=Double.parseDouble("3.14");
        System.out.println(doubleValue+1);//4.140000000000001

        float floatValue=Float.parseFloat("1.3");
        System.out.println(floatValue+1);//2.3


//        了解内容：
//        静态方法：十进制转二进制字符串：
        String a1=Integer.toBinaryString(3);
        System.out.println(a1);//11--字符串类型

//        十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        String a2=Integer.toHexString(16);//转为16进制字符串类型
        System.out.println(a2);//10

        String a3=Integer.toOctalString(8);
        System.out.println(a3);//八进制字符串：10

//        在Object类型的toString方法中；
        System.out.println(new Object());
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());-----将整形转换为字符串类型的16进制
    }
        * */


//        Integer中也有静态方法 valueOf------------将不是包装型的整数型数字转换为包装型
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);//int---->Integer

        Integer i2=Integer.valueOf("100");
        System.out.println(i2);//String ----> Integer

//        Integer i3=Integer.valueOf("zhang");//---------注意这里是不行的： java.lang.NumberFormatException
//        System.out.println(i3);
    }
}
