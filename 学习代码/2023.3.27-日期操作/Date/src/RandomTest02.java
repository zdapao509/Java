import java.util.Random;

/*
编程：
    生成5个不重复的随机数。如果重复的话，重新生成，最终将5个随机数放在数组中
* */
public class RandomTest02 {
    public static void main(String[] args) {
        int[] a=new int[5];
        Random random=new Random();//创建random对象
        for (int i = 0; i < a.length; i++) {//将数组默认生成的0全部变为-1，取数范围为0-100
            a[i]=-1;
        }
        int i=1;//后面的随机数从下标为1开始进入
        a[0]=random.nextInt(100);//随机数的第一个值先定义好-------------判断生成的是否有为正确的，可以把数的范围限制在5.看顺序对不对
        while(i!=5){//循环，下标不到5之前，一直循环，直到下标到达5，表示1 2 3 4 四个下标已经存了数，数组已满
            int j=random.nextInt(100);//随机产生一个数0-100
            boolean sign=true;//判断标志
            for (int k = 0; k < i; k++) {//每次产生的随机数，都要和数组中已有的数比较，但不是全部遍历，如果数组中只存了两个数，那就只用和两个数比较，所以循环的终止条件是i
                if(j==a[k]){//如果找到了已有的数，那就结束循环，并且将标识赋false。
                    sign=false;
                    break;
                }
            }
            if(sign){//经过上面的循环判断，如果不存在相等的数，标识为true，那就把这个数加到数组中。
                a[i++]=j;
            }
        }
        for (int j = 0; j < 5; j++) {//遍历数组
            System.out.println(a[j]);
        }
    }
}
