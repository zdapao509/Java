//使用递归的方式求a的阶乘；
/*public class HomeWork01
{
	public static void main(String[] args){
		java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
		System.out.println("请输入一个数：");
		int a=s.nextInt();
			System.out.println("计算结果是："+jieCheng(a));
	}
	public static int jieCheng(int a)
	{
		if (a==1)
		{
			return 1;
		}
		System.out.println("计算到了a="+a);
		return a*jieCheng(--a);
	}
}*/

//7.7---2
/*
public class HomeWork01
{
	public static void main(String[] args){
			System.out.println("初始化程序，请输入用户名和密码");//初始化界面
			yongHuMing();
			
	}
	public static void yongHuMing(){//用户名是否正确的判断方法
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入用户名：");
			String a=s.next();
			if ("admin".equals(a))//一种判断字符串是否相等的新的语句；
			{
				System.out.println("用户名正确");
				miMa();
			}else{
				System.out.println("用户名有误");
				return;
			}
	}
	public static void miMa(){//输入密码是否正确的判断语句
			System.out.println("请输入密码：");
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			int a=s.nextInt();
			if (a==123)
			{
				System.out.println("密码正确\n欢迎回来");
			}else{
				System.out.println("你的输入有误");
				return;
			}
	}
}*/

/*先输入用户名和密码，再判断
public class HomeWork01 
	{  
		public static void main(String[] args) {  //初始化界面  
				initUI();  
		} 
	
	public static void login(String username, String password) 
		{  
				if("admin".equals(username) && "123".equals(password))
					{  System.out.println("登录成功，欢迎"+username+"回来！");  
				}else
					{  System.out.println("对不起，用户名或者密码错误！");  }  }  
			
	public static void initUI() 
		{  
			java.util.Scanner s = new java.util.Scanner(System.in); 
			System.out.println("欢迎使用本系统，请登录！");  
			System.out.print("用户名：");  
			String username = s.next();  
			System.out.print("密码：");  
			String password = s.next();  //登录  
			login(username, password); 
		} 
	}
*/


//第三题：通过方法重载、方法重复利用完成以下功能：  
		//定义一个方法，该方法可以选出2个int类型较大的数据，返回值是较大的数据。  
		//再定义一个方法，该方法可以选出3个int类型中较大的数据，返回值是较大的数据。  
		//要求使用方法重载机制，要求代码体现出重复利用。  main方法中编写程序进行测试。 
/*
public class HomeWork01
{
	public static void main(	String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入3个数：");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			System.out.println("a,b比较的结果是："+biJiao(a,b)+"更大");
			System.out.println("a,b,c比较的结果是："+biJiao(a,b,c)+"更大");
	}
	public static int biJiao(int a,int b){
			if (a<b)
			{
				return b;
			}
			return a;
	}
	public static int biJiao(int a,int b,int c){
			if (a>b)
			{
				if (a>c)
				{
					return a;
				}
				return c;
			}
			else{
					if (b>c)
					{
						return b;
					}
					return c;
			}
	}
}*/


//考虑采用三目运算符

public class HomeWork01
{
	public static void main(	String[] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.println("请输入3个数：");
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			System.out.println("a,b比较的结果是："+biJiao(a,b)+"更大");
			System.out.println("a,b,c比较的结果是："+biJiao(a,b,c)+"更大");
	}
	
	public static int biJiao(int a,int b){
			return a>b?a:b;
	}

	public static int biJiao(int a,int b,int c){
			return biJiao(a,b)>c?biJiao(a,b):c;
	}

}