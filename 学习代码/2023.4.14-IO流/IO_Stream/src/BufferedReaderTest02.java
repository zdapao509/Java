import java.io.*;

/*
测试转换流的使用：

    InputStreamReader

* */
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        BufferedReader br=null;//BufferedReader类初始化参数是：一个字符流对象；如果想要将一个字节流对象放到形式参数的位置，需要转换流
        FileInputStream fio=null;//准备创建字节流
        InputStreamReader isr=null;//转换流

        try {

//            创建字节流对象
            fio=new FileInputStream("test.txt");

//            创建转换流对象：
            isr=new InputStreamReader(fio);//在这个位置：FileInputStream 字节流属于节点流， 而InputStreamReader 转换流属于 包装流

//            创建缓冲流：
            br=new BufferedReader(isr);//在这个位置：InputStreamReader 转换流属于 节点流  ，而BufferedReader 缓冲流属于 包装流


//            另外一种合并的写法：套娃
            br=new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));


//            开始读数据：
            String line=null;

            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (br != null) {//这里注意：关闭的时候，只要将最外层的包装流进行关闭就好，不需要对其他流关闭
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
