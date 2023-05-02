/*
关于String类中的构造方法

常用的构造方法：

            String a="aaa";

            String s=new String("aa");

            String a=new String(char数组);

            String a=new String(char数组，数组元素下标的起始位置，长度);

            String a=new String(byte数组);

            String a=new String(byte数组，数组元素下标的起始位置，长度);
* */
public class StringTest04 {
    public static void main(String[] args) {
        String s1="aaa";//这是最简单得一种字符串创建方法
        System.out.println(s1);//正常应该输出的是内存地址，但是，输出一个引用的时候，会自动调用引用的toString方法，
        // 这里证明，String类已经重写了toString方法


//        只掌握常用的构造方法
        byte[] bytes={97,98,99,100,127};
        String a=new String(bytes);//创建时：字节数组先按照ASCII码转换为字符，然后创建字符串对象存在字符串常量池，最后在堆内存里面创建字符串对象
        System.out.println(a);//abcd


//        String（字节数组，数组元素下标的起始位置，长度）-----String(byte[] bytes, int offset, int length)
        String b=new String(bytes,1,2);
        System.out.println(b);//bc-将字节数组中指定位置的元素转换为字符串

//        将char数组中的全部转换为字符串
        char[] c= {'我','是','中','国','人'};
        String cc=new String(c);
        System.out.println(cc);//我是中国人

//        将char数组中的一部分转换为字符串
        String ccc=new String(c,2,3);
        System.out.println(ccc);//中国人
    }
}

