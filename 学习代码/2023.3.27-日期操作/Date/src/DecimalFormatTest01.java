import java.text.DecimalFormat;

/*
�������ֵĸ�ʽ��
* */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
//        java.text.DecimalFormat  ר�Ÿ������ָ�ʽ��
//        DecimalFormat df=new DecimalFormat("���ָ�ʽ")��

        /*
        ���ָ�ʽ������
            #  ������������
            �� ����ǧ��λ
            .  ����С����
            0  ������ʱ��0

            ###��###.## �������ǧ��λ��������λС��
        * */
        DecimalFormat df =new DecimalFormat("###,###.##");
        String s=df.format(123456.123456);
        System.out.println(s);//123,456.12

        DecimalFormat df1 =new DecimalFormat("###,###.0000");
        String s1=df1.format(123456.12);
        System.out.println(s1);//123,456.1200


    }
}
