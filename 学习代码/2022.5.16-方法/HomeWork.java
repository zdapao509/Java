//编写方法，求整数N的阶乘。思考：方法起什么名字，方法的形参是谁，方法的返回值类型是什么
/*public class HomeWork
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入你要计算的阶乘数");
			int a=s.nextInt();
			//jieCheng(a);
			System.out.println("计算结果是："+jieCheng(a));
	}
	
	public static int jieCheng(int i){
		int b=1;
			for (; i>=1;i-- )
			{
					b*=i;
			}
			return b;
	}
}*/


//输出大于某个正整数N的最小质数；

/*方法一：
public class HomeWork
{
	public static void main(String[] argss){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入一个数");
			int a=s.nextInt();
			System.out.println("大于这个数的最小质数是："+Test(a+1));//调用方法时，直接将值加一，保证进入求证是否是
																												//质数的方法中的数比输入的数大
	}
	public static int Test(int a){
		for (; ;a++ )//循环，开始让a变量逐个+1；循环没有结束条件，结束语句用return在循环中；
		{
			boolean isZhiShu=true;//指定一个布尔类型，如果不是质数就变成false
			for (int i=2;i<a ;i++ )//求证a能不能除开比自己小的除了1的数，如果可以除开，说明这是合数
			{
				if (a%i==0)
				{
					isZhiShu=false;
					break;
				}
			}
			if (a<=1)//如果数是1的话，大于他的最小的质数是2
			{
				return 2;//返回值是2，方法结束。
			}
			if (isZhiShu)//如果isZhiShu是true，说明这个数是质数，返回这个数。
			{
				return a;
			}

		}	
	}
}*/

public class HomeWork
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入一个数：");
			int a=s.nextInt();
			zuiXiaoZhiShu(a);
	}
	//控制比输入的a大的数一直加，直到找到那个质数；循环一直执行，只有break执行跳出循环；
	public static void zuiXiaoZhiShu(int a){
			/*while (true)//负责一直加加
			{
					if (isZhiShu(++a))
					{
						System.out.println("大于它的最小质数是："+a);
						break;//结果是质数就结束循环，
					}
			}*/

//简化循环过程的代码
			while (!isZhiShu(++a))//这里的循环执行一次就会判断一次：括号里面的是不是True
			{
				System.out.println(a+"我不是质数");
			}
			System.out.println("大于它的最小质数是："+a);


	}
	//判断输入的数是不是质数，返回一个布尔类型的判断结果；
	public static boolean isZhiShu(int b){
			boolean c=true;
			for (int i=2;i<b ; i++)
			{
				if (b%i==0)
				{
					return false;//不是质数直接返回false
				}
			}
			return true;//是质数返回true
	}
}