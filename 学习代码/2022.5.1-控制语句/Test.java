/*
第一题：编写java程序，用循环结构打印如下的数值列表：
1 10 100 1000
2 20 200 2000 
3 30 300 3000 
4 40 400 4000     
5 50 500 5000 
*/

/*
public class Test{  
		public static void main(String[] args){
			for (int a=1;a<6 ;a++ )
			{
				System.out.println(a+"  "+(a*10)+"  "+(a*100)+"  "+(a*1000));
			}
		} 
	} 

也可以写成：
	for (int a=1;a<=5 ;a++ )
		{
			for(int b=a;b<=a*1000;b*=10){
				System.out.print(b+" ");
			}
			System.out.println();
		}
				
*/



	/*
				第二题：打印2到10000的所有素数，每行显示8个素数
	*/
/*
public class Test{  
		public static void main(String[] args){
			int b=1;//定义每行数据个数，用b统计每行个数
			for (int a=2;a<10001 ;a++ )//外循环，分析的数据从2-10000
			{
				for (int i=2; i<a;i++ )//内循环要判断是否是素数。通过a除以2---a-1的方法，判断是否是素数
				{
						int c=a%i;//取余判断是否是素数
						if (c==0)
						{
							break;	//只要有一个可以整除这个数，就是合数；跳出本次循环
						}
						else if (i==a-1)//当执行到最后（a-1）都没有除开的时候，认为这个数据是素数；
						{
								if (b<9 ){//输出的数据要控制在每行8个；
													if (a==3)//为了输出2的同时还保持每行数据个数保持不变；用输出3的方法控制语句
													{
															System.out.print(2+"  "+3+"  ");
															b+=2;//输出2个数据；但是本行还剩余6个数，所以剩下的数据要从第三个开始到第八个共6个数据
													}else{
															System.out.print(a+"  ");
															b++;
													}
											}

									else{//每行数据个数超过8个的时候，下一行开始
												System.out.println();//转到下一行
												System.out.print(a+"  ");//数据填入下一行的行首
												b=2;//由于已经填了第一个数据，下一个数据要从第二个开始
										 }
						}
				}
			}
		} 
	} 
*/


//新的思路：

/*public class Test
{
	public static void main(String[] args){
			int count=0;
			for (int a=2;a<=10000 ;a++ )
			{
				boolean isSuShu=true;//提前定义好一个布尔型判断数据,如下面的循环判断语句直接不执行，
													//就会输出真，用在输出最小素数a=2；

//for循环用于判断是否是素数，if判断语句用于输出素数，并判断每行数据是否到达了8个数据；

				for (int b=2;b<a ;b++ )//这个语句成功的包含了2这个最小的素数。
													//如果b小于a，也就是b=2;a=2的时候可以直接跳过判断语句，输出2
							{
								if (a%b==0)
								{
									isSuShu=false;
									break;
								}
							}

				if (isSuShu)
							{
								System.out.print(a+"  ");
								count++;
								if (count==8)
								{
									System.out.println();
									count=0;
								}	
							}
			}
	}
}*/


/*
			第三题：编写程序，计算5的阶乘。
*/

/*public class Test{  
		public static void main(String[] args){
			int b=1;
			for (int a=1;a<6 ;a++ )
			{
				b=b*a;
			}
				System.out.println("5的阶乘"+b);
		} 
	} */



/*
			第四题：控制台输入年龄，根据年龄输出不同的提示。 
*/

/*
public class Test
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入你的年龄(0-150):");
			double a=s.nextDouble();
			if (a<0||a>150)
			{
				System.out.println("你在狗叫什么");
				return;//指令需要终止，否则会出现输出下面的b值
			}
			int c=(int)(a/10);
			String b="老年";
			switch (c)
			{
					case 0:
						b="小孩";
					break;
						case 1: case 2: 
						b="青年";
					break;
					case 3: case 4:
						b="中年";
					break;
			}
			System.out.println("你属于："+b);
	}
}
*/

