/*
File �ļ��ĳ��÷�����

* */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f=new File("F:\\����\\1-�ļ�\\ÿ�ս�չ.txt");

//        ��ȡ�ļ���
        System.out.println("�ļ�����"+f.getName());//�ļ�����ÿ�ս�չ.txt

//        �ж�File�ǲ���һ��Ŀ¼��
        System.out.println(f.isDirectory());//false

//        �ж�File�ǲ���һ���ļ�
        System.out.println(f.isFile());//true

//        ��ȡ�ļ����һ�ε��޸�ʱ�䣺
        long haoMiao=f.lastModified();//�õ����Ǵ�1970�굽���ڵ��ܺ�����
        Date date=new Date(haoMiao);//�˷���������ת��Ϊ����
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss  SSS");
        String s=sdf.format(date);
        System.out.println("���һ���޸�ʱ�䣺"+s);

//        ��ȡ�ļ���������������ļ�,����һ��File����
        File f1=new File("F:\\����\\1-�ļ�");

        File[] files=f1.listFiles();
        for (File file:files) {
            System.out.println(file);
            /*
            F:\����\1-�ļ�\~$���۽�չ.xlsx
            F:\����\1-�ļ�\���۽�չ.xlsx
            F:\����\1-�ļ�\������Ŀ�ʼ�-�����
            F:\����\1-�ļ�\����.pptm
            F:\����\1-�ļ�\ÿ�ս�չ.txt
            F:\����\1-�ļ�\����ṹ.png
            * */
        }
    }
}
