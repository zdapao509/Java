import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常的处理方式：

    第一种方式：

        在方法声明的位置，使用throws关键字，抛给上一级----------------谁调我，我就抛给谁。

    第二种方式：

        使用try catch 语句进行异常的捕捉，不再上抛了

 注意：只要异常没有被捕捉。采用上报的方式，此方法的后续代码就不会执行，

      另外，try语句中的某一行出现异常，该行后面的代码不会执行

      try catch执行之后，后续代码块可以执行

      一个方法体出现异常上报之后，此方法结束
* */
public class ExceptionTest06 {
    /*
    一般不建议在main方法中使用throws，因为这样的异常真正的发生了，一定会抛给JVM，JVM直接终止程序
    异常处理机制就是为了增强程序的健壮性，怎么能做到异常发生了也不影响正常的程序执行。所以：一般的main方法中的异常建议使用try catch机制进行捕捉，main就不要再往上面传了
    * */

    public static void main(String[] args) {

        /*如果下面的m1抛出的是FileNotFoundException异常的话，就得是以下的方式
        try {//尝试
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }*/

/*    如果下面的m1抛出的是Exception异常的话，就得是以下的方式
    try {
            m1();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("main方法执行");
        try {//这里是因为下面的m1抛出了两个异常
            System.out.println("main执行");
            m1();
//            m1代码出现问题，直接进入catch块，后面的输出不再执行
            System.out.println("main结束");
        } catch (IOException e) {
            System.out.println("此文件不存在，文件路径有问题");
//            throw new RuntimeException(e);-------注意这里又抛出了，我不需要在抛出此异常
            System.out.println("--------------------");
            System.out.println(e);//java.io.FileNotFoundException: C:\Users\Administrator\Desk----------top\相干性-孙.txt (系统找不到指定的路径。)

        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
        }
        System.out.println("catch之后还能继续执行");
    }

    private static void m1() throws IOException, ClassNotFoundException {
        System.out.println("m1执行");
        m2();
        //            m2代码出现问题，直接进入上抛，后面的输出不再执行
        System.out.println("m1结束");
    }

    private static void m2() throws ClassNotFoundException,FileNotFoundException {
        System.out.println("m2执行");
        m3();
        //            m3代码出现问题，直接进入上抛，后面的输出不再执行
        System.out.println("m2结束");
//        这里如果不进行throws FileNotFoundException 操作就会报错，这是因为m3方法中没有对异常进行处理，只是将其上抛，现在m2调用它，没有处理，所以报错

//        注意这里：不能因为抛别的异常ClassNotFoundException 忽略FileNotFoundException异常，那就是没有解决FileNotFoundException异常，直接报错
//        但是可以跑FileNotFoundException异常的父类，IOException、或者Exception
    }

    private static void m3() throws FileNotFoundException {
        /*
        调用了SUN JDK中的类的构造方法，为什么编译报错：？
        原因：

            第一：这里调用了一个构造方法，FileInputStream

            第二：这个构造方法的声明位置上，有throws FileNotFoundException

            第三：通过类的继承结构看到：FileNotFoundException 的父类是 IOException，IOException的父类是 Exception----即为编译时异常

            错因就是：编译时异常必须在编译阶段就对其进行处理，否则，编译器就会报错

            这里采用第一种方式，在方法声明位置上使用throws继续将错误上抛

        * */
        System.out.println("m3执行");
        new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
        //            FileInputStream 代码出现问题，直接进入上抛，后面的输出不再执行
        System.out.println("m3结束");
    }
}
