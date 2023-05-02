import java.io.File;
import java.io.IOException;

/*
File

    1.File类和四大家族没有关系，所以File类不能完成文件的读和写

    2.File对象代表什么？

        文件和目录路径名的抽象表现形式

        F:\桌面\1-文件   这是一个File对象

        F:\桌面\1-文件\每日进展.txt   这也是一个File对象

        一个File文件可能对应的是目录，可能对应的是文件

        File只是一个路径名的抽象表示形式

    3.需要掌握File类中常用的方法

        f1.exists() 判断是否存在该文件夹

        f1.createNewFile();  创建文件

        f1.mkdir();   创建文件夹

        f1.mkdirs();   创建多重文件夹

        f2.getParent();   获取上一级文件夹

        f2.getParentFile();  以文件形式获取父文件夹

        f3.getAbsolutePath()； 获取文件绝对路径


* */
public class FileTest01 {
    public static void main(String[] args) {
//        创建File对象
        File f1=new File("F:\\桌面\\1-文件\\test\\a\\b\\c");

//        判断是否存在该文件夹：
        System.out.println(f1.exists());//没有创建之前是false

//        如果该文件不存在，创建一个该文件：以文件的形式创建
/*        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


//        如果该文件不存在，创建一个该文件：以 文件夹 的形式创建
        /*if (!f1.exists()) {
             f1.mkdir();
        }
*/


//        也可以创建多重目录
        if (!f1.exists()) {
            f1.mkdirs();
        }


//        创建File对象：
        File f2=new File("F:\\桌面\\1-文件\\每日进展.txt");

//       获取改文件的父路径：
        String parentPath=f2.getParent();
        System.out.println(parentPath);//F:\桌面\1-文件

//        以另外一种方法获取文件的父路径：
        File f3=f2.getParentFile();
        System.out.println("获取绝对路径的方法："+f3.getAbsolutePath());//获取绝对路径的方法：F:\桌面\1-文件




    }
}
