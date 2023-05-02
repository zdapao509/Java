/*
this :
1.this是一个关键字，全部小写
2.this是什么，在内存方面是怎么样的？
	一个对象一个this。
	this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
	所以，严格意义上讲，this代表的就是“当前对象”。
	this存储在堆内存中对象的内部。
3.this只能使用在实例方法中，谁调用这个实例方法，this就是谁；所以this代表的是：当前对象
4.this.大部分情况是省略的
5.为什么this不能使用在静态方法中？
	this代表的是当前对象，静态方法中不存在当前对象。
*/

public class Test06
{
	public static void main(String[] args){
		User a=new User("张三");
		a.c();
		User b=new User("李四");
		b.c();
	}
}

class User
{
	//属性——实例变量(必须采用  引用.   的方式访问)
	String name;
	//构造方法
	public User(){
	
	}
	public User(String s){
		name=s;
	}

	//实例方法
	public void c(){
		//这里的this就是当前对象
		//a调用c()  this就是a
		//b调用c() this就是b
			System.out.println(name+"被选中了");
			System.out.println(this.name+"被选中了");//这里的this就是当前对象，虽然上面一行没有this，但是代表的
			//意思是一样的，即this是可以省略的；默认访问当前对象的name
	}

	//静态方法
	public static void c1(){
		//这里的this就是当前对象，而静态方法不需要对象，矛盾了
		//错误: 无法从静态上下文中引用非静态 变量 name
			//System.out.println(name+"被选中了");
	}
}

class Student
{
	//实例变量怎么访问？必须先new对象，通过引用.的方式来访问
	String  name ="张三";
	//静态方法
	public static void m(){
		//System.out.println(name);访问时静态方法通过类.m()的方式进行访问，但是name是实例属性，
		//通过对象.name的方式才能引用，不创建对象就无法访问

		//System.out.println(this.name);//this代表的就是当前对象；但是static静态状况是不需要当前对象的；

		//也就是是说明this和static是水火不容的两种状态

		//除非是这样：
		Student aa=new Student();
		System.out.println(aa.name);
	}

	//为什么set和get是实例方法-------------方法中直接访问了实例变量，这个方法就是实例方法
	public void setName(String s){
		name=s;
	}
	public String getName(){
		return name;
	}

}


/*
public class Testdemo{
	int i=100;---------实例变量，必须先new对象才能去访问
	static int k=111；-----------静态变量
	public static void main（String[] args）{
		//错误：无法从静态上下文中引用非静态 变量 i
		System.out.println(i);

		//怎么样访问i
		Testdemo bb=new Testdemo();
		System.out.println(bb.i);

		//静态变量用“类名.”访问
		System.out.println(Testdemo.k);

		//类名可以省略：在同一个类下面进行访问
		System.out.println(k);
	}
}

*/