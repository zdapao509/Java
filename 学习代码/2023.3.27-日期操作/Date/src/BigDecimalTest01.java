import java.math.BigDecimal;

/*
1.BigDecimal 属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
这是SUN公司提供的一个专用于财务公司的软件中

2.注意：财务软件中，double是不够的，财务中用java.math.BigDecimal
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
//        这里的100不是普通的100，而是精度极高得100
        BigDecimal dec=new BigDecimal(100);
        System.out.println(dec);//100
        BigDecimal dec2=new BigDecimal(200);
        System.out.println(dec2);//200

//        System.out.println(dec+dec2);//不能求和，这里的dec 和dec2 是引用

        BigDecimal dec3=dec.add(dec2);
        System.out.println(dec3);//300
    }

}
