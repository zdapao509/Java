/*
do...while 循环语句执行原理及语法机制：
		语法机制：
				do{
				循环体；
				}while（布尔表达式）；

				注意：do...while 循环之后别漏掉分号；循环至少执行一次，循环体执行次数：1~n；
*/

public class DoWhileTest
{
	public static void main(String[] args){
			int i=0;
			do{
					System.out.println("i>>>>"+i);
					i++;
			}while (i<10);

System.out.println("------------------------------");

			int a=0;
			do{
				System.out.println("a>>>>"+(a++));
			}while(a<10);
	}
}

/*

int a=0;
do{
	System.out.println("a>>>>"+(a++));
}while(a<10);

输出：
a>>>>0
a>>>>1
a>>>>2
a>>>>3
a>>>>4
a>>>>5
a>>>>6
a>>>>7
a>>>>8
a>>>>9
*/