/*
	一个java源文件可以定义多个class

	public的类不是必须的

	只要有一个class的定义，那么一定会生成一个对应的class文件

	public的类名可以没有，但是如果有，public所修饰的类名必须与源文件名字保持一致

	public 有且只能有一个，避免了类重复

	多个类下面，想从哪个入口进去，就从哪个进口运行命令

*/

class S{
	public static void main (String[] args){
	System.out.println("S");
	}
}
class A{
	public static void main(String[] args){
	System.out.println("A");
	}
}

	