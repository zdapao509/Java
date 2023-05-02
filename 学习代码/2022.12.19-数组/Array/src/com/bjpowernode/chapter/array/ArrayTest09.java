package com.bjpowernode.chapter.array;
/*
* 关于java中的二维数组。：
*   1.二维数组其实是一个特殊的一位数组，特殊在这个一位数组当中的每一个元素都是一个一维数组
*   2.三维数组是什么？三维数组是一个特殊的二维数组，特殊在这个二维数组中每一个元素是一个一维数组
*       实际开发中，使用最多的就是一维数组， 二维数组也很少使用，三维数组几乎不用
*   3.二维数组静态初始化
*       int[][] array={{100,20,30},{1,2,3},{59,4,65}};
* */
public class ArrayTest09 {
    public static void main(String[] args) {
//        一维数组
        int[] array={100,200,300};

//        二维数组
//        下面的二维数组里面的是3个一维数组：
        int[][] a={
                {100,200,2003,2326},//注意这里面是靠逗号分开的
                {10,2,3},
                {5}
        };
        System.out.println(a.length);//3
        System.out.println(a[0].length);//4
        System.out.println(a[1][2]);
    }
}
