public class OperatorTest03{
		public static void main(String[] args){
					int a=10;
					a+=1;
					System.out.println(a);
					/*其效果等同于：
								int a=10;
								a=a+1;
								System.out.println(a);
					*/

					byte x=10;//这里是可以执行的，原因是：10虽然是int类型的但是小于byte的取值范围
					//x=x+1;------------------报错类型：类型不兼容；因为实际上右边先转化为int类型进行计算
					//System.out.println(x);

					//OperatorTest03.java:13: 错误: 不兼容的类型: 从int转换到byte可能会有损失
                                        //x=x+1;

					x+=1;
					System.out.println(x);//--------------重要机制：使用扩展赋值运算符时，
																			//永远不会改变运算结果类型。
																			//x自诞生就是byte类型，那么最后结果x仍然是byte类型
				 x/=20;
				 System.out.println(x);//输出：0

		}
}