import java.util.Random;

/*
������Ĳ���
* */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random=new Random();//���������
        int num1= random.nextInt();//�������һ��int����ȡֵ��Χ�ڵ���
        System.out.println(num1);

//        ��������� 0~100��Χ�ģ�������101
        int num2= random.nextInt(101);
        System.out.println(num2);

    }
}
