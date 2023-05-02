/*
枚举：一枚一枚可以列举出来。才建议使用枚举类型
枚举编译之后也生成class文件
枚举也是一种引用数据类型
枚举中的每一个值可以看成是常量

枚举类型怎么定义的？
    enum 枚举类型名{
        枚举值1，枚举值2
    }

一个函数的返回结果只有两种情况，建议使用布尔类型，

    超过两种情况建议枚举，例如：颜色，四季，星期。。。

* */

public class EnumTest02 {
    public static void main(String[] args) {
        Result r=divide(10,0);
        System.out.println(r==Result.SUCCESS?"计算成功":"计算失败");
    }
    public static Result divide(int a,int b){//这种方法比较合理，但是只有两种情况。实际问题中，出现的不只是两种情况，所以使用受到限制-----考虑引入枚举
        try{
            int c=a/b;
            return Result.SUCCESS;
        }catch(Exception e){
            return Result.FAIL;
        }
    }
}

enum Result {
//    SUCCESS 是枚举Result中的一个值
//    FAIL 是枚举Result中的一个值
//    枚举中的每一个值，可以看成是“常量“
    SUCCESS,FAIL
}