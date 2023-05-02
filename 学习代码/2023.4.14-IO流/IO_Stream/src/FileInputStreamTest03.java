import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream����������÷�����

    int available(); ��������ʣ���û�ж�ȡ�����ֽ�����

    long skip(long n)�� ���������ֽڲ���

* */
public class FileInputStreamTest03 {
    public static void main(String[] args) {

        FileInputStream fis=null;

        try {

            System.out.println("-------------------------------����available----------------------------");

//        ������  int available(); ��������ʣ���û�ж�ȡ�����ֽ�����

            fis=new FileInputStream("test.txt");

            System.out.println("���Զ�ȡ���ֽ�����"+fis.available());

//            ��һ���ֽڣ�ʣ��5���ֽ�
            int readData = fis.read();

//            ʣ���ֽ�������
            System.out.println("��ʣ�µ��ֽ�����"+fis.available());

//           ����������ô���ʵ�ָ���available�������õ���Ҫָ��������ĳ��ȣ�����Ҫѭ����ֱ�Ӷ�һ�ξͿ���

            byte[] bytes=new byte[fis.available()];//�ܶ�ȡ�������ʹ����೤�����鳤��

            // -----------ȱ�㣺���ʺ�̫����ļ���û��̫��������ڴ�ռ䡣������ڴ�ռ���������

            int readCount=fis.read(bytes);//5----�������һ��

            System.out.println(new String(bytes));

            System.out.println("-------------------------------����skip----------------------------");

//          ������  long skip(long n)�� ���������ֽڲ���

            fis=new FileInputStream("src/test.txt");

            System.out.println("���Զ�ȡ���ֽ�����"+fis.available());

            fis.skip(3);//�������� 3 ���ֽڲ���ȡ

            System.out.println(fis.read());//100 ���ַ� d�����ö�Ӧ��ASCII�� 100

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (fis != null) {

                try {

                    fis.close();

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }
    }
}
