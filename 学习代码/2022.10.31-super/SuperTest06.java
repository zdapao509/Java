/*
通过本测试得出结论：

	super不是引用，super也不保存内存地址，super不指向任何对象
	super只是代表当前对象内部的那一块父类型的特征。
	
*/

public class SuperTest06{
	
	//实例方法
	public void doSome(){
		System.out.println(this);
		//输出“引用”的时候，会自动调用引用的toString（）方法。
		System.out.println(this.toString());//返回该对象的字符串表示。 toString 方法会返回一个“以文本方式表示”此对象的字符串。

		//SuperTest06@4517d9a3
		//SuperTest06@4517d9a3

		//System.out.println(super);//编译错误: 需要'.'

		//System.out.println(super.xxx);//编译错误: 需要'.'
	}

	public void doOther(){
		System.out.println(this);
		//System.out.println(super.xxx);
	}

	public static void main(String[] args){
		SuperTest06  st=new SuperTest06();
		st.doSome();
	}

}