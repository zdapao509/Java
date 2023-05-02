public class OperatorTest02{
	public static void main(String[] args){
					System.out.println(true&false);
					System.out.println(false&false);
					System.out.println(true|false);

					int a=10;
					int b=11;
					System.out.println(a>b&a>b++);
					//&与表示：当两边都为真时，才会为真，
					//所以在左边已经是假的情况下，左边不必要执行，也可以输出假的结果
					System.out.println(b);
					//但是实际上，运行结果仍然是12，即右边还是运行了

					int x=10;
					int y=11;
					System.out.println(x>y&&x>y++);
					//在&&运行的状态下，右边输出依旧是11，
					//也就是在左边为假的状态下，右边已经不再运行，即短路现象
					System.out.println(y);

					int c=10;
					int d=9;
					System.out.println(c>d|c>d++);
					System.out.println(d);

					int w=10;
					int z=9;
					System.out.println(w>z||w>z++);
					System.out.println(z);//短路现象导致z++没有执行
	}

}