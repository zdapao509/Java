package com.bjpowernode.chapter.array;
/*
 冒泡排序算法

 原始数组： 2 1 5 3 8 0------------一共6个数，循环5次比较-------可以看成，每次都让最大的数到右边，那么6个数，每次放一个，放5次，就可以排完序
                                            在每一次循环里面，是两两比较。比如一开始，6个数，两两比较，就要5次。
                                            5个数，两两比较，就要4次。

 第一次循环：
   1 2 5 3 8 0 第一次比较，交换
   1 2 5 3 8 0 第二次比较，不交换
   1 2 3 5 8 0 第三次比较，交换
   1 2 3 5 8 0 第四次比较，不交换
   1 2 3 5 0 8 第五次比较，交换

 第二次循环：
   1 2 3 5 0 第一次比较，不交换
   1 2 3 5 0 第二次比较，不交换
   1 2 3 5 0 第三次比较，不交换
   1 2 3 0 5 第四次比较，交换

 第三次循环：
   1 2 3 0 第一次比较，不交换
   1 2 3 0 第二次比较，不交换
   1 2 0 3 第三次比较，交换

 第四次循环：
   1 2 0 第一次比较，不交换
   1 0 2 第二次比较，交换

 第五次循环：
   0 1 第一次比较，交换



* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={15,6,8,4,0,41};
        /*int count=0;
        for (int i = 0; i < arr.length-1; i++) {采用这种方式i从0开始
            for (int j = 0; j < arr.length-1-i; j++) {两两比较--需要的次数是原始数组的长度减一次，5个数，比4次
                count++;
                if (arr[j] > arr[j+1]) {
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

//        i直接从最大值开始更加方便
        int count=0;
        int count2=0;
        for (int i = arr.length-1; i >0 ; i--) {//6个数，只要循环5次就行
            for (int j = 0; j < i; j++) {
                count++;
                if (arr[j] >arr[j+1] ) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count2++;
                }
            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("比较次数："+count);
        System.out.println("交换次数："+count2);
    }
}
