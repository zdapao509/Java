import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
�Լ�дһ������־������
* */
public class LogUtilTest {
    public static void main(String[] args) {
        String s="�������׼������";
        String s1="��������ٴγ���";
        LogUtil.log(s);
        LogUtil.log(s1);
    }
}


class LogUtil{
    public static void log(String msg) {
        try {
//            ������׼���������
            PrintStream ps=new PrintStream(new FileOutputStream("log.txt",true));

//            �ı����λ�ã�
            System.setOut(ps);

//            ��¼��ǰʱ�䣺
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH : mm : ss  SSS");
            String s=sdf.format(date);

//            �����
            System.out.println(s+" : "+msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}