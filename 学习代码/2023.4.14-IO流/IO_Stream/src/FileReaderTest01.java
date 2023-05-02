import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:

    文件字符输入流，只能读取普通文本

    读取文本内容，比较方便，快捷

    字符流用char数组；字节流用byte数组
* */
public class FileReaderTest01 {
    public static void main(String[] args) {

        FileReader reader=null;

        try {
//            创建文件字符流输入
            reader=new FileReader("test.txt");

//            开始读取：
            char[] chars =new char[4];//一次读取4个字符

            int readCount=0;

            while ((readCount = reader.read(chars)) != -1) {

//                System.out.print(new String(chars,0,readCount));
                /*
                abcdefhaidhHZNAzhian站发给我IE烦恼米欧尼
                * */

//                观察一次读取的字符数：每次读取4个字符
                System.out.println("本次读取：");

                for (char c : chars) {

                    System.out.println(c);
                    /*
                    本次读取：
                    a
                    b
                    c
                    d
                    本次读取：
                    e
                    f
                    h
                    a
                    本次读取：
                    i
                    d
                    h
                    H
                    本次读取：
                    Z
                    N
                    A
                    z
                    本次读取：
                    h
                    i
                    a
                    n
                    本次读取：
                    站
                    发
                    给
                    我
                    本次读取：
                    I
                    E
                    烦
                    恼
                    本次读取：
                    米
                    欧
                    尼
                    恼
                    * */
                }
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
