package com.bjpowernode.chapter.array;
//当一个方法的参数是数组的时候，我们可以采用这样的方式赋值
public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        printArray(a);

        int[] aa=new int[5];
        printArray(aa);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        printArray(new int[6]);

//        有没有这种语法：
//        printArray({1,2,3,4});---------------java: 非法的表达式开始

        System.out.println("***************************************");
        printArray(new int[]{2,3,4,567,8});//但是支持这种语法------------如果直接传递一个静态数组的话，语法必须这样写
    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
