/*
编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器发出不同的声音。
弹奏的乐器包括：二胡，钢琴和琵琶

实现代码的思路以及关键代码：
	定义乐器类：
	定义乐器子类
	定义乐手 类
	定义测试类


规律：这种题目，需要有一个抽象的父类，然后由抽象的父类衍生出很多的子类；子类和父类有同样的方法属性

			然后还要有类似于乐手的使用者类，这一步主要是在调用抽象的父类，实现向上转型。

			最后，出现测试类。测试类调用使用者类，填入相应的参数，完成目的。
*/

//乐器父类
class YuQi
{
	public void TanZou(){}
}

//子类
class ErHu extends YuQi
{
	public void TanZou(){
		System.out.println("二胡");
	}
}

//子类
class Piano extends YuQi
{
	public void TanZou(){
		System.out.println("钢琴");
	}

}

//子类
class PiPa extends YuQi
{
	public void TanZou(){
		System.out.println("琵琶");
	}
}


//乐手类
class YuShou
{
	public void Tanzou(YuQi  a){
		a.TanZou();
	}
}

//乐手类的另一种写法
/*class YuShou
{
	YuQi i;
	public YuShou(){}
	public YuShou(YuQi i){
		this.i=i;
	}
	public void Tanzou(){
		i.TanZou();
	}
}*/


//测试类
class HomeWork02
{
	public static void main(String[] args){
		YuShou b=new YuShou();
		b.Tanzou(new PiPa());
	}

/*	乐手的另一种写法的测试方法
public static void main(String[] args){
		YuShou b=new YuShou(new PiPa());
		b.Tanzou();
	}
	*/
}