/*
for 循环的语法机制及运行原理：
		语法机制：
				for(初始化表达式；条件表达式；更新表达式){
						循环体；//循环体由java语句构成
				}
		
			注意：
				第一：初始化表达式最先执行，并且在一个循环中只执行一次
				第二：条件表达式结果必须是一个布尔类型，也就是true或者false
				第三：循环体执行条件为条件表达式为真，条件表达式执行结果为false时终止执行循环体
			
			执行原理：
					先执行初始化表达式，并且初始化表达式只执行1次。
					然后判断条件表达式的结果，如果条件表达式的结果是true，就执行循环体，然后执行更新表达式
					语句；更新完成之后再判断条件表达式的结果。如果还是true继续执行循环体。
					直到更新表达式的结果经过条件表达式判断为false之后循环终止；

					注意：更新表达式的作用是：控制循环次数， 换句话说，更新表达式实际上在改变某个变量得值，

					这样表达式的结果才可能是true或false，从而终止for循环的执行，如果缺失更新表达式，
					
					很可能导致死循环


		所有合法的控制语句都可以嵌套使用。
		for嵌套一个for循环；可以看成：
		for(){
		//在分析外层循环的时候，把里面的for当做一段普通的代码语句；
		for(){}
		}


*/
public class ForTest01{
		public static void main(String[] args){
				/*
					for(;;){//初始化表达式，条件表达式，更新表达式其实都不是必须的
				System.out.println("死循环");				
				}
				*/
				
/*				
				for (int i=1;i<10 ;i++ )//注意：初始化表达式中，一定要定义一个变量，即要有数据类型int；
				//这里的i变量，属于for循环的局部变量，for循环结束之后i的内存就被释放了，这个i变量只能在
				//for循环中使用，属于for循环域。在main方法中没有办法直接使用。
				{
					System.out.println(i);
				}

	
				int a=10;
				for (;a<=50 ; )
				{
					System.out.println(a);
					a++;
				}
				System.out.println("这里还可以访问嘛："+a);


				int b=10;
				for (;b<=20 ; )
				{
					b++;//--------------------输出11-21
					System.out.println(b);	
				}
				System.out.println("这里还可以访问嘛："+b);


				
				for (int c=100;c>0 ;c%=3 )//---------------------取余运算，死循环，一直余1；
				{	
					System.out.println(c);
				}
*/

//使用for循环，输出1-100的所有奇数求和
		/*方法1
		int sum=0;
			for (int d=1;d<=100 ;d++ )
			{
				if (d%2==1)
				{
					sum+=d;
				}
			}
			System.out.println("所有1-100的奇数求和为："+sum);
			*/
			
			/*方法二
			int sum=0;
			 for (int a=1;a<100 ;a+=2 )
			 {
				 sum+=a;
			 }
				 System.out.println("最后的结果是"+sum);
				 */

//嵌套使用：
				/* for (int s=1;s<3 ;s++ )
				 {
					 for (int d=1;d<10 ;d++ )
					 {
						 System.out.println(d);
					 }
				 }*/

//将内部嵌套的初始化表达式语句放在外循环外面：
		
		/*int a=0;
		for (int i=0;i<2 ;i++ )
		{ 
			for (;a<10 ;a++ )
			{
				System.out.println(i);
				System.out.println("a----->"+a);
			}
		}*/

//将内部嵌套的初始化表达式放入原位置后，并在内部嵌套的语句中输出外部嵌套的变量值				
		/*for (int i=0;i<2 ;i++ )
		{ 
			for (int a=0;a<10 ;a++ )
			{
				System.out.println(i);
				System.out.println("a----->"+a);
			}
		}*/


//九九乘法表
		/*正三角输出，a代表行号，b代表列号
		for (int a=1; a<10; a++)
		{
			for (int b=1;b<=a ;b++ )
			{
				System.out.print(b+"*"+a+"="+(a*b)+"       ");
			}
			System.out.println("\n");
		}*/


//倒三角的形式输出
		for (int a=1;a<10 ;a++ )
		{
			for (int b=a;b<10 ;b++ )
			{
				System.out.print(a+"*"+b+"="+(a*b)+"	 ");
			}
			System.out.println("\n");
		}
//规律：代码输出是按照行来输出，所以写的时候就要按照每一行不变的数作为外循环变量，
//内循环变量就是行内变量在改变的 ；即外循环为纵向循环（行改变），内部循环为横向循环（列改变）

		}
}