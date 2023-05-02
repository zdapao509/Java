public class Test
{
	public static void main(String[] args){
		address b=new address();
		b.age=15;
		b.name="阿伟";
		user a=new user();
		a.addr=b;// 变量保存的东西被等号传过去了，这里的变量b实际上保存的是一个新的对象的地址，
		//这里是对这个地址进行了一次复制 ，然后将复制之后的值给了变量addr，两个变量都是存的是
		//变量b指向的对象在堆中的内存地址 
		System.out.println(a.id);
		System.out.println(a.username);
		System.out.println(a.addr.name);//注意这里不能直接输出a.name 因为a属于user类的引用，user中没有name的属性
		//而a.addr属于address类型，而在address中含有name这个属性

		//拆分a.addr.name:
		/*
		address ad=a.addr;-----------------这里的addr就是来源于address类（引用数据类型）的变量，所以用address再生
		----------------------------------------成一个数，可以进行赋值的过程。
		String abab=ad.name;-----------------ad的属性包括name，而name属于字符串类，所以用String 生成一个新的变量接收
														-------ad变量的属性
		System.out.println(abab);--------------最后输出这个变量，整体过程可以简化成a.addr.name
		*/
	}
}