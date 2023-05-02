//关于Object类中的finalize（）方法：非重点,了解即可
/*
1.在Object类中的源代码：
    protected void finalize() throws Throwable { }

    GC负责：调用finalize（）方法

2.finalize（）方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。

3.这个方法不需要程序员手动调用，JVM垃圾回收器负责调用这个方法，不像equals和toString方法是需要我们自己写代码调用的，
    finalize（）只需要重写，重写完了会有程序来调用

4.finalize（）方法的执行时机：
    当一个Java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize方法

5.finalize方法实际上是SUN公司为Java程序员准备的一个时机，垃圾销毁时机，如果希望在对象销毁时机执行一段代码的话，这段代码要写到finalize方法当中

6.静态代码块的作用是什么？
    static{

    }
    静态代码块是在类加载的时候执行的，并且只执行一次，
    这是SUN公司准备的类加载时机

    finalize（）方法同样也是SUN为程序员准备的一个时机，这个时机是垃圾回收时机。

7.提示：Java中的垃圾回收器不是轻易启动的，垃圾太少，或者时间没到，种种条件下，有可能启动，也有可能不启动


* */

public class finalize_test {
    public static void main(String[] args) {
        Person p=new Person();//创建对象
        p=null;//怎么把Person对象变成垃圾？这里采用的是：将引用赋值为空，那么原本有内存地址指向的对象无法被识别，就会被垃圾回收
        // -------一点点垃圾的话调用不了垃圾回收器，

        for (int i=0;i<10000;i++){
            Person p1=new Person();
            p1=null;
            //有一段代码可以建议垃圾回收器启动：但是只是建议，可能不启动，也可能启动，启动的概率大一点
            System.gc();
        }
    }
}


//项目开发的时候常常会遇到这种需求：所有对象在JVM中被释放的时候，记录一下释放时间！！
//记录对象被释放的时间节点，这个负责记录的代码主要写到finalize方法中

class Person{

    //重写finalize方法：person类型的对象，被垃圾回收的时候，垃圾回收器会负责调用：p.finalize();
    protected void finalize() throws Throwable {
        System.out.println(this+"即将被销毁");
    }
}
