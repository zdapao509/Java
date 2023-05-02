import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java.io.FileImputStream:

    1.�ļ��ֽ������������ܵģ��κ����͵��ļ������Բ������������ȡ

    2.�ֽڵķ�ʽ���������Ĳ�������ɶ��Ĳ�����Ӳ��---->�ڴ棩


���³�������⣺

    һ�ζ�ȡһ���ֽ�byte�������ڴ��Ӳ�̽���̫Ƶ����������ʱ�䶼�˷��ڽ��������ˣ��ܲ���һ�ζ�ȡ����ֽ��أ�  ����
* */
public class FileInputStreamTest01 {
    public static void main(String[] args) {

        FileInputStream fis=null;//��ΪҪ��finally���潫���رգ������Ƚ��䶨����try���ⲿ������finally�ڲ������ж�

        try{

            fis=new FileInputStream("G:\\2--Javaѧϰ\\ѧϰ�ʼ�\\2023.4.14-IO��\\test.txt");//�����ļ�����������---���þ���·���ķ�ʽ
//            ע������д�� ��/�� Ҳ�ǿ��Ե�

//            �õ�������֮�󣬿��Կ�ʼ��������
            int readData=0;

            while ((readData = fis.read()) != -1) {//�˷����ķ���ֵ�Ƕ�ȡ�����ֽڱ���read����ָ��һ��ָ�룬ÿreadһ�Σ�ָ���������ƶ�һ��

                System.out.println("��ʱ��"+readData);
                /*
                ��ʱ��97
                ��ʱ��98
                ��ʱ��99
                ��ʱ��100
                ��ʱ��101
                ��ʱ��102   //�����ļ�β��������-1
                * */
            }
        }catch (FileNotFoundException e) {

            e.printStackTrace();

        }catch (IOException e) {

            e.printStackTrace();

        }finally{//�����������Ĺر�

            if (fis != null) {//��������null��ʱ����Ҫ���йر�

                try {

                    fis.close();

                }catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }

    }
}
