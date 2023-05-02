public class PersonTest
{
	public static void main(String [] args){
		Person p1=new Person();
		System.out.println(p1.getAge());
		java.util.Scanner s=new java.util.Scanner(System.in,"GBK");
		System.out.println("输入你的年龄：");
		int a=s.nextInt();
		p1.setAge(a);
		System.out.println(p1.getAge());
	}
}