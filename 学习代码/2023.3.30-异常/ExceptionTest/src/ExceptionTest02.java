/*
java�����У��쳣��ʲô��ʽ���ڣ�

    java ���쳣�������ʽ���ڣ�ÿһ���쳣�඼���Դ���ʵ��������


* */

public class ExceptionTest02 {
    public static void main(String[] args) {
//        ͨ���쳣��ʵ�����쳣����
        NumberFormatException nfe=new NumberFormatException("���ָ�ʽ���쳣");
        System.out.println(nfe);//java.lang.NumberFormatException: ���ָ�ʽ���쳣

        NullPointerException npe=new NullPointerException("��ָ���쳣");
        System.out.println(npe);//java.lang.NullPointerException: ��ָ���쳣
    }
}
