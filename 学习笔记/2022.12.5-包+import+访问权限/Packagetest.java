/*关于java语言中的package和import机制：
	
		1.为什么要使用package：
			
				package是java中的包机制，包机制的作用是方便程序的管理，不同功能的类分别存放在不同的包下。
				
				按照功能划分的，不同的软件包有不同的功能。

		2.package怎么用？
			
			package是一个关键字，后面加包名。例如：
				
				package com.bjpowernode.javase.chapter17;

				注意：package语句只允许出现在源代码的第一行。

		3.包名有没有命名规范，有
			
			一般都采用公司域名倒序的方式（因为公司域名具有全球唯一性。）

			包名的命名规范：	

					公司域名倒叙+项目名+模块名+功能名

		4.对于带有package的java程序怎么编译？怎么运行？

			采用之前的编译和运行行不行？编译可以通过，但是运行通过不了：
			
				G:\2--Java学习\学习笔记\2022.12.5-包+import+访问权限>java Package
				错误: 找不到或无法加载主类 Package
				原因: java.lang.NoClassDefFoundError: com/holleworld/Package01/Package (wrong name: Package)

			编译变成：
				
					javac -d . Package.java

					解释一下：
						
							javac 负责编译的命令
								
							-d  带包编译

							. 代表编译之后的东西放在当前目录下（点代表当前目录）

							Package.java代表被编译的java文件名

					运行：
					
						java com.holleworld.Package01.Package

						这里面注意：此时的类名不是Package了，而是com.holleworld.Package01.Package
	
		5.import的使用：
			
			什么时候使用：
				
				A类中使用B类：	
					
					A类和B类在同一个包下，不需要import；
					A类和B类不在同一个包下，需要使用import；
					java.lang.*这个类是java的语言类包，包含了String类，等等，不需要使用import导入。

			import怎么使用？

				import语句只能出现在package语句之下，class声明语句之上。
				import语句还可以采用*号的方式；

		6.package和import
			
			6.1package
				
				第一：package出现在java源文件第一行
				第二：带有包名怎么编译？	javac -d . 类名.java
				第三：怎么运行？ java 完整代码

				补充：以后说类名的时候，如果带着包名描述，表示完整类名；
					
					如果不带包名，描述的话，表示简类名。

						java.util.Scanner 完整类名

						Scanner简类名


			6.2import
				
				import什么时候不需要？
						
						java.lang不需要
							
						同包下不需要

						其他一律都需要。
					
				怎么用？
					
					import 完整类名；

					import 包名.*；

					import java.util.Scanner ；完整类名

					疑问：import java.util.*;  ----------------这样效率会不会比较低？
						
						这个效率不低，因为编译器在编译的时候，会自动把*变成具体的类名。

					可不可以写成这样？----------import java.*;
					
						这是不允许的，因为在java语言中规定，这里的*只代表某些类的名字。只能在类名的那一层省略用*代表。

		7.	访问控制权限
			
			7.1访问控制权限都有哪些？	
				
				一共4个。

					private 私有的

					protected 受保护的

					public 公开的

					 什么也没有   默认的

			7.2以上的四个访问权限，控制的范围是什么？

					private表示的是私有的，只能在本类中访问----------------只能自己看

					public表示公开的，在任何位置都可以访问------------------所有人都能看

					“默认”表示只能在本类，以及同包下访问----------------只有自己和兄弟看，同包的儿子也可以看

					protected表示只能在本类、同包、子类中访问。-----------自己、兄弟、子孙都可以看，外人不能看

					访问控制权限         本类中（一个class下）        同包（一个包里面，同胞兄弟）             子类（子类，子子孙孙）             任意位置（无关人员）
					--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
					public                         可以                                       可以                                                               可以                                              可以

					protected                    可以                                       可以                                                         可以 (同包下可以，不同包可以)      不可以

					默认                            可以                                      可以                                                     不可以 (同包下可以，不同包不行)      不可以

					private                          可以                                      不可以                                                           不可以                                           不可以


					范围从小到大：public>protected>默认>private

						这里说到的能不能访问，是我相对于当前类进行实例化（如果是子类的话），然后看其他的引用能不能访问相对于这个当前类的父类，

						或者其他包下面的类的被public protected private 默认修饰的属性或者方法。如果不是子类的话，就是另一个类在本类中进行了实例化，
						
						然后其引用能否访问该类的属性。
					
		7.3访问控制权限修饰符可以修饰什么？
			
			属性（四个都能用）

			方法（四个都能用）

			类（public和默认能用，其他不行）

			接口（public和默认能用，其他不行）

*/


package com.helloworld.Package01;

public class Packagetest
{
	public static void main(String[] args){
		System.out.println("HelloWorld");
	}
}

//358

//365