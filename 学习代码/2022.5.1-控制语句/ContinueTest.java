/*
continue语句：
作用：终止当前本次循环，直接进入下一次循环；（直接进行下一次循环的更新表达式）

for{
		if (){
				continue;//当条件成立，执行continue语句，此时下面的语句不再执行，直接执行更新表达式。
		}
		code 1；
		code 2；
}
*/
public class ContinueTest{
		public static void main(String[] args){
			for (int i=1;i<10 ;i++)
			{
				if (i==5)
				{
					System.out.println("到5啦");
					continue;
				}
				System.out.println(i);
			}

	System.out.println("______________________________________________");


			a:for (int a=0; a<3;a++ )
			{
					b:for (int i=1;i<10 ;i++)
						{
							if (i==5)
							{
								System.out.println("到5啦");
								System.out.println("第-----"+a+"-----轮");
								continue b;
							}
							System.out.println(i);
						}
						System.out.println("第-----"+a+"-----轮");
			}
		}
}