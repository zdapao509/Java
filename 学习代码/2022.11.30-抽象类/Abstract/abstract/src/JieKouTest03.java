/*
接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？

    对于计算机来讲，一个机箱上有很多接口，包括键盘接口、鼠标接口等等

重点：一个类可以同时实现多个接口；

这种机制弥补了java中的那个缺陷？
    java中类和类只支持单继承，实际上单继承是为了简单而出现的，现实世界中存在多继承，java的接口弥补了单继承带来的缺陷。

接口U和V之间虽然没有继承关系，但是写代码的时候，可以互相转换，编译器没有意见，但是运行时可能会报错，ClassCastException

之前有一个结论：
    无论是向上转型还是向下转型，两种类型之间必须要有继承关系，没有继承关系，编译器就会报错了，------------------这句话不适用于接口方面；编译阶段是可以转型的，

                                                       运行阶段：类型转换异常（运行阶段，要看引用指向的对象类型与强转目标的类型是否有继承关系，没有就报错）

    最终实际上还是和之前一样，需要加instanceof运算符进行判断，向下转型养成好习惯，转型之前先  if instanceof 进行判断；
* */

public class JieKouTest03 {
    public static void main(String[] args) {

//-----------------------------------------------------
        V v=new W();
//        U u=(U)v;//向下转型：类型转换异常---------经过测试，接口和接口之间在进行强制类型转换的时候，编译阶段：没有继承关系也可以进行强制类型转换，
        //但是一定要注意，运行阶段：可能出现类型转换异常java.lang.ClassCastException
        // 编译没问题，运行有问题
        // Exception in thread "main" java.lang.ClassCastException: class W cannot be cast to class U (W and U are in unnamed module of loader 'app')
        //at JieKouTest03.main(JieKouTest03.java:15)
        //可做如下修改：
        if(v instanceof U){//引入instanceof语句进行判断，只有引用  v  指向的对象是 U 类型的，才能进行向下转型，做如下的变化；
            U u=(U)v;
        }


//-----------------------------------------------------
        D1 d1=new D4();
        D2 d2=new D4();
        D3 d3=new D4();

        //int cc=d1.m3();//报错： 这里的m3是D3类的方法，而D1类型的引用d1没有办法访问； java: 找不到符号    符号:   方法 m3()     位置: 类型为D1的变量 d1
//-----------------------------------------------------
        //可以利用强制类型转换实现这个过程：
        D3 d1_1=(D3)d1;//我的理解是：d1指向的对象是D4（）类型的，而D4和D3之间存在继承关系，所以编译不报错，可以强转
        //接口转型（调用其他接口中的方法，需要转型）：这个编译没有问题，运行也没有问题-----------这是因为，编译阶段即使没有继承关系，也可以进行，所以编译阶段没问题；
                                                        // 运行阶段，d1指向的对象是D4类型的，而D4和D3之间又具有继承关系，所以也可以运行
        int aa=d1_1.m3();
        System.out.println(aa);

//-----------------------------------------------------
        //也可以直接一步到位，直接转换成子类D4类：向下转型，强制类型转换
        D4 d4=(D4)d1;
        System.out.println(d4.m3());

    }
}

interface U{}
interface V{}
class W implements V{

}

//class R extends V implements U {}------------注意这样写是不对的，这里的extends后面只能写同样的非抽象类或抽象类；implements才是实现接口的方法
//class T extends U{}-----------类不能继承接口，要实现接口

//-----------------------------------------------------

interface X{}
interface Y{}
interface Z extends X,Y{};//接口和接口之间支持多继承

//-----------------------------------------------------


interface D1{
    int m1();
}
interface D2{
    int m2();
}
interface D3{
    int m3();
}
//实现多个接口其实就类似于多继承
class D4 implements D1,D2,D3{
    @Override
    public int m1() {//实现接口D1中的方法m1();
        return 0;
    }

    @Override
    public int m2() {//实现接口D2中的方法m2();
        return 0;
    }

    @Override
    public int m3() {//实现接口D3中的方法m3();
        return 0;
    }
}

