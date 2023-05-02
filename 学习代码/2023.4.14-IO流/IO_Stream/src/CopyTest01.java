import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
ʹ��FileInputStream + FileOutputStream ����ļ��Ŀ���

    �����Ĺ��̣�һ�߶���һ��д

    ʹ�����ϵ��ֽ��������ļ����ļ��������⣬û�����ƣ�ʲô�����ļ����ܿ���

* */
public class CopyTest01 {

    public static void main(String[] args) {

        FileInputStream fis=null;

        FileOutputStream fos=null;

        try {
//            ��������������
            fis=new FileInputStream("H:\\��Ƶ+S54+���鸨�����Կؼ���+������ͨ��ѧ.mp4");

//            �������������
            fos=new FileOutputStream("������Ƶ.mp4");

//            ��ʼ���ƣ�һ�߶���һ��д
            int readData=0;

            byte[] bytes=new byte[1024*1024];//ÿ�ζ�1M�����ݣ�1024��1k��

            while ((readData = fis.read(bytes)) != -1) {//��ȡ�����ݣ���ʱ�����ڴ��У������� bytes����ʽ�棬readDataͳ�������Ҫ��ȡ��������

                fos.write(bytes,0,readData);//��bytes�������ļ�����д����ȡ���پ�д����

            }

//            д��֮��һ���ǵã�������� ˢ��
            fos.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }finally {//����Ҫע�⣺�ر�����ʱ�� ��Ҫ�ֱ�try catch ����ͳһ����catch��������Ϊ�������һ�����Ĺرճ��������⣬
            // ��������Ͳ�����ִ�У�ֱ��catch�ˣ����������Ĺر�

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
