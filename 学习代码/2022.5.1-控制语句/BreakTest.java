/*public class BreakTest{
		public static void main(String[] args){
				for (int a=0; a<10; a++)
				{
					if (a==5)
					{
						break;//语句会使得离他最近的循环终止掉；终止的是循环，不是if语句
					}
					System.out.println(a);
				}
				System.out.println("nihao--------------------------------------------");//break不会终止这个代码；

			for (int b=0; b<2; b++)
			{
						for (int a=0; a<10; a++)
						{
							if (a==5)
							{
								break;//语句会使得离他最近的for 循环终止掉；外部for循环不结束
							}
							System.out.println(a);
						}
			}*/


//用break语句终止指定的循环：通过给循环起名字的方式：

public class BreakTest{
		public static void main(String[] args){
					 c:for (int b=0; b<2; b++)
								{
											d:for (int a=0; a<10; a++)
											{
												if (a==5)
												{
													break c;//语句会使名字为d的for循环终止掉
												}
												System.out.println("a>>>>>>"+a);
											}

										System.out.println("b>>>>>>"+b);

								}


		}
}