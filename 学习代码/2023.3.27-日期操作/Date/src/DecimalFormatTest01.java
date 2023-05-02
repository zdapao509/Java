import java.text.DecimalFormat;

/*
关于数字的格式化
* */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
//        java.text.DecimalFormat  专门负责数字格式化
//        DecimalFormat df=new DecimalFormat("数字格式")；

        /*
        数字格式包括：
            #  代表任意数字
            ， 代表千分位
            .  代表小数点
            0  代表不够时补0

            ###，###.## 代表加入千分位，保留两位小数
        * */
        DecimalFormat df =new DecimalFormat("###,###.##");
        String s=df.format(123456.123456);
        System.out.println(s);//123,456.12

        DecimalFormat df1 =new DecimalFormat("###,###.0000");
        String s1=df1.format(123456.12);
        System.out.println(s1);//123,456.1200


    }
}
