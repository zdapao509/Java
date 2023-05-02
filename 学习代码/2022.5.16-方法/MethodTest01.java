/*
任何一个方法体的代码都是遵循自上而下的顺序依次执行的，main方法最先执行，
并且最后一个结束，main结束整个程序就结束了
*/
/*
public class MethodTest01
{
	public static void main(String[] args){
			System.out.println("main begain");
			m1();
			System.out.println("main over");
	}

	public static void m1(){
			System.out.println("m1 begain");
			m2();
			System.out.println("m1 over");
	}

	public static void m2(){
			System.out.println("m2 begain");
			T.m3();
			System.out.println("m2 over");
	}
	
}

class T
{
	public static void m3(){
			System.out.println("m3 bagain");
			System.out.println("到底了");
			System.out.println("m3 over");
	}
}
*/


/*
break 和return的区别：
			不是一个级别；
			break用来终止switch语句和离他最近的循环；
			return用来终止离他最近的方法。
*/
/*
public class MethodTest01
{
	public static void main(String[] args){
			for (int i=1; i<10;i++ )
			{
				if (i==5)
				{
					//break;------------执行了这一句，只是跳出循环，后续的  结束  任然输出
					return;-----------这里的return执行之后，后续的  结束  语句不输出
				}
				System.out.println(i);
			}
			System.out.println("结束");
	}  
}
*/



/*

*/

public class MethodTest01
{
	public static void main(String[] args){
			int a=m();
			System.out.println(a);
	}
	/*public static int m(){
			boolean flag=true;//编译器不负责运行程序，编译器只讲道理。对于编译器来说，编译器只知道flag是Boolean
			//类型，编译器会认为flag有可能是false也有可能是true；如果是True还好，可以输出返回值；但是如果是false，就会报错
			if (flag)//编译器认为为了确保程序不出现任何异常，所以编译器报错。
			{
				return 1;// 错误: 缺少返回语句
			}
	}*/

//修改方案1：带else的分支的一定会有一个分支执行。
/*	public static int m(){
			boolean flag=true;
			if (flag)
			{
				return 1;
			}else{
				return 0;
			}
	}*/


//修改方案2：return 语句一旦执行，所在方法就会结束。
/*	public static int m(){
			boolean flag=true;
			if (flag)
			{
				return 1;
			}
				return 0;
	}*/


//在同一个域中，return语句下面不能再编写其他代码，否则编译之后报错
	/*public static int m(){
			boolean flag=true;
			if (flag)
			{
				return 1;//return1 一旦执行，该方法就会结束，下面的return语句就不执行。
				//System.out.println(123);//错误: 无法访问的语句
			}
			System.out.println("aaa");//这行语句和上面的语句的区别是，不在同一个域中，如果if的语句不成立的话，
			//就可以执行这句。
				return 0;
				System.out.println("ajaja");//同样的无法执行。
	}*/


//修改方案3：三目运算符,代码简练。
	public static int m(){
			boolean flag=true;
			return flag ? 1:0;
	}
}