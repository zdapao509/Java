import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:

    文件字符输出流：写

    只能输出普通文本。

    写入的形式可以是：字符型数组：char[]   或者可以直接写 字符串

* */

public class FileWriterTest01 {

    public static void main(String[] args) {

        FileWriter out = null;

        try {

//            out=new FileWriter("FileWriterTest.txt");//创建文件字符流对象

            out=new FileWriter("FileWriterTest.txt",true);//不覆盖源文件，直接在源文件后面添加

            char[] chars={'a','y','b','d','张'};

            out.write(chars);//将字符全部写入

            out.write(chars,0,2);//部分写入

            out.write("\n我来自火星");//可以直接写入字符串

//            写完了一定记得刷新：
            out.flush();

        } catch (IOException e) {

            e.printStackTrace();

        }finally{

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
