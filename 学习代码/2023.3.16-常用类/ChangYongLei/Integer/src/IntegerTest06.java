/*
Integer���õķ�����

�������쳣��
    ����ת���쳣��ClassCastException
    ��ָ���쳣��NullPointerException
    �����±�Խ���쳣��ArrayIndexOutOfBoundsException
    �����ʽ���쳣��NumberFormatException

* */
public class IntegerTest06 {
    public static void main(String[] args) {
        Integer a=new Integer(100);
//        Integer b=new Integer("��");//����û���⣬�����﷨������ʱ��������һ�� ���� �����԰�װ��һ��Integer�ࡣ
//        java.lang.NumberFormatException


//        �ص㷽����
//        ��̬������ ����String���ͣ�����int��
//        parseInt��String s��-----------���ַ������͵� ���� ת��Ϊ���ε� ����
        int retValue=Integer.parseInt("123");
        System.out.println(retValue+100);//223

//        int retValue1=Integer.parseInt("zhnag");//java.lang.NumberFormatException �����ʽ���쳣

        double doubleValue=Double.parseDouble("3.14");
        System.out.println(doubleValue+1);//4.140000000000001

        float floatValue=Float.parseFloat("1.3");
        System.out.println(floatValue+1);//2.3


//        �˽����ݣ�
//        ��̬������ʮ����ת�������ַ�����
        String a1=Integer.toBinaryString(3);
        System.out.println(a1);//11--�ַ�������

//        ʮ�����ƣ�1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        String a2=Integer.toHexString(16);//תΪ16�����ַ�������
        System.out.println(a2);//10

        String a3=Integer.toOctalString(8);
        System.out.println(a3);//�˽����ַ�����10

//        ��Object���͵�toString�����У�
        System.out.println(new Object());
        /*
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());-----������ת��Ϊ�ַ������͵�16����
    }
        * */


//        Integer��Ҳ�о�̬���� valueOf------------�����ǰ�װ�͵�����������ת��Ϊ��װ��
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);//int---->Integer

        Integer i2=Integer.valueOf("100");
        System.out.println(i2);//String ----> Integer

//        Integer i3=Integer.valueOf("zhang");//---------ע�������ǲ��еģ� java.lang.NumberFormatException
//        System.out.println(i3);
    }
}
