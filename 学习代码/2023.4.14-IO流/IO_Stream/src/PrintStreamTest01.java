import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
PrintStream�� ��׼�����

Ĭ�����������̨�����ǿ��Ըı���������򣬰���д�뵽Ӳ���ļ�����

* */
public class PrintStreamTest01 {
    public static void main(String[] args) {

//        System.out �ķ���ֵ��һ��PrintStream�����
        System.out.println("hello world");

//        �ֿ�д��
        PrintStream ps=System.out;
        ps.println("ţ��");
        ps.println("huhu");

//        ��׼�����������Ҫ�ֶ�close()�ر�
//        ���Ըı��׼������ķ���

//        ���õ�System��ķ��������ԣ�

/*        System.gc();
        System.exit(0);
        System.currentTimeMillis();
        System.arraycopy();//public static native void arraycopy(Object src,  int srcPos, Object dest, int destPos, int length);
        //��Դ����srcȡԪ�أ���ΧΪ�±�srcPos��srcPos+length-1��ȡ����length��Ԫ�أ�
        // ��ŵ�Ŀ�������У����λ��Ϊ�±�destPos��destPos+length-1����������������ݣ���ArrayList�ײ����������*/


        try {
//            ��׼���������ָ�����̨��ָ��log���ļ�
            PrintStream ps1=new PrintStream(new FileOutputStream("log.txt",true));

//            �޸�������򣬽��������ĵ������ log �ļ�
            System.setOut(ps1);

//            �������
            System.out.println("hello test");
            System.out.println("*************");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
