import java.io.File;
import java.io.IOException;

/*
File

    1.File����Ĵ����û�й�ϵ������File�಻������ļ��Ķ���д

    2.File�������ʲô��

        �ļ���Ŀ¼·�����ĳ��������ʽ

        F:\����\1-�ļ�   ����һ��File����

        F:\����\1-�ļ�\ÿ�ս�չ.txt   ��Ҳ��һ��File����

        һ��File�ļ����ܶ�Ӧ����Ŀ¼�����ܶ�Ӧ�����ļ�

        Fileֻ��һ��·�����ĳ����ʾ��ʽ

    3.��Ҫ����File���г��õķ���

        f1.exists() �ж��Ƿ���ڸ��ļ���

        f1.createNewFile();  �����ļ�

        f1.mkdir();   �����ļ���

        f1.mkdirs();   ���������ļ���

        f2.getParent();   ��ȡ��һ���ļ���

        f2.getParentFile();  ���ļ���ʽ��ȡ���ļ���

        f3.getAbsolutePath()�� ��ȡ�ļ�����·��


* */
public class FileTest01 {
    public static void main(String[] args) {
//        ����File����
        File f1=new File("F:\\����\\1-�ļ�\\test\\a\\b\\c");

//        �ж��Ƿ���ڸ��ļ��У�
        System.out.println(f1.exists());//û�д���֮ǰ��false

//        ������ļ������ڣ�����һ�����ļ������ļ�����ʽ����
/*        if (!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


//        ������ļ������ڣ�����һ�����ļ����� �ļ��� ����ʽ����
        /*if (!f1.exists()) {
             f1.mkdir();
        }
*/


//        Ҳ���Դ�������Ŀ¼
        if (!f1.exists()) {
            f1.mkdirs();
        }


//        ����File����
        File f2=new File("F:\\����\\1-�ļ�\\ÿ�ս�չ.txt");

//       ��ȡ���ļ��ĸ�·����
        String parentPath=f2.getParent();
        System.out.println(parentPath);//F:\����\1-�ļ�

//        ������һ�ַ�����ȡ�ļ��ĸ�·����
        File f3=f2.getParentFile();
        System.out.println("��ȡ����·���ķ�����"+f3.getAbsolutePath());//��ȡ����·���ķ�����F:\����\1-�ļ�




    }
}
