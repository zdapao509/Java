/*public class DiGui
{
	public static void main(String[] args){

			m1();
	}

	public static void m1(){
			System.out.println("\n");
			System.out.println("开始执行");
			m1();//目前这个递归没有结束语句
			System.out.println("结束执行");
	}
}*/



//计算1-n的和：
/*
public class DiGui
{
	public static void main(String[] args){
				System.out.println("请输入一个数：");
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				int a=s.nextInt();
				System.out.println("求和结果是："+Sum(a));
	}
	public static int Sum(int a){
		int b=1;
			for (;a>1;a-- )
			{
				b+=a;
			}
			return b;
	}
}*/



//采用递归的方法：
/*
public class DiGui 
{
	public static void main(String[] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.println("请输入一个数：");
				int a=s.nextInt();
				System.out.println("结果是："+Sum(a));
	}
	public static int Sum(int a){
		if (a<1)
		{
			return 0;//判断：当a==0的时候就可以终止这个程序的执行，也就是Sum（0）直接 返回给了1+Sum(0)，
						//不会执行到下一句的 return 0+Sum（--0）
		}	
		System.out.println("执行到了a=："+a);
			return	a+Sum(--a);//反复执行，3+Sum(2)=3+2+Sum(1)=3+2+1+Sum(0);到了0之后就返回0，程序不再往下执行
	}
}*/


//使用递归的方式求a的阶乘；
public class DiGui
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
		System.out.println("请输入一个数：");
		int a=s.nextInt();
		System.out.println("计算结果是："+jieCheng(a));
	}
	public static int jieCheng(int a)
	{
		if (a==1)
		{
			return 1;
		}
		System.out.println("计算到了a="+a);
		return a*jieCheng(--a);
	}
}
