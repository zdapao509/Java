/*
Integer int String �������͵�ת��
* */
public class IntegerTest07 {
    public static void main(String[] args) {
//        int-->String
        System.out.println(123+"");//���Ϊ�ַ���
        String i=String.valueOf(123);

//        Stirng --->int
        int j=Integer.parseInt("123");
        System.out.println(j);//123

//        int--->Integer
        Integer k=100;//�Զ�װ��
        Integer l=Integer.valueOf(100);

//        Integer--->int
        int m=k.intValue();
        int n=l;//�Զ�����

//        Integer---->String
        String o=String.valueOf(k);

//        String ---->Integer
        Integer p=Integer.valueOf("123");
    }
}
