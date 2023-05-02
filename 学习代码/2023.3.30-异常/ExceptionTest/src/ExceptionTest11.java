/*
finally语句块是有很高的优先级的。

    try语句不能单独使用

    try finally语句是可以联合使用de

* */

public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        以下代码执行顺序：
            先执行try
            然后执行finally
            最后执行try中的return
        * */
        try{
            System.out.println("helloWorld!");
            return;
        }finally {
            System.out.println("***********");
        }

//        System.out.println("///////////////////////");java: 无法访问的语句--------如果上面的try中有return，这里不执行
    }
}
