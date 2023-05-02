import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件字节输出流： 负责写

从内存到硬盘。

* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {

        FileOutputStream fos=null;

        try {

            fos=new FileOutputStream("src/outputTest");//会自动创建文件，但是不能自动创建文件夹

//            开始写文件
            byte[] bytes={97,98,99,100,101};

//            将bytes数组中的所有数据写出
            fos.write(bytes);

//            指定写出bytes数组中的数据范围
            fos.write(bytes,0,2);//从下标0 开始写，写出长度：2  （此时的长度如果超出要求范围，属于运行时异常）

//            上面的过程得到的是：  abcdab    能不能在源文件的后面继续添加，而不是每一次都清空覆盖

//            要想不清空原文件内容：以追加的方式在文件末尾写入：不会清空源文件内容
            fos=new FileOutputStream("src/outputTest01.txt",true);//参数为false时，代表将源文件覆盖

            fos.write(bytes);

//            将字符串内容写入文件：先转成字节数组
            String s="我来自火星";

//            将字符串转成数组：
            byte[] bs=s.getBytes();

//            写入文件：
            fos.write(bs);


//            注意：写完之后，一定注意用flush函数进行刷新，将管道中所有的数全部写完；清空管道
            fos.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (fos != null) {

                try {

                    fos.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }
    }
}
