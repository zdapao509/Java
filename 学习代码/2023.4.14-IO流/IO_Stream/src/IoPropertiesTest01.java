import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
IO+Properties   ����ʹ�ã�

    �ǳ��õ�������

        �Ժ󾭳��ı�����ݣ����Ե���д��һ���ļ��У�ʹ�ó���̬��ȡ

        ����ֻ��Ҫ�޸�����ļ������ݣ�java���벻��Ҫ�Ķ�������Ҫ���±��룬������Ҳ����Ҫ���������������õ���̬����Ϣ


Properties��һ��Map���ϣ�key��value����String���ͣ��뽫userinfo�ļ��е����ݼ��ص�Properties������


���������ϻ��Ƶ��ļ�����Ϊ�����ļ������ҵ������ļ��е����ݸ�ʽΪ��

    key=value
    key:value---------���ǲ�����ʹ�� ��

    ��ʱ�����ǰ����������ļ��������������ļ�


java�淶����Ҫ�����������ļ�������.properties��β�����ǲ���ǿ��Ҫ��ģ�

    ������.properties��β���ļ���java�б���Ϊ�����������ļ�

    ����Properties��ר�Ŵ�����������ļ������е�һ���ࡣ


�����������ļ��У�#��ע��

    ���������ļ��У�key�ظ��Ļ���value���Զ�����

    ���������������ļ�����ò�Ҫ���ֿո�


* */
public class IoPropertiesTest01 {
    public static void main(String[] args) {
//        �½�һ������������
        FileReader reader=null;
        try {
            reader=new FileReader("userinfo.properties");

//            �½�һ��map���ϣ�
            Properties pro=new Properties();

//            ����һ��Properties�����load�������ļ��е����ݼ��ص�Map������:
            pro.load(reader);//�ļ�����ʱ��=�����key  =�ұ���value

//          ͨ��key����ȡvalue
            String username=pro.getProperty("username");
            System.out.println(username);//"����"

            String password=pro.getProperty("password");
            System.out.println(password);//123

            String zhang=pro.getProperty("zhang");
            System.out.println(zhang);//7489


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
