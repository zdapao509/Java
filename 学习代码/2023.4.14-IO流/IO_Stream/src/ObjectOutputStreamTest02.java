/*
����һ�������л����������

    ���Եģ����Խ�������ڼ����� �����л�����

��ʾ��

    �������л���ArrayList�����Լ������е�Ԫ��User�඼��Ҫʵ��Sreializable�ӿ�


����transient�ؼ��֣�

    ����״̬�����������л����̡�����һ����������ؼ��ֵ�ʱ���ڽ������л���ʱ�򣬸����Բ��������л�

* */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) {
        List<User> user=new ArrayList<>();
        user.add(new User("zhang",10));
        user.add(new User("lisi",50));
        user.add(new User("wangwu",100));

        for (User u:user) {
            System.out.println(u);
            /*
            zhang:10
            lisi:50
            wangwu:100
            * */
        }

        ObjectOutputStream ois=null;
        try {
//            �������������
            ois=new ObjectOutputStream(new FileOutputStream("ObjectOutputStreamTest02"));

//            ���л�һ�����ϣ����϶����з��˺ܶ���������
            ois.writeObject(user);

//            ˢ��
            ois.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class User implements Serializable{
    private transient String name;//����״̬�����������л�
    private int no;
    public User(){}
    public User(String name,int no) {
        this.name=name;
        this.no=no;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getNo(){
        return no;
    }
    public void setNo(int no) {
        this.no=no;
    }
    public String toString(){
        return this.name+":"+no;
    }
}
