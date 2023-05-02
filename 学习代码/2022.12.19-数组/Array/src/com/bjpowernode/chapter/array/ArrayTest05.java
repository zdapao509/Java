package com.bjpowernode.chapter.array;
/*
* 1.main方法上面的“String[] args”是什么意思？
*
*       分析一下：谁负责调用main方法（JVM）
*       JVM调用main方法的时候会自动传一个String数组过来
*
* java中用DOS命令的时候：可以从RUN里面找到EditConfiguration,里面有一个Program arguments，传一下参数就好
* */
public class ArrayTest05 {

//   这个方法程序员负责写出来，JVM负责调用，JVM调用的时候，一定会传一个String数组过来

    public static void main(String[] args) {

//JVM默认传递过来的这个数组的长度是:默认为0
//        通过测试得出：args不是null；----------args是一个引用数据类型，也就是说他是一个引用存的是内存地址，如果args==null,就会出现空指针异常，但是
//        这里并没有出现空指针异常，就表明args是有值的，JVM是给他传了地址的

        System.out.println("JVM给传过来的String数组参数，他这个数组的长度是："+args.length);


//        这个数组什么时候里面会有值呢？
//        其实这个数组是留给用户的，用户可以在控制台输入参数，这个参数自动被转换为：“String[] args”
//        例如这样的运行程序：java ArrayTest05 abc def xyz
//        那么这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成之后，自动放到“String[] args”数组中
//        所以main方法中的String[] args 数组主要是用来接收用户输入的参数的
//        把abc def xyz转换成字符串数组：{”abc“,"def","xyz"}
//        遍历数组：
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }




//        以下这行代码说明：数组对象创建了，但是数组中没有任何东西
        String[] a=new String[0];//java: 缺少数组维------如果中括号里面什么都不填的话，就会出现这个错
        String[] aa={};
        printLength(aa);



    }
    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
