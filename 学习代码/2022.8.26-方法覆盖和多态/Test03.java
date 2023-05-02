/*
关于Object中的toString方法：
	1.toString（）方法的作用是什么？
			作用：将java对象转换成“字符串”形式
	2.Object类中的toString()方法的默认实现是什么？
			public String toString(){
				return getClass().getName()+"@"+Integer.toHexString(hashCode());
			}
	3.那么toString 方法的默认实现够用吗?

	注意：直接输出对象的引用的时候，默认调用它的toString（）方法，方法重写之后就调用重写的方法。
*/

public class Test03
{
	public static void main(String[] args){
		//创建一个日期对象
		MyDate t1=new MyDate();
		//调用toString（）方法（将对象转换成字符串的形式）
		//问：你对这个输出的结果满意吗？不满意，我们希望输出的是：xxx.年xxx月xxx日
		//重写MyDate的toString（）方法之前的结果：
		//System.out.println(t1.toString());//MyDate@372f7a8d：这个是对象在堆内存中的地址

		//重写MyDate的toString（）方法之后的结果：
		System.out.println(t1.toString());//1998年10月24日

		MyDate t2=new MyDate(2022,9,5);
		System.out.println(t2);//2022年9月5日：println这个方法会直接调用tostring这个方法
	}
}

class MyDate
{
	private int year;
	private int month;
	private int day;
	public MyDate(){
		this(1998,10,24);
	}
	public MyDate(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public int getMonth(){
		return this.month;
	}
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return this.day;
	}

	//从Object类中继承过来的那个toString方法已经无法满足我的业务需求了
	//子类中有必要对父类中继承的MyDate中的toString方法进行覆盖/重写
	//希望toString输出的是：xxx.年xxx月xxx日
	//重写一定要注意的是：直接复制原代码，不要手动编写，避免出错
	public String toString(){
		return  this.year+"年"+this.month+"月"+this.day+"日";
	}
}