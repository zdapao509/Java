public class OverrideTest05{
	public static void main(String[] args){
		//静态方法可以通过“引用.”来调用吗？可以
		//虽然使用“引用.”来调用，但是和对象无关。
		Animal a =new Cat();//多态
		//静态方法和对象无关。
		//虽然使用"引用."来调用。但是实际上运行的时候还是：Aniaml.doSome()
		a.doSome();
		Animal.doSome();
		Cat.doSome();
		/*
		Animal的doSome方法执行！
		Animal的doSome方法执行！
		Cat的doSome方法执行！
		*/
	}
}

class Animal
{
	//父类的静态方法
	public static void doSome(){
		System.out.println("Animal的doSome方法执行！");
	}
}

class Cat extends Animal
{
	//尝试在子类中对父类的静态方法进行重写
	public static void doSome(){
		System.out.println("Cat的doSome方法执行！");
	}
}