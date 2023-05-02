/*
1.java中8种基本数据类型对应8种包装类型，8中包装类属于引用数据类型
2.思考：
    为什么提供8种包装类？
    因为8种基本数据类型不够用，所以SUN公司又提供了8种包装类型

* */
public class IntegerTest01 {
    public static void main(String[] args) {
        //有没有这样的需求，需要调用doSome 方法时，传一个数字进去
//        但是数字属于基本数据类型，而doSome方法参数的类型是：引用数据类型---Object
//        可见doSome方法无法接受基本数据类型的数字。所以怎么办？------可以传一个数字对应的包装类进去

//        把100这个数字经过包装类中的构造方法，包装成对象
        Package myInt=new Package(200);
        doSome(myInt);
    }
    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}

class Package{//模拟包装类
    private int i;
    public Package(){}
    public Package(int i){
        this.i=i;
    }

    @Override
    public String toString() {
        return String.valueOf(this.i);//静态方法，通过类调用
        // -----将非字符串转换为字符串，这里的参数就不是引用了，是基本数据类型

        //在println（）函数里面为一个Package类型的引用的时候，会自动调用valueOf方法（参数是引用数据类型时--这里是该引用），
        // valueOf方法又会调用该引用的toString方法，然后toString方法调用valueOf方法（这里是基本数据类型），
        // 直接转换成对应的字符串类型并返回。最终返回该引用的int类型的数据转换成字符串类型的数据
    }
}