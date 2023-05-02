/*
1.8种基本数据类型的包装类：

    基本数据类型         包装类型
    ------------------------------
    byte                 java.lang.Byte（父类Number）
    short                java.lang.Short（父类Number）
    int                  java.lang.Integer（父类Number）
    long                 java.lang.Long（父类Number）
    float                java.lang.Float（父类Number）
    double               java.lang.Double（父类Number）
    boolean              java.lang.Boolean（父类Object）
    char                 java.lang.Character（父类Object）

2.以上的8中包装类，重点以java.lang.Integer为代表学习，其他参照

3.八种基本数据类型中的6种父类都是Number，可以先研究Number中的公共的方法：
    Number属于抽象类，无法实例化对象；
    Number类中有这样的方法：
    byte          byteValue() 返回指定号码作为值 byte ，这可能涉及舍入或截断。
    abstract      double doubleValue() 返回指定数字的值为 double ，可能涉及四舍五入。
    abstract      float floatValue() 返回指定数字的值为 float ，可能涉及四舍五入。
    abstract      int intValue() 返回指定号码作为值 int ，这可能涉及舍入或截断。
    abstract      long longValue() 返回指定数字的值为 long ，可能涉及四舍五入或截断。
    short         shortValue() 返回指定号码作为值 short ，这可能涉及舍入或截断。

    这些方法在包装类的子类中都有 ，这些方法是负责拆箱的。


* */
public class IntegerTest02 {
    public static void main(String[] args) {
//        123这个基本数据类型，进行构造方法的包装达到了。基本数据类型向引用数据类型的转换。
//        装箱：基本数据类型--->引用数据类型
//        （实际上，就是将123作为整数存进了一个包装类的对象，把这个对象的内存地址传给了一个引用，
//        用这个引用代表了这个基本数据类型；也就是装箱）
        Integer i=new Integer(123);//划掉：代表过时

//        将引用数据类型转换为基本数据类型：拆箱
        float f =i.floatValue();
        System.out.println(f);//123.0

        int j=i.intValue();
        System.out.println(j);//123
    }
}
