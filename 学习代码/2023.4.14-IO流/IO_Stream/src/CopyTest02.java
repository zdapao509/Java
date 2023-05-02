import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
ʹ��  FileReader + FileWriter  ���ļ����и��ơ�

ע�⣺���ַ�ʽ���о����Եģ�ֻ�ܿ����ı��ļ�


IO �����ص���ǣ���ܴ��
* */
public class CopyTest02 {
    public static void main(String[] args) {

        FileReader reader=null;

        FileWriter out=null;

        try {
//            ��
            reader=new FileReader("test.txt");

//            д
            out=new FileWriter("src/CopyTest02.txt");

//            һ�߶���һ��д��
            char[] chars=new char[4];//ע�⣺1024���ֽ���1KB��1024*1024���ֽ���1MB��
            // char�����д�ŵ����ַ���һ���ַ�=2���ֽڣ�
            // �����ַ������1024*512���ַ�����  1MB
            int readData=0;

            while ((readData = reader.read(chars)) != -1) {

                System.out.println(new String(chars));//չʾÿһ�ζ�ȡ��������---ÿ���ĸ��ַ�
                /*
                abcd
                efha
                idhH
                ZNAz
                hian
                վ������
                IE����
                ��ŷ����
                * */

                out.write(new String(chars,0,readData));//д������
            }

//            ˢ�£�
            out.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }finally {//�ر���

            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
