import java.text.SimpleDateFormat;
import java.util.Date;

/*
ע��Date����󴴽���ʱ��ʹ���޲������췽���������ǵ�ǰʱ�䡣�в�������ϵͳ��1970-1-1 00:00:00 000 ֻ�ᾭ���˶��֮��ʱ������ʲô������Ǻ���

* */
public class DateTest03 {
    public static void main(String[] args) {
        Date time=new Date(1);//ע�������һ������
        System.out.println(time);//Thu Jan 01 08:00:00 CST 1970---------ע�������ﲻ�Ǵ�00:00:00��ģ��ǴӶ�������Ҳ����8�����
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:dd:ss SSS");
        String strTime=sdf.format(time);
        System.out.println(strTime);//1970-01-01 08:01:00 001

//        ��ȡ�����ʱ��ʱ�䣺
        Date time2=new Date(System.currentTimeMillis()-1000*60*60*24);//��ǰʱ��-һ��ĺ�����
        String strTime2=sdf.format(time2);
        System.out.println(strTime2);//2023-03-26 21:26:37 525
    }
}
