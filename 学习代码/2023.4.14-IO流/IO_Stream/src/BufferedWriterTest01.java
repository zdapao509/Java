import java.io.*;

/*
 BufferedWriter:���л�����ַ������

 OutputStreamWriter: ת����------>���ֽ������ת��Ϊ�ַ������

* */
public class BufferedWriterTest01 {
    public static void main(String[] args) {

        BufferedWriter bw=null;
        FileWriter fw=null;
        FileOutputStream fos=null;

        try {

//            ���������������ַ������󣻴����ַ�������
            fw=new FileWriter("BufferedWriterTest.txt",true);

            bw=new BufferedWriter(fw);

//            ����������������ֽ���������д����FileOutputStream��OutputStreamWriter�Ľڵ�����OutputStreamWriter�ǰ�װ��
//            OutputStreamWriter��BufferedWriter�Ľڵ�����BufferedWriter�ǰ�װ��
            bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("BufferedWriterTest.txt",true)));


//            д�룺
            char[] chars={'a','b','z','e'};

            bw.write(chars);

            bw.write("�����Ի���");

//            ˢ�£�
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
