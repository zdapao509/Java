/*
多态的语法基础：
	1.学习基础语法之前，需要明确两个概念：
		第一个：向上转型（upcasting）
			子----->父(自动类型转换)
		第二个：向下转换(downcasting)
			父----->子（强制类型转换，需要加强制类型转换符）


		注意：
			java 中允许向上转型，也允许向下转型

			***无论是向上转型还是向下转型：
			两种类型之间必须有继承关系，没有继承关系编译器会报错

			专业说法：向上转型和向下转型不要说是强制类型转换，因为自动类型转换和强制类型转换是使用在
			基本的数据类型方面的，在引用数据类型方面只有向上转型和向下转型

	2.多态指的是：
		父类型指向子类型的对象：
			包括编译阶段和运行阶段：
				编译阶段：绑定父类的方法；
				运行阶段：动态绑定子类型对象的方法
				多种形态。

	3.向下转型
		什么时候需要进行向下转型？
			当你的访问的是子类对象中“特有的”方法的时候，此时必须进行向下转型
			（不要随便使用强制类型转换）

	4.Animal a4=new Dog();

		a4.move();

		多态：多种形态，多种状态
		编译期间：静态绑定
		运行期间：动态绑定

		编译的时候编译器发现a的类型是Animal ，所以编译器会去Animal类中找move方法，
		找到了，绑定，编译通过。
		但是运行时，和底层堆内存中的实际对象相关，真正执行的时候会调用“堆内存中真实对象的”相关方法

		多态的典型代码：父类型的引用指向子类型的对象，



*/

class Animal
{
	public void move(){
		System.out.println("动物在移动");
	}
}

class Bird extends Animal
{
	public void move(){
		System.out.println("鸟在飞");
	}
	public void fly(){
		System.out.println("---------------------乌鸦坐飞机-------------------------");
	}
}

class Cat extends Animal
{
	public void move(){
		System.out.println("猫猫叫");
	}
	public void catchMouse(){//这里出现了：猫除了有Animal共有的特征之外，还有自己特有的特征
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal
{
	public void move(){
		System.out.println("狗仔跑");
	}
}

public class Test01
{
	public static void main(String[] args){
		Animal a1=new Animal();
		a1.move();

		Bird a2=new Bird();
		a2.move();

		Dog a3=new Dog();
		a3.move();

		//代码的新的编写方法：
			//经过测试发现java中支持一种这样的语法：
				//父类型的引用允许指向子类型的对象。
				//Animal a2=new Dog();
				//a2就是父类型的引用，new Dog()就是一个子类型的对象
				//允许a2这个父类型的引用指向子类型的对象

		Animal a4=new Dog();
		a4.move();
		Animal a5=new Bird();
		a5.move();

		/*
			没有继承关系的两个类型之间存在转型嘛？
				不存在
			错误: 不兼容的类型: Bird无法转换为Animal
                Animal a5=new Bird();


				什么是多态？
					多种形式，多种状态。

				分析：
					a4.move()执行过程

					java程序分成编译阶段和运行阶段：
						
						先来分析编译阶段：	
							对于编译器来说：
								编译器只知道a4的类型是Animal，
								所以编译器在检查语法的时候，会在Animal.class字节码文件中找move()方法，找到了，
								绑定上move()方法，编译通过了，静态绑定成功。（编译阶段属于静态绑定。）

						再来分析运行阶段：
							运行阶段的时候，实际上在堆内存中创建的java对象是Dog对象，所以move（）的时候，
							真正参与move的对象是一条狗，所以运行阶段会动态执行Dog对象的move()方法，这个过程
							属于运行阶段绑定（运行阶段绑定属于动态绑定）


				多态表示多种形态：
					编译时一种形态
					运行时一种形态

		*/


		Animal a6=new Cat();//这一句是可以运行的
		//   a6.catchMouse();//错误: 找不到符号-------------------这一句不能运行
		/*
			分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定
			只有编译阶段通过了才能运行，没有编译轮不到运行

			这里错误的原因在于：
				编译器只知道a6的类型是Animal。去Animal.class文件中找catchMouse方法，结果没有找到，
				所以静态绑定失败了，编译报错，无法运行

	现在假设：代码就写到了这里，我非要调用catchMouse方法怎么办？
		
		这时候就需要用到向下转型（强制类型转换）

		*/
		Cat x=(Cat)a6;
		x.catchMouse();//这里没有报错的原因是：a6就是Animal类型，转成Cat,Animal和Cat之间存在继承关系，
		//所以没有报错

		//向下转型有风险吗？

		Animal a7=new Bird();
		//Cat y=(Cat)a7;
		//y.catchMouse();

		/*
			表面上看：a7是一个Animal，运行时，实际上是一个Bird
			以上得程序为什么编译时正常，运行时报错：
				编译器检测到a7这个引用是Animal类型，、
				而Animal和Cat之间存在继承关系，所以可以进行向下转型，编译没问题

				运行阶段，堆内存实际创建的对象是：Bird对象，在实际运行阶段，拿着Bird对象转换成Cat 对象
				就不行了，因为Bird和Cat之间没有继承关系

				运行时会出现异常：这个异常和空指针异常一样非常重要，也非常经典：
					java.lang.ClassCastException:类型转换异常

					java.lang.NullPointerException:空指针异常
		*/


		/*
			怎样避免：	java.lang.ClassCastException:类型转换异常	的出现

			新的内容（运算符）：
				instanceof （运行阶段动态判断）

			第一：instanceof可以在运行阶段动态判断引用指向的对象类型。
			第二：instanceof语法：	 
		
							引用  instanceof  类型

			第三：instanceof运算符的运算结果只能是：true、false
			第四：c是一个引用，c变量保存了内存地址指向堆中的对象。
				假设（c instanceof Cat）为true表示：	
					c引用指向的堆内存中的java对象是一个Cat
				假设（c instanceof Cat）为false表示：	
					c引用指向的堆内存中的java对象不是一个Cat
			
			程序员要养成一个好的习惯：
				任何时候，任何地点，对类型进行向下转型的时候，一定要使用instanceof运算符进行判断
				（java中规范要求的）
				这样可以很好的避免：
					ClassCastException
				
		*/

		System.out.println(a7 instanceof Cat);

		if (a7 instanceof Cat)//如果a7是一只Cat,再强制类型转换
		{
			Cat y=(Cat)a7;
			y.catchMouse();

		}else if (a7 instanceof Bird)
		{
			Bird s=(Bird)a7;
			s.fly();
		}

		

		Test01.test(new Cat());
	}

//注意这里：方法出现的位置，一定是在主方法外面的一个新的方法，不能包含在上一个方法里。
/*
	当别人调用你的函数的时候，可能输入的是一个Cat类也可能是一个Bird类。
*/
	public static  void test(Animal a){
				if (a instanceof Cat)
				{
					Cat c=(Cat)a;
					c.catchMouse();
				}else if (a instanceof Bird)
				{
					Bird s=(Bird)a;
					s.fly();
				}
		}
}