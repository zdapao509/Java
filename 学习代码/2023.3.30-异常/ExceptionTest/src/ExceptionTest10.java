/*
关于try catch中的finally子句：

    1.在finally子句中的代码是最后执行的，并且是一定会执行的，即使try catch语句中的代码出现了异常；

        finally子句必须和try一起出现，不能单独编写

    2.finally语句使用情况：

        通常在finally语句中完成资源的关闭，释放

        因为finally语句中的代码比较有保障

        即使try语句中的代码出了问题，finally语句还是会执行
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream f=null;//放在try外面，这样在finally语句中才可以用
        try {
//            创建输入流对象：
//            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Administrator\\Desktop\\相干性-孙.txt");

            f=new FileInputStream("C:\\Users\\Administrator\\Desktop\\相干性-孙.txt");

            String s=null;

            s.toString();//运行时异常，空指针异常

            System.out.println("************************");

//            流使用完之后必须进行关闭，否则占用资源
//            即使上面的程序出现问题，流也必须关闭！
//            放在此处，流就无法关闭
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally {
//            流的关闭放在这里比较保险，finally中的语句一定会执行，即使try中的语句出现了异常
//            fileInputStream.close();注意：写在try中的参数是局部变量，是不能在finally语句中再用的；所以得在main方法中设置局部变量
            try {
                System.out.println("流已经关闭");
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("-------");
            }
        }

        System.out.println("执行结束");
    }
}
