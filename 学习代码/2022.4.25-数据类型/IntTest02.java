/*
在byte char short 做混合运算的时候，各自先转换为int 再进行运算
*/

public class IntTest02{
		public static void main(String[] args){
				char c1='a';
				byte d=1;
				System.out.println(c1);//-----------输出结果为字符 a
				System.out.println(c1+d);//----------此处可以进行输出
				
				//short s=c1+d;---------报错原因：右边转化为int类型进行相加之后，
																		//虽然数据值为98没有超过short的最大范围，
																		//但是编译器并不能直接认为此处的输出数据
																		//与short类型的范围的大小关系;只知道是int类型的，所以报错

				//IntTest02.java:12: 错误: 不兼容的类型: 从int转换到short可能会有损失
                              //  short s=c1+d;

			//如果想输出结果，需先对等号右边进行强制转化：
			short s=(short)(c1+d);
			System.out.println(s);

			//int a=1;------------------报错理由：编译器只识别数字类型（在等号右边不是直接显示数字的情况下）
			//short s=a;
			//System.out.println(s);

					//IntTest02.java:25: 错误: 不兼容的类型: 从int转换到short可能会有损失
							  //short s=a;
			
		}
}