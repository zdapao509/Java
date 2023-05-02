import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
DataInputStream：数据字节输入流

DataOutputStream：写的文件。只能使用DataInputStream去读取，并且，读的时候，必须提前知道写入的顺序，

读的顺序必须和写的顺序是一样的，才可以正常取出数据

* */
public class DataInputStreamTest01 {
    public static void main(String[] args) {
        DataInputStream dis=null;
        try {
//            创建输入流
            dis=new DataInputStream(new FileInputStream("DataOutputStreamTest01"));

//            开始读取：
            byte b=dis.readByte();
            short s=dis.readShort();
            int i=dis.readInt();
            long l=dis.readLong();
            float f=dis.readFloat();
            double d=dis.readDouble();
            boolean bo=dis.readBoolean();
            char c=dis.readChar();

//          显示：
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(bo);
            System.out.println(c);

/*
            100
            200
            500
            5606
            3.4
            3.21
            false
            a
* */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
