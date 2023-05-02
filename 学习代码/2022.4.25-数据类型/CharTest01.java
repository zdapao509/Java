/*
关于java中的转义字符 
	java 语言中'\'负责转义，转义符号\实现将最近的字符转化为仅代表文字含义的普通字符，
	\t表示制表符tab
	\n表示换行
	System.out.print();
	System.out.println();-----------加了ln表示换行输出，否则不换行
	\u表示后面的是一个字符的Unicode编码，输出即可显示该实际字符
*/

public class CharTest01{
		public static void main(String[] args){
			char c1='t';
			System.out.println(c1);
			char c2='\t';
			System.out.println(c2);//两个字符串合在一起表示一个字符，其中\t表示“制表符tab”
			System.out.println("abc\ndef");

//假设现在想在控制台输出一个\字符怎么办
			//System.out.println('\');---------------------------此处不能正常输出的原因是：\本身带有转义含义；
								
									// 错误: 未结束的字符文字
												//System.out.println('\');
													 //            ^

//假设想要输出一个单引号 '
			//System.out.println(' ' '); -----------------此处不能正常执行，原因是java认为引号已经配对，
			                                                             //无法识别第三个引号的作用
						 
						 //错误: 未结束的字符文字
												//System.out.println(' ' ');
															//                    ^
				//要想实现输出单引号，考虑采用\'的输出方式
				System.out.println('\'');
				//假设想要实现输出\，考虑采用以下方式：
				System.out.println('\\');//两个反斜杠//代表了一个普通反斜杠


				//假设想要输出的结果是：“test”
				//System.out.println(""test"");---------------无法输出的真实原因是：两个英文单引号就近原则，
																				//识别之后发现没有括号报错
				// 错误: 需要')'
                              //  System.out.println(""test"");
                            //                                     ^

				System.out.println("“test”");//通过采用中英文双引号实现输出“test”----对应的引号是中文引号
				System.out.println("\"test\"");//通过采用转义符号\实现将最近的英文引号转化为普通字符，
																//输出的结果就是英文引号
	
				System.out.println(" ' ");//--------------此处也可以进行输出，表示实现了单引号输出
				System.out.println("'输出'");//---------此处可以进行输出，外面的双引号识别为字符串，内部认为‘输出’为字符串
				char x='\u4e2d';//-------\u表示后面的是一个字符的Unicode编码，输出即可显示该实际字符
				System.out.println(x);

				char y=97;
				System.out.println(y);

				//char v=65536;
				//Systenm.out.println(v);

				//CharTest01.java:58: 错误: 不兼容的类型: 从int转换到char可能会有损失
                            //    char v=65536;
			char a1=65535;
			System.out.println(a1);
		}
}

/*
t

abc
def
'
\
“test”
"test"
 '
'输出'
中
a
?
*/