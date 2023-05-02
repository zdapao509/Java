/*
try catch深入：

    catch后面的小括号中的类型可以是具体的异常类型，也可以是给异常类型的父类型---------多态机制

    catch可以写多个，建议catch的时候，精确地一个一个的处理，方便调试

    catch写多个的时候，从上到下，必须遵守从小到大


    在以后的开发中，处理编译时异常，应该上报还是捕捉？

        如果希望调用者来处理，那就选择throws上报。其余使用try catch机制
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest07 {
    public static void main(String[] args) {


/*        try {
            new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/



/*        try {
            new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
        } catch (Exception e) {//多态机制：父类型的引用指向子类型的应用   Exception e=new FileNotFoundException（）
            throw new RuntimeException(e);
        }*/


        try {
           FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
           f.read();
        } catch (FileNotFoundException e) {//多态机制：父类型的引用指向子类型的应用   Exception e=new FileNotFoundException（）
            System.out.println("文件路径错误");;
        } catch (IOException e) {
            System.out.println("IoException---读文件的报错");
        }

        System.out.println("-------------------------------------------------");
        try {
            FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");
            f.read();
        } catch (IOException e) {//注意：这里的IOException是FileNotFoundException的父类，所以上面抛出的两种类型的错误都可以通过这里捕捉
            System.out.println("IoException---读文件的报错");
        }

        System.out.println("-------------------------------------------------");
        try {

            FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\相干性-孙.txt");

            System.out.println(100/0);//这属于运行时异常，编译时可以处理也可以不处理

        } catch (FileNotFoundException | ArithmeticException e) {//注意：这是JDK8的新特性，允许这样的形式抛出异常
            System.out.println("读文件的报错或者数学异常");
        }
    }
}
