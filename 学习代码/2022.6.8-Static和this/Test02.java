/*
关于方法来说，什么时候定义为实例方法？什么时候定义为静态方法？有无参考标准？

此方法用于描述一个行为，如果该行为由对象去触发，一般情况下为实例方法。

参考标准：当这个方法体中，直接访问了实例变量，这个方法一定是实例方法。
					我们以后的开发中，大部分情况下，如果是工具类的话，工具类的方法一般都是静态的。
					静态方法有一个好处：不需要new对象，直接采用类名调用，极其方便。工具类就是为了方便，所以工具
					类中的方法一般都是static的。

					什么是工具类：以后讲——就是方便编程而开发的一些类。

类=属性+方法
		属性为状态
		方法为动作；一个方法代表了一个动作

什么时候方法定义为实例方法：
		张三考试60分
		李四考试100分
		不同对象参加考试的结果不同
		我们可以认定“考试”这个行为是与对象相关的行为
		建议将考试的方法定义为实例方法
*/
public class Test02
{
	public static void main(String[] args){
		User u =new User();
		System.out.println(u.getId());
		System.out.println(u.getName());
	}
}
class User    
{
	private int id;//实例变量——需要对象
	
	private String name="zhangweiming";

	public String getName(){
		System.out.println(name);//打印用户的名字的方法应该是实例方法，不同的实例化对象拥有不同的实例化方法
		return name;  
	}

	public static void printName01(){
	
	}

	public void setId(int i){
		id=i;
	}

	public int getId(){
		return id;
	}

/*
	public static int getId(){
		return id;//静态方法的话，要访问这个方法可以通过类名.getId（）的方式读取，不需要创建对象；
		//但是这里面的id，如果不进行实例化的话，就没有数值，也就无法返回一个正常的整数，即报错
	}

	public static void setId(int i){
		id=i;
	}同样的，如果静态的话，id是没有值的，也不知道这个值具体的类型，因为没有实例化，不知道这个值的类型			
*/

}