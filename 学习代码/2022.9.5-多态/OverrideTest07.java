public class OverrideTest07{
	public static void main(String[] args){
			
	}
}

class Animal
{

	/*public double sum(int a ,int b){
		return a+b;
	}*/


	/*public long sum(int a ,int b){
		return a+b;
	}*/

	public int sum(int a ,int b){
		return a+b;
	}

}

class Cat extends Animal
{
	/*public int sum(int a ,int b){//Cat中的sum(int,int)无法覆盖Animal中的sum(int,int)			返回类型int与double不兼容
		return a+b;
	}*/

	/*public int sum(int a ,int b){//Cat中的sum(int,int)无法覆盖Animal中的sum(int,int)		返回类型int与long不兼容
		return a+b;
	}*/

	/*public long sum(int a ,int b){//Cat中的sum(int,int)无法覆盖Animal中的sum(int,int)		返回类型long与int不兼容
		return a+b;
	}*/

		public long sum(int a ,int b,int c){//这一步就可以执行，因为属于一个新的方法，无重写
		return a+b;
	}

}



class MyClass1
{
	public Animal getAnimal(){
		return null;
	}
}

class MyClass2 extends MyClass1
{
	/*public Animal getAnimal(){//返回值类型是：引用数据类型--------允许这样的重写
		return null;
	}*/

	/*public Cat getAnimal(){//重写的时候，返回值类型由Animal变成了Cat,变小了。（可以，java中允许这种重写）
		return null;
	}*/


	public Object getAnimal(){//错误：返回类型Object与Animal不兼容		
											//重写的时候，返回值类型由Animal变成了Object,变大了。（不可以，java中不允许这种重写）
		return null;// 错误: MyClass2中的getAnimal()无法覆盖MyClass1中的getAnimal()
	}
}

/*
对于父类中方法为基本数据类型的话：子类重写时必须保持同样的基本数据类型

对于父类中方法为引用数据类型的话，子类重写时：

		子类继承父类之后，对父类中的实例方法进行重写时，
		子类重写的方法的返回值类型可以是父类原方法中返回值类型的本身或者其子类，但是不能比原来的返回值类型大
*/