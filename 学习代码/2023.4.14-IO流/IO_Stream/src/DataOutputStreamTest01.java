import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream:数据专属的流

这个流可以将数据以及数据的类型一并写入文件

注意：这个文件不是普通的文本文档，用记事本是打不开的
* */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
//        创建数据专属的字节输出流:
        DataOutputStream dos=null;
        try {
            dos=new DataOutputStream(new FileOutputStream("DataOutputStreamTest01"));

//            写入数据：
            byte b=100;
            short s=200;
            int i=500;
            long l=5606;
            float f=3.4F;
            double d=3.21;
            boolean bo=false;
            char c='a';

//            写入：
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(bo);
            dos.writeChar(c);

//            刷新：
            dos.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
