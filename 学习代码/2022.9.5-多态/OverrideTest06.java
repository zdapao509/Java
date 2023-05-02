//经过测试，私有方法不能覆盖
//私有化的方法就是只供自己使用，不公开。

public class OverrideTest06
{
	//私有方法
	private void doSome(){
		System.out.println("OverrideTest06's private method doSome execute!");
	}
	
	//入口----------这里可以看到，我并没有在别的类里面创建新对象并访问doSome方法，因为这里的方法是私有化的，只要同类中可以访问。
	public static void main(String[] args){
		//多态
		OverrideTest06 ot=new T();
		ot.doSome();//OverrideTest06 ' s private method doSome execute!
	}
}

class T extends OverrideTest06
{
	//尝试重写父类中的doSome()方法
	//访问权限不能更低，可以更高。
		public void doSome(){
		System.out.println("T 's public doSome method execute!");	
	}
}


/*
class OverrideTest06
{
	public static void main(String[] args){
		OverrideTest ot=new T();
		ot.doSome();//错误: doSome() 在 OverrideTest 中是 private 访问控制ot.doSome();
	}
}*/