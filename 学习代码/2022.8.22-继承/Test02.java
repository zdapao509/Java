//默认继承的Object中，有哪些方法呢？
/*

package java.lang;

import jdk.internal.vm.annotation.IntrinsicCandidate;

public class Object {

	//无参数构造方法
    @IntrinsicCandidate
    public Object() {}


    @IntrinsicCandidate
    public final native Class<?> getClass();

    @IntrinsicCandidate
    public native int hashCode();

    public boolean equals(Object obj) {
        return (this == obj);
    }

	//equals方法名
	//public是公开的
	//boolean是方法的返回值类型
	//(Object obj)是一个形式参数
	//作用：已有对象a，想创建一个和a一模一样的对象，可以调用这个克隆方法

    @IntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;


    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
	//public代表公共的
	//String是返回值类型，toString（）方法执行结束之后返回一个字符串---------------作用：把对象转换成字符串


    @IntrinsicCandidate
    public final native void notify();


    @IntrinsicCandidate
    public final native void notifyAll();

    public final void wait() throws InterruptedException {
        wait(0L);
    }


    public final native void wait(long timeoutMillis) throws InterruptedException;

    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }


    @Deprecated(since="9", forRemoval=true)
    protected void finalize() throws Throwable { }
}

*/


//当源代码方法以“；”结尾，并且修饰符类列表中有native关键字，表示底层调用C++写的dll程序（dll动态链接库文件）

public class Test02
{
	/*
		Test02默认继承Object，Test02类中有toString方法
		但是，toString方法是一个实例方法，需要创建对象才能调用

		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
		}
	*/
	public static void main(String[] args){
		//分析一下语句是否可以执行？
		//Test02.toString();--------------不能执行，原因：实例方法，需要先创建对象，用引用.的方式来调用

		//先new对象
		Test02  a=new Test02();
		String retValue=a.toString();
		System.out.println(retValue);//Test02@4517d9a3
		//其中，4517d9a3可以“等同”看做是对象在堆内存当中的内存地址
		//实际上是内存地址经过哈希算法得到的十六进制结果
		
		//创建对象
			Product pro=new Product();
			String b=pro.toString();
			System.out.println(b);//Product@2f92e0f4

			System.out.println(pro.toString());//Product@2f92e0f4

			System.out.println(pro);	//Product@2f92e0f4
			//以上代码证明：println方法会自动调用Pro中的toString（）方法
			//经过研究发现：当直接输出一个引用的时候，println方法会自动调用“引用.toString()”，然后输出toString()方法的执行结果
	}
}

class Product
{
}

P284