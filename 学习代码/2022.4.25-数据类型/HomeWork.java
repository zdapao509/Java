public class HomeWork{
		public static void main (String[] args){
				//byte b1 =1000;//----------编译报错，因为1000已经超出范围
				byte b2=20;//-----------可以
				short s=1000;//--------可以
				int c=1000;//----可以
				long d=c;//---------  可以：小范围转化为大范围
				//int e=d;//-----------不可以---大范围转换为小范围，类型不兼容
				int f=10/3;//----------可以
				long g=10;//可以
				//int h=g/3;//--------------不可以，运行过程中先将右边都转换成长整型，类型不兼容
				long m=g/3;//-----------可以
				//byte x=(byte)g/3;//-----------注意：优先级问题；g先由long类型强转为byte类型，但是3为int类型，
				//----------------------------运算时，先整体转换为最大容量的类型，即int类型；运算结果仍然是int类型
				short y=(short)(g/3);//---------可以
				short i=10;//-------可以
				byte j=5;//--------可以
				//short k=i+j;//---------不可以--short byte char进行运算时，
				//-------------------------先转换为int类型；int转换为short时类型不兼容
				int n=i+j;//--------可以
				char cc='a';//-------可以
				System.out.println("cc="+cc);//-----输出结果：cc=a
				System.out.println((byte)cc);//----------cc会先转换为int类型，再做运算
				int o=cc+100;//------可以
				System.out.println(o); //------197

		}
}