/*
在java中boolean仅仅包括true false
不像C或者C++中1和0也可以表示布尔类型

实际开发中，通常放在条件的位置上（充当条件）
*/

public class BooleanTest{
		public static void main(String[] args){
		//boolean sex=1;-----------int 类型无法直接转化成Boolean类型
//错误: 不兼容的类型: int无法转换为boolean
//                boolean sex=1;
		Boolean sex=true;
		System.out.println(sex);

		int a=10;
		int b=20;
		System.out.println(a<b);//-------------输出结果为true 或者false
		System.out.println(b>a);

		boolean flag=(a<b);//运算符是有优先级的，不确定可以加小括号
		System.out.println(flag);

		if (sex)
		{
			System.out.println("男");
		}
		else{
			System.out.println("女");
		}
		}
}