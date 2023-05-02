/*
唯一一个可影响finally语句优先性的语句：

     System.exit(0);//退出JVM之后，finally语句中的代码不执行
* */

public class ExceptionTest12 {
    public static void main(String[] args) {
        try{
            System.out.println("------------");
            System.exit(0);//退出JVM之后，finally语句中的代码不执行
        }finally {
            System.out.println("*********");
        }
    }
}
