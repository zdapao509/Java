package com.bjpowernode.chapter.array;
/*
关于二维数组中元素的：读和改
a[二维数组中一维数组的下标][一维数组的下标]
a[0][0]:表示第一个数组的第一个元素
注意：对于a[0][0]来说，其中的a[0]是一个整体，后面的[0]是前面的a[0]执行之后的结果然后再下标0
* */
public class ArrayTest10 {
    public static void main(String[] args) {
//        二维数组
        int[][] aa={
                {100,20,30},
                {15,56},
                {50,656,556,4161,34}
        };
//        请取出以上二维数组中的第一个一维数组
        int[] a1=aa[0];
        int a=a1[0];
        System.out.println(a);
//        合成：
        System.out.println(aa[0][0]);
//        第二个一维数组中的第一个元素：
        System.out.println(aa[1][0]);
//        改：
        aa[0][2]=10;
        System.out.println(aa[0][2]);
//        注意不要越界：java.lang.ArrayIndexOutOfBoundsException
//        System.out.println(aa[0][3]);
    }
}
