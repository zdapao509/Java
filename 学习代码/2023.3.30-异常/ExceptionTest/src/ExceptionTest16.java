/*
֮ǰ���ķ������ǵ�ʱ�����µ����⣺

    ��д֮��ķ������ܱ���д֮ǰ�ķ����׳����ࣨ���������쳣�����Ը��٣�����ԭ���׳���Ҳ���Բ��׳�


�ܽ᣺�쳣�г��õĹؼ��֣�

    �쳣��׽��

        try

        catch

        finally

    throws  �ڷ�������λ����ʹ�ã���ʾ�ϱ��쳣��Ϣ��������

    throw   �ֶ��׳��쳣
* */

public class ExceptionTest16 {
    public static void main(String[] args) {

    }
}

class AA{
    public void doSome() throws Exception{

    }

    public void doOther(){

    }
}

class BB extends AA{

/*   public void doSome(){//���Բ��׳��쳣

   } */

/*   public void doSome() throws NullPointerException{//�����׳����෽���׳��쳣�������쳣

    }*/

    public void doSome() throws Exception{//����ԭ���׳�

    }

/*    public void doOther() throws Exception{//���಻�׳��쳣�����಻�׳�
        super.doOther();
    }*/
}
