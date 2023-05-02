/*
i f 语句的语法结构与运行原理
		if语句是时支语句，也可以叫做条件语句
		if语句的语法格式： 
				第一种写法：
							int a =100；
							int b=200；
							if（布尔表达式a==b）{
											java语句 
											java语句
							}
							这里的大括号{}叫做一个分支。如果布尔表达式结果是true就执行括号中的程序，否则不执行

				第二种语法：---------------一定会有一条分支执行
							if （布尔表达式）{分支1
									Java语句；
							}else{分支2
									Java语句；
							}
							如果布尔表达式运行结果是true，就执行分支1；否则执行分支2；保证一定会有一个分支执行

				第三种语法：
						if （布尔表达式1）{分支1
						Java语句
						}else if（布尔表达式2）{分支2
						Java语句
						}else if（布尔表达式3）{分支3
						Java语句
						}
					如果布尔表达式1为true就执行分支1，然后if语句执行结束，否则判断布尔表达式2，
																																				是否为true，为true执行分支2。
					
					第四种语法：------------一定会有一条分支执行
						if （布尔表达式1）{分支1
						Java语句
						}else if（布尔表达式2）{分支2
						Java语句
						}else if（布尔表达式3）{分支3
						Java语句
						}else{
						Java语句            以上语句没有一个成立的，就执行else
						}


					注意：对于if语句在任何情况下，只能有一个分支执行，不可能存在2个或者更多的分支执行。
									
										当分支中Java语句只有一条，那么大括号可以省略，但是为了可读性，最好不要省略。 
*/



public class IfTest{
		public static void main(String[] args){
					boolean sex=false;
					if (sex){
								System.out.println("男");
					}else{
								System.out.println("女 ");//-----------------sex为真就执行输出“男”语句，否则执行输出“女”
					}

				System.out.println(sex?"男":"女");//三目运算符
		}

}



/*
public class IfTest{
		public static void main(String[] args){
					boolean sex=false;
					if (sex)
								System.out.println("男");----------当分支中仅有一个语句时，可以去掉大括号执行；
						                                                            该语法写成这样成立
					else
								System.out.println("女 ");
					
				System.out.println(sex?"男":"女");-----------------这里允许出现新的语句，
														系统默认到if 和else后面第一个语句会加括号，所以后面的语句没有问题
		}

}
*/



/*
public class IfTest{
		public static void main(String[] args){
					boolean sex=false;
					if (sex)
								System.out.println("男");//----------当分支中仅有一个语句时，可以去掉大括号执行；
						                                                           // 该语法写成这样成立

								System.out.println(sex?"男":"女");//----这里就会出问题，
																			//因为系统默认第一行语句结束就会出现括号进行分割，
																			//所以这个语句夹在if和else中间，让系统以为只有if语句，
																			//而下面的else语句因为缺少if而出现报错
					else
								System.out.println("女 ");


			//		错误: 有 'if', 但是没有 'else'
             //                          else
					
		}

}
*/
