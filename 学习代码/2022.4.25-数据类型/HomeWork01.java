public class HomeWork01{
			public static void main(String[] args){
					/*题目1

					int x = 10; 
					int a = x+ x++; 
					System.out.println("a =" + a); //20----------------先赋值，再加一  x已经变成11
					System.out.println("x =" + x); //11
					int b = x + ++x; 
					System.out.println("b =" + b); //23
					System.out.println("x =" + x); //12
					int c = x + x--; 
					System.out.println("c =" + c); //24
					System.out.println("x =" + x); //11
					int d = x + --x; 
					System.out.println("d =" + d); //21
					System.out.println("x =" + x); //10
					
					*/
				
				/*题目2

					int a = 15;
					int b = 2; 
					double c = 2; 
					System.out.println(c); //输出2.0  而不是2.00
					System.out.println(a + "/" + b + "=" + (a / b)); //   15/2=7
					System.out.println(a + "%" + b + "=" + (a % b)); //   15%2=1
					System.out.println(a + "/" + c + "=" + (a / c)); //   15/2.0=7.5-------------注意不是15/2.00=7.50
					System.out.println(a + "%" + c + "=" + (a % c)); //  15%2.0=1.0

				*/

				/*题目3
					boolean x, y, z; 
					int a = 15; 
					int b = 2; 
					x = a > b; // true; 
					y = a < b; // false; 
					z = a != b; // true; 
					System.out.println("x =" + x); //x=true
					System.out.println("y =" + y); 
					System.out.println("z =" + z); 
				*/

				/*题目4
				int x; 
				double y; 
				x = (int) 22.5 + (int) 34.7; //不存在四舍五入，直接保存整数部分
				y = (double) x; //双精度浮点型需要直接进行加“.0”即可
				System.out.println("x = " + x); //56
				System.out.println("y = " + y); //56.0
				*/

				
				/*题目5
					int i = 5;
					int j = 5; 
					int m = 5; 
					int n = 5; 
					i++; 
					j = j + 1; 
					m--; 
					n = n - 1; 
					System.out.println(i); //6
					System.out.println(i++); //6；实际上i进行了加一操作，只不过赋值给输出的还是i加一之前的值，
																	//i已经变成了7；相当于分了两个步骤，先赋值，后加一
					System.out.println(++i); //8
					System.out.println(i--); //8        i已经变成7
					System.out.println(); //注意不仅仅是换行，而是输出空的一行
					System.out.println(j); //6
					System.out.println(j++); //6       先赋值，再加1，i已经变成7
					System.out.println(j--); //7            先赋值，再减1，i已经变成6
					System.out.println(--j); //5            先减一，再赋值
					System.out.println(); //注意不仅仅是换行，而是输出空的一行
					System.out.println(m);//4 
					System.out.println(n); //4
				*/

				
				/*题目6

						int i = 0;
						int j = 0; 
						System.out.println(i); //0
						System.out.println(j);//0 
						i++; 
						++j; 
						System.out.println(i); //1
						System.out.println(j); //1
						System.out.println("--------------------------"); 
						System.out.println(i++); //1         i 已经变成2
						System.out.println(++j); //2         j 已经变成2
						System.out.println("--------------------------"); 
						System.out.println(i); //2
						System.out.println(j); //2

				*/


			}
}