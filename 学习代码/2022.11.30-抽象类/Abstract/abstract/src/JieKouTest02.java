/*
接口的基础语法：

    1.类和类之间叫做继承，类和接口之间叫做 实现；

      别多想：仍然可将“实现”看作是“继承”

      继承使用的是extends；实现使用的是：implements关键字完成；

    2.重点：当一个非抽象的类 实现 接口的话，必须将接口中的所有的抽象方法都实现（覆盖、重写）
* */

public class JieKouTest02 {
    public static void main(String[] args) {
//        new Mymath();//java: Mymath是抽象的; 无法实例化

        Mymath mm=new MymathImpl();//父类型的引用指向子类型的对象

        int a=mm.sum(10,20);//调用接口里面的方法，面向接口编程
        System.out.println(a);
        int b=mm.sub(93,80);
        System.out.println(b);
    }
}

//特殊的抽象类，完全抽象的，叫做接口
interface Mymath{

    double pi=3.1415926;//这是一个常量，前面自动加：public static final-----------常量必须赋值

    int sum(int a,int b);//抽象方法

    int sub(int a,int b);//抽象方法


}

//编写这样一个类（这个类是一个“非抽象”的类）
//这个类的名字是随意的；

/*
class MymathImpl implements Mymath{//java: MymathImpl不是抽象的, 并且未覆盖Mymath中的抽象方法sub(int,int)
}
*/

//修正：
class MymathImpl implements Mymath{
    //覆盖、重写、实现  接口中的方法
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    //注意，不能省略public;------知识点：子类继承父类的时候，访问权限只能更高，不能更低；这里父类的访问权限已经是public（最高的），所以子类只能也是public
    /*int sub(int a,int b){//java: MymathImpl中的sub(int,int)无法实现Mymath中的sub(int,int)
                            //正在尝试分配更低的访问权限; 以前为public
        return a-b;
    }*/

    public MymathImpl() {
    }
}