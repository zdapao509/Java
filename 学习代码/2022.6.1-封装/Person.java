/*
	Person代表人类。属性：年龄

	如果不使用封装机制，可以在外部程序中任意访问，导致了不安全---------------所以需要封装


*/
/*
public class Person
{
	//实例变量(属性)
	int age;

}*/



//封装一下：
public class Person
{
	//实例变量(属性)

	private int age;//private表示私有的，被关键词修饰之后，数据只能在本类中访问，出了这个类，age属性就无法访问
	
	//这就导致安全过头，不能读也不能写。
	
	//需要一个get方法和set方法：get方法负责读取数据，set方法负责写入数据
	//get、set方法不应该带有static，均为实例方法
	//封装的第二步：向外部提供公开的set方法和get方法操作入口，并且都不带static
	/*
		java 开发规范中有要求，set方法的get方法要满足以下格式：
			
			get方法的要求：
					
					public 返回值类型 get+属性名首字母大写（无参数）{-------------这里是读数据，所以一定要有返回值
							return xxx；
					}

			set方法的要求：

					public void set+属性名首字母大写（有一个参数）{---------这里是写数据，只负责写入，不负责返回
							xxx=参数；
					}

	*/

	public int getAge(){//读参数的过程不需要传入参数
			return age;
	}
	public void setAge(int a){
		if (a<0||a>150)
		{
			System.out.println("输入有误");
			return;
		}
			age=a;
	}
}
/*
		对于私有化的理解，如果没有private私有化的话，外部程序可以直接调用并且修改对象的属性
		这就会出现不合理又没法控制的现象，比如：年龄范围不能存在负数，但是如果不私有化，外部
		更改年龄为负数，那就没办法控制，需要有一个校验的过程，这里就是get和set的作用，读与写；但是没有
		private的话，是不会执行实例方法的，所以必须要private；

		封装的两个步骤：
				
				1.属性私有化 private
				2.每个属性对外提供get和set两个方法，外部程序只能通过get读取，通过set修改；可以在set里面设立关卡
						以保护数据的安全性；

		set个get不带static，为实例方法
		实例方法必须先new一个对象
		set方法：public void set+属性名首字母大写（一个参数）{
				xxx=参数；
		}
		get方法：public 返回值类型 get+属性名首字母大写（无参数）{
				return xxx；
		}
*/