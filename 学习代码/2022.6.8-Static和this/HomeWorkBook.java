/*
请通过代码封装,实现如下需求:
编写一个类Book，代表教材:
1.具有属性:名称(title) 、页数(pageNum)
2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
3.为各属性提供赋值和取值方法
4.具有方法:detail，用来在控制台输出每本教材的名称和页数
5.编写测试类BookTest进行测试:为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
*/

class Book
{
	//实例属性
	private String title;
	private int pageNum;

	//无参数构造方法——这个要写上，必须写上！
	public Book(){}

	//有参数构造方法。这里的title和pageNum实际上前面都是有this.的。设置页数和修改页数的时候都要控制
	//它的数量在200以上
	public Book(String a,int b){
		title=a;
		if (b<200)
		{
			pageNum=200;
		}else{
			pageNum=b;
		}

	}

	//读写页数
	public int getPageNum()//get方法返回的是数据类型；是你要读取的数，你要实际的看到这个数
	{
		return pageNum;
	}
	public void setPageNum(int a){//set方法没有返回值类型，他只管修改的工作，不负责数据的读取
		if (a<200)
		{
			System.out.println("输入错误，页数至少在200页以上");
			pageNum=200;
			return;
		}
		else
		{
			pageNum=a;
		}
	}

	//实例方法；实际上此处的title是this.title；前面的this代表的是在堆内存中的当前对象的地址；这里省略掉了
	public void detail()
	{
		System.out.println("书名:"+title+"；页数为："+pageNum);
	}

	//读写书名
	public String getTitle(){
			return title;
	}
	public void setTitle(String s){
			title=s;
	}
}


public class HomeWorkBook
{
	public static void main(String [] args){
			Book a=new Book();
			a.setTitle("海底两万里");
			a.setPageNum(230);
			a.detail();
			Book b=new Book("国富论",30);
			b.detail();
	}
}