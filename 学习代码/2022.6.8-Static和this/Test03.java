/*
静态代码块：
1.使用static关键字可以定义静态代码块
2.静态代码块定义语法：
		static{
				java语句；
				java语句；
		}
3.static静态代码块在什么时候执行：
		类加载时执行。并且只执行一次；
		静态代码块有这样的特点。
4.注意：静态代码块在类加载时执行，并且在main方法之前执行
5.静态代码块一般都是按照自上而下的顺序执行。
6.静态代码块有什么作用：
		第一：静态代码块不常用；不是每一个类中都要写的东西
		第二：静态代码块的语法机制实际上是SUN公司给我们程序员的一个特殊的时刻/时机；即类加载时机
	
	具体的业务上来说：
			项目经理说了：大家注意，我们所编写的程序中，只要是类加载了，请记录一下类加载的日志信息
			（在哪年哪月哪日几时几分几秒，哪个类加载到JVM当中了）————这些记录日志的代码写到
			静态代码块当中
*/

public class Test03
{
	//静态代码块（特殊的时机：类加载时机）
	static{
		System.out.println("A");
	}
	//一个类中可以有多个静态代码块
	static{
		System.out.println("B");
	}
	//入口
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
	
	static{
		System.out.println("C");
	}
} 

/*
执行结果：
A
B
C
Hello World!
*/