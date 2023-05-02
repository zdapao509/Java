import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
�����л�����: ObjectOutputStreamTest02
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
//            �������л�����
            ois=new ObjectInputStream(new FileInputStream("ObjectOutputStreamTest02"));

//            �����ݽ��з����л���
/*            Object obj=ois.readObject();

            System.out.println(obj instanceof List);//true*/


//            ����ǿ������ת����
            List<User> userList=(List<User>)ois.readObject();
            for (User user:userList) {
                System.out.println(user);

                /*name���Դ�������״̬�����������л��������л���ʱ��Ҫ�½��������Ը�ֵΪnull
                null:10
                null:50
                null:100
                * */
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
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
