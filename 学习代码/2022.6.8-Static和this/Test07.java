/*
1.this可以使用在实例方法中，不能使用在静态方法中。
2.this关键字在大部分情况下可以省略，什么时候不能省略呢？
	在实例方法中，或者构造方法中，为了区分局部变量和实例变量
	在这种情况下，this.是不能省略的。
*/
public class Test07
{
	public static void main(String[] args){
		Student s=new Student();//调用无参数构造方法
		s.setNo(111);
		s.setName("张三");
		System.out.println("学号："+s.getNo());
		System.out.println("姓名："+s.getName());

		Student s1=new Student(2222,"李四");
		System.out.println("学号："+s.getNo());
		System.out.println("姓名："+s.getName());
	}
}

class Student
{
	private int no;
	private String name;
	//构造方法无参数
	public Student(){}
	//构造方法有参数

	/*之前的方式：————可读性不高
		public Student(int i,String s){
		no=i;
		name=s;
	}
	*/

	//采用以下的方式，增强可读性的同时保证这里等号左边的no指的是实例的变量；右边的是指的局部变量
	public Student(int no,String name){
		this.no=no;
		this.name=name;
	}

	//setter和getter方法

	//读写no
	public void setNo(int i){
		no=i;
	}


				//这里的i的可读性不强所以考虑换成以下的方式：
					/*
							public void setNo(int no){
									no=no;——这里的两个no都是局部变量no与实例变量的no没有关系
								}
					*/

				//这里就体现出了this的用处，不能删除这里的this
				/*
					public void setNo(int no){
									this.no=no;——这里的no是局部变量，this.no是实例变量；this.的出现是区分局部变量和实例变量
								}
				*/

	public int getNo(){
		return no;//这里的no实际上是this.no；只不过这里不存在区分的问题所以可以省略this.
	}

	//读写name
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}



}