/*
关于Object类中的equals方法
    1.equals方法的源码：Object方法的默认实现
        public boolean equals(Object obj) {
                return (this == obj);----------------------这里的this是当前对象的内存地址
            }

            System.out.println(a1.equals(a2));

            如果直接调用父类里面的Object方法，那么this代表的就是：a1中存储的堆内存地址this=a1

            obj代表的就是：a2中的堆内存地址。obj=a2

            两个内存地址一定不同，所以肯定是false。与实际的我想要的结果相反。比较对象的时候，我们一般都是比较内容；并不比较内存地址

    2.SUN公司设计的equals方法的目的是：

        以后的编程的时候，都要通过equals方法来判断两对象是否相等。
        equals方法是判断两对象是否相等的。

    3.我们需要研究一下，Object类给的这个默认的equals方法够不够用！！！！
        在Object类中的equals方法当中，默认采用的是==方法，判断两个java对象是否相等，而==判断的是两个java对象的内存地址，
        我们应该判断的是，两个java对象的内容是否相等，所以老祖宗类的equals方法不够用，需要对子类重写equals方法。

    4.判断两个java对象是否相等，不能使用==，因为==比较的是两个对象的内存地址是否相等


* */

public class Equals {
    public static void main(String[] args) {
        //判断两个基本数据类型用==判断就行
        int a=100;
        int b=100;
        //这个==是判断a中保存的数据是否和b中保存的数据相等
        System.out.println(a==b);

        //判断两个java对象是否相等，可以直接使用==判断吗
        MyTime a1=new MyTime(1998,10,24);

        MyTime a2=new MyTime(1998,10,24);

        MyTime a3=new MyTime(1997,10,24);

        MyTime a4=null;

        //测试一下，比较两个对象是否相等，能不能使用==方式
        //注意：这里的==判断的是a1和a2两个引用中保存的内存地址是否相等
        System.out.println(a1==a2);//false

        System.out.println(a1.equals(a2));//true

        System.out.println(a1.equals(a3));//false

        System.out.println(a1.equals(a4));//false----这个过程，是可以执行的；但是，这里存在一个问题，你的效率比较低，null就不需要进行判断了
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


    //重写Object类的equals方法，
    //怎么重写？复制粘贴，相同的返回值类型，相同的方法名，相同的形式参数列表
/*
    public boolean equals(Object obj) {//这里用到了多态，由父类型的Object的引用obj指向子类型的对象，子类型的对象需要自己指定
                                                    // --Object类是祖宗类，所有子类的父类

        //注意：这里不能直接写this.year==obj.year;因为是多态，obj是Object类型的引用，
        // 虽然子类里面有year等属性，但是编译阶段，只会在父类里面找，父类里面是没有year等属性的----------这是多态的基础

        if (obj instanceof MyTime){
            MyTime aa=(MyTime)obj;
            return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//当年月日相等的时候，两个对象相等
            //这里为什么已经判断为是MyTime类的时候还要进行强制类型转换向下转型？
            //这是因为：即使已经进行了判断，编译器还是不认识obj.year；因为obj类下面没有year属性
        }else{
            return false;//如果Obj连个MyTime类都不是的话，就说明这两个对象肯定不相等
        }

    }
*/
    //这里还有一个要注意的点：上面的方法覆盖老祖宗的Object类，不可以为了方便，
    // 把形式参数列表改成MyTime myTime这样的形式，因为这样就不构成方法覆盖了



    //改良以下方法
/*    public boolean equals(Object obj) {
        if (obj ==null){//如果obj是空，直接返回false
            return false;
        }
        if (!(obj instanceof MyTime)){//如果obj不是MyTime类，直接返回false
            return false;
        }
        if(this==obj){//如果this和obj保存的内存地址相等，没必要比较，直接返回true。内存地址相同的时候指向堆内存中的对象肯定是同一个
            return true;
        }

        //程序可以执行到此处可以说明：  说明obj不是null，obj是MyTime类型
        MyTime aa=(MyTime)obj;
        return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//当年月日相等的时候，两个对象相等
    }
*/


    //还可以再精简
    public boolean equals(Object obj) {
        if (obj ==null||!(obj instanceof MyTime)){//如果obj是空，或如果obj不是MyTime类,直接返回false
            return false;
        }

        if(this==obj){//如果this和obj保存的内存地址相等，没必要比较，直接返回true。内存地址相同的时候指向堆内存中的对象肯定是同一个
            return true;
        }
        //程序可以执行到此处可以说明：  说明obj不是null，obj是MyTime类型
        MyTime aa=(MyTime)obj;
        return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//当年月日相等的时候，两个对象相等
    }

}
