import java.math.BigDecimal;

/*
1.BigDecimal ���ڴ����ݣ����ȼ��ߡ������ڻ����������ͣ�����java���������������ͣ�
����SUN��˾�ṩ��һ��ר���ڲ���˾�������

2.ע�⣺��������У�double�ǲ����ģ���������java.math.BigDecimal
* */
public class BigDecimalTest01 {
    public static void main(String[] args) {
//        �����100������ͨ��100�����Ǿ��ȼ��ߵ�100
        BigDecimal dec=new BigDecimal(100);
        System.out.println(dec);//100
        BigDecimal dec2=new BigDecimal(200);
        System.out.println(dec2);//200

//        System.out.println(dec+dec2);//������ͣ������dec ��dec2 ������

        BigDecimal dec3=dec.add(dec2);
        System.out.println(dec3);//300
    }

}
