import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
以后查看异常的追踪信息的时候，怎么看 可以快速的调试程序？

    从上往下，直接跳过SUN公司给的异常信息，主要看自己的
* */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();//打印异常堆栈追踪信息，
//            在实际开发中建议使用这个，养成好习惯

            /*
            java.io.FileNotFoundException: C:\Users\Administrator\Desk----------top\相干性-孙.txt (系统找不到指定的路径。)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
                at ExceptionTest09.m3(ExceptionTest09.java:27)
                at ExceptionTest09.m2(ExceptionTest09.java:23)
                at ExceptionTest09.m1(ExceptionTest09.java:19)
                at ExceptionTest09.main(ExceptionTest09.java:12)

                27行的问题导致23行，23导致19 ，19导致12
            * */
        }

//        下面的代码不会被停止，继续执行，很健壮
        System.out.println("程序继续执行");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
    }
}
