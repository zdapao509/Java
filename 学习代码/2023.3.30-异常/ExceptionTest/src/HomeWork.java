/*
��д����ģ���û�ע�᣺

    1.����ʼִ��ʱ����ʾ�û����룺�û�����������Ϣ

    2.������Ϣ֮�󣬺�̨java����ģ���û�ע�ᣬ

    3.ע��ʱ���û���Ҫ�󳤶���6-14֮�䣬С�ڻ��ߴ��ڶ������쳣

    ע�⣺

        ���ע��ķ����ŵ�һ�����������У��쳣���Զ��弴��

        ��дmain��������main�����н����û�����Ϣ����main�����е���UserService���register�������ע��

* */

public class HomeWork {
    public static void main(String[] args) {
        String a="    �� ��  ��    ";
        String b="123456";
        UserService user=new UserService();
        try {
            user.register(a,b);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class UserService{
    String username,passward;
    public void register(String username,String passward) throws MyException {
        /*
        * ��̾��飺����==null ��÷������е��ж�ǰ��
        *
        * ͨ������д�� null==���á�����д�� ����=null�����˸�ֵ
        * */
        if(username==null||username.trim().length()<6||username.trim().length()>14){
            throw new MyException("�û������ȳ�������");
        }
        this.username=username;
        this.passward=passward;
        System.out.println("���ע��");
    }
}