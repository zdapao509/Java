/*
1."this."和“super.”大部分情况下是可以省略的。
2.“this.”什么时候不能省略？
		public void setName（String name）{
			this.name=name;
		}

3."super."什么时候不能省略？
	父中有，子中又有，如果想在子类中访问父类的特征，super.不能省略
*/


//假定：子类中也存在和父类一样的属性，shopping函数怎么输出？

public class SuperTest05
{
	public static void main(	String[] args){
				Vip v=new Vip("张三");
				v.shopping();
				v.dosome();
		}
}

class Customer{
		String name;
		public Customer(){}
		public Customer(String name){
			this.name=name;
		}

		public void dosome(){
			System.out.println(this.name+"dosome!");
			System.out.println(name+"123");
			//System.out.println(super.name+"565654");// 错误: 找不到符号  符号: 变量 name  即祖宗类的Object里面是没有name这个属性的
		}
}

class Vip extends Customer
{
	//java中允许在子类中出现和父类一样的同名属性、变量
	String name;//假定：子类中也存在和父类一样的属性，shopping函数怎么输出？

	public Vip(){
	//name=null;
	}
	public Vip(String name){
		super(name);
		//this.name=null;-----------注意这里虽然没写出来，但是由于子类中也有一个属性，所以实例化的时候，一定会对他赋值
	}
	//super和this都不能出现在静态方法中
	public void shopping(){

		/*
		java是怎么来区分子类和父类的同名属性的？
			this.name：当前对象的name属性
			super.name：当前对象的父类型特征中的name属性。
		
		*/


		//this表示当前对象
		System.out.println(this.name+"正在购物！");
		//super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间，主要就是一直往上面调用。子调父，父调爷）
		System.out.println(super.name+"正在购物！");
		System.out.println(name+"正在购物！");
		/*
			null正在购物！
			张三正在购物！
			null正在购物！
			张三dosome!
			张三123
		*/
	}
}
