package com.bjpowernode.chapter.array;
import java.util.Arrays;
/*
Arrays工具类：可以直接导入使用;
工具类中的方法都是静态的，可以直接调用。

    java.util.Arrays
* */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] a={5,56,4,8,35,0};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        int index=Arrays.binarySearch(a,8);//如果后面要查，某个数组里面是不是有某个元素，就可以直接调用二分法+三目运算符判断
        System.out.println(index==-1?"不包含此数":"8在数组中的位置："+index);
    }
}
