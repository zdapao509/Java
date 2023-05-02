/*
java中关于方法调用时的参数传递实际上只有一个规则：

不管你是基本数据类型还是引用数据类型，实际上在传递的时候都是将变量中保存的那个值复制一份，传过去；
int x=10;
int y=x;把x中保存的10复制一份传给y。x和y都是局部变量

Person p1=0x1234;
Person p2=p1;把p1中保存的0x1234	复制一份传递给p2，这里的p1和p2都是局部变量，且保存的都是指向对象的地址
0x1234，这就是说，其中任意一个引用改变这个对象中的属性的话就会出现，两个引用，不论谁访问都会出现新的
数值。
就好像你和你老婆都有家门钥匙，她往家里搬了电视，你回家也会见到电视。

*/

public class Test01
{
	public static void main (String[] args){
			Person p=new Person();//这里的p中存的是对象在堆内存中的内存地址，
			p.age=10;
			add(p);
			System.out.println(p.age);
	}
	public static void add(Person p){//p进行赋值的时候将存的内存地址赋值一份给了这里作为方法的参数
			p.age++;//对于p的地址指向的对象里的数据采用这样的形式进行改变
			System.out.println(p.age);
	}
}
class Person
{
	int age;
}