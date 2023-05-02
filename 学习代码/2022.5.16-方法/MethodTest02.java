/*
局部变量：只在方法体内有效，方法结束之后，局部变量内存就释放了；

JVM三块租主要的内存：栈内存，堆内存，方法区内存

方法区最先有数据，方法区中放代码片段，存放class字节码

栈内存：方法调用的时候，该方法需要的内存空间需要在栈中分配。

方法不调用的话是无法在栈中调用内存空间的。

方法只有在调用的时候才会在栈中分配空间，并且调用时就是压栈，分配空间

方法执行结束之后，该方法所需要的空间就会释放，此时发生弹栈动作，释放空间

栈中存储什么：方法运行过程中需要的内存，以及栈中会存储方法的局部变量；   
*/


/*
以下方法执行过程中:main 方法最先入栈，开始执行，在栈中的最底层，并且给自己的局部变量x分配空间；
接着m1，然后 m1开始执行，m1入栈，给自己的局部变量i分配内存空间，然后是m2执行，m2执行之后m3入栈，
开始执行；m3位于栈的最顶层，m3结束之后，弹栈并且释放空间，接下来是m2弹栈，并且释放空间，然后是m1
弹栈，释放内存空间，最后main方法弹栈释放内存空间，程序结束。
*/
public class MethodTest02
{
	public static void main(String[] args){
			System.out.println("main begain");
			int x=100;//这里的x是局部变量，只能在此方法中被使用	
			m1(x);
			System.out.println("main over");
	}
	public static void m1(int i){
			System.out.println("m1 bagain");
			m2(i);
			System.out.println("m2 over");
	}
	public static void m2(int i){
			System.out.println("m2 begain");
			m3(i);
			System.out.println("m2 over");
	}
	public static void m3(int i){
			System.out.println("m3 begain");
			System.out.println(i);
			System.out.println("m3 over");
	}
}