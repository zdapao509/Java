/*
1.举例子：在适当的时候使用：super（实际参数列表）

2.注意：在构造方法执行过程中，一连串调用了父类的构造方法，父类的构造方法又继续向下调用它的父类的构造方法，
			但是实际上，对象只创建了一个。

3.思考：“super（实参）”到底是干啥的？
	
	super（实参）的作用是：初始化当前对象的父类型特征。
	并不是创建新对象。实际上对象只创建了一个。

4.super关键字代表什么呢？
	super关键字代表的就是“当前对象”的那部分父类型的特征

	比如：我继承了我父亲的一部分特征：
				例如：眼睛、鼻子等
				super代表就是“眼睛、鼻子等”
				“眼睛、鼻子”虽然是继承了父类的，但是这部分在我的身上
*/

public class SuperTest03{
	public static void main(String[] args){
		CreditAccount ca1=new CreditAccount();
		System.out.println(ca1.getActno()+","+ca1.getBalance()+","+ca1.getCredit());
		CreditAccount ca2=new CreditAccount("张威明",10000,0.9999);
		System.out.println(ca2.getActno()+","+ca2.getBalance()+","+ca2.getCredit());
	}
}

//账户
class Account
{
	//属性
	private String actno;
	private double balance;

	//构造方法
	public Account(){
	//this.actno=null;虽然不显示，但是是存在着两个语句的
	//this.balance=0.0;
	}

	public Account(String actno ,double balance){
		this.actno=actno;
		this.balance=balance;
	}

	public void setActno(String actno){
		this.actno=actno;
	}
	public String getActno(){
		return actno;
	}

	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
}

class CreditAccount extends Account
{
	//属性：信用度
	private double credit;

	public CreditAccount(){
	//credit=0.0；注意这里会隐藏一句这个语句，也就是在无参数构造方法执行的时候，自动给对应的实例属性赋一个值
	}

	public CreditAccount(String actno,double balance,double credit){
		/*
		这里要注意，属性私有化之后，只能在本类下面访问，子类继承父类的时候，对于私有的属性，是不能进行继承的

		this.actno=actno;//错误: actno 在 Account 中是 private 访问控制
		this.balance=balance;//错误: balance 在 Account 中是 private 访问控制

		*/

		//虽然不能通过this.的方式修改父类的私有化属性，但是由于super（）函数可以调用父类构造方法的特性，可以利用super（）
		//super();//调用父类的无参数构造方法
		super(actno,balance);
		this.credit=credit;
	}

	//setter和getter方法
	public void setCredit(double credit){
		this.credit=credit;
	}
	public double getCredit(){
		return credit;
	}
}

