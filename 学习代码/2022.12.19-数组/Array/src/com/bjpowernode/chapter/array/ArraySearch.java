package com.bjpowernode.chapter.array;
/*
数组中元素的查找：
    两种方法：
        1.遍历，直到找到为止
        2.二分法，效率更高   binarySearch

        二分法查找建立在排序的基础之上；

        二分法查找原理：

            10（下标0） 23 56 89 799 4664 5615 8989 45456 565656（下标9）----找 565656

            开始下标 0  结束下标 9----------------查找下标 （0+9）/2=4；  数组[4]=799<565656

            开始下标 4+1  结束下标 9--------------查找下标  （5+9）/2=7;  数组[7]=8989<565656

            开始下标 7+1  结束下标 9--------------查找下标  （8+9）/2=8;  数组[8]=45456<56565

            开始下标 8+1  结束下标 9--------------查找下标   （9+9）/2=9；  数组[9]=565656

         二分法终止条件：一直折半，直到中间的那个元素恰好是被查到的元素

* */
public class ArraySearch {
    public static void main(String[] args) {
        int[] a={1,2,7,43,65};

        /*for (int i = 0; i < a.length; i++) {-------------方法1，遍历
            if (a[i] == 5) {
                System.out.println("65下标为："+i);
                return;
            }
        }
        System.out.println("执行到此处，没有此数");
        return;*/

        int index=arraySearch(a,2);
        System.out.println(index==-1?"该元素不存在":"65的下标是："+index);//三目运算符
    }

    /*public static int arraySearch(int[] a, int i) {--------遍历
        for (int j = 0; j < a.length; j++) {
            if (a[j] == i) {
                return j;
            }
        }
        return -1;
    }*/


    /*public static int arraySearch(int[] a, int i) {--------直接定义中间点的索引，这种定义方法在处理最后的0 1下标的数会出现报错
        int index=(a.length-1)/2;
        while(index>=0 && index<=a.length-1){//当索引的范围超出限制的时候，就说明没有找到这个数
            if (i == a[index]) {//要找的数正好和中间的数相等，返回此下标
                return index;
            } else if (i>a[index]) {//要找的数在中间下标的右边，重新二分，起始下标为 中间下标+1
                index=(index+1+a.length-1)/2;
            }else if(i<a[index]){//要找的数在中间数的左边，重新二分，终点下标 中间下标-1
                if (index == 2) {//这一步的出现是为了避免当下标为2时，(2-1)/2=0；实际上当运行到只剩下下标0 1两个数的时候，要从大的开始，也就是从1进行比较
                    index++;
                }
                index=(index-1)/2;
            }
        }
        return -1;
    }*/

    public static int arraySearch(int[] a, int i) {//二分正确写法
        int begin=0;//定义起始下标
        int end=a.length-1;//定义结束下标

        while(begin<=end){//循环条件是：起始下标的一定在结束下标前面，否则就错了

            int index=(begin+end)/2;

            if (i == a[index]) {//要找的数正好和中间的数相等，返回此下标
                return index;
            } else if (i>a[index]) {//要找的数在中间下标的右边，重新二分，起始下标为 中间下标+1
                begin=index+1;
            }else if(i<a[index]){//要找的数在中间数的左边，重新二分，终点下标 中间下标-1
                end=index-1;
            }
        }
        return -1;
    }


}
