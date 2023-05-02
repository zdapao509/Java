/*
定义丈夫类 Hsband和妻子类wife,
丈夫类的属性包括:身份证号,姓名，出生日期，妻子。
妻子类的属性包括:身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法（无参数构造方法和有参数构造方法都要提供），编写测试程序，创建丈夫对象，
然后再创建妻子对象，丈夫对象关联妻子对象，妻子对象关联丈夫对象，要求能够输出这个"丈夫对象"的妻子的名字，
或者能够输出这个"妻子对象"的丈夫的名字。要求能够画出程序执行过程的内存图。
并且要求在程序中演示出空指针异常的效果-

*/

class Man
{
	String idCard;
	String name;
	int year;
	int month;
	int day;
	Woman woman;

	public Man(){}
	public Man(String idCard,String name,int c,int d,int e){
			this.idCard=idCard;
			this.name=name;
			
	}

	public void x(){

		System.out.println(name+"的妻子是"+woman.name+"\n她的身份证号是："+woman.idCard);
	}
}

class Woman
{
	String idCard;
	String name;
	int year;
	int month;
	int day;
	Man man;

	public Woman(){}
	public Woman(String a,String b,int c,int d,int e){
			idCard=a;
			name=b;
			
	}

	public void y(){

		System.out.println(name+"的丈夫是"+man.name+"\n"+"他的身份证号是："+man.idCard);
	}
}

public class HomeWork
{
	public static void main(String[]  args){
		Man q=new Man("155546464","张三",1998,10,24);
		Woman p=new Woman("16498756","李四",1999,12,30);
		q.woman=p;//这个地方是将两个对象关联起来最重要的关系式；创建的q这个男人类中的woman实例变量本来
		//是空的，现在将女人类的位置复制一份给了他，也就是他也可以访问这个类，这时就可以找到堆内存中的
		//女人的对象p的位置，从而读取p的属性。
		p.man=q;
		q.x();
		p.y();
	}
}


