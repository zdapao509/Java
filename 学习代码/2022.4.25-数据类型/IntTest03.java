public class IntTest03{
		public static void main(String[] args){
				long a=10L;
				char b='a';
				short c=100;
				int d=30;
				System.out.println(a+b+c+d);
				//int e=a+b+c+d;-----------报错原因：多种类型混合运算的时候，
																			//最终结果类型是“最大容量”对应的类型
				// 错误: 不兼容的类型: 从long转换到int可能会有损失
																		 //int e=a+b+c+d;

				int e=(int)a+b+c+d;
				System.out.println(e);

				int temp=10/3;//java 中规定，int类型最终结果还是int类型
				System.out.println(temp);

				int temp1=1/2;
				System.out.println(temp1);//输出：0
		}
}