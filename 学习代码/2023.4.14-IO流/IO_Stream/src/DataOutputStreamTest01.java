import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
java.io.DataOutputStream:����ר������

��������Խ������Լ����ݵ�����һ��д���ļ�

ע�⣺����ļ�������ͨ���ı��ĵ����ü��±��Ǵ򲻿���
* */
public class DataOutputStreamTest01 {
    public static void main(String[] args) {
//        ��������ר�����ֽ������:
        DataOutputStream dos=null;
        try {
            dos=new DataOutputStream(new FileOutputStream("DataOutputStreamTest01"));

//            д�����ݣ�
            byte b=100;
            short s=200;
            int i=500;
            long l=5606;
            float f=3.4F;
            double d=3.21;
            boolean bo=false;
            char c='a';

//            д�룺
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(d);
            dos.writeBoolean(bo);
            dos.writeChar(c);

//            ˢ�£�
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
