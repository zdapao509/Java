/*public class Test{
		public static void main(String[] args){
			doSome();
			Test.doSome();
			Test a=new Test();
			a.doOther();
		}
		public static void doSome(){
				System.out.println("doSome");
		}
		public void doOther(){
				System.out.println("doOther");
		}
}*/




public class Test{
		public static void main(String[] args){
				User ab=new User();
				System.out.println(ab.a);
				ab.doSome();
				ab=null;//NullPointerException: Cannot read field "a" because "<local1>" is null空指针异常
							//--可以编译但是无法运行
				//	System.out.println(ab.a);
				ab.doSome();//一个实例方法的调用也需要有对象的存在
		}
}
//类=属性+方法
//属性描述状态。方法描述行为动作
class User{
		int a;//实例变量
		public void doSome(){//实例方法
				System.out.println("doSome");
		}
}