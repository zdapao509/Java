/*
ExceptionTest04中的异常的两种处理方式：
* */

public class ExceptionTest05 {
    /*public static void main(String[] args) throws ClassNotFoundException{
//        第一种处理方式：将异常继续上抛。在方法声明的位置使用 throws，来完成异常的继续上抛。抛给调用者
//        上抛类似于推卸责任，继续把异常传递给调用者
        dosome();
    }*/
    public static void main(String[] args){
//        第二种处理方式：try catch机制
//        捕捉异常等于把异常拦下，异常真正的解决了，调用者是不知道的
        try{
            dosome();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    public static void dosome() throws ClassNotFoundException{
        System.out.println("----------------");
    }
}
