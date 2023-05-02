 //方法覆盖的经典案例
 //一定要注意：方法覆盖或者叫重写，建议直接将父类的方法复制粘贴，这样比较保险
 
 public class Test02
 {
	 public static void main(String[] args){
		//创建对象：
		//ChinaPeople a=new ChinaPeople("张威明");//错误: 无法将类 ChinaPeople中的构造器 ChinaPeople应用到给定类型;
		//原因: 实际参数列表和形式参数列表长度不同;这是因为我继承的方法里面没有继承主类的构造方法
		//----子类不能继承父类的构造方法，只能自己写构造方法或者通过a.setName();方法去定义

		ChinaPeople a=new ChinaPeople();
		a.setName("张威明");
		a.speak();

		AmericaPeople b=new AmericaPeople("xiaozhang");
		b.speak();
	 }
 }

 class People
 {
	 private	String  name;
	 public People(){}
	 public People(String name){
		this.name=name;
	 }
	 public void setName(String name){
		this.name=name;
	 }
	 public String getName(){
		return name;
	 }
	 public void speak(){
		System.out.println(name+"--------");
	 }
 }

 class ChinaPeople extends People
 {
	 public void speak(){
		System.out.println(this.getName()+"正在说汉语");
	 }
 }

 class AmericaPeople extends People
 {
	 public void speak(){
		System.out.println(this.getName()+"speak english");
	 }
	 public AmericaPeople(String name){
		this.setName(name);
	 }
 }

 P289