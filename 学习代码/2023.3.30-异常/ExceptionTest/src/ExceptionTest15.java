/*
调用自己写的异常:MyException
* */

public class ExceptionTest15 {
    public static void main(String[] args) {
//       创建异常对象，只是new了异常对象，并没有抛出

        MyException e=new MyException("自定义异常");

//        打印异常堆栈信息
        e.printStackTrace();

//        打印异常信息：
        String s=e.getMessage();
        System.out.println(s);

    }
}
