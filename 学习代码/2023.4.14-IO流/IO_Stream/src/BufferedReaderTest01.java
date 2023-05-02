import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader:

    ���л��������ַ�������

    ʹ���������ʱ�򣬲���Ҫ�Զ���char ���飬����˵����Ҫ�Զ���byte���飬�Դ�����

* */
public class BufferedReaderTest01 {

    public static void main(String[] args) {

        BufferedReader br=null;

        FileReader reader= null;

        try {

            reader = new FileReader("test.txt");

//            ��һ�����Ĺ��췽����Ҫһ������ʱ������������������������ڵ���
//            �ⲿ�����װ�����������������װ��������һ�����֣�������������
//            ��ǰ�����  FileReader  ����һ���ڵ�����  BufferedReader���ǰ�װ����������
            br=new BufferedReader(reader);

//            �����װ����һ���ص㣺����һ���Զ�ȡһ�����ݣ�
            String aLine=br.readLine();
            System.out.println(aLine);
            //abcdefhaidhHZNAzhianվ������IE������ŷ��

//            br.readLine()������ȡһ���ı��У����ǲ������з�

//            ��br.readLine()�������ص���һ��null��ʱ�򣬴����Ѿ���ȡ��ϣ�

            String s =null;

            while ((s=br.readLine()) != null) {//ע�⣺br.readLine()�����ǲ����Զ����е�

                System.out.println(s);

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            if (br != null) {//ע�⣺�ر�����ʱ�򣬶��ڰ�װ����˵��ֻҪ�ر�����������У�����Ľڵ������Զ��رա�
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
