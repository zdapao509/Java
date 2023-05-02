/*
没有方法的话，会存在什么问题：代码的复用性差，功能相同不需要重复编写。

方法定义的类体中，顺序不重要，主方法不调用，他不执行。

方法的语法机制：
		[修饰符列表]		返回值类型	方法名（形式参数列表）{
				方法体；
		}

	注意：[ ]里面的内容表示不是必须的，是可选的，由java语句构成。

关于修饰符列表：不是必选项，是可选的，目前统一写成public static。

关于返回值类型：

		1.可以是任意的类型，包括基本的数据类型+引用数据类型，也就是说，返回值可以是：byte，short，int，
			long，float，double，Boolean，char，String。。

		2.方法结束之后，大部分情况下都是有一个结果的，一般都是以数据的形式体现出来，
			方法执行结束之后，返回值返回给调用方。

		3.当一个方法执行结束之后，不返回任何返回值的时候，返回值类型也不能是空白，必须写上void关键字，
			所以void表示该方法执行之后不返回任何结果。

		4.如果返回值类型不是void，那么方法体结束时，必须使用“return  值”这样的语句来完成值的返回，如果
			没有return值，编译报错。

		5.只要有return关键字的语句执行，当前方法必结束。注意不是整个程序结束，是当前的方法结束。

		6.如果返回值类型是void，那么在方法体当中，不能有“return 值”这样的语句，但是可以有“return”语句，
			return的作用就是：终止当前的方法。

		7.除了void之外，剩下的都必须有“return 值”这样的语句。

方法名：
		方法名要见名知意；
		 驼峰式命名规则，首字母小写，后面每个单词的首字母大写

形式参数列表：
		形式参数的每一个变量都是局部变量，方法结束之后，内存释放，
		形参的个数是0-n个，
		形参的数据类型及决定性作用，其对应的变量名是随意的。
		形参之间用英文的逗号隔开；

方法体：
		方法体的编写是业务逻辑代码，完成某个特定的功能，遵循自上而下的执行顺序，
		在方法体中处理业务的逻辑代码的时候需要数据，数据的来源就是这些形参。
		方法体只有调用之后才能执行，执行的语法是：
				类名.方法名（实际参数列表）；

		注意：在调用方法的时候，a()方法调用b()方法，当a和b方法在同一个类中的时候，“类名.”可以省略。
					如果不在一个类的时候，需要跨类调用的时候，“类名.”不能省略。

		方法定义的形式参数的数据类型是整形，可以在实际参数给定的数据类型是byte类型，属于小容量转大容量
		自动类型转换。

*/

public class MethedTest
{
	//入口主方法
	public static void main(	String[] args){

			int a=MethedTest.divide(7,2);//其中（7,2）叫做实际参数列表，简称实参
			//注意实际参数列表必须和形式参数的列表长度相同，一一对应，类型要对应，个数要对应。
			System.out.println(a);


			//divide(10,2);//注意调用的时候形式参数的数据类型要与规定的数据类型对应。
			//return;
	}

	/*public static int divide(int a,int b){
			return System.out.println(a/b);
			//错误: 不兼容的类型: void无法转换为int
	}*/

		/*
		正常语法：
		public static int divide(int a,int b){
			return a/b;
			}*/


		/*
		方法可以不返回任何的数据类型，只要在方法体中输出值，在主方法中调用即可。
		public static void divide(int a,int b){
				System.out.println(a/b);
				return;
			}*/


			/*public static int divide(int a,int b){
					int x=a/b;
					//错误: 缺少返回语句
			}*/


			/*public static int divide(int a,int b){
					int x=a/b;
					return;
			错误: 不兼容的类型: 缺少返回值
			}*/

			/*public static void divide(int a,int b){
					int x=a/b;
					return x;// 错误: 不兼容的类型: 意外的返回值
					}*/
		public static int divide(int a,int b){
			return a/b;
			}
}