/*
try catch���룺

    catch�����С�����е����Ϳ����Ǿ�����쳣���ͣ�Ҳ�����Ǹ��쳣���͵ĸ�����---------��̬����

    catch����д���������catch��ʱ�򣬾�ȷ��һ��һ���Ĵ����������

    catchд�����ʱ�򣬴��ϵ��£��������ش�С����


    ���Ժ�Ŀ����У��������ʱ�쳣��Ӧ���ϱ����ǲ�׽��

        ���ϣ���������������Ǿ�ѡ��throws�ϱ�������ʹ��try catch����
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest07 {
    public static void main(String[] args) {


/*        try {
            new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }*/



/*        try {
            new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
        } catch (Exception e) {//��̬���ƣ������͵�����ָ�������͵�Ӧ��   Exception e=new FileNotFoundException����
            throw new RuntimeException(e);
        }*/


        try {
           FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
           f.read();
        } catch (FileNotFoundException e) {//��̬���ƣ������͵�����ָ�������͵�Ӧ��   Exception e=new FileNotFoundException����
            System.out.println("�ļ�·������");;
        } catch (IOException e) {
            System.out.println("IoException---���ļ��ı���");
        }

        System.out.println("-------------------------------------------------");
        try {
            FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");
            f.read();
        } catch (IOException e) {//ע�⣺�����IOException��FileNotFoundException�ĸ��࣬���������׳����������͵Ĵ��󶼿���ͨ�����ﲶ׽
            System.out.println("IoException---���ļ��ı���");
        }

        System.out.println("-------------------------------------------------");
        try {

            FileInputStream f= new FileInputStream("C:\\Users\\Administrator\\Desk----------top\\�����-��.txt");

            System.out.println(100/0);//����������ʱ�쳣������ʱ���Դ���Ҳ���Բ�����

        } catch (FileNotFoundException | ArithmeticException e) {//ע�⣺����JDK8�������ԣ�������������ʽ�׳��쳣
            System.out.println("���ļ��ı��������ѧ�쳣");
        }
    }
}