/*
			第五题：编写程序输出下图菱形。 
*/

/*
public class Test
{
	public static void main(String[] args){
				for (int a=1;a<10 ;a++ )//行号控制
				{
					//一共9行数据，前面5行的规律一样，后面4行的规律一样。用if语句分开进行输出。
					
					if (a<6)//前面的5行按照一样的规律进行计算
					{
						//同一行先输出空格，再输出*符号

						for (int i=1;i<((9-(2*a-1))/2)+1; i++)//前面的空格直接用循环计算，第一行空4个，第二行空3个，
																				//与行号有线性函数关系
						{
							System.out.print(" ");//空格结束之后不换行输出*
						}
						for (int b=1;b<(2*a-1)+1; b++)//空格循环结束之后，利用循环输出*符号
						{
							System.out.print("*");
						}
					}
					
					
					
					else{//后面的4行按照一样的规律计算
								for (int i=1;i<(a-5)+1; i++)
										{
											System.out.print(" ");
										}
								for (int b=1;b<(9-2*(a-5))+1; b++)
										{
											System.out.print("*");
										}
							}

				if (a!=9)//第九行结束之后，不需要再空一行，所以用if判断是否需要换行输出。
				{
					System.out.println();//同一行输出结束之后，需要换行输出；然后换到下一行进行输出
				}else{
						break;
				}

			
				}
	}
}
*/




/*
第六题：篮球从5米高的地方掉下来，每次弹起的高度是原来的30%，经过几次弹起，篮球的高度是0.1米。 
*/

/*public class Test
{
	public static void main(String[] args){
				double h=5;(注意这里的高度是浮点型，不要定义成整数型，否则后续乘0.3就成了整数了)
				int a=0;
				do
				{
					h*=0.3;
					a++;
				}
				while (h>0.1);
				System.out.println("经过次数："+a);
				System.out.println("高度："+h);
	}
}*/


/*
计算1000以内不能被7整除的数的和；
*/
/*
public class Test
{
	public static void main(String[] args){
		int a=0;
			for (int i=1;i<=1000 ;i++ )
			{
				if (i%7!=0)
				{
					a+=i;
				}
			}
			System.out.println("计算和为："+a);
	}
}*/

/*
计算1+2-3+4-5+6-7+。。。+100=结果
*/

/*public class Test
{
	public static void main(String[] args){
		int a=1;
			for (int i=2;i<=100 ;i++ )
			{
				if (i%2==0)
				{
					a+=i;
				}else{
					a-=i;
				}
			}
			System.out.println("计算结果是："+a);
	}
}*/



/*
小明的妈妈每天给他2.5元，他都会存起来，但是在存钱的第五天或者存钱的第5的倍数天，
它会花6元，求他什么时候可以存到100元
*/
//for循环
/*
public class Test
{
	public static void main(String[] args){
				double a=0;//注意这里的钱数是浮点型数据，
				int day=1;
				for (;a<100 ;day++ ){//用天数做初始化语句，用钱数做条件表达式
						if (day%5==0)
								{
										a-=6;//加等减等不改变a的数据类型，所以如果定义的a是整数型，
												//这里加了2.5就会出现精度损失的现象，影响结果；
										a+=2.5;
								}else{
										a+=2.5;
								}
					}
					System.out.println("天数："+(--day));
					System.out.println("钱数："+a);
				
	}
}
*/


//改用while循环：
/*
public class Test
{
	public static void main(String[] args){
			double i=0;
			int d=0;
			while (i<=1000000)
			{
				d++;
				i+=2.5;
				if (d%5==0)
				{
					i-=6;
				}
			}
			System.out.println("小明只经过："+((int)(d/365))+"年，就赚到了："+i+"元；赚钱真的很简单！");
	}
}*/


