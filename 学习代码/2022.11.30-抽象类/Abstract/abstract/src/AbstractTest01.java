/*
类到对象是实例化；对象到类叫抽象

抽象类：
        1.什么是抽象类？

            类和类之间具有的共同的特征，将这些共同特征提取出来，形成的就是抽象类。
            类本身是不存在的，所以抽象类无法创建对象《无法进行实例化》

        2.抽象类属于什么类型？

            抽象类属于引用数据类型。

       3.抽象类怎么定义？

            语法：

                [修饰符列表] abstract class 类名{
                    类体；
                }

       4.抽象类是无法进行实例化的，无法创建对象，所以抽象类是用来被子类继承的。------------------天生就是用来被继承的

       5.final 和 abstract 不能联合使用，这两个关键词是对立的。

       6.抽象类的子类可以继续是抽象类

       7.抽象类无法进行实例化，但是抽象类有构造方法，这个构造方法是供子类使用的

       8.抽象类关联到一个新的概念：抽象方法；

            什么是抽象方法呢？       抽象方法： 表示没有实现的方法，没有方法体的方法。没有实现的方法。

            public abstract void doSome();

            抽象方法的特点是：
                1.没有方法体，以分号结尾
                2.前面修饰符列表中有abstract关键字；

       9.抽象类中不一定有抽象方法，但是抽象方法必须出现在抽象类或者接口中。
* */

public class AbstractTest01 {
    public static void main(String[] args) {
        //new Account();//错误： java: Account是抽象的; 无法实例化
    }
}

//银行账户类

/*
final abstract class Account{//错误：java: 非法的修饰符组合: abstract和final
}*/

abstract class Account{
    public Account() {//无参数构造方法-----如果写了有参数构造方法而没有无参数构造方法，则子类进行无参数构造方法的时候的super语句就找不到父类的无参数构造方法，报错
    }

    public Account(String s) {//有参数构造方法
    }

    public void doSome(){}//抽象类中可以有实例方法

    public abstract void withdraw();//抽象类中可以没有抽象方法，但是抽象方法只能出现在抽象类中----若果这里的Account类是非抽象类，报错：java: Account不是抽象的, 并且未覆盖Account中的抽象方法withdraw()
}


//非抽象子类继承父类，子类可以实例化对象

abstract class CreditAccount extends Account{//子类可以继续是抽象类，因为抽象类还可以继续抽象，所以抽象类的子类也可以是抽象类
//    对于子类是抽象类继承了父类的抽象类的话，即使父类中有抽象方法withdraw()，子类也可以不用去实现。
}

/*
class A extends CreditAccount{-----子类的子类还是要实现父类的抽象方法
--------------java: A不是抽象的, 并且未覆盖Account中的抽象方法withdraw()
}
* */



class CreditAccount01 extends Account{//错误：java: CreditAccount01不是抽象的, 并且未覆盖Account中的抽象方法withdraw()------------当上面的抽象类中存在抽象方法的时候，出现这个错误
    public CreditAccount01() {
        super();
    }
    public void withdraw(){
        System.out.println("12");
    }
}

class BS extends CreditAccount01{
//这里是为了证明：只要子类CreditAccount01已经实现了父类抽象类Account中的抽象方法，那么子类的子类也就是BS类就不用再去实现Account类中的抽象方法
}
