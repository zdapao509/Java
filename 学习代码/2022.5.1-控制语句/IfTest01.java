/*
业务要求：
1.从键盘上接收一个人的年龄
2.年龄要求为[0~150],其他值表示非法，提示非法信息
3.根据人的年龄判断属于哪个生命阶段：
		[0~5]婴幼儿
		[6~10]少儿
		[11~18]少年
		[19~35]青年
		[36~55]中年
		[56~150]老年

*/

/*嵌套格式写

import java.util.Scanner;//导入包

public class IfTest01{
		public static void main(String[] args){
				Scanner s=new Scanner(System.in,"GBK");
				System.out.print("请输入你的年龄");
				int a=s.nextInt();
				if (a>=0&&a<=150){
						if(a<=5){
								System.out.println("婴幼儿");
						}else if (a<=10){
								System.out.println("少儿");
						}else if(a<=18){
								System.out.println("少年");
						}else if (a<=35){
								System.out.println("青年");
						}else if(a<=55){
								System.out.println("中年");
						}else{
								System.out.println("老年");
						}
				
				}
				else if(a>150){
				System.out.println("你能活这么多？干理梁！");
				}
				else{
				System.out.println("倒反天罡？尼踏马の");
				}

		}
}

*/

/*初次改良，不用嵌套；并且改变包的调用方式
public class IfTest01{
		public static void main(String[] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入你的年龄");
				int a=s.nextInt();
				if (a<0||a>150){
						System.out.println("你能活这么多？干理梁！");
				}else if(a<=5){
						System.out.println("婴幼儿");
				}else if (a<=10){
						System.out.println("少儿");
				}else if(a<=18){
						System.out.println("少年");
				}else if (a<=35){
						System.out.println("青年");
				}else if(a<=55){
						System.out.println("中年");
				}else{
						System.out.println("老年");
				}
		}
}
*/

//再次改进------不采用每行输出的格式，引入字符串变量；减少代码量；
//最好的代码就是：最少的代码，最高的效率
public class IfTest01{
		public static void main(String[] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
				System.out.print("请输入你的年龄");
				int a=s.nextInt();

				String b="老年";

				if (a<0||a>150){
						b="你能活这么多？干理梁！";
				}else if(a<=5){
						b="婴幼儿";
				}else if (a<=10){
						b="少儿";
				}else if(a<=18){
						b="少年";
				}else if (a<=35){
						b="青年";
				}else if(a<=55){
						b="中年";
				}

				System.out.println(b);

		}
}
