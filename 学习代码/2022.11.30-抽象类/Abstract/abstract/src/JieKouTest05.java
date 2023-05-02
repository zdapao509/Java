/*
重点： **任何一个接口都有一个调用者和实现者！！！！

这里的接口是：FoodMenu{}

接口的调用者是：Customer{}

接口的实现者是：ChinaCooker{}  AmericaCooker{}

测试程序：JieKouTest05 {}

利用接口实现解耦合，解的是接口的 实现者 和 调用者 之间的耦合

也就是：Customer{} 和具体的厨师 ChinaCooker{}  AmericaCooker{} 之间的耦合

后续进行大项目之间的开发，一般都是将项目分离成一个模块一个模块的，模块和模块之间通过接口来实现衔接，降低耦合度。

当自己定义类被定义为属性的时候，和常规的int String等类型的属性所不同的是：这些int String属性只能赋值，然后无法再使用；
而自己定义的类下面的属性虽然也是赋值（堆内存中的内存地址），但是还可以使用这个属性下面的方法，属性下还有东西（属性、方法）
* */

public class JieKouTest05 {
    public static void main(String[] args) {
        Customer cc=new Customer(new AmericaCooker());
        // 具体的执行过程：Customer类进行实例化之后，进行有参数构造；在有参数构造方法中，利用多态，利用接口父类进行父类型的引用指向子类型的对象。
        // 在Customer类有了实例cc之后，其FoodMenu属性在经过有参数构造方法之后有了值，指向的是堆内存中的AmericaCooker()类的对象。
        // 那么，利用cc.getFoodMenu().xihongshiChaoJiDan()的方式就能实现顾客选了美国厨师还是中国厨师做的西红柿蛋炒饭这个过程。
        cc.getFoodMenu().xihongshiChaoJiDan();
        cc.order();

    }
}


interface FoodMenu{//接口-菜单，抽象的
    void xihongshiChaoJiDan();
    void yuXiangRouSi();
}

//--------------------------------------------------------------------------------------------------------------------------

class Customer{
    //顾客手里有菜单
    //Customer has a FoodMenu!  顾客有一个菜单
    //记住：以后凡是可以用has a 来描述的，统一以属性的方式存在；
    //实例变量，属性

    private FoodMenu foodMenu;//注意：这里并没有创建对象，只是一个属性，一个引用，一个引用数据类型
    // ----------面向抽象编程，降低耦合度，提升扩展能力----养成习惯，属性私有化

    //如果是以下这种方式写，就表示写死了（焊接了，没有可插拔）---------顾客要吃饭的时候，直接找厨师说了，而不是用菜单交流，不方便
    //ChinaCooker cc;//中餐厨师
    //AmericaCooker ac;//西餐厨师

    public Customer(){}//无参数构造方法

    public Customer(FoodMenu foodMenu) {//有参数构造方法
        this.foodMenu = foodMenu;
    }

    //setter和getter
    public void setFoodMenu(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }
    public FoodMenu getFoodMenu(){
        return foodMenu;
    }

    //写一个点菜方法
    public void order(){
        //先拿到菜单才能点菜
        //调用get方法拿菜单
        //FoodMenu fm=this.getFoodMenu();

        //也可以不调用get方法，因为在本类中私有的属性是可以访问的
        this.foodMenu.xihongshiChaoJiDan();//foodMenu指向的对象是美国厨师或者中国厨师，每个对象里面又有两种饭，
        // 包括西红柿炒鸡蛋，包括鱼香肉丝
        foodMenu.yuXiangRouSi();

    }

}


//--------------------------------------------------------------------------------------------------------------------------
/*
Cat is a Animal,但凡满足is a 的表示都可以设置为继承；
Customer has a FoodMenu;但凡满足has a 的都可以以属性的形式存在；
*/
//--------------------------------------------------------------------------------------------------------------------------


//中餐厨师：实现菜单上的菜；厨师是接口的实现者
class ChinaCooker implements FoodMenu{
    @Override
    public void xihongshiChaoJiDan() {
        System.out.println("中餐厨师-西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("中餐厨师-鱼香肉丝");
    }
}

//西餐厨师：实现菜单上的菜； 厨师是接口的实现者
class AmericaCooker implements FoodMenu{
    @Override
    public void xihongshiChaoJiDan() {
        System.out.println("西餐厨师--西红柿炒鸡蛋");
    }

    @Override
    public void yuXiangRouSi() {
        System.out.println("西餐厨师--鱼香肉丝");
    }
}



//--------------------------------------------------------------------------------------------------------------------------
//以下的这两段代码是为了说明：自己创建的类可以作为属性，并且属于引用数据类型；

// 比如：Address addr;    addr存的是堆内存中的对象地址，可以通过new对象的方式，给它赋值

/*
class Address{
    String city;
    String street;
    String zipcode;
}

class User{
    int id;
    String name;
    Address addr;

    public static void main(String[] args){
        //Address addr;局部变量
        //addr=new Address();
        //也可以写成以下的格式：
        //Address addr=new Address();

        User u=new User();
        u.id=100;
        u.name="张三";
        u.addr=new Address();

        System.out.println(u.addr.city);//null
        System.out.println(u.addr.street);//null
        System.out.println(u.addr.zipcode);//null
    }
}
* */

/*
自己类
Myself has a Friend;

class Myself{
    //你的这个对象，应该有一个朋友对象的电话号码；
    //电话号码就是一个存着对象的内存地址，联系你的朋友的时候，打电话
    //f是一个引用。f是默认值null,是null表示，你没有朋友

    Friend f;

    public Myself(){}

    //通过构造方法能不能给你一个朋友对象

    public Myself(Friend f){
        this.f=f;
    }

    public static void main(String[] args){
        //创建朋友对象
        Friend f=new Friend();//朋友对象有了
        //创建自己对象
        Myself m=new Myself();
        //把朋友对象的联系方式赋值给我自己的朋友的联系方式
        m.f=f;

        //或者可以直接构造方法：
        Myself m2=new Myself(f);
    }
}

朋友类：
class Friend {}
* */

//--------------------------------------------------------------------------------------------------------------------------