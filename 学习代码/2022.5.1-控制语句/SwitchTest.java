/*
switch 语句：
			选择语句，分支语句
			switch语句语法格式：
					
					switch（值）{
							case 值1：
									java语句
									break；
							case 值2：
									java语句；
									break；
							case 值3：
									java 语句；
									break；
							default：---------------------------不论放在那里，都是执行case之后执行default
									java语句；
					}

					以上是一个完整的switch语句：
							其中：break语句不是必须的  default分支也不是必须的

					switch语句只支持int类型和String 类型；
					在JDK 版本8之前不支持String 类型，只支持int类型；
					switch语句本质上是只支持int和String 类型，
					但是byte short char也可以使用在switch类型，因为可以直接进行int类型转换。

					switch 语句中“值1”，“值2”比较的时候会使用“==”进行比较；

					switch语句的执行原理
					值与值1进行比较，如果相同，则执行该分支中的java语句，然后遇到break语句，switch语句就结束了；
					如果值与值1不相等，会继续拿值与值2进行比较，如果相同，则执行该分支中的java语句，然后遇到break，结束

					如果分支执行了，但是最后没有break，此时会发生case穿透现象

					所有的case都没有匹配成功，那么最后执行default分支
*/

public class SwitchTest{
		public static void main(String[] args){
				/*long a=100;//--------------无法执行，类型不兼容；long转换成int会有精度损失
				switch(a){---------------只接受int类型和String 类型
				}
				
				byte b=100;//----------------可以执行
				switch(b){
				}

				short s=100;
				switch(s){}

				char c='a';
				switch(c){}

				String d="abc";
				switch(d){}
				*/

/*
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入数据（0-2）：\t");
				int a=s.nextInt();
				switch(a){
						case 0:
							System.out.println("输入0");
							break;
						case 1:
							System.out.println("输入1");
							break;
						case 2:
							System.out.println("输入2");
							break;
				}

*/				

/*case穿透
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入数据（0-2）：\t");
				int a=s.nextInt();
				switch(a){
						case 0:
							System.out.println("输入0");
							//break;----------------没有break就会出现直接穿透到下一层的现象，输入0，输出0 1 2
							//就是穿透现象
						case 1:
							System.out.println("输入1");
							//break;
						case 2:
							System.out.println("输入2");
							//break;-----------------最后的break不会穿透，判断为2之后直接进行下面的语句

*/

/*验证default语句
	java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入数据（0-2）：\t");
				int a=s.nextInt();
				switch(a){
						case 0:
							System.out.println("输入0");
							break;
						case 1:
							System.out.println("输入1");
							break;
						case 2:
							System.out.println("输入2");
							break;
					   default://-------------------这行数据有没有都行，没有的话，
						   //输入数据和以上case无直接匹配就输出空语句，有的话，输出default语句
						   System.out.println("输入有误");
				}
*/


/*验证case合并语句
java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入数据（0-2）：\t");
				int a=s.nextInt();
				switch(a){
						case 0: case 1:
							System.out.println("输入");
							break;
						case 2:
							System.out.println("输入2");
							break;
						case 3:
							System.out.println("输入3");
							break;
				}

				*/




//作业：输入成绩，输出等级

			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.print("输入你的成绩：\t");
			double a=s.nextDouble();
			int score=(int)(a/10);//注意：如果不加（int）进行强制类型转换，这里的double类型的a除以10的时候结果为double类型
			//错误: 不兼容的类型: 从double转换到int可能会有损失
			String c="优秀";
			switch (score)
			{
					case 1:case 2:case 3:case 4:case 5:case 0:
						c="垃圾";
						break;

					case 6:
						c="及格";
					break;

					case 7:
						c="中";
					break;

					case 8:
						c="良";
					break;
			}
			System.out.println(c); 
		}
}


