/*
finally�������кܸߵ����ȼ��ġ�

    try��䲻�ܵ���ʹ��

    try finally����ǿ�������ʹ��de

* */

public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        ���´���ִ��˳��
            ��ִ��try
            Ȼ��ִ��finally
            ���ִ��try�е�return
        * */
        try{
            System.out.println("helloWorld!");
            return;
        }finally {
            System.out.println("***********");
        }

//        System.out.println("///////////////////////");java: �޷����ʵ����--------��������try����return�����ﲻִ��
    }
}
