public class StringTest03 {
    public static void main(String[] args) {

        /*
        * 这里面一共创建了几个对象？--------------3个对象
        *
        * 包括： "aaa"在方法区字符串常量池中的对象---1
        *        堆内存中的两个String对象---------2
        * */
        String a=new String("aaa");
        String b=new String("aaa");

    }
}
