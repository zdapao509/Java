public class HomeWork
{
	public static void main(String[] args){
			Man a=new Man("张威明","1998-10-24");
			
			Woman b=new Woman("熊滢","1998-06-20");

			a.w=b;
			b.q=a;

			System.out.println(a.name+"的妻子是"+a.w.name);
			System.out.println(b.name+"的老公是"+b.q.name);
	}
}

class Man
{
	int num;
	String name;
	String Born;
	Woman w;
	public Man(){
		
	}
	public Man(String  name,String  Born){
		this.name= name;
		this.Born= Born;
	}
}

class Woman
{
	int num;
	String name;
	String Born;
	Man q;
	public Woman(){
		
	}
	public Woman(String  name,String  Born){
		this.name=  name;
		this.Born= Born;
	}
}