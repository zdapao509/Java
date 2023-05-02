/*
关于Integer类的构造方法，有两个----其他包装类相同

    Integer(int);
    Integer(String);

* */

public class IntegerTest03 {
    public static void main(String[] args) {
        Integer x=new Integer(123);
        System.out.println(x);//将数字100转换成Integer包装类型（int-->Integer）

//        将String类型的数字转成Integer包装类型。string--->Integer
        Integer y=new Integer("123");
        System.out.println(y);
    }
}
