/*
枚举类型：是一个常用类

       注意：这个代码没有用枚举类型，以下代码设计上有什么问题？

        设计缺陷：divide方法的返回值类型上，不恰当，既然最后的结果只是成功失败，最好使用Boolean类型。

        因为Boolean类型整好可以表示两种不同的状态
* */
public class EnumTest01 {
    public static void main(String[] args) {
        boolean a=divide(5,3);
        System.out.println(a);

        boolean b=divide(10,0);
        System.out.println(b);
    }
/*    public static int divide(int a,int b){//设计缺陷：divide方法的返回值类型上，不恰当，既然最后的结果只是成功失败，
                                                            //最好使用Boolean类型。因为Boolean类型整好可以表示两种不同的状态
        try{
            int c=a/b;
            return 1;
        }catch(Exception e){
            return 0;
        }
    }*/


    public static boolean divide(int a,int b){//这种方法比较合理，但是只有两种情况。实际问题中，出现的不只是两种情况，所以使用受到限制-----考虑引入枚举
        try{
            int c=a/b;
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
