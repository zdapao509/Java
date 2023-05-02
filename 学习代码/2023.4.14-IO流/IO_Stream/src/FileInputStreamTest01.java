import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileImputStream:

    1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读取

    2.字节的方式，完成输入的操作，完成读的操作（硬盘---->内存）


以下程序的问题：

    一次读取一个字节byte，这样内存和硬盘交互太频繁，基本上时间都浪费在交互上面了，能不能一次读取多个字节呢？  可以
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fis=null;//因为要在finally里面将流关闭，所以先将其定义在try的外部，方便finally内部进行判断

        try{

            fis=new FileInputStream("G:\\2--Java学习\\学习笔记\\2023.4.14-IO流\\test.txt");//创建文件输入流对象---采用绝对路径的方式
//            注意这里写成 ‘/’ 也是可以的

//            得到流对象之后，可以开始读数据了
            int readData=0;

            while ((readData = fis.read()) != -1) {//此方法的返回值是读取到的字节本身；read方法指向一个指针，每read一次，指针往后面移动一次

                System.out.println("此时："+readData);
                /*
                此时：97
                此时：98
                此时：99
                此时：100
                此时：101
                此时：102   //读到文件尾部，返回-1
                * */
            }
        }catch (FileNotFoundException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }finally{//用来进行流的关闭

            if (fis != null) {//当流不是null的时候，需要进行关闭

                try {

                    fis.close();

                }catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }

    }
}
