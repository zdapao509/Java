public class T
{
	A o1;
	public static void main(String[] args){
			D d=new D();//这里的d实际上存的是新的对象D在堆内存中的地址，
			C c =new C();
			B b =new B();
			A a =new A();
			T t =new T();

			//如果，没有下面四行，就会出现代码空指针的现象
			c.o4=d;//这里进行的就是将d存的D对象在堆内存的地址复制一份传送给c的o4变量，实际上地址也是一个数据
			b.o3=c;
			a.o2=b;
			t.o1=a;
			
			//怎么通过t来访问d中的i
			System.out.println(t.o1.o2.o3.o4.i);
	}	
}

//注意这里的类在定义时，类不包含类
class A
	{
		B o2;
	}
class B
	{
		C o3;
	}
class C
	{
		D o4;
	}
class D
	{
		int i;
	}