package com.bjpowernode.chapter.array;
/*
二维数组的遍历
* */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] str={
                {"张","威","明"},
                {"动力","节点"},
                {"x","y","z"}
        };
        for (int i = 0; i < str.length; i++) {//取数的规律就是外部循环控制行变化，内部循环控制每一行的内部变化
            for (int j = 0; j < str[i].length; j++) {
                System.out.print(str[i][j]+" ");
            }
            System.out.println();//换行
        }
    }
}
