package com.helloworld.Package01;

public class test01
{
	public static void main(String[] args){

		//创建Packagetest对象
		//Package的完整类名：com.helloworld.Package01.Packagetest
		System.out.println("执行了");
		com.helloworld.Package01.Packagetest aa=new com.helloworld.Package01.Packagetest();
		System.out.println(aa);

		//这里的包名字省略也没有关系，
		//思考：这里的包名之所以可以省略，是因为Package和test01在同一个包下；如果换到不同路径的话，以下的方式就行不通。
		Packagetest bb=new Packagetest();
		System.out.println(bb);
	}
}