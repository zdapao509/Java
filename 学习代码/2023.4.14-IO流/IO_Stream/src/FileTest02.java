/*
File 文件的常用方法：

* */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f=new File("F:\\桌面\\1-文件\\每日进展.txt");

//        获取文件名
        System.out.println("文件名："+f.getName());//文件名：每日进展.txt

//        判断File是不是一个目录？
        System.out.println(f.isDirectory());//false

//        判断File是不是一个文件
        System.out.println(f.isFile());//true

//        获取文件最后一次的修改时间：
        long haoMiao=f.lastModified();//得到的是从1970年到现在的总毫秒数
        Date date=new Date(haoMiao);//此方法将秒数转换为日期
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss  SSS");
        String s=sdf.format(date);
        System.out.println("最后一次修改时间："+s);

//        获取文件夹下面的所有子文件,返回一个File数组
        File f1=new File("F:\\桌面\\1-文件");

        File[] files=f1.listFiles();
        for (File file:files) {
            System.out.println(file);
            /*
            F:\桌面\1-文件\~$力扣进展.xlsx
            F:\桌面\1-文件\力扣进展.xlsx
            F:\桌面\1-文件\力扣题目笔记-按题号
            F:\桌面\1-文件\开题.pptm
            F:\桌面\1-文件\每日进展.txt
            F:\桌面\1-文件\链表结构.png
            * */
        }
    }
}
