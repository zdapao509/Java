//继承：解决代码复用问题
//继承也是有缺点的：耦合度高，父类修改，子类就会受到牵连
public class Test01
{
	public static void main(String[] args){
		//创建普通账户
		Account act =new Account();
		act.setActno("10101101");
		act.setBalance(10000);
		System.out.println(act.getActno()+",余额"+act.getBalance());

		//创建信用账户
		CreditAccount ca =new CreditAccount();
		ca.setActno("20202020220");
		ca.setBalance(2000);
		ca.setCredit(0.989);
		System.out.println(ca.getActno()+",余额"+ca.getBalance()+",信誉值"+ca.getCredit()+"/n");
		ca.dosome();
	}
}

/*
这里有一个知识点：

子类继承了父类之后，构造方法创建子类对象的时候，先要默认将父类属性进行初始化，通过super（）机制-----所以上面创建的ca对象，即使不执行
ca.setActno("20202020220");
		ca.setBalance(2000);
		ca.setCredit(0.989);--------这三句话，这三个属性系统会赋默认值

		super（）只能出现在构造方法第一行，通过当前的构造方法区调用“父类”中的构造方法，
							
							目的是：创建子类对象的时候，先初始化父类型特征
*/

class Account
{
	private String actno;
	private double balance;

	public Account(){}
	public Account(String actno,double balance){
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
	private double credit;

	public CreditAccount(){}

	public void dosome(){
		//错误：继承之后，无法直接访问父类中的私有化属性；actno在Account中是private访问控制
			//System.out.println(actno);
			System.out.println(this.getActno());
			System.out.println(getActno());
	}

	public void setCredit(double credit){
		this.credit=credit;
	}
	public double getCredit(){
		return credit;
	}
}