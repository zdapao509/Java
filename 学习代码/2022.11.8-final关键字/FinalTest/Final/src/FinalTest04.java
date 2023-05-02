/*
FinalTest03的结论：
    final修饰的实例变量，必须手动赋值
    《重点》final修饰的变量，只能赋值一次；

final修饰的实例变量一般添加static修饰；

终极结论：
    static final联合修饰的变量称为“常量”
    常量名建议全部大写，每个单词之间常用下划线衔接

常量:实际上常量和静态变量一样，区别在于：

    常量的值不能变，且在定义的时候就要赋好值，静态变量的值是可以改变的

    (但静态变量是唯一的，也就是一旦改变，所有的  引用.静态  变量值都会改变，实际上是因为，
    他们都会变成： 类名.静态变量----指向同一个内存空间，无论在作用域的哪里调用修改，改变的都是同一个内存地址。)。

    常量和静态变量都是存储在方法区，并且都是在类加载时初始化。

    常量一般都是公共的：public的。
* */

public class FinalTest04 {
    public static void main(String[] args) {
        System.out.println(Chinese.COUNTRY);
        Chinese.JingTai="zzz";
        System.out.println(Chinese.JingTai);//静态变量值可以改变，由于指向的是同一个内存地址，所以以后的通过 引用.静态变量 的方式，访问静态变量的值的时候，都会改变
//        Chinese.COUNTRY="美国";//错误：java: 无法为最终变量COUNTRY分配值
    }
}

class Chinese{
    String idCard;
    String name;
    static String JingTai="中国";
//    String COUNTRY;
    //国家的值是一个固定值“中国”
    //实例变量在堆中，一个对象一份，100个对象100份
    //实例变量既然使用final修饰了，说明该实例变量值不会随着对象的变化而变化。
    //该实例变量前面应该添加static关键字，变为静态的，存储在方法区。
//    static final String COUNTRY="中国";
public static final String COUNTRY="中国";//一般的常量都是公开的

public static final int a=10;//i永远都是10，创建多少个实例都是10；既然这样
    //没必要声明为实例变量，最好是静态的，节省内存；
}