/*
输入一个数；计算输入的数的阶乘。
*/
/*public class Test
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("输入要计算阶乘的数");
			int b=1;
			for (int a=s.nextInt();a>1;a-- )
			{
				b*=a;
			}
			System.out.println("计算结果是："+b);
	}
}*/

/*
控制台输入一个数判断他是否是质数；（除了能整除1和他自身，其余不能整除）

这种判断题目，可以考虑在循环之前加一个布尔类型的判断标记，减少工作量。
*/
/*
public class Test
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入要检验的整数：");
			int a=s.nextInt();
			//可以在外边准备一个布尔类型的标记-----------------打标记法
			boolean isZhiShu=true;
			for (int i=2;i<a ;i++ )
			{
				if (a%i==0)
				{
					isZhiShu=false;
					break;
				}
			}
			if (isZhiShu)
			{
				System.out.println("这是一个质数");
			}else{
				System.out.println("这是一个合数");
			}

	}
}
*/



/*
从键盘接收一个正整数，该正整数作为行号，输出三角形。
*/
/*
public class Test
{
	public static void main(String[] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.println("请输入数据：");
				int a=s.nextInt();
				for (int b=1;b<=a ;b++ )//整体思路是：从上到下，从左往右------------------此处先控制行号
				{
					for (int i=1; i<=(a-b); i++)//控制同行空格数
					{
						System.out.print(" ");
					}
					for (int j=1;j<(2*b) ;j++ )//控制同行*数
					{
						System.out.print("*");
					}
					if (b!=a)//控制每行结束换行，同时最后一行不换行
					{
						System.out.println();
					}
				}
	}
}
*/


/*
从键盘接收一个正整数，该正整数作为行号，输出菱形。
*/
/*
public class Test
{
	public static void main(String[] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.println("请输入数据：");
				int a=s.nextInt();
				for (int b=1;b<=a ;b++ )//整体思路是：从上到下，从左往右------------------此处先控制行号
				{
					for (int i=1; i<=(a-b); i++)//控制同行空格数
					{
						System.out.print(" ");
					}
					for (int j=1;j<(2*b) ;j++ )//控制同行*数
					{
						System.out.print("*");
					}
						System.out.println();
				}
				for (int b=a+1;b<=2*a-1 ;b++ )
				{
					for (int i=1; i<=b-a; i++)
					{
						System.out.print(" ");
					}
					for (int j=1;j<=(4*a-2*b-1) ;j++ )
					{
						System.out.print("*");
					}
					if (b!=2*a-1)//控制每行结束换行，同时最后一行不换行
					{
						System.out.println();
					}
				}
	}
}
*/






/*
一个数如果恰好等于它的因子之和，这个数就是完数，例如6=1+2+3.找出所有1000内的完数
*/
/*
public class Test
{
	public static void main(String[] args){
			for (int i=1;i<=1000 ;i++ )//先取数
			{
				int a=0;//每取一个数，事先将因子的和归零；注意没必要把他放在外面。
				for (int j=1;j<i ;j++ )//从取到的数求它的所有因子。---------这里注意：一个数的本身不算在内
				{
					if (i%j==0)
					{
							a+=j;
					}
				}
				if (a==i)
				{
					System.out.println(i+"是完数");
				}
			}
	}
}
*/





/*
给一个不多于5位数的正整数，求出它是几位数，并且逆序输出各位数字
*/
/*
public class Test
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入一个不超过5位数的正整数：");
			int a=s.nextInt();
			//12345
			int j=1;
			int k=a;
			for (int i=10;k/i>0 ;k/=i )
			{
				j++;
			}
				System.out.println("输入了一个"+j+"位数");

				if (j==1)
				{
					System.out.println("逆序结果："+a);
				}
				else if (j==2)
				{
					int b=a%10;
					int c=a/10;
					System.out.println("逆序结果："+b+c);
				}
				else if (j==3)
				{
					int b=a/100;
					int c=a%100/10;
					int d=a%10;
					System.out.println("逆序结果："+d+c+b);
				}
				else if (j==4)
				{
					int b=a/1000;
					int c=a%1000/100;
					int d=a%100/10;
					int e=a%10;
					System.out.println("逆序结果："+e+d+c+b);
				}
				else if (j==5)
				{
					int b=a/10000;
					int c=a%10000/1000;
					int d=a%1000/100;
					int e=a%100/10;
					int f=a%10;
					System.out.println("逆序结果："+f+e+d+c+b);
				}

	}
}

另一种写法：
System.out.print("逆序输出的结果为：  ");
		while (c!=0)
		{
			System.out.print(c%10);
			c=c/10;
		}

*/



