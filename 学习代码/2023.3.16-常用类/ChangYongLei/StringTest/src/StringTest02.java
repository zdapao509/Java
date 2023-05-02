/*
通过此方法：证明String类型的比较，不能用==,应该用equals方法

String类已经重写了Object中的equals方法
* */
public class StringTest02 {
    public static void main(String[] args) {
        String a="aaa";
        //aaa 是存储在方法区的字符串常量池中的，所以  这个  aaa  是不会新建的，因为这个对象已经存在了；
        String b="aaa";
        //也就是说，只是将 aaa  这个对象在字符串常量池中的内存地址赋给  a 和 b 这两个引用；
        System.out.println(a==b);//返回的是 true  因为指向同一个内存地址

        String c=new String("xyz");
        String d=new String("xyz");
        System.out.println(c==d);//返回结果是false 因为，此时 c 和 d 这两个引用中存的是创建的 String对象在堆内存中的地址，
        // 而String对象里面存的 是  xyz 这个字符串在方法区中的字符串常量池中的 内存地址

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        System.out.println("xyz".equals(c));
        //为什么 "xyz"  这个字符串可以加  .  呢？
        // 因为任何一个字符串都是一个String类型的对象。你在写一个字符串的时候，实际上就已经创建了一个字符串对象，
        // 这个对象存在 方法区的字符串常量池中，对象就有原String类里面提供的方法，而String类已经对父类Object中的equals方法进行了重写，所以可以调用

//        比较一个 变量 和 字符串 是否相等的时候，最好将 字符串 写在前面；这样可以避免变量为空 或者为 null 的时候，
//        里面没有存数据，不知道指向哪个对象，更不知道对象里面有什么方法，出现  空指针异常

        String e=null;
        System.out.println(e.equals("xyz"));//NullPointerException---空指针异常
    }
}
