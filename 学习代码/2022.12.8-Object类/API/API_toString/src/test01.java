/*
关于Object类中的toString（）方法
    1.源代码长什么样子

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());//这里的getclass是取该类对象的内存地址的
    }
    源代码上toString()方法的默认实现是：
        类名@对象的内存地址转换为十六进制的形式

    2.SUN公司设计toString（）方法的目的是什么？

        toString（）方法的作用是什么？

            toString（）方法的设计目的是：

            通过调用这个方法可以将一个“java”对象转换成“字符串类型”

    3.其实SUN公司开发java语言的时候，建议所有的子类都重写toString（）方法，toString（）方法应该是一个简洁的，详实的方便阅读的。

* */

public class test01 {
    public static void main(String[] args) {
        MyTime myTime=new MyTime(1998,10,24);
        //一个日期对象转换成字符串的形式的话，我希望看到的是具体的日期信息，
        String a=myTime.toString();

        //MyTime类重写toString（）方法之前
//        System.out.println(a);//MyTime@16b98e56

        //MyTime类重写toString（）方法之后
        System.out.println(a);//1998年10月24日

        System.out.println(myTime.toString());//1998年10月24日

        //输出为引用的时候，默认调用的是toString（）方法
        System.out.println(myTime);//1998年10月24日
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime(){

    }

    public MyTime(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public String toString(){
        return this.year+"年"+this.month+"月"+this.day+"日";
    }
}
