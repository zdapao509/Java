/*
����Integer��Ĺ��췽����������----������װ����ͬ

    Integer(int);
    Integer(String);

* */

public class IntegerTest03 {
    public static void main(String[] args) {
        Integer x=new Integer(123);
        System.out.println(x);//������100ת����Integer��װ���ͣ�int-->Integer��

//        ��String���͵�����ת��Integer��װ���͡�string--->Integer
        Integer y=new Integer("123");
        System.out.println(y);
    }
}
