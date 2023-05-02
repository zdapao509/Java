/*
异常有两个重要的方法：

    获取异常简单的描述信息：

        String msg=exception.getMessage();

    打印异常追踪的堆栈信息：

        exception.printStackTrace();
* */
public class ExceptionTest08 {
    public static void main(String[] args) {
//        注意这里只是new出了异常对象，并没有进行抛出。JVM会认为这只是一个简单地java对象
        NullPointerException np=new NullPointerException("空指针异常嗯嗯嗯");
        String msg=np.getMessage();
        System.out.println(msg);//空指针异常嗯嗯嗯

        np.printStackTrace();//打印异常的追踪信息，
//        java后台打印异常的堆栈追踪信息的时候,采用的是异步线程的方式打印的

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}
