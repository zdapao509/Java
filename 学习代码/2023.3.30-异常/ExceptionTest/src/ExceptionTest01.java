/*
�쳣������ִ���еĲ��������

    java�ṩ�쳣�Ĵ��������ʲô�ã�

        ����java�г��ֵĲ������������java���Ժ����ƣ��ṩ���쳣������ƣ����³���ִ�й����г����˲������������

        java�Ѹ��쳣��Ϣ��ӡ������̨��������Ա�ο���

        ����Ա�����쳣��Ϣ֮�󣬾Ϳ��Զ��쳣��Ϣ�����޸ġ��쳣������ƣ���java���Ը��ӽ�׳


* */
public class ExceptionTest01 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
//        ʵ���ϳ���ִ�е��˴�����new�쳣����new ArithmeticException��"/by zero"��
//        ����JVM��new���쳣��Ϣ ��ӡ������̨
        int c=a/b;
        System.out.println(c);//�׳��쳣�� Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at ExceptionTest01.main(ExceptionTest01.java:13)

        System.out.println(100/0);//�˴�����Ҳ�ᴴ��һ���쳣�����׳�

/*        int a=10;
        int b=0;
        if(b==0){
            System.out.println("������Ϊ0");
            return;
        }

        int c=a/b;//����ִ�е��˴���Ϊ0*/
    }
}
