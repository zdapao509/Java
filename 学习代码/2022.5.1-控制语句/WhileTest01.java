/*
while循环：
			语法机制及执行原理：
			语法机制：
					while（布尔表达式）{
					循环体；
					}
			执行原理：判断布尔表达式，如果为true执行循环体，循环结束之后，再次判断布尔表达式的结果，
			如果还是true，继续执行循环体；直到布尔表达式结果为false，while循环结束。

			while循环次数：
						0-n次
				
*/

public class WhileTest01{
		public static void main(String[] args){
				
				/*死循环
				while(true){
						System.out.println("死循环");
				}*/

				//本质上：while循环与for循环执行原理是相同的
				/*for (int a=1;a<10 ;a++ )
				{
					System.out.println("a>>>>"+a);
				}

				int b=1;
				while (b<10)
				{
					System.out.println("b>>>>>"+b);
					b++;
				}*/
		
		
		
		
		/*for (初始化表达式;条件表达式 ;更新表达式 )
		{
			循环体；
		}
		
		初始化表达式；
		while (条件表达式)
		{
			循环体；
				更新表达式；
		}*/

		}

}