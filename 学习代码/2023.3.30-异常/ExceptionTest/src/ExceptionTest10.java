/*
����try catch�е�finally�Ӿ䣺

    1.��finally�Ӿ��еĴ��������ִ�еģ�������һ����ִ�еģ���ʹtry catch����еĴ���������쳣��

        finally�Ӿ�����tryһ����֣����ܵ�����д

    2.finally���ʹ�������

        ͨ����finally����������Դ�Ĺرգ��ͷ�

        ��Ϊfinally����еĴ���Ƚ��б���

        ��ʹtry����еĴ���������⣬finally��仹�ǻ�ִ��
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest10 {
    public static void main(String[] args) {
        FileInputStream f=null;//����try���棬������finally����вſ�����
        try {
//            ��������������
//            FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Administrator\\Desktop\\�����-��.txt");

            f=new FileInputStream("C:\\Users\\Administrator\\Desktop\\�����-��.txt");

            String s=null;

            s.toString();//����ʱ�쳣����ָ���쳣

            System.out.println("************************");

//            ��ʹ����֮�������йرգ�����ռ����Դ
//            ��ʹ����ĳ���������⣬��Ҳ����رգ�
//            ���ڴ˴��������޷��ر�
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch(NullPointerException e){
            e.printStackTrace();
        }finally {
//            ���Ĺرշ�������Ƚϱ��գ�finally�е����һ����ִ�У���ʹtry�е����������쳣
//            fileInputStream.close();ע�⣺д��try�еĲ����Ǿֲ��������ǲ�����finally��������õģ����Ե���main���������þֲ�����
            try {
                System.out.println("���Ѿ��ر�");
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("-------");
            }
        }

        System.out.println("ִ�н���");
    }
}
