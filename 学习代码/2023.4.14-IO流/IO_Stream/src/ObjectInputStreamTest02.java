import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/*
反序列化集合: ObjectOutputStreamTest02
* */
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois=null;
        try {
//            创建序反列化对象
            ois=new ObjectInputStream(new FileInputStream("ObjectOutputStreamTest02"));

//            将内容进行反序列化：
/*            Object obj=ois.readObject();

            System.out.println(obj instanceof List);//true*/


//            进行强制类型转换：
            List<User> userList=(List<User>)ois.readObject();
            for (User user:userList) {
                System.out.println(user);

                /*name属性处于游离状态，不参与序列化，反序列化的时候，要新建对象，所以赋值为null
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
