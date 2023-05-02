import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
�ļ��ֽ�������� ����д

���ڴ浽Ӳ�̡�

* */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {

        FileOutputStream fos=null;

        try {

            fos=new FileOutputStream("src/outputTest");//���Զ������ļ������ǲ����Զ������ļ���

//            ��ʼд�ļ�
            byte[] bytes={97,98,99,100,101};

//            ��bytes�����е���������д��
            fos.write(bytes);

//            ָ��д��bytes�����е����ݷ�Χ
            fos.write(bytes,0,2);//���±�0 ��ʼд��д�����ȣ�2  ����ʱ�ĳ����������Ҫ��Χ����������ʱ�쳣��

//            ����Ĺ��̵õ����ǣ�  abcdab    �ܲ�����Դ�ļ��ĺ��������ӣ�������ÿһ�ζ���ո���

//            Ҫ�벻���ԭ�ļ����ݣ���׷�ӵķ�ʽ���ļ�ĩβд�룺�������Դ�ļ�����
            fos=new FileOutputStream("src/outputTest01.txt",true);//����Ϊfalseʱ������Դ�ļ�����

            fos.write(bytes);

//            ���ַ�������д���ļ�����ת���ֽ�����
            String s="�����Ի���";

//            ���ַ���ת�����飺
            byte[] bs=s.getBytes();

//            д���ļ���
            fos.write(bs);


//            ע�⣺д��֮��һ��ע����flush��������ˢ�£����ܵ������е���ȫ��д�ꣻ��չܵ�
            fos.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

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
