/*
�����Լ�д���쳣:MyException
* */

public class ExceptionTest15 {
    public static void main(String[] args) {
//       �����쳣����ֻ��new���쳣���󣬲�û���׳�

        MyException e=new MyException("�Զ����쳣");

//        ��ӡ�쳣��ջ��Ϣ
        e.printStackTrace();

//        ��ӡ�쳣��Ϣ��
        String s=e.getMessage();
        System.out.println(s);

    }
}
