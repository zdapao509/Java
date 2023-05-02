import java.io.*;

/*
 BufferedWriter:带有缓冲的字符输出流

 OutputStreamWriter: 转换流------>将字节输出流转化为字符输出流

* */
public class BufferedWriterTest01 {
    public static void main(String[] args) {

        BufferedWriter bw=null;
        FileWriter fw=null;
        FileOutputStream fos=null;

        try {

//            创建带缓冲区的字符流对象；创建字符流对象
            fw=new FileWriter("BufferedWriterTest.txt",true);

            bw=new BufferedWriter(fw);

//            当创建的是输出的字节流：套娃写法：FileOutputStream是OutputStreamWriter的节点流，OutputStreamWriter是包装流
//            OutputStreamWriter是BufferedWriter的节点流，BufferedWriter是包装流
            bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("BufferedWriterTest.txt",true)));


//            写入：
            char[] chars={'a','b','z','e'};

            bw.write(chars);

            bw.write("我来自火星");

//            刷新：
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
