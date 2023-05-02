/*
获取自1970年1月1日00:00:00 000到当前系统时间的总毫秒数----------用于统计代码的运行时间


总结：
    System类的相关属性和方法：
        System.out             out 是System的静态变量
        System.out.println()         println不是System类的，是PrintStream类的方法
        System.gc()   建议启动垃圾回收机制
        System.currentTimeMills() 获取1970 1 1 到系统当前时间的总毫秒数
        System.exit(0) 退出JVM
* */
public class DateTest02 {
    public static void main(String[] args) {
//        获取自1970年1月1日00:00:00 000到当前系统时间的总毫秒数
        long nowTimeMillis=System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1679922598917

//        可以用于统计一个方法的用时，在调用目标方法之前记录一次时间
        long begin=System.currentTimeMillis();
        print();
//        执行方法之后再调用一次记录毫秒数
        long end=System.currentTimeMillis();
        System.out.println("用时："+(end-begin));
    }

    public static void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
