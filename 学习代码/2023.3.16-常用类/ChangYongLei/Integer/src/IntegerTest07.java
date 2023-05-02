/*
Integer int String 三种类型的转换
* */
public class IntegerTest07 {
    public static void main(String[] args) {
//        int-->String
        System.out.println(123+"");//输出为字符串
        String i=String.valueOf(123);

//        Stirng --->int
        int j=Integer.parseInt("123");
        System.out.println(j);//123

//        int--->Integer
        Integer k=100;//自动装箱
        Integer l=Integer.valueOf(100);

//        Integer--->int
        int m=k.intValue();
        int n=l;//自动拆箱

//        Integer---->String
        String o=String.valueOf(k);

//        String ---->Integer
        Integer p=Integer.valueOf("123");
    }
}
