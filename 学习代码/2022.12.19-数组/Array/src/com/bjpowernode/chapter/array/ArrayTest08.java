package com.bjpowernode.chapter.array;
/*
* 数组的扩容：数组缺点，长度一旦确定，不可变
*
*   关于一维数组的扩容：
*
*   在java开发中，数组长度一旦确定了就不可变，那么数组满了怎么办？
*
*       数组满了，需要扩容
*          Java中对数组扩容是：
*
*               先新建一个大容量的数组，然后将小容量的数组中的数据一个一个的拷贝到大数组当中。
*
* 结论：数组扩容的效率较低，因为涉及到拷贝的问题，所以在以后的开发中请注意，尽量少进行数组的扩容。
*
*       可以在创建数组的时候预估一下多长合适，可以减少数组的扩容次数，提高效率。
*
* */
public class ArrayTest08 {
    public static void main(String[] args) {
//        java中是怎么进行拷贝的呢？
//        System.arraycopy();

//        拷贝源（从这个数组中拷贝）
        int[] ints={1,23,12,2,15};
//        拷贝目标（拷贝到这个目标数组上）
        int[] dest=new int[20];
//        调用JDK System类中的arraycopy方法，完成拷贝
        System.arraycopy(ints,1,dest,4,3);//这里的第一个参数放的是源数组，第二个参数放源数组中从哪个数进行复制，
        // 第三个参数放的是目标数组，第四个参数是复制到目标数组中的第几个数，第五个参数是要复制几个数

//        遍历目标数组dest：
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        System.out.println("*****************************");

//        将ints中的数全部拷贝到dest数组中：
        System.arraycopy(ints,0,dest,0,ints.length);

//        遍历目标数组dest：
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

//        数组中如果存的是引用数据类型，也可以进行拷贝
        String[] str={"hahah","hihi ","ijiji"};
        String[] newStr=new String[20];
        System.arraycopy(str,0,newStr,0,str.length);
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }

//        Object类型：注意这里复制的是对象的内存地址
        Object[] obj={new Object(),new Object()};
        Object[] objects=new Object[20];
        System.arraycopy(obj,0,objects,0,obj.length);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
