/*
* 模拟简单计算器：
* 定义Number的类；其中有两个整形数据成员n1和n2应声明为私有
* 编写构造方法赋予n1和n2初始值
* 再为该类添加addition（）、subtration()、multiplication（）、division（）等公有实例方法；
* 分别对两个成员执行加减乘除的运算
* */
public class HomeWork1 {
    public static void main(String[] args) {
        Number a=new Number(0,2);
        System.out.println(a.addition());
        System.out.println(a.subtration());
        a.multiplication();
        a.division();
        System.out.println(47/24);
    }
}

class Number{
    //私有化属性
    private int n1;
    private int n2;
    //构造方法
    public Number() {
    }
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //setter和getter

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //加法
    public int addition(){
        return n1+n2;
    }
    //减法
    public int subtration(){
        return n1-n2;
    }
    //乘法
    public void multiplication(){
        System.out.println(this.getN1()+"*"+this.getN2()+"="+(getN1()*getN2()));
    }
    //除法
    public void division(){
        if(n2==0){
            System.out.println("除数不能为0");
            return;
        }
        System.out.println(this.getN1()+"/"+this.getN2()+"="+((double)getN1()/(double)getN2()));
    }
}

