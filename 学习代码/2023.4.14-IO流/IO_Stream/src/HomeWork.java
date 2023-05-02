import java.io.*;

/*
�����ļ���������������ݵ���һ���ļ�����

�õ���

    FileInputStream;
    FileOutputStream;
    File;

* */
public class HomeWork {
    public static void main(String[] args) {
        File f=new File("G:\\zzzzzû��\\�ĵ�");
        File out=new File("F:\\����\\test");
        copy(f,out);
    }

//    �ļ����Ʒ�����
    public static void copy(File f, File out) {
        if (f.isFile()) {
            FileInputStream fis=null;
            FileOutputStream fos=null;
            try {
//                �������ֽ�����������
                fis=new FileInputStream(f);//������˿��Ը��ַ�����·���������Ը�File ���͵��ļ�

//                ���´�ʱ��Ŀ��Ŀ¼��Ŀ¼��Ŀ��Ŀ¼�;����²�����ԭĿ¼��ɵģ������Ŀ��·��Ҫ�����ļ������֣�
//                ����  xxx.pdf Ҫ������Ŀ��·�����棬�����ʵû�����·�����Ǿ�ֱ�Ӵ������ļ�

//                �� Java �У�FileOutputStream ����Զ�����һ���ļ������ǲ����Զ������ļ��С�
//                ���ָ����·���а��������ڵ��ļ��У�����׳� FileNotFoundException �쳣��
                String s=out.getAbsolutePath().endsWith("\\") ? out.getAbsolutePath() : out.getAbsolutePath()+"\\";
                s=s+f.getAbsolutePath().substring(11);
                fos=new FileOutputStream(s);

                int readData=0;

                byte[] bytes=new byte[1024*1024];

                while ((readData = fis.read(bytes)) != -1) {
                    fos.write(bytes,0,readData);
                }

                fos.flush();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }else{
//            �����һ���ļ��У��Ǿͱ����ļ���������������ļ���Ȼ��ݹ飬����������ļ��ǲ����ļ������ļ���
            File[] files=f.listFiles();
            for (File file:files) {
                if (file.isDirectory()) {//�ж�������ļ��У��Ǿʹ����ļ��У���Ϊ������������ǲ��ܴ����ļ��еģ�ֻ�ܴ����ļ�
                    String f1=file.getAbsolutePath().substring(11);//�²�����ȡ��Ӧλ�õ��ļ�·��
                    System.out.println(f1);
                    String f2=out.getAbsolutePath().endsWith("\\") ? out.getAbsolutePath() : out.getAbsolutePath()+"\\";
                    //����Ŀ��·������û�С�\\��
                    String f3=f2+f1;//ƴ���µ�·������\\��
                    System.out.println(f3);
                    File newOut=new File(f3);//�����µ��ļ�������ļ��в����ڣ��Ǿʹ����ļ��У����������㴴��
                    if (!newOut.exists()) {//������Ӧ�ļ���
                        newOut.mkdirs();//Ҫ�����������ļ��У���һ���ļ�����  F:\����\test\�ĵ�\ES�ĵ�  ��ʱ�� �ĵ�\ES�ĵ� �������ڣ�����Ҫ���ش���
                    }
                }
                copy(file,out);//�ݹ���ã����ļ���������ȥ
            }
        }
    }
}
