package com.helloworld.Package01;

import java.util.Scanner;

public class test03
{
	public static void main(String[] args){
		java.util.Scanner aa=new java.util.Scanner(System.in,"GBK");
		//为什么要这样写？
			//这是因为：Test03类和Scanner类不在同一个包下。
			//java .util就是Scanner类的包名----------------------------------------基于这个问题，我们可以考虑把这个包先导入，后续就不需要这样复杂的写
		String ss=aa.next();
		System.out.println("你输入的是："+ss);

		Scanner cc=new Scanner(System.in,"GBK");
		String dd =cc.next();
		System.out.println("你输入的是："+dd);
	}
}