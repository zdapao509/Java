/*
到目前为止，一个类中可以出现的：

	类体{
			实例变量；
			实例方法；

			静态变量；
			静态方法；

			构造方法；

			静态代码块；
			实例语句块；

			方法(){
				局部变量
				int i=200;
			}
	}
*/

public class Review
{
	//类加载的机制是这样的，在程序执行之前，范式需要加载的类全部加载到JVM当中。先完成加载才会执行方法
	static{
		System.out.println("Review类加载时执行！");
	}
	
	//入口——静态方法
	public static void main(	String[] args){
		//局部变量
		int i=100;
		//完成一个对象的一连串动作
		//一个学生在教室里先学习，学习完成之后再去餐厅吃饭
		Student s1=new Student();
		s1.study();
		Student s2=new Student();

	}
}

class Student
{
	//静态代码块
	static{
		System.out.println("Student类加载时执行！");
		
	}

	//实例变量
	private int no;
	private String name;
	
	//静态变量
	static String job="学习";//注意：private与static不可以同时出现；private是实例变量的私有化，是可以利用set方法
	//和get方法进行修改的，但是static属于静态变量，类加载时进行初始化，不能修改(可以修改，这里错了)，所以注意二者不能同时出现
	//-------这里有一个错误，静态变量的值是能修改的，是唯一的，也就是一个对象改了，其他对象调用的时候也是已经改过的

	//使用static关键字修饰的变量，称为静态变量。静态变量的值是唯一的，不是不变的（也就是可以修改），
	//在其作用范围内，只存在一个值，无论在作用域的哪里调用修改，改变的都是同一个内存地址。

	//实例代码块
	{
		System.out.println("实例语句块，构造方法执行一次，这里就执行一次");
	}

	//构造方法
	public Student(){
		//无参数构造方法
		this(100,"张三");
	}
	public Student(int no,String name){
		this.no=no;
		this.name=name;
	}

	//封装setter和getter方法
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setNo(int no){
		this.no=no;
	}
	public int getNo(){
		return no;
	}

	//提供两种实例方法
	public void study(){
		//私有化可以在本类中访问的，其他的类中必须使用set和get方法；以下四种方法都是可以使用的，功能相同
		System.out.println(this.name+"正在努力的学习");
		System.out.println(name+"正在努力的学习");
		System.out.println(this.getName()+"正在努力的学习");
		System.out.println(getName()+"正在努力的学习");
		
		//方法执行到此处就结束了，去吃饭
		this.eat();//this.可以省略；编译器检测到eat方法是实例方法，会自动在eat方法前面添加this.
		eat();
	}

	public void eat(){
		System.out.println(this.name+"正在吃饭呢");

		//调用静态方法m1（）
		//静态方法使用的是“类名.”的方式访问
		//Student.m1（）；类名.可以省略
		//java编译器会在m1方法前面自动添加“类名.”因为检测到的m1方法是静态方法
		m1();
	}

	//	静态方法
	public static void m1(){
		System.out.println("Student m1 method execute!");
		//调用m2方法
		//Student.m2();
		m2();
	}
	public static void m2(){
		System.out.println("工作性质"+job);
		//编译器检测到job是一个静态工作变量，会在job前面自动添加Student.
	}

}

