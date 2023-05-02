import java.text.SimpleDateFormat;
import java.util.Date;

/*
java中的日期处理，
    主要掌握：
        1.怎么获取系统当前时间？
        2.String----->Date
        3.Date------->String

        注意：生成自我定义的时间格式的话，需要先获取当前时间 创建Date对象；然后创建SimpleDateFormat对象以明确格式，最后用字符串接收新的格式下的字符串时间

                                         获取当前时间也可以：   System.currentTimeMillis()
* */
public class DateTest01 {
    public static void main(String[] args) throws Exception {
//        获取系统当前时间，精确到毫秒的系统当前时间
//        直接调用无参数构造方法就行
        Date nowTime=new Date();
        System.out.println(nowTime);//这里的java.util.Date中的toString方法已经被重写了-------Mon Mar 27 20:51:29 CST 2023


//        日期的格式化输出：按照指定的格式进行转换。Date---转换成具有一定格式的日期字符串--->String
//        SampleDateFormat是java.text包下面的，专门负责日期的格式化：
        /*
        yyyy 年（4位）
        MM 月（2位）
        dd 日（2位）
        HH 时
        mm 分
        ss 秒
        SSS 毫秒（毫秒3位，最高999ms,1000ms=1s）

        注意：在日期格式中，除了 y M d H m s S 这些字符不能随便写之外，其他随便组织

        */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  SSS");
        String nowTimeStr=sdf.format(nowTime);
        System.out.println(nowTimeStr);//2023-03-27 20:59:58  515


        SimpleDateFormat sdf1=new SimpleDateFormat("yy/MM/dd HH:mm:ss  SSS");
        String nowTimeStr1=sdf1.format(nowTime);
        System.out.println(nowTimeStr1);//23/03/27 21:00:55  961


//        假设有一日期字符串，String，怎么转换成Date类型？
//        String------->Date
        String time="2023-3-27 21:02:36 465";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf2);//java.text.SimpleDateFormat@f174ef73
        Date dateTime=sdf2.parse(time);
        System.out.println(dateTime);//Mon Mar 27 21:02:36 CST 2023
    }
}
