/*
ö�����ͣ���һ��������

       ע�⣺�������û����ö�����ͣ����´����������ʲô���⣿

        ���ȱ�ݣ�divide�����ķ���ֵ�����ϣ���ǡ������Ȼ���Ľ��ֻ�ǳɹ�ʧ�ܣ����ʹ��Boolean���͡�

        ��ΪBoolean�������ÿ��Ա�ʾ���ֲ�ͬ��״̬
* */
public class EnumTest01 {
    public static void main(String[] args) {
        boolean a=divide(5,3);
        System.out.println(a);

        boolean b=divide(10,0);
        System.out.println(b);
    }
/*    public static int divide(int a,int b){//���ȱ�ݣ�divide�����ķ���ֵ�����ϣ���ǡ������Ȼ���Ľ��ֻ�ǳɹ�ʧ�ܣ�
                                                            //���ʹ��Boolean���͡���ΪBoolean�������ÿ��Ա�ʾ���ֲ�ͬ��״̬
        try{
            int c=a/b;
            return 1;
        }catch(Exception e){
            return 0;
        }
    }*/


    public static boolean divide(int a,int b){//���ַ����ȽϺ�������ֻ�����������ʵ�������У����ֵĲ�ֻ���������������ʹ���ܵ�����-----��������ö��
        try{
            int c=a/b;
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
