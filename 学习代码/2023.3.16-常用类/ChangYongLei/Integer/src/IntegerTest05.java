/*
在JDK1.5之后，支持自动拆箱和自动装箱了

有了自动拆箱之后，Number类中的拆箱方法就用不着了。

自动拆线的优点：方便编程

* */
public class IntegerTest05 {
    public static void main(String[] args) {
//        自动装箱：
//        int类型--自动转换为--Integer类型--------自动装箱

        Integer x=100;

//        Integer类型自动转换为int类型------自动拆箱（x是Integer类型，即为包装类型；而y类为基本数据类型）

        int y=x;

        Integer z=1000;//z里面保存的是内存地址，z是包装类，为一个引用分，保存的是内存地址。等同于：Integer z=new Integer(1000);
        System.out.println(z+1);//这里的输出  引用+int类的数字   为什么没有报错  ：
        // 因为这里调用了自动拆箱机制，先将Integer包装类自动拆箱成了基本数据类型整数类，然后整数类相加

//       == 不会触发自动拆箱机制，所以还是比较的两个对象的内存地址：只有 + - * /这些符号才能触发拆箱机制
        Integer q=1000;
        System.out.println(z==q);//false-------进行的是内存地址的比较，

//      java中为了提高程序的执行效率，将[-128,127] 之间的所有的包装对象提前创建好，放到了一个方法区的“整数型常量池”中 ；实际上是缓存一组对象
//      目的是：再使用这个范围的数据不需要再new了。直接从整数型的常量池中取出来。
        Integer a=128;
        Integer b=128;
        System.out.println(a==b);//false

        Integer o=127;
        Integer p=127;
        System.out.println(o==p);//true----原理就是：o p 中保存的对象的内存地址都是一样的，都在整数型常量池中
    }
}
