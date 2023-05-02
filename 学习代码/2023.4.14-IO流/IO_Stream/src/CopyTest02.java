import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
使用  FileReader + FileWriter  将文件进行复制。

注意：这种方式是有局限性的，只能拷贝文本文件


IO 流的重点就是：框架搭建好
* */
public class CopyTest02 {
    public static void main(String[] args) {

        FileReader reader=null;

        FileWriter out=null;

        try {
//            读
            reader=new FileReader("test.txt");

//            写
            out=new FileWriter("src/CopyTest02.txt");

//            一边读，一边写：
            char[] chars=new char[4];//注意：1024个字节是1KB，1024*1024个字节是1MB；
            // char数组中存放的是字符；一个字符=2个字节，
            // 所以字符数组里：1024*512个字符就是  1MB
            int readData=0;

            while ((readData = reader.read(chars)) != -1) {

                System.out.println(new String(chars));//展示每一次读取到的数据---每次四个字符
                /*
                abcd
                efha
                idhH
                ZNAz
                hian
                站发给我
                IE烦恼
                米欧尼恼
                * */

                out.write(new String(chars,0,readData));//写入数据
            }

//            刷新：
            out.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }finally {//关闭流

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
