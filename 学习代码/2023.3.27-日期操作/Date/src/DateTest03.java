import java.text.SimpleDateFormat;
import java.util.Date;

/*
注意Date类对象创建的时候，使用无参数构造方法创建的是当前时间。有参数的是系统从1970-1-1 00:00:00 000 只会经历了多久之后时间变成了什么：差的是毫秒

* */
public class DateTest03 {
    public static void main(String[] args) {
        Date time=new Date(1);//注意参数是一个毫秒
        System.out.println(time);//Thu Jan 01 08:00:00 CST 1970---------注意我这里不是从00:00:00算的，是从东八区，也就是8点算的
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:dd:ss SSS");
        String strTime=sdf.format(time);
        System.out.println(strTime);//1970-01-01 08:01:00 001

//        获取昨天此时的时间：
        Date time2=new Date(System.currentTimeMillis()-1000*60*60*24);//当前时间-一天的毫秒数
        String strTime2=sdf.format(time2);
        System.out.println(strTime2);//2023-03-26 21:26:37 525
    }
}
