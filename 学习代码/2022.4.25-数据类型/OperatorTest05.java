public class OperatorTest05{
			public static void main(String[] args){
					int a=100;
					int b=200;
					System.out.println("计算结果为："+(a+b));//括号拥有优先级，先计算括号，然后进行拼接
					System.out.println(a+b+"300");//优先级：在没有小括号的情况下，优先级从左到右，先计算再拼接
					System.out.println(a+(b+"300"));//先括号内拼接，再括号外拼接
					System.out.println(a+"+"+b+"="+(a+b));//输出100+200=300
					System.out.println(a+"+"+b+"="+a+b);//输出100+200=100200
					String c="张威明";
					System.out.println("欢迎"+c+"回归");
			}
}