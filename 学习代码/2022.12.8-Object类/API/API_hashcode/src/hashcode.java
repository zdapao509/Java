/*
hashCode方法：

    在Object中的hashCode方法的原码：

        public native int hashCode();

        这个方法不是抽象方法，带有native关键字，底层是调用的C++程序；返回值是int类型

     hashCode方法返回的是：哈希码

        实际上就是一个Java对象的内存地址，经过哈希算法，得出一个值，所以hashCode（）方法的执行结果可以等同看做是一个Java对象的内存地址
* */

public class hashcode {
    public static void main(String[] args) {
        Object obj=new Object();
        int hashCode01=obj.hashCode();
        System.out.println(hashCode01);//764977973

        //对象内存地址经过哈希算法转换的一个数字，可以等同看做内存地址

        MyClass a=new MyClass();
        int hashCode02=a.hashCode();
        System.out.println(hashCode02);//2129789493

    }
}

class MyClass{

}
