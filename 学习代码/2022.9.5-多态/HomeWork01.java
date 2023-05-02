/*
多态练习题：
	编写程序模拟“主人” “喂养” “宠物”的场景：
	
	提示：主人类（Master）
				宠物类（Pet）
				宠物类子类（Dog  Cat  Bird）

	提示：
			主人应该有喂养的办法：	feed（）、
			宠物应该有吃的方法：eat（）
			只要主人喂，宠物就吃

	要求：
		主人类只提供一个喂养方法feed（），要求达到可以喂养任何类型的宠物

	编写测试程序：
		创建主人对象
		创建各种宠物对象
		调用主人的喂养方法feed（），喂养不同的宠物，观察执行的结果：
			
	通过该案例。理解多态在开发中的应用

	重要提示：
		feed方法是否需要一个参数，参数选择什么类型！！！

*/

class Pet
{
	public void Eat(){
		System.out.println("宠物吃东西");
	}
}

class Dog extends Pet
{
	public void Eat(){
		System.out.println("狗吃肉");
	}
}

class Cat extends Pet
{
	public void Eat(){
		System.out.println("猫吃猫粮");
	}
}

class Bird extends Pet
{
	public void Eat(){
		System.out.println("鸟吃虫子");
	}
}

class Master
{
	public void feed(Pet a){
		/*if (a instanceof Cat)
		{
			Cat x=(Cat)a;
			x.Eat();
		}else if (a instanceof Dog)
		{
				Dog y=(Dog)a;
				y.Eat();
		}else if (a instanceof Bird)
		{
				Bird z=(Bird)a;
				z.Eat();
		}*/
		
		//--------------------------这里注意：我现在用到的是向上转型，
	    //-------------------------并且访问的所有的子类里面的特征都是eat，所以不需要向下转型，只要：a.Eat();就行
		a.Eat();
	}
}

public class HomeWork01
{
	public static void main(String[] args){
		Master q=new Master();
		q.feed(new Cat());
		q.feed(new Bird());
		q.feed(new Dog());
	}
}

/*
当我现在的宠物数量增加的时候，如果不使用多态的方法，就会出现我需要一直在我的Master里面去扩充

public void feed(Cat cat){}------------里面的(Cat cat)即同样的宠物类型，不断地增加方法；

这就会使得我的方法过于繁琐

这个时候就要引入多态的方法

这里就说明：最好不要写具体的宠物类型，这样会影响程序的扩展性

public void feed(Pet a){}

编译的时候，编译器发现：a是pet类型，就会去pet类里面去找eat方法。结果找到了，编译通过

运行的时候，底层实际的对象是什么，就会自动调用什么，也就是会自动调用到对象对应的eat方法上

这就是多态的使用


软件在扩展新需求的时候，一定要记住：
	修改的越少越好
	修改的越多，系统的稳定性就越差，位置的风险就越多

	这里涉及到一个开发的原则，软件开发中有7条基本原则，其中最基本的一条就是：
			
			OCP：open close开闭原则

			开闭原则：对于扩展：开放（你可以额外添加，没问题），对于修改：关闭（最好是很少的修改现有程序）

			在软件扩展过程中，修改的越少越好


高手在开发项目的时候 ，不仅仅是为了满足客户的需求，还需要考虑软件的扩展性

什么是软件的扩展性：	
	假设电脑的内存条坏了。我们可以在买一个新的插上，直接使用，这就是电脑在设计的时候考虑了扩展性

面向父类编程。面向更加抽象进行编程，不建议面向具体编程，因为面向具体的编程会让软件的扩展能力很差
*/