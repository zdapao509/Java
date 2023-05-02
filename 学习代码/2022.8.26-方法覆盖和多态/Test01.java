/*
当我们的代码怎么编写的时候，在代码级别上，构成了方法覆盖呢？

				条件1：两个类必须要有继承关系

				条件2：重写之后的方法和重写之前的方法具有：
									相同的返回值类型
									相同的方法名
									相同的形式参数列表

				条件3：访问权限不能更低，可以更高（这个点现记住）

				条件4：重写之后的方法不能比之前的方法抛出更多的异常，可以更少（这个先记住）

*/

public class Test01{
	public static void main(String[] args){
		//创建鸟的对象
		Bird b=new Bird();
		//让鸟儿移动
		b.move();
		//创建猫的对象
		Cat c=new Cat();
		c.move();
	}
}

//父类
class Animal{
	public void move(){
		System.out.println("动物在以移动");
	}

	/*protected void move(){//访问权限不能更低，可以更高
		System.out.println("动物在以移动");
	}*/

	public void sing(int i){
		System.out.println("是谁在唱歌");
	}
}

//子类
class Bird extends Animal {
//对move方法进行覆盖，方法重写，override
//最好将父类中的方法原封不动的复制过来；方法的覆盖就是将原来的方法覆盖掉了，原来的方法没有了
	public void move(){
		System.out.println("鸟儿在飞翔");
	}


//这里的sing()和父类中的sing（int i）没有构成方法的覆盖：
//原因是：两个方法根本就是两个完全不同的方法，
//可以说两个方法构成方法的重载，因为Bird类继承了Animal类，相当于sing(int i)方法已经在Bird类里面 
		public void sing(){
		System.out.println("是鸟在唱歌");
		}

		
}

class Cat extends Animal{
	public void move(){
		System.out.println("猫在走猫步");
	}

	/*protected void move(){————————————protected表示受保护的，没有public开放
		System.out.println("猫在走猫步");
	}*/

	/*错误: Cat中的move()无法覆盖Animal中的move()
        protected void move(){
                       ^
  正在尝试分配更低的访问权限; 以前为public*/

}