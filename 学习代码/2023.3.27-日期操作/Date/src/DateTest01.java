import java.text.SimpleDateFormat;
import java.util.Date;

/*
java�е����ڴ���
    ��Ҫ���գ�
        1.��ô��ȡϵͳ��ǰʱ�䣿
        2.String----->Date
        3.Date------->String

        ע�⣺�������Ҷ����ʱ���ʽ�Ļ�����Ҫ�Ȼ�ȡ��ǰʱ�� ����Date����Ȼ�󴴽�SimpleDateFormat��������ȷ��ʽ��������ַ��������µĸ�ʽ�µ��ַ���ʱ��

                                         ��ȡ��ǰʱ��Ҳ���ԣ�   System.currentTimeMillis()
* */
public class DateTest01 {
    public static void main(String[] args) throws Exception {
//        ��ȡϵͳ��ǰʱ�䣬��ȷ�������ϵͳ��ǰʱ��
//        ֱ�ӵ����޲������췽������
        Date nowTime=new Date();
        System.out.println(nowTime);//�����java.util.Date�е�toString�����Ѿ�����д��-------Mon Mar 27 20:51:29 CST 2023


//        ���ڵĸ�ʽ�����������ָ���ĸ�ʽ����ת����Date---ת���ɾ���һ����ʽ�������ַ���--->String
//        SampleDateFormat��java.text������ģ�ר�Ÿ������ڵĸ�ʽ����
        /*
        yyyy �꣨4λ��
        MM �£�2λ��
        dd �գ�2λ��
        HH ʱ
        mm ��
        ss ��
        SSS ���루����3λ�����999ms,1000ms=1s��

        ע�⣺�����ڸ�ʽ�У����� y M d H m s S ��Щ�ַ��������д֮�⣬���������֯

        */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss  SSS");
        String nowTimeStr=sdf.format(nowTime);
        System.out.println(nowTimeStr);//2023-03-27 20:59:58  515


        SimpleDateFormat sdf1=new SimpleDateFormat("yy/MM/dd HH:mm:ss  SSS");
        String nowTimeStr1=sdf1.format(nowTime);
        System.out.println(nowTimeStr1);//23/03/27 21:00:55  961


//        ������һ�����ַ�����String����ôת����Date���ͣ�
//        String------->Date
        String time="2023-3-27 21:02:36 465";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf2);//java.text.SimpleDateFormat@f174ef73
        Date dateTime=sdf2.parse(time);
        System.out.println(dateTime);//Mon Mar 27 21:02:36 CST 2023
    }
}
