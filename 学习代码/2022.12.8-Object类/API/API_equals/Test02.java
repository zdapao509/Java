//判断用户的名字和家庭住址是否相同------------这个程序废了，不能编译的原因是：根目录下面的文件是不能编译的
// -------源根目录外的文件不可编译；必须得在src文件夹下面

public class Test02 {
    public static void main(String[] args) {
        Address a=new Address();
        a.city="1230";
        System.out.println(a.city);
    }
}

class User{

}

class Address{
    String city;
    String street;
}
