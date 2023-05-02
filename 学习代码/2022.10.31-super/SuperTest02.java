/*
在java语言中，不管是new什么对象，最后老祖宗的Object类的无参数构造方法是一定会执行的。
（Object类的无参数构造方法是处于		栈顶部		的）

栈顶的特点：
	最后调用，但是最先执行结束
	后进先出原则

注意：以后代码写的过程中，最好是先将一个类的无参数构造方法写出来，如果无参数构造方法丢失的话，可能会影响到“子类对象的创建”	 
*/

public class SuperTest02{
	public static void main(String[] args){
		new C();
		System.out.println("创建新的对象");
	}
}

class A
{
	public A(){
		System.out.println("A的无参数构造方法执行");
	}
}

class B extends A
{
	public B(){//虽然这里没有写明super（），但是这里默认是存在这样的一个语句的。
		System.out.println("B的无参数构造执行");	
	}
	public B(String name){//虽然这里没有写明super（），但是这里默认是存在这样的一个语句的。
		System.out.println("B的有参数构造方法执行");
	}
}

class C extends B
{
	public C(){
		this("132");
		System.out.println("C的无参数构造方法执行");
	}
	public C(String abc){
		this("152",125);
		System.out.println("C的有参数构造方法执行（String）");
	}
	public C(String a , int b){
		super("5656");
		System.out.println("C的有参数构造方法执行（String ,int）");
	}
}

/*
执行结果：
 
A的无参数构造方法执行
B的有参数构造方法执行
C的有参数构造方法执行（String ,int）
C的有参数构造方法执行（String）
C的无参数构造方法执行
创建新的对象
*/

