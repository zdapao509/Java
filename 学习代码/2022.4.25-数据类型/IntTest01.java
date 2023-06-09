/*
计算机在任何情况下都只能识别二进制
计算机在底层存储数据的时候，一律存储为----二进制的补码形式
															原因：补码的效率最高
计算机中二进制有 ：原码 反码 补码
对于正数来说，二进制的原码反码补码形式都是同一个，完全相同
对于一个负数来说：
			byte a=-1；
			对应的二进制原码：10000001
			对应的二进制反码（符号位不变，其他位取反）：11111110
			对应的二进制补码（反码+1）：11111111

			分析：byte b=(byte)150;输出b的结果为？
			150的二进制原码：
					00000000 00000000 00000000 10010110
			将以上的int类型强转为1个字节的byte，最终计算机得到的原码(正数的原码=补码)是：10010110

			注意：计算机永远的储存形式都是二进制补码形式；
			即10010110是一个二进制的补码，计算机输出的是这个补码所对应的原码数据：

			10010110---->补码
						-1
			10010101---->反码
					符号位不变，其他位取反
			11101010---->原码----------------对应数据，-106


*/

public class IntTest01{
		public static void main (String[] args){
				byte b=(byte)150;
				System.out.println(b);
		}
}