/*
判断一个数是不是回文数；回文数：12321，个位与万位相同，十位与千位相同
*/
/*
public class Test
{
	public static void main(String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入一个数");
			int a=s.nextInt();
			if (a/10000==a%10)
			{
				if ((a%10000)/1000==(a%100)/10);
				{
					System.out.println(a+"是回文数");
				}
			}else{
				System.out.println(a+"不是回文数");
			}
	}
}*/

/*
回文数的解法：
public class Test01{
	public static void main(String[] args){
		Test01 test=new Test01();
		boolean a=test.A(122321);
		System.out.println(a);
	}
	public boolean A(int x){
		if (x<0||(x!=0 && x/10==0))
		{
			return false;
		}
		int reventedNumber=0;
		while (x>reventedNumber)
		{
			reventedNumber=reventedNumber*10+x%10;
			x/=10;
		}
		return x==reventedNumber||x==reventedNumber/10;
	}
}


*/

/*
共有若干桃子，猴子第一天吃掉一半，加一个；第二天又吃掉了剩下的一半加一个；
以后每天都吃掉前一天的一半加一个，到第十天，只剩一个桃子，求桃子总数。
*/
/*
public class Test
{
	public static void main(String[] args){
		int a=1;//一开始第十天只剩下1个，开始倒推天数
			for (int i=1;i<10 ;i++ )//由于第10天的苹果数量已经指定，所以剩下的只需要算9天。循环9次就行。
			{
				a=(a+1)*2;
			}
				System.out.println("一共："+a+"个苹果");
	}
}*/



/*
计算1！+2！+3！+。。。+100！
*/
/*
public class Test
{
	public static void main(String[] args){
			long a=0l;//由于结果太大，只能定义长整型的数据，以防止出现溢出。
			for (int i=1;i<=100 ;i++ )//先从1取到100
			{
				long b=1l;//这里的b也要是长整型数据，避免某一个数的阶乘溢出
				for (int j=i;j>=1 ;j-- )//求每个数的阶乘；
				{
					b*=j;
				}
				a+=b;//将所有的阶乘结果加起来
			}
			System.out.println("结果是："+a);
	}
}*/


/*
一个球从100米落下，每次反弹回原来一般的高度再落下，求他在第十次落地时，共经过多少米
*/
/*
public class Test
{
	public static void main(String[] args){
			double a=100;	//初始高度，也就是第一次落地时走过的路程。
			int i=1;//次数
			double b=100;//统计高度；
			while (i<=9)
			{
				a/=2;
				b+=(2*a);//第一次落地不算在次数里面，从第二次开始，所以次数是9次
								//都是先升高上一次的一点半再降低到地面也就是上一次结果乘以二
				i++;
			}
			System.out.println("最后结果是："+b);
	}
}*/



/*
一个四位数，恰好等于它的首位数字之后所剩下的三位数的三倍，这个四位数是多少？
*/

public class Test
{
	public static void main(	String[] args){
			for (double a=1000;a<=9999 ;a++ )//这里的a必须是浮点数，否则就会出现，
																	//1499这样的直接除完了之后就会变成整数，出现计算误差
			{
				if (a%1000==(a/3))//a对1000求余数，剩下的就是原来的百位十位个位上的三位数与a除以三的结果相等即可
				{
					System.out.println("这个数是："+a);
				}
			}
	}
}