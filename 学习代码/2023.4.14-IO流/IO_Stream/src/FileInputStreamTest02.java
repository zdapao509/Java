/*
��IDEA�У�Ĭ�ϵ��ļ�·���ǣ�Project���̵ĸ�Ŀ¼�����磺��ʱ�ļ���Ĭ���ļ��Ķ�ȡλ���ǣ�IO_Stream  �ļ��У����δ����е����·�����Ǵ�����ļ������濪ʼ��

int read(byte[] b)

    һ������ȡb.length ���ֽ�

    ����Ӳ�̺��ڴ�֮��Ľ�������߳��������Ч��

    ��byte[] ���鵱�ж�
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

    public static void main(String[] args) {

        FileInputStream fis=null;

        try {

//            fis=new FileInputStream("test.txt");//�ļ������λ�ã����ڣ�G:\2--Javaѧϰ\ѧϰ����\2023.4.14-IO��\IO_Stream\test.txt�ļ���

            fis=new FileInputStream("src/test.txt");//���λ�ã����� IO_Stream ��Ŀ�ļ�������� src �ļ���

//            ��ȡ��ʱ��������ķ�ʽ���ж�ȡ���ӿ��ȡ���ٶȣ���byte[] ����ķ�����ȡ
            int readData=0;

            byte[] cur=new byte[4];//һ�ζ�ȡ4���ֽ�

            while ((readData=fis.read(cur)) != -1) {//�����������ݵ�ʱ�򣬷��� -1

//                System.out.println(cur[0]);cur[0]=97��ͨ��String���췽����ֱ�ӽ��ֽ������е�ASCII��ֵת�����ַ���Ҳ����ֱ��ת�� a

                String a=new String(cur,0,readData);
                //ͨ��String�Ĺ��췽������cur�����ָ��λ�õ��ֽ�ת�����ַ�����
                // �����readData����ÿһ�ζ�ȡ�����ֽ�����,ָ��ÿһ�ζ�ȡ���ֽ��������������ת�����ַ����ȶ�ȡ�����ַ���Ҫ��������

//                System.out.println(a);--------�Զ����в��ÿ��ļ���ԭ����ʽ���ĳɲ�����

                System.out.print(a);//�������Զ����У�������������ݷ��صľ���ԭ�������ݸ�ʽ
            }
        }catch (FileNotFoundException e) {

            e.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }finally {

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
