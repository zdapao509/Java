/*输入成绩

public class IfTest02{
		public static void main(String [] args){
				java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
					System.out.print("考了多少，输进来：");
					double a=s.nextDouble();
					String b="不及格";
					if (a<0||a>100){
							System.out.println("你可别扯了");
							return;-----------这句话的出现是为了解决后续的21行出现的输出“b”的语句；输完这句就不再输出“b”语句
					}else if(a>=90){
							b="优秀";
					}else if(a>=80){
							b="良好";
					}else if(a>=70){
							b="中";
					}else if (a>=60){
							b="及格";
					}
				System.out.println(b);
		}
}
*/


/*天气和是否打伞*/

public class IfTest02
{
	public static void main(String [] args){
			java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
			System.out.print("啥天气（1：晴天；0：雨天）：\t");
			int a=s.nextInt();
			String b="女人：擦防晒霜，出去玩";
			if (a!=0&&a!=1)
			{
				System.out.println("你的输入有误");
				return;
			}
			
			else if (a==0)
			{
							System.out.print("你是男是女(1：男人；0：女人)：\t");
							int c=s.nextInt();
							if (c!=0&&c!=1)
							{
								System.out.println("你是什么怪物");
								return;
							}else if (c==1)
							{
								b="男人，你需要打一把大黑伞";
							}
							else
							{
								b="女人：记得打一把小花伞";
							}
			}
			
			else 
			{
							System.out.print("你是男是女(1：男人；0：女人)：\t");
							int c=s.nextInt();
							if (c!=0&&c!=1)
							{
								System.out.println("你是什么怪物");
								return;
							}else if (c==1)
							{
								b="男人，直接去玩";
							}	
			}

			System.out.println(b);
	}
}