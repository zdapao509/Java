import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
反序列化：ObjectInputStream

    在对Student类进行了手写序列号之后，修改原来类的结构，再次进行反序列化就不会出现报错
* */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
            ois=new ObjectInputStream(new FileInputStream("ObjectOutputStreamTest01"));

//           开始反序列化：反序列化是一个学生对象，
            Object res=ois.readObject();

//           输出：自动调用学生对象的toString方法
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
