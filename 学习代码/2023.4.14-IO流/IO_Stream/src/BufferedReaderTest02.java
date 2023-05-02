import java.io.*;

/*
����ת������ʹ�ã�

    InputStreamReader

* */
public class BufferedReaderTest02 {
    public static void main(String[] args) {
        BufferedReader br=null;//BufferedReader���ʼ�������ǣ�һ���ַ������������Ҫ��һ���ֽ�������ŵ���ʽ������λ�ã���Ҫת����
        FileInputStream fio=null;//׼�������ֽ���
        InputStreamReader isr=null;//ת����

        try {

//            �����ֽ�������
            fio=new FileInputStream("test.txt");

//            ����ת��������
            isr=new InputStreamReader(fio);//�����λ�ã�FileInputStream �ֽ������ڽڵ����� ��InputStreamReader ת�������� ��װ��

//            ������������
            br=new BufferedReader(isr);//�����λ�ã�InputStreamReader ת�������� �ڵ���  ����BufferedReader ���������� ��װ��


//            ����һ�ֺϲ���д��������
            br=new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));


//            ��ʼ�����ݣ�
            String line=null;

            while ((line=br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (br != null) {//����ע�⣺�رյ�ʱ��ֻҪ�������İ�װ�����йرվͺã�����Ҫ���������ر�
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
