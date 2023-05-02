/*
this的使用：

	1.this除了在实例方法中使用，还可以用在构造方法中。

	2.新的语法：通过当前的构造方法去调用另一个本类的构造方法，可以使用以下语法格式：
		
		this（实际参数列表）；
			通过一个构造方法1区调用构造方法2，可以做到代码复用
			但需要注意的是：“构造方法1”和“构造方法2”都是在同一个类当中

	3.this（）这个语法作用是什么？
		
			代码复用。

	4.死记硬背：
			
			对于this方法的调用只能出现在构造方法的第一行。

	5.以后写代码的流程：
		
		先写类，类写好了写属性，属性注意要私有化，属性写完了写构造方法，包括有参数的和无参数的

		构造方法后面还要跟着setter方法和getter方法；这几个步骤都是必备的步骤。
*/

public class Test08
{
	public static void main(String[] args){
		//调用无参数的构造方法
		Date d1=new Date();
		d1.detail();

		//调用有参数的构造方法
		Date d2=new Date(2000,10);
		d2.detail();
	}
}

class Date
{
	//属性都要私有化；养成私有化的习惯
	private int year;
	private int month;


	//构造无参数的构造方法
	public Date(){
		//year=1000;
		//month=9;
		this(1000,9);
	}
	
	/*无参数的构造方法有部分内容实际上在有参数的构造方法中也存在，为了减少工作量，可以采用this方法
	public Date(){
		this(1000,9);——这里要注意，this方法只能出现在构造方法的第一行。
	}
	
	*/

	//构造有参数的构造方法
	public Date(int year,int month){
		this.year=year;
		this.month=month;
	}
	//提供一个打印的方法
	public void detail(){
		System.out.println(year+"的"+month);
	}
	//读写year
	public void setYear(int year)
	{
		this.year=year;		
	}
	public int getYear(){
		return this.year;
	}

	//读写month
	public void setMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return month;
	}

}


