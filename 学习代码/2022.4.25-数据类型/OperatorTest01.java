/*
算术运算符：
		% 求余数（求模）
		++ 自加1
		--自减1

		对于++运算符来说，可以出现在变量前，也可以出现在变量后，
		总之++命令执行之后，变量值一定加一

		++在变量之前，则变量先加一再赋值
		++在变量之后，先赋值再变量自身加一
*/

public class OperatorTest01{
		public static void main(String[] args){
				int a=2;
				a++;
				int b=2;
				++b;
				System.out.println(a);
				System.out.println(b);

				//讨论++出现在变量之前与出现在变量之后的区别：
				int m=20;
				int n=m++;
				System.out.println(m);//++出现在自变量之前，自变量加一
				System.out.println(n);//存在“传参数”的过程，先将m的数值传递至n处，但是n并不加一
				int y=39;
				int x=++y;
				System.out.println(y);//运算过程中，++y先进行加运算，再向x赋值；因此x,y都是40
				System.out.println(x);

				int c=10;
				System.out.println(c++);//运算过程：先将c复制一份传递给输出，然后c自身加1;输出结果是10
				/*
				相当于：
						int c=10;
						int temp=c++;
						System.out.println(temp)
				*/
				System.out.println(c);

				int d=10;
				System.out.println(++d);//运算过程：先将d加一，再将其赋值给d
				/*
						相当于：
						int d=10;
						int temp2=++d;
						System.out.println(temp2)
				*/
				System.out.println(d);
		}
}