import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
�Ժ�鿴�쳣��׷����Ϣ��ʱ����ô�� ���Կ��ٵĵ��Գ���

    �������£�ֱ������SUN��˾�����쳣��Ϣ����Ҫ���Լ���
* */
public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();//��ӡ�쳣��ջ׷����Ϣ��
//            ��ʵ�ʿ����н���ʹ����������ɺ�ϰ��

            /*
            java.io.FileNotFoundException: C:\Users\Administrator\Desk----------top\�����-��.txt (ϵͳ�Ҳ���ָ����·����)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:111)
                at ExceptionTest09.m3(ExceptionTest09.java:27)
                at ExceptionTest09.m2(ExceptionTest09.java:23)
                at ExceptionTest09.m1(ExceptionTest09.java:19)
                at ExceptionTest09.main(ExceptionTest09.java:12)

                27�е����⵼��23�У�23����19 ��19����12
            * */
        }

//        ����Ĵ��벻�ᱻֹͣ������ִ�У��ܽ�׳
        System.out.println("�������ִ��");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
    }
}
