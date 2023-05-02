import java.util.Random;

/*
随机数的产生
* */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random=new Random();//创建随机数
        int num1= random.nextInt();//随机产生一个int类型取值范围内的数
        System.out.println(num1);

//        产生随机数 0~100范围的，不包括101
        int num2= random.nextInt(101);
        System.out.println(num2);

    }
}
