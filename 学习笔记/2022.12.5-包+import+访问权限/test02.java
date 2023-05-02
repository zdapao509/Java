package com;

import com.helloworld.Package01.Packagetest;//这里的包的导入，要直接导入到最终的类，而不是导入类所在的文件夹；不然报错：错误: 找不到符号
//同时注意：包的导入必须要com开始，也就是说即使我现在在com内部，但是这没关系，还是要从需要调用的class的具体完整的路径下手，
//com必需要在

import com.helloworld.Package01.*;//这里证明import也可以使用.*的方式直接调用，不用具体写明要用的类

public class test02
{
	public static void main(String[] args){
		//注意:这里的test02在com包下面，和test01不在一个包下面；包名是不可以省略的：

		//Packagetest aa =new Packagetest();// 错误: 找不到符号
		
		com.helloworld.Package01.Packagetest aa=new com.helloworld.Package01.Packagetest();//这样写是可以通过的，
																																						//但是这样的方式会导致实例化一个对象极其复杂
		System.out.println(aa);

		Packagetest bb=new Packagetest();

		System.out.println(bb);

	}
}