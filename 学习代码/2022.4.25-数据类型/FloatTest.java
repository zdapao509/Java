/*
关于java中浮点型数据：float（4个字节）  double（8个字节）
float为单精度；double为双精度：double更精确
但是需要注意的是：如果在银行方面或者在财务方面，double也是远远不够的。
在java中提供了一种精度更高的类型，这种类型专门在财务软件方面：Java.math.BigDecimal
																														(不是基本数据类型，属于引用数据类型)
float 和double存储数据的时候都是存储近似值；因为现实世界中数据实际上是无线循环的，只能近似存储

long 类型占用八个字节
float类型占用4个字节---------------那个容量更大？
						注意：任意一个浮点型都比整数型空间大
						float容量>long容量

浮点型数据默认为double类型来处理；如果想让浮点型数据被当做float类型来处理的话，需要在后面添加F/f
1.0被默认为double类型处理
1.0F这才是float类型

*/


public class FloatTest{
		public static void main(String[] args){
				double pi=3.1415926;//这里不存在类型转换，因为3.1415926就是double类型pi就是double类型
				System.out.println(pi);
				float f=3.14f;//----------------------此处3.14为double类型数据，存在数据类型转换，会有精度损失
				System.out.println(f);
				//也可以通过强制类型转换
				float t=(float)3.24;
				System.out.println(t);

				int r=(int)10.0/5;
				System.out.println(r);
				// 错误: 不兼容的类型: 从double转换到int可能会有损失
                         //       int r=10.0/5;
				//可以通过强制转化功能实现,强转的时候只留下整数位。
				int e=(int)(10.0/5);
				System.out.println(e);

				}
}

