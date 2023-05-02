/*
频繁的进行字符串的拼接有什么问题：
    因为java中的字符串是不可变的，每一次拼接都会产生新的字符串，
    会占用大量的方法区内存。
    String s="abc";
    s+="hello";
    上面两句代码就已经在方法区中的字符串常量池里面创建了3个对象：
    "abc"
    "hello"
    "abchello"


    如果以后要进行大量的字符串的拼接工作，建议使用JDK中自带的：

        java.lang.StringBuffer
        java.lang.StringBuilder


StringBuffer底层实际上是一个byte[]数组；
    往StringBuffer中放字符串，实际上是放到byte数组当中了，
    StringBuffer的初始化容量是16

如何优化StringBuffer的性能？
    在创建StringBuffer的时候，尽可能定一个初始化容量；-------------扩容次数越少，效率越高
    最好减少底层数组的扩容次数，预估计一下，给一个大一些的初始化容量。

String创建字符串对象和StringBuffer创建对象时，底层同样都包含一个byte数组，但是区别是：

        String中的数组是被final修饰了: private final byte[] value;（String为什么不可变的理由：数组被final修饰）

        而StringBuffer中的数组是没有被修饰的: byte[] value;



        StringBuffer的数组对象，数组一旦创建-->长度一定，当数组满了的时候，就会创建一个新的长度的数组对象，

        把原先的数组中的数拷贝过来，然后指针指向新的数组对象，然后原数组就会被垃圾回收器回收,达到减少内存占用的目的。

        而String中的字符串就不能这样，因为他的内存地址一旦确定就不能被修改，被final修饰了。


 StringBuilder：同样可以完成字符串拼接
    与StringBuffer的区别，：
    StringBuffer中的方法都有：synchronized关键字修饰，表示，StringBuffer在多线程环境下运行是安全的。
    StringBuilder中的方法都没有synchronized关键字修饰，表示StringBuilder在多线程环境下运行是不安全的

    StringBuilder是非线程安全的。
    StringBuffer是线程安全的。


面试题：String是不可变的，为甚？

        我看过源代码，String类中有一个byte[] 数组，这个byte数组被final修饰了。
        因为数组一旦创建长度不可变，并且被final修饰的引用一旦指向某个对象之后，不可以再指向其他对象，所以String是不可变的
        “abc”无法转换成“abcd”

        StringBuffer、StringBuilder为什么是可变的。？

        StringBuffer、StringBuilder内部实际上是一个byte[]数组，这个数组没有被final修饰，
        StringBuffer、StringBuilder的初始化容量应该是16，当内存满了之后，会进行扩容，
        底层调用了数组的拷贝方法：System.arraycopy()进行扩容的，
        所以StringBuffer、StringBuilder适合用于字符串的频繁拼接操作

* */
public class StringBufferTest01 {
    public static void main(String[] args) {
        /*String a="";
        for (int i = 0; i < 100; i++) {
            a+=i;
            System.out.println(a);
        }*/

//        创建一个初始化容量为16的byte[]数组，字符串缓冲区对象
        StringBuffer str=new StringBuffer();

//        拼接字符串，统一用append（）方法
        str.append("张");
        str.append("01");
        str.append(0);
        str.append(100L);
        System.out.println(str);

//        指定初始化容量的StringBuffer对象，
        StringBuffer STR=new StringBuffer(100);
        STR.append(10);
        STR.append("zhang ");
        System.out.println(STR);

//        创建StringBuilder对象：
        StringBuilder aa=new StringBuilder();
        aa.append("abc");
        aa.append("123");
        System.out.println(aa);

//        字符串的不可变是指“abc”不可变成“abcd”，不是指下面的s不能变
        String s="abc";
        s="abcd";//这里的s只是存字符串在方法区中的字符串常量池里面的内存地址，本身没有被final修饰，所以可以操作。
    }
}
