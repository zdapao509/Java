/*
Ψһһ����Ӱ��finally��������Ե���䣺

     System.exit(0);//�˳�JVM֮��finally����еĴ��벻ִ��
* */

public class ExceptionTest12 {
    public static void main(String[] args) {
        try{
            System.out.println("------------");
            System.exit(0);//�˳�JVM֮��finally����еĴ��벻ִ��
        }finally {
            System.out.println("*********");
        }
    }
}
