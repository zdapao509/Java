import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader:

    带有缓冲区的字符输入流

    使用这个流的时候，不需要自定义char 数组，或者说不需要自定义byte数组，自带缓冲

* */
public class BufferedReaderTest01 {

    public static void main(String[] args) {

        BufferedReader br=null;

        FileReader reader= null;

        try {

            reader = new FileReader("test.txt");

//            当一个流的构造方法需要一个流的时候，这个被传进来的流叫做：节点流
//            外部负责包装的这个流，叫做：包装流，还有一个名字，叫做：处理流
//            当前程序的  FileReader  就是一个节点流，  BufferedReader就是包装流，处理流
            br=new BufferedReader(reader);

//            这个包装流有一个特点：可以一次性读取一行数据：
            String aLine=br.readLine();
            System.out.println(aLine);
            //abcdefhaidhHZNAzhian站发给我IE烦恼米欧尼

//            br.readLine()方法读取一个文本行，但是不带换行符

//            当br.readLine()方法返回的是一个null的时候，代表已经读取完毕：

            String s =null;

            while ((s=br.readLine()) != null) {//注意：br.readLine()方法是不能自动换行的

                System.out.println(s);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (br != null) {//注意：关闭流的时候，对于包装流来说，只要关闭最外层流就行，里面的节点流会自动关闭。
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
