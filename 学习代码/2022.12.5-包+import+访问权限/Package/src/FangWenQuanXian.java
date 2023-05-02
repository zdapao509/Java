import ass.test02;
//import org.User01;
import org.test01;

public class FangWenQuanXian extends test02 {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------
        //以下这段代码说明：private修饰的属性，只能在同类中访问，出了同类，不能访问    而public、protected、默认修饰的属性出了同类不出包任然可以调用
        User user =new User();
        //System.out.println(user.id);//错误：java: id 在 User 中是 private 访问控制---------只能在本类中被访问
        System.out.println(user.age);
        System.out.println(user.weight);
        System.out.println(user.name);


//---------------------------------------------------------------------------------------------------------
// 以下程序说明：访问控制权限修饰的类：默认的修饰的类（类前面什么也没有），在不同包下面是不能进行实例化的;
// 只有public修饰的类，在不同的包下面才能进行实例化访问;
// 经过测试：就算是不同包下面的子类，也不能访问有protected修饰的父类--------------注意：protected和private不能修饰类

//        User01 user01=new User01();//错误：java: org.User01在org中不是公共的; 无法从外部程序包中对其进行访问；
//        因为在org包里面的User01类不是公开的，所以这里会爆这种错误
//        System.out.println(user01.age);
//        System.out.println(user01.weight);
//        System.out.println(user01.name);


        test02 test002=new test02();
        System.out.println(test002.age);
//        System.out.println(test002.weight);//这里不能访问的原因，并不是因为子类不能访问父类中protected修饰的属性；
//        是因为我在子类中没有把父类看成父类，对父类进行了实例化，把父类看成了其他类

//        System.out.println(test002.name);//java: name在ass.test02中不是公共的; 无法从外部程序包中对其进行访问

//----------------------------------------------------------------------------------------------------------
//以下这段代码表示不同包下面，如果子类FangWenQuanXian继承了父类test02的话，对于父类中protected修饰的属性，子类是可以进行访问的
        //而默认修饰符 修饰的属性出了同一个包，哪怕是子类都没有办法访问

        FangWenQuanXian aaa=new FangWenQuanXian();
//        System.out.println(aaa.name);//java: name在ass.test02中不是公共的; 无法从外部程序包中对其进行访问
        System.out.println(aaa.weight);

//---------------------------------------------------------------------------------------------------------
//以下这段代码说明：public修饰的属性，出了本类，出了同包，在任意位置，还可以继续访问。
// 而protected和默认修饰的属性，出了同包，在任意位置就不能访问
        //也就是不同包下面，protected\默认修饰符 修饰的属性是不能被访问的
        test01 test001=new test01();
        System.out.println(test001.age);//可以执行，即public修饰的是公开的，在哪里都能访问
//        System.out.println(test001.weight);//不可以，protected在这里不行；java: weight 在 org.test01 中是 protected 访问控制
        //System.out.println(test001.name);//不可以，“默认”在这里也不行
    }
//---------------------------------------------------------------------------------------------------------
    //以下这段代码说明：如果不再同一个包下面，protected修饰的属性在子类中任然可以访问，但是默认的修饰的属性在子类中就不能访问
    //              ------------如果不再一个包下面的话，protected修饰的属性只能子类去使用
    // 并且，public修饰的属性在子类中可以访问，private修饰的属性在子类中也不能访问

    //这里面：test01在org包下面；FangWenQuanXian在src下面，二者不在一个包下面，但是FangWenQuanXian是test01的子类
    public void shopping(){
        //System.out.println(this.id);//错误:java: id 在 org.test01 中是 private 访问控制
        System.out.println(this.age);
        System.out.println(this.weight);
//        System.out.println(this.name);//错误：//java: name在org.test01中不是公共的; 无法从外部程序包中对其进行访问
    }

}

class User{
    private int id;
    public int age;
    protected int weight;
    String name;

    //方法可以用访问权限进行修饰
    public void m1(){}
    protected void m2(){}
    private void m3(){}
    void m4(){}

    //静态方法可以用访问权限进行修饰
    public static void m5(){}
    protected static void m6(){}
    private static void m7(){}
    static void m8(){}

}
