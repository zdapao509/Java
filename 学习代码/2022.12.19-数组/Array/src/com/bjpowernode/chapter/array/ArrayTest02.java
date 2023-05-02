package com.bjpowernode.chapter.array;
/*
* 数据类型默认值：
*
* 数据类型    默认值
* byte       0
* short      0
* int        0
* long       0L
* float      0.0F
* double     0.0
* boolean    false
* char       \u0000
* 引用数据类型  null
*
*
* 什么时候采用静态初始化的方式赋值，什么时候采用动态初始化的方式赋值？
*
*   当你创建数组的时候，确定数组中存储那些具体的元素的时候，采用静态初始化的方式
*
*   当你创建数组是，不确定数组中存储那些具体的元素的时候，可以采用动态初始化的方法，预先分配内存空间
* */
public class ArrayTest02 {
    public static void main(String[] args) {
//        声明/定义一个数组，采用动态初始化的方式创建
        int[] a=new int[4];//创建长度为4的int数组，数组中的每个元素的默认值都是0
//        遍历数组：
        for(int i=0;i<4;i++){
            System.out.println("下标为："+i+"的数是："+a[i]);
        }

//        创建一个object类型的数组，采用动态初始化的方式
        Object[] objs=new Object[4];//注意创建数组的时候，中括号一定记得带
        for(int i=0;i<4;i++){
            System.out.println(objs[i]);
        }

//        创建一个字符串类型的对象
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        String[] strs=new String[3];
        for(int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
        }

//        采用静态初始化的方式
        String[] strs1={"100","zzzzz"};
        for(int i=0;i< strs1.length;i++){
            System.out.println(strs1[i]);
        }

//        存储Object,采用静态初始化：
        Object o1=new Object();
        Object o2=new Object();
        Object o3=new Object();
        Object[] obj={o1,o2,o3};
        Object[] obj1={new Object(),new Object(),new Object()};//当然也可以这样定义
        for (int i = 0; i <obj.length ; i++) {
            System.out.println(obj[i]);
            /*
            * 上面这句等同于：
            * Object o=obj[i];
            * System.out.println(o.toString());也就是说，这里的obj[i]会自动调用toString方法
            * */
        }
    }
}
