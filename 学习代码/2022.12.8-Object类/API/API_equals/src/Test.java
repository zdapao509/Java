/*
本代码用于：

    Java语言中的字符串String有没有重写toString（）方法，有没有重写equals方法。

    总结：

        1.String类已经重写了equals方法，比较两个字符串不能使用==，必须使用equals方法。equals是通用的。

        2.String 类已经重写了toString方法。

    大结论：

        Java中什么类型的数据可以使用"=="判断？

            Java中基本数据类型的比较是否相等，使用==

        Java中什么数据类型的使用需要equals判断

            Java中所有的引用数据类型统一使用equals方法来判断是否相等。

            这是规矩
* */

public class Test {
    public static void main(String[] args) {

        //大部分情况下，采用这样的方式创建字符串对象
        String s1="test";
        String s2="test";
        System.out.println(s1==s2);//true：作为局部变量出现的时候，这里是相等的。表明局部变量之间用==判断的是两个值相等。没有调用equals方法
        System.out.println(s1);//test

        //实际上，String也是一个类，不属于基本数据类型，所以，既然String是一个类，那么定存在构造方法。
        String s3=new String("test");
        String s4=new String("test");
        System.out.println(s3==s4);//false
        //new两次，两个对象内存地址，s3保存的内存地址和s4保存的内存地址不同。==判断的是两个内存地址，不是内容
        System.out.println(s3.equals(s4));//true 这说明，equals方法已经修改用于判断对象的内容是否相等，而不是判断两对象的内存地址是否相等
        System.out.println(s1.equals(s3));//true 判断内容而不是地址
        System.out.println(s1==s3);//false；虽然内容相同，但是这里没有调用toString方法，所以后面是带了内存地址的，二者不相等
        System.out.println(s3);//test----------虽然这里显示的s3的值是test和s1的值表面上是相等的，都是test，
        // 但是实际上，这里的s3是引用数据类型，所以调用的时候，实际上是：s3.toString（），（当我不写toString方法的时候，系统默认调用）
        // 也就是s3+内存地址的十六进制，但是这里由于String类里面已经对toString方法进行了重写，
        // 所以，隐藏了内存地址，但是这不代表s1和s3就相等了，内存地址只是隐藏了

        //String类有没有重写toString方法？
        String x=new String("动力节点");
        //如果String没有重写toString方法，输出的结果应该是：Java.lang.String@十六进制的内存地址
        //经过测试，String类已经重写了toString方法。
        System.out.println(x.toString());//动力节点
        System.out.println(x);//动力节点

    }
}
