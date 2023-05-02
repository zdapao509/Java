/*public class Input{
		public static void main(String[] args){
						java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
						
							int i=s.nextInt();
							System.out.println("您输入的数字是："+i);			

							System.out.print("谁是世界上最帅的人\t");
							String  a=s.next();
							System.out.println("世界上最帅的人是："+(String)a+"\n"+"你果然很聪明");
								
			}
}
*/

import java.util.Scanner;//导入包
//更有交互性
public class Input{
		public static void main(String[] args){
						 Scanner s=new  Scanner(System.in,"GBK");//---------前提;如果不加GBK就会出现
																								//--------中文乱码的错误
						
							int i=s.nextInt();//-------------------接收一个整数类型数据
							System.out.println("您输入的数字是："+i);

							System.out.print("谁是世界上最帅的人");
							String  a=s.next();//-----------------接收一个字符串
							System.out.println(a);
			}
}