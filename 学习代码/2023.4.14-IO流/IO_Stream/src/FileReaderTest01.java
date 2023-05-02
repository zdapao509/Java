import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:

    �ļ��ַ���������ֻ�ܶ�ȡ��ͨ�ı�

    ��ȡ�ı����ݣ��ȽϷ��㣬���

    �ַ�����char���飻�ֽ�����byte����
* */
public class FileReaderTest01 {
    public static void main(String[] args) {

        FileReader reader=null;

        try {
//            �����ļ��ַ�������
            reader=new FileReader("test.txt");

//            ��ʼ��ȡ��
            char[] chars =new char[4];//һ�ζ�ȡ4���ַ�

            int readCount=0;

            while ((readCount = reader.read(chars)) != -1) {

//                System.out.print(new String(chars,0,readCount));
                /*
                abcdefhaidhHZNAzhianվ������IE������ŷ��
                * */

//                �۲�һ�ζ�ȡ���ַ�����ÿ�ζ�ȡ4���ַ�
                System.out.println("���ζ�ȡ��");

                for (char c : chars) {

                    System.out.println(c);
                    /*
                    ���ζ�ȡ��
                    a
                    b
                    c
                    d
                    ���ζ�ȡ��
                    e
                    f
                    h
                    a
                    ���ζ�ȡ��
                    i
                    d
                    h
                    H
                    ���ζ�ȡ��
                    Z
                    N
                    A
                    z
                    ���ζ�ȡ��
                    h
                    i
                    a
                    n
                    ���ζ�ȡ��
                    վ
                    ��
                    ��
                    ��
                    ���ζ�ȡ��
                    I
                    E
                    ��
                    ��
                    ���ζ�ȡ��
                    ��
                    ŷ
                    ��
                    ��
                    * */
                }
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
