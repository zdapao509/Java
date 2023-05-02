/*
二、写一个名为Account的类模拟账户。该类的属性和方法如下所示。
该类包括的属性:

账户id，余额balance，年利率annualInterestRate:

包含的方法:各属性的set和get方法。取款方法withdraw()，存款方法deposit()

写一个测试程序
(1）创建一个customer，名字叫Jane Smith，他有一个账号为1000，余额为2000
年利率为1.23%
(2）对Jane Smith操作:
存入100元,再取出960元,再取出2000.

打印Jane Smith的基本信息
		信息如下显示:
		成功存入: 100
		成功取出:960
		余额不足,取钱失败
*/

//注意上面的要求里面除了要求有一个Account账户类的创建，还要考虑这个测试程序，因为需要一个人去拥有
//银行卡，也就是银行卡必须有一个主人，那这个人就属于一个对象，对象就需要一个类去创造，这里就需要
//为银行卡的主人创建一个类。

class Account
{
	private String id;  
	private int balance;
	private double annualInterestRate;

	//构造方法（无参数）
	public Account(){}
	//有参数构造方法
	public Account(String id,int balance,double annualInterestRate){
		this.id=id;
		if (balance<0)
		{
			System.out.println("余额不能为负值");
			return;
		}else{
			this.balance=balance;
		}
		this.annualInterestRate=annualInterestRate;
		System.out.println("账户id是："+this.id+";账户余额："+balance+";年利率："+annualInterestRate+"%");
	}

	//读写id号码
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId(){
		return id;
	}
	//读写余额
	public void setBalance(int balance){
		this.balance=balance;
	}
	public int getBalance(){
			return balance;
	}
	//读写年利率
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//取款方法
	public void withdraw(int ee){
		balance -=ee;
		if (balance<0)
		{
			balance=balance+ee;
			System.out.println("余额不足，取钱失败");
		}else{
			System.out.println("成功取出："+ee+"\n目前账户余额："+balance);
		}
	}
	//存款方法
	public void deposit(int ff){
		this.balance+=ff;
		
			/*
				可以调用方法来修改余额：
				this.setBalance(this.Balance()+ff);其中的this可以省略
			*/

		System.out.println("成功存入:"+ff+"\n账户余额："+balance);
	}
	
}


//测试程序里还有一个客户测试，所以这里应该还有一个客户类
class Customer
{
	private String name;
	private Account act;
	//无参数构造方法
	public Customer(){
	
	}
	//有参数构造方法
	public Customer(String name,Account act){
			this.name=name;
			this.act=act;
	}
	//setter和getter方法
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}

	public void setAct(Account act){
		this.act=act;
	}
	public Account getAct(){
		return act;
	}
}



public class HomeWorkAccount
{
	public static void main(String[] args){
		Account a=new Account("1000",2000,1.23);//初始化账户类
		Customer c=new Customer("Jane Smith",a);//创建客户类，
																			//其中a中存的是Account类的实例化对象在堆内存中的地址；
		
		c.getAct().deposit(100);

			//这里的c.getAct()的作用就是读取客户类的对象c的实例属性act，这个act中存了账户类Account 的
			//对象在堆内存中的地址，通过这个地址才能将客户类和账户类联系起来，从这个地址出发就可以实现对
			//客户账户的余额的增加与减少

		c.getAct().withdraw(960);
		c.getAct().withdraw(2000);
		System.out.println(c.getAct().getBalance());//注意这里的getBalance是不输出的，需要用输出语句输出
	}
}
