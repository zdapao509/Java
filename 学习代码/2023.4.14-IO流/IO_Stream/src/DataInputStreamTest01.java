import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
DataInputStream�������ֽ�������

DataOutputStream��д���ļ���ֻ��ʹ��DataInputStreamȥ��ȡ�����ң�����ʱ�򣬱�����ǰ֪��д���˳��

����˳������д��˳����һ���ģ��ſ�������ȡ������

* */
public class DataInputStreamTest01 {
    public static void main(String[] args) {
        DataInputStream dis=null;
        try {
//            ����������
            dis=new DataInputStream(new FileInputStream("DataOutputStreamTest01"));

//            ��ʼ��ȡ��
            byte b=dis.readByte();
            short s=dis.readShort();
            int i=dis.readInt();
            long l=dis.readLong();
            float f=dis.readFloat();
            double d=dis.readDouble();
            boolean bo=dis.readBoolean();
            char c=dis.readChar();

//          ��ʾ��
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
