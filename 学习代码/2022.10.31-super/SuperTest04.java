/*
这个例子证明了，当子类中没有和父类同名的属性的时候

子类中对父类属性的调用：可以是 this.  super.  和  什么都不加

也就是说，这里的 this. 和 super. 是可以省略的
*/

public class SuperTest04
{
	public static void main(	String[] args){
				Vip v=new Vip("张三");
				v.shopping();
		}
}

class Customer{
		String name;
		public Customer(){}
		public Customer(String name){
			this.name=name;
		}
}

class Vip extends Customer
{
	public Vip(){}
	public Vip(String name){
		super(name);
	}
	//super和this都不能出现在静态方法中
	public void shopping(){//注意这里不能是静态方法，不能加static，因为this和super都是对实例属性的调用，只能出现在实例方法中
		//this表示当前对象
		System.out.println(this.name+"正在购物！");
		//super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间，主要就是一直往上面调用。子调父，父调爷）
		System.out.println(super.name+"正在购物！");
		System.out.println(name+"正在购物！");
		/*
		张三正在购物！
		张三正在购物！
		张三正在购物！
		*/
	}
}

/*
注意一个保存问题：保存的时候，一定要选：UTF-8  的格式，而不是   UTF-8+BOM   的格式



如果子类中也有String name;这个属性的话。输出：
		
		null正在购物！
		张三正在购物！
		null正在购物！


并且注意：

	如果父类中的String name属性是私有化的，那么super.name的语句就会报错：
		
		错误: name 在 Customer 中是 private 访问控制

	可以通过：super.getName()的方式访问父类型的属性。

*/