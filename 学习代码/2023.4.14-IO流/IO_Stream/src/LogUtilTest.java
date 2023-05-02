import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
自己写一个：日志工具类
* */
public class LogUtilTest {
    public static void main(String[] args) {
        String s="进入程序，准备启动";
        String s1="密码错误再次尝试";
        LogUtil.log(s);
        LogUtil.log(s1);
    }
}


class LogUtil{
    public static void log(String msg) {
        try {
//            创建标准输出流对象
            PrintStream ps=new PrintStream(new FileOutputStream("log.txt",true));

//            改变输出位置：
            System.setOut(ps);

//            记录当前时间：
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH : mm : ss  SSS");
            String s=sdf.format(date);

//            输出：
            System.out.println(s+" : "+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}