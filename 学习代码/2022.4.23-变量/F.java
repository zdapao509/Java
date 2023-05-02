/*public class F{
				int a=300;
				public static void main(String[] args){
						int a,b,c=100;
						a=100;
						b=200;
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
				}
			}
			*/


/*注意：方法内部无法访问方法外的成员变量，出了大括号就不认识

成员变量包括：实例变量、类变量（加static就是类变量，不加就是实例变量）

public class F{
				int a=300;
				public static void main(String[] args){
						int b,c=100;						
						b=200;

						System.out.println(a);------- 错误: 无法从静态上下文中引用非静态 变量 a;不能访问成员变量

						System.out.println(b);
						System.out.println(c);
				}
			}

*/

/*
public class F{
				int a=300;//实例变量
				static int d=1500;//静态变量
				public static void main(String[] args){
						int b,c=100;						
						b=200;//局部变量

						F cc=new F();----先实例化才能访问实例变量
						System.out.println(cc.a);

						System.out.println(F.d);---对于类变量，直接 类名.类变量 进行访问

						System.out.println(b);
						System.out.println(c);
				}
			}
*/



//作业
public class F{
	
	public static void main(String[] args){
		long xueHao;
		String xinMing;
		char xingBie;
		double shenGao;
			xueHao=3121101103L;
			xinMing="张威明";
			xingBie='男';
			shenGao=198.12;
			System.out.println(xueHao);
			System.out.println(xinMing);
			System.out.println(xingBie);
			System.out.println(shenGao);
			System.out.println("-----------------------------");
			xueHao=121212312102L;
			xinMing="熊滢";
			xingBie='女';
			shenGao=162.00;
			System.out.println(xueHao);
			System.out.println(xinMing);
			System.out.println(xingBie);
			System.out.println(shenGao);
	}
}
