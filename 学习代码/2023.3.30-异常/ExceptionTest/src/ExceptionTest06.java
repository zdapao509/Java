import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
�쳣�Ĵ���ʽ��

    ��һ�ַ�ʽ��

        �ڷ���������λ�ã�ʹ��throws�ؼ��֣��׸���һ��----------------˭���ң��Ҿ��׸�˭��

    �ڶ��ַ�ʽ��

        ʹ��try catch �������쳣�Ĳ�׽������������

 ע�⣺ֻҪ�쳣û�б���׽�������ϱ��ķ�ʽ���˷����ĺ�������Ͳ���ִ�У�

      ���⣬try����е�ĳһ�г����쳣�����к���Ĵ��벻��ִ��

      try catchִ��֮�󣬺�����������ִ��

      һ������������쳣�ϱ�֮�󣬴˷�������
* */
public class ExceptionTest06 {
    /*
    һ�㲻������main������ʹ��throws����Ϊ�������쳣�����ķ����ˣ�һ�����׸�JVM��JVMֱ����ֹ����
    �쳣������ƾ���Ϊ����ǿ����Ľ�׳�ԣ���ô�������쳣������Ҳ��Ӱ�������ĳ���ִ�С����ԣ�һ���main�����е��쳣����ʹ��try catch���ƽ��в�׽��main�Ͳ�Ҫ�������洫��
    * */

    public static void main(String[] args) {

        /*��������m1�׳�����FileNotFoundException�쳣�Ļ����͵������µķ�ʽ
        try {//����
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("�ļ�������");
        }*/

/*    ��������m1�׳�����Exception�쳣�Ļ����͵������µķ�ʽ
    try {
            m1();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }*/

        System.out.println("main����ִ��");
        try {//��������Ϊ�����m1�׳��������쳣
            System.out.println("mainִ��");
            m1();
//            m1����������⣬ֱ�ӽ���catch�飬������������ִ��
            System.out.println("main����");
        } catch (IOException e) {
            System.out.println("���ļ������ڣ��ļ�·��������");
//            throw new RuntimeException(e);-------ע���������׳��ˣ��Ҳ���Ҫ���׳����쳣
            System.out.println("--------------------");
            System.out.println(e);//java.io.FileNotFoundException: C:\Users\Administrator\Desk----------top\�����-��.txt (ϵͳ�Ҳ���ָ����·����)

        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
        }
        System.out.println("catch֮���ܼ���ִ��");
    }

    private static void m1() throws IOException, ClassNotFoundException {
        System.out.println("m1ִ��");
        m2();
        //            m2����������⣬ֱ�ӽ������ף�������������ִ��
        System.out.println("m1����");
    }

    private static void m2() throws ClassNotFoundException,FileNotFoundException {
        System.out.println("m2ִ��");
        m3();
        //            m3����������⣬ֱ�ӽ������ף�������������ִ��
        System.out.println("m2����");
//        �������������throws FileNotFoundException �����ͻᱨ��������Ϊm3������û�ж��쳣���д���ֻ�ǽ������ף�����m2��������û�д������Ա���

//        ע�����������Ϊ�ױ���쳣ClassNotFoundException ����FileNotFoundException�쳣���Ǿ���û�н��FileNotFoundException�쳣��ֱ�ӱ���
//        ���ǿ�����FileNotFoundException�쳣�ĸ��࣬IOException������Exception
    }

    private static void m3() throws FileNotFoundException {
        /*
        ������SUN JDK�е���Ĺ��췽����Ϊʲô���뱨����
        ԭ��

            ��һ�����������һ�����췽����FileInputStream

            �ڶ���������췽��������λ���ϣ���throws FileNotFoundException

            ������ͨ����ļ̳нṹ������FileNotFoundException �ĸ����� IOException��IOException�ĸ����� Exception----��Ϊ����ʱ�쳣

            ������ǣ�����ʱ�쳣�����ڱ���׶ξͶ�����д������򣬱������ͻᱨ��

            ������õ�һ�ַ�ʽ���ڷ�������λ����ʹ��throws��������������

        * */
        System.out.println("m3ִ��");
        new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
        //            FileInputStream ����������⣬ֱ�ӽ������ף�������������ִ��
        System.out.println("m3����");
    }
}
