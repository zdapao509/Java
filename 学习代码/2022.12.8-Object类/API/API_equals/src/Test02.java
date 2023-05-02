//判断用户的名字和家庭住址是否相同

//这段代码主要说明：equals方法的重写一定要彻底；该重写的部分要全部重写。两个对象的比较一定不能用==判断，要用equals判断。

public class Test02 {
    public static void main(String[] args) {
        User a1=new User("张三",new Address("西安","灞桥街道","012000"));
        User a2=new User("张三",new Address("西安","灞桥街道","012000"));
        System.out.println(a1.equals(a2));//true
    }
}

class User{
    String name;//这里的name实际上保存的也是一个内存地址，是一个字符串对象的内存地址
    Address addr;

    public User(){}

    public User(String name,Address addr){
        this.name=name;
        this.addr=addr;
    }

    public String toString(){
        return this.name+"的地址："+this.addr.city+this.addr.street+this.addr.zipcode;
    }

    //重写equals方法：重写规则：当一个用户的用户名和家庭住址都相同的时候，表示同一用户。-------这里的重写是因为：要进行User对象和User对象的比较；
    // 下面的Address类里面没有重写equals方法-----------this.addr.city.equals(user.addr.city)这一句直到String类型的city属性才能利用equals方法比较
    //这里的equals判断的是User对象和User 对象是否相等。
//    public boolean equals(Object obj){
//        if (obj==null||!(obj instanceof User)) return false;
//        if (this==obj) return true;
//        User user=(User)obj;
//        return this.name.equals(user.name)&&this.addr.city.equals(user.addr.city)&&this.addr.street.equals(this.addr.street)&&this.addr.zipcode.equals(user.addr.zipcode);
//    }


    public boolean equals(Object obj){//这里的equals是User的equals方法
        if (obj==null||!(obj instanceof User)) return false;
        if (this==obj) return true;
        User user=(User)obj;//可以理解为内存地址变化了，但是还是指向堆内存中的User对象-------或者可以认为是内存地址没变，只是属于的数据类型变了
        return this.name.equals(user.name)&&this.addr.equals(user.addr);

        //注意这里的这种写法为什么会报错：因为这里的equals方法实际上调用的是：Address类下面的equals方法，
        // 此时，如果Address类下面的equals方法还是继承的是Object类的方法，那还是比较的是两个对象的内存地址是否相等，用的是==，而不是equals方法。
        //所以要使得这一行语法通过，下面的Address类里面的equals方法一定要重写。
        //注意：equals方法重写的时候要彻底一点，要把需要判断的部分都写重写。


        // return this.name.equals(user.name)&&this.addr.equals(user.addr);

        // 分析这句话；
        // 前面的this.name.equals(user.name)中的equals方法是this.name的类的equals方法，也就是String的equals方法，
        //而：this.addr.equals(user.addr)中的equals方法是Address中的equals方法，两个equals方法的来源是不同的。
    }

}

class Address{
    String city;
    String street;
    String zipcode;

    public Address(){}

    public Address(String city,String street,String zipcode){
        this.city=city;
        this.street=street;
        this.zipcode=zipcode;
    }

    public boolean equals(Object obj){//这个方法存在的意义就是：equals方法重写的时候要彻底，不管哪个类，一定要完全重写
        if (obj==null||!(obj instanceof Address)) return false;
        if (this==obj) return true;
        Address addr =(Address)obj;
        return this.city.equals(addr.city) &&this.street.equals(addr.street)&&this.zipcode.equals(addr.zipcode);
        //注意这里一不留神就会出错，用了 this.city==addr.city  的判断方法，这是错误的，字符串的判断一定要用equals方法，不然这样写了半天没意义了。
    }
}
