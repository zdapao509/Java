/*
		什么时候变量声明是实例的，什么时候是静态的？
				如果这个类型的所有对象的某个属性值都是一样的，不建议定义为实例变量，浪费内存空间
				建议定义为类级别的特征，也就是静态变量，在方法区中只保留一份，节省内存开销

				一个对象一分的是实例变量
				所有对象一份的是静态变量
*/

/*
public class	Test01
{
	public static void main(String[] args)
	{
		Chinese c1=new Chinese("123456","张三","中国");
			System.out.println(c1.idCard);
			System.out.println(c1.name);
			System.out.println(c1.country);

		Chinese c2=new Chinese("456789","李四","中国");
			System.out.println(c2.idCard);
			System.out.println(c2.name);
			System.out.println(c2.country);
	}
}

class Chinese
{
	String idCard;
	String name;
	String country;
	public Chinese(){
	}

	public Chinese(String x,String y,String z){
			idCard=x;
			name=y;
			country=z;
	}
}*/



public class	Test01
{
	public static void main(String[] args)
	{
		Chinese c1=new Chinese("123456","张三");
			System.out.println(c1.idCard);
			System.out.println(c1.name);
			System.out.println(Chinese.country);

		Chinese c2=new Chinese("456789","李四");
			System.out.println(c2.idCard);
			System.out.println(c2.name);
			c2=null;
			System.out.println(c2.country);

			/*
					注意：实例变量一定需要使用引用.的方式进行访问，但是
					静态的既可以使用引用.的方式进行访问，也可以使用类名.的方式进行访问

					c2虽然为null,但是不会出现空指针异常，因为静态变量不需要对象的存在，实际上代码运行的时候还是：
						
						System.out.println(Chinese.country);

					但是如果访问c2.name 就会出现空指针异常，

					结论：空指针异常只有在空引用访问实例相关的，都会出现空指针异常
			*/
	}
}

class Chinese
{
	String idCard;
	String name;
	//加static属于静态变量，静态变量在类加载的时候初始化，不需要new对象，静态变量的空间就开出来了
	//静态变量的存储在方法区。
	static String country="中国";
	public Chinese(){
	}

	public Chinese(String x,String y){
			idCard=x;
			name=y;
	}
}