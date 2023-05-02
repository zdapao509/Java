import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
PrintStream： 标准输出流

默认输出到控制台，但是可以改变其输出方向，把他写入到硬盘文件里面

* */
public class PrintStreamTest01 {
    public static void main(String[] args) {

//        System.out 的返回值是一个PrintStream类对象
        System.out.println("hello world");

//        分开写：
        PrintStream ps=System.out;
        ps.println("牛哈");
        ps.println("huhu");

//        标准的输出流不需要手动close()关闭
//        可以改变标准输出流的方向

//        常用的System类的方法和属性：

/*        System.gc();
        System.exit(0);
        System.currentTimeMillis();
        System.arraycopy();//public static native void arraycopy(Object src,  int srcPos, Object dest, int destPos, int length);
        //从源数组src取元素，范围为下标srcPos到srcPos+length-1，取出共length个元素，
        // 存放到目标数组中，存放位置为下标destPos到destPos+length-1。常用作数组的扩容，如ArrayList底层数组的扩容*/


        try {
//            标准输出流不再指向控制台，指向“log”文件
            PrintStream ps1=new PrintStream(new FileOutputStream("log.txt",true));

//            修改输出方向，将输出方向改到输出至 log 文件
            System.setOut(ps1);

//            再输出：
            System.out.println("hello test");
            System.out.println("*************");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
