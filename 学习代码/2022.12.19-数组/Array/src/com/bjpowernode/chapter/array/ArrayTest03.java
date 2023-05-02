package com.bjpowernode.chapter.array;
//当一个方法上，参数的类型是一个数组的时候，要怎么传参数
public class ArrayTest03 {
    public static void main(String args[]) {//注意看这里的中括号写到String后面试java的标准写法，写到args后面是C++的标准写法，但是java中也允许这样写
        System.out.println("123");
//        静态初始化话传参数
        String[] aa={"123789","zjhia"};
        ArrayTest(aa);

        int[] bb= {1,2,3,45,65,789};
        ArrayTest(bb);

//        动态初始化传参数：
        String[] cc=new String[10];
        ArrayTest(cc);

        ArrayTest(new String[15]);

        ArrayTest(new int[5]);
    }

    public static void ArrayTest(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    public static void ArrayTest(int[] aa){//方法重载
        for (int i = 0; i < aa.length;i++) {
            System.out.println(aa[i]);
        }
    }
}
