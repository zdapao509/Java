/*
�쳣��������Ҫ�ķ�����

    ��ȡ�쳣�򵥵�������Ϣ��

        String msg=exception.getMessage();

    ��ӡ�쳣׷�ٵĶ�ջ��Ϣ��

        exception.printStackTrace();
* */
public class ExceptionTest08 {
    public static void main(String[] args) {
//        ע������ֻ��new�����쳣���󣬲�û�н����׳���JVM����Ϊ��ֻ��һ���򵥵�java����
        NullPointerException np=new NullPointerException("��ָ���쳣������");
        String msg=np.getMessage();
        System.out.println(msg);//��ָ���쳣������

        np.printStackTrace();//��ӡ�쳣��׷����Ϣ��
//        java��̨��ӡ�쳣�Ķ�ջ׷����Ϣ��ʱ��,���õ����첽�̵߳ķ�ʽ��ӡ��

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}
