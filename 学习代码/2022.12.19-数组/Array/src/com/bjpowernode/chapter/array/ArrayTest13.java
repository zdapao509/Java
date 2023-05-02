package com.bjpowernode.chapter.array;
/*
排序算法：冒泡排序		选择排序

查找算法：二分法查找

以上的算法java中已经封装好了，直接调用。工具类：Arrays-----------java.util.Arrays;  其中有一个sort方法，可以排序。

工具类的方法大部分都是静态的，直接调用
* */
import java.util.Arrays;

/*
使用以下的SUN公司提供的数组工具类：java.util.Arrays;
* */
public class ArrayTest13 {
    public static void main(String[] args) {
        int[] arr={15,45,61,34,84,1,58,83,79,45,41};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
