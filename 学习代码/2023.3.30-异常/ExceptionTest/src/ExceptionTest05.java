/*
ExceptionTest04�е��쳣�����ִ���ʽ��
* */

public class ExceptionTest05 {
    /*public static void main(String[] args) throws ClassNotFoundException{
//        ��һ�ִ���ʽ�����쳣�������ס��ڷ���������λ��ʹ�� throws��������쳣�ļ������ס��׸�������
//        ������������ж���Σ��������쳣���ݸ�������
        dosome();
    }*/
    public static void main(String[] args){
//        �ڶ��ִ���ʽ��try catch����
//        ��׽�쳣���ڰ��쳣���£��쳣�����Ľ���ˣ��������ǲ�֪����
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
