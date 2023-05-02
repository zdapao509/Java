/*
关于遇到特殊的java面试题目：虽然return最后执行，但是输出的是100而不是101
* */
public class ExceptionTest13 {
    public static void main(String[] args) {
        System.out.println(m());//输出的是：100 而不是101
    }
/*
java语法规则：

    方法体中的代码必须自上而下执行，逐行执行；

    return语法一旦执行，整个方法必须结束。
* */
    public static int m(){
        int i=100;
        try{
//            这段代码出现在int i=100下面。所以最终结果一定是等于100.
            return i;
        }finally {
            i++;
        }
    }
}


/*
反编译结果：

    public static int m(){
        int i=100;
        int j=i;
        i++;
        return j;
    }
* */