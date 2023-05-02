package com.bjpowernode.chapter.array;
/*
动态初始化二维数组
* */
public class ArrayTest12 {
    public static void main(String[] args) {
//       三行四列
        int[][] aa=new int[3][4];
        int[][] bb=new int[3][];
//        遍历二维数组
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j]);
            }
            System.out.println();
        }

        System.out.println("*************************");
/*        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < bb[i].length; j++) {
            //报错原因：Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "bb[i]" is null
                System.out.print(bb[i][j]);
            }
            System.out.println();
        }*/

        int[][] aaa={{12,12,3,450},{15,12,2,3},{12,12}};
        printArray(aaa);

//        没有这样的语法：
//        printArray({{12,12,3,450},{15,12,2,3},{12,12}});

//        但是可以这样写：
        printArray(new int[][]{{1,2,3},{45,6,45}});
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"   ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
