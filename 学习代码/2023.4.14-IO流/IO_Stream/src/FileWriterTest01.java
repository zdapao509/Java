import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter:

    �ļ��ַ��������д

    ֻ�������ͨ�ı���

    д�����ʽ�����ǣ��ַ������飺char[]   ���߿���ֱ��д �ַ���

* */

public class FileWriterTest01 {

    public static void main(String[] args) {

        FileWriter out = null;

        try {

//            out=new FileWriter("FileWriterTest.txt");//�����ļ��ַ�������

            out=new FileWriter("FileWriterTest.txt",true);//������Դ�ļ���ֱ����Դ�ļ��������

            char[] chars={'a','y','b','d','��'};

            out.write(chars);//���ַ�ȫ��д��

            out.write(chars,0,2);//����д��

            out.write("\n�����Ի���");//����ֱ��д���ַ���

//            д����һ���ǵ�ˢ�£�
            out.flush();

        } catch (IOException e) {

            e.printStackTrace();

        }finally{

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
