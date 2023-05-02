/*
IO流，什么是IO?

    I : Input

    o : output通过IO可以完成硬盘文件的读和写


IO流的分类?   有多种分类方式

    一种方式是按照流的方向进行分类以内存作为参照物，往内存中去，叫做输入(Input)。或者叫做读(Read)。

         从内存中出来，叫做输出(output)。或者叫做写(write)。

    一种方式是按照读取数据方式不同进行分类:

        字节流： 有的流是按照字节的方式读取数据，一次读取1个字节byte，等同于一次读取8个二进制位，这种流是万能的，什么类型的文件都可以读取。

                包括:文本文件，图片，声音文件，视频

            假设文件filel.txt，采用  字节流  的话是这样读的:

                a中国bc张三fe

                    第一次读:1个字节正好读到'a'

                    第二次读:一个字节，正好读到中·字符的一半

                    第三次读:一个字节，正好读到·中·字符的另外一半


        字符流：有的流是按照 字符 的方式读取数据的，一次读取一个字符，这种流是为了方便读取普通文本文件而存在的，

                这种流不能读取: 图片、声音、视频等文件。只能读取纯文本文件，连word文件都无法读取。

                假设文件file1.txt，采用字符流的话是这样读的:

                    a中国bc张三fe

                第一次读: 'a'字符 (a'字符在windows系统中占用1个字节)

                第二次读:'中·字符 ('中'字符在windows系统中占用2个字节)。


        综上所述: 流的分类

                输入流、输出流

                字符流、字节流


java中IO流已经写好了，需要掌握Java中提供了哪些流，每个流的特点是什么，每个流对象的常用方法是什么

    java中所有的流都是在java.io.*下；

    java主要还是在研究，怎么new流对象，调用流对象的那个方法是读哪个方法是写


java IO流有四大家族：

    四大家族的首领：-------------都为抽象类

        java.io.InputStream  字节输入流

        java.io.OutputStream  字节输出流

        java.io.Reader    字符输入流

        java.io.Writer    字符输出流


    所有的流都实现了：

        java.io.Closeable接口，都是可关闭的，都有close（）方法；

        流毕竟是一个管道，是内存和硬盘之间的通道，用完了之后，一定要关闭。不然会占用很多资源。

    所有的输出流都实现了：

        java.io.Flushable接口，都是可刷新的，都有flush()方法；

        养成习惯：输出流在最终输出之后，一定要记得flush（）；刷新一下，

            这个刷新方法将通道、管道中的剩余未输出的数据强行输出完，清空管道，-----刷新的作用

            注意：如果没有flush（）可能会导致数据丢失


    java中只要类名以stream结尾的都是字节流，以Reader/Writer结尾的都是字符流


java.io下需要掌握的流有16个：

    文件专属：

        java.io.FileInputStream
        java.io.FileOutputStream
        java.io.FileReader
        java.io.FileWriter

    转化流：将字节流转换为字符流

        java.io.InputStreamReader
        java.io.OutputStreamWriter

    缓冲专属流：

        java.io.BufferedReader
        java.io.BufferedWriter
        java.io.BufferedInputStream
        java.io.BufferedOutputStream

    数据专属流：

        java.io.DateInputStream
        java.io.DateOutputStream

    标准专属流：

        java.io.PrintWriter
        java.io.PrintStream

    专属对象流：

        java.io.ObjectInputStream
        java.io.ObjectOutputStream

* */
public class IOTest01 {
    public static void main(String[] args) {
/*                System.out.println("-1234".matches("-?\\d+"));
                System.out.println("5678".matches("-?\\d+"));
                System.out.println("+911".matches("-?\\d+"));
                System.out.println("+911".matches("(-|\\+)?\\d+"));
                System.out.println("-81.23".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println("+81.23".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println("xx".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println(".5".matches("(-|\\+)?(\\d+)*.?\\d*"));
                System.out.println(" ".matches("(-|\\+)?(\\d+)?.?\\d+"));
                System.out.println(".5".matches("(-|\\+)?(\\d+).?\\d\\d*"));
                System.out.println("55.0".matches("(-|\\+)?(\\d+)*.?\\d+"));
                */
        System.out.println("123".matches("\"^(\\-|\\+)?\\d+(\\.\\d+)?$\""));
        int a=0;
        switch (a){
            
        }
    }
}
