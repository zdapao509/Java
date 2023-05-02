/*
在IDEA中，默认的文件路径是：Project工程的根目录。比如：此时文件的默认文件的读取位置是：IO_Stream  文件夹；本段代码中的相对路径都是从这个文件夹下面开始的

int read(byte[] b)

    一次最多读取b.length 个字节

    减少硬盘和内存之间的交互，提高程序的运行效率

    往byte[] 数组当中读
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

    public static void main(String[] args) {

        FileInputStream fis=null;

        try {

//            fis=new FileInputStream("test.txt");//文件的相对位置，放在：G:\2--Java学习\学习代码\2023.4.14-IO流\IO_Stream\test.txt文件夹

            fis=new FileInputStream("src/test.txt");//相对位置，放在 IO_Stream 项目文件夹里面的 src 文件夹

//            读取的时候，以数组的方式进行读取，加快读取的速度：用byte[] 数组的方法读取
            int readData=0;

            byte[] cur=new byte[4];//一次读取4个字节

            while ((readData=fis.read(cur)) != -1) {//当读不到数据的时候，返回 -1

//                System.out.println(cur[0]);cur[0]=97，通过String构造方法，直接将字节数组中的ASCII码值转换成字符，也就是直接转成 a

                String a=new String(cur,0,readData);
                //通过String的构造方法，将cur数组的指定位置的字节转换成字符串，
                // 这里的readData就是每一次读取到的字节数量,指定每一次读取的字节数量，否则出现转换的字符串比读取到的字符串要长的现象

//                System.out.println(a);--------自动换行不好看文件的原来格式，改成不换行

                System.out.print(a);//不进行自动换行，方便读到的数据返回的就是原来的数据格式
            }
        }catch (FileNotFoundException e) {

            e.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }finally {

            if (fis != null) {

                try {

                    fis.close();

                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }
}
