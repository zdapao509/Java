/*
使用方法重载机制：
		优点1：代码整齐美观
		优点2：功能相似的代码，可以让方法名重名，方便以后的编写

在java语言中：
		进行使用的方法区分时，首先java编译器通过方法名进行区分，但是在java语言中允许方法名相同的情况出现
		如果方法名重名了，编译器通过方法的参数类型进行方法的区分；

*/
public class ChongZai
{
	public static void main(String[] args){
		double c=sum(10.0,20.0);
		System.out.println(c);
	}
	public static int sum(int a,int b){
			System.out.println("int执行");
			return a+b;
	}
	public static long sum(long a,long b){
			System.out.println("long执行");
			return a+b;
	}
	public static double sum(double a,double b){
			System.out.println("double执行");
			return a+b;
	}
}

/*
什么时候要考虑方法重载：方法名相同，形参不同

		如果在同一个类中，如果功能1和功能2功能相似，那么可以考虑将他们的方法名一致。这样代码美观
		同时便于代码编写。

		注意：方法重载不能随便使用，如果两个功能根本不同，就不便于使用方法重载。
					方法重载和返回值类型无关，与函数名和参数类型有关。

		条件：满足以下的条件，就可以认为方法与方法之间发生了方法重载机制。
				
					同一个类当中

					方法名相同

					参数列表不同：

							参数的个数不同

							参数的类型不同

							参数的顺序不同


							以下这种情况就不属于方法重载，因为参数的类型决定了两个方法的一致，
							如果调用时给出   m1(1,100)那么就会出现编译器识别不了到底采用哪个m1来进行调用。
							以下属于方法调用。

							public static void m1(int a ,int b){}

							public static void m1(int x ,int y){}


							以下的方法也不属于方法重载，属于方法重复：
							方法重载和返回值类型无关，如果调用时，直接调用  m1()   那么返回int 还是返回double就不确定了

							public static int m1(){}

							public static double m1(){}


							以下的方法也不是方法重载，属于方法重复：与修饰符列表的有无无关。
									
									void m1(){}

									public static void m1(){}



					实际上：System.out.println()代码中可以看到，println（）就是一个方法的重载，方法名就是println，
									参数类型不同而已

*/

