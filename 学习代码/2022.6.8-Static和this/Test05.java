//实例代码块
/*
1.除了静态代码块之外，还有一种语句块叫做实例语句块。
2.实例语句在类加载时没有执行
3.实例语句语法：
	{
		java语句；
	}

4.实例语句块在什么时候执行？
	只要是构造方法执行，必然在构造方法执行之前，自动执行“实例语句块”中的代码
	实际上这也是SUN公司为程序员准备的一个特殊的时机，叫做对象的构造时机。
*/

public class Test05
{
	//入口
	public static void main(String[] args){
		System.out.println("main begain");
		new Test05();
		new Test05();
		new Test05("zhang");
	}

	//实例语句块
	{
		System.out.println("实例语句块执行！");
	}

	//无参数构造方法
	public Test05(){
		System.out.println("无参数构造方法");
	}

	//有参数构造方法
	public Test05(String name){
		System.out.println("有参数构造方法");
	}
}


/*
判断程序的执行顺序:A  X  Y  C  B  Z
public class CodeOrder{
	//静态代码块
	static{
		System.out.println("A");
	}
	//入口
	public static void main(String[] args){
		System.out.println("Y");
		new CodeOrder();
		System.out.println("Z");
	}
	//构造方法
	public CodeOrder(){
		System.out.println("B");
	}
	//实例语句块
	{
		System.out.println("C");
	}
	//静态代码块
	static{
		System.out.println("X");
	}
}
*/