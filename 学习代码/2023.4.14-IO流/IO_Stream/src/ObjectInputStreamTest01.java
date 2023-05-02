import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
�����л���ObjectInputStream

    �ڶ�Student���������д���к�֮���޸�ԭ����Ľṹ���ٴν��з����л��Ͳ�����ֱ���
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("ObjectOutputStreamTest01"));

//           ��ʼ�����л��������л���һ��ѧ������
            Object res=ois.readObject();

//           ������Զ�����ѧ�������toString����
            System.out.println(res);

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
