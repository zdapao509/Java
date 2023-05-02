/*
异常：程序执行中的不正常情况

    java提供异常的处理机制有什么用？

        对于java中出现的不正常的情况，java语言很完善，提供了异常处理机制，以下程序执行过程中出现了不正常的情况，

        java把该异常信息打印到控制台，供程序员参考。

        程序员看到异常信息之后，就可以对异常信息进行修改。异常处理机制，让java语言更加健壮


* */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
//        实际上程序执行到此处，会new异常对象，new ArithmeticException（"/by zero"）
//        并且JVM将new的异常信息 打印到控制台
        int c=a/b;
        System.out.println(c);//抛出异常： Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at ExceptionTest01.main(ExceptionTest01.java:13)

        System.out.println(100/0);//此处运行也会创建一个异常对象并抛出

/*        int a=10;
        int b=0;
        if(b==0){
            System.out.println("除数不为0");
            return;
        }

        int c=a/b;//程序执行到此处不为0*/
    }
}
