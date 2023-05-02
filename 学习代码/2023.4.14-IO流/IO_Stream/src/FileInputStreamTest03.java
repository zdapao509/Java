import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其他常用方法：

    int available(); 返回流中剩余的没有读取到的字节数量

    long skip(long n)： 跳过几个字节不读

* */
public class FileInputStreamTest03 {
    public static void main(String[] args) {

        FileInputStream fis=null;

        try {

            System.out.println("-------------------------------方法available----------------------------");

//        方法：  int available(); 返回流中剩余的没有读取到的字节数量

            fis=new FileInputStream("test.txt");

            System.out.println("可以读取的字节数量"+fis.available());

//            读一个字节，剩下5个字节
            int readData = fis.read();

//            剩余字节数量：
            System.out.println("还剩下的字节数量"+fis.available());

//           这个方法的用处：实现根据available方法，得到需要指定的数组的长度，不需要循环，直接读一次就可以

            byte[] bytes=new byte[fis.available()];//能读取几个，就创建多长的数组长度

            // -----------缺点：不适合太大的文件：没有太大的连续内存空间。数组的内存空间是连续的

            int readCount=fis.read(bytes);//5----上面读了一个

            System.out.println(new String(bytes));

            System.out.println("-------------------------------方法skip----------------------------");

//          方法：  long skip(long n)： 跳过几个字节不读

            fis=new FileInputStream("src/test.txt");

            System.out.println("可以读取的字节数量"+fis.available());

            fis.skip(3);//表明跳过 3 个字节不读取

            System.out.println(fis.read());//100 是字符 d，整好对应的ASCII是 100

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

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
