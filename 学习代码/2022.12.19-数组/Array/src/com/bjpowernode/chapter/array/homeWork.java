package com.bjpowernode.chapter.array;
/*
编写程序：使用一维数组，模拟栈的数据结构。
要求：
    1.这个栈可以存储java中任何引用类型的数据。
    2.在栈中提供push方法，模拟压栈，（栈满了，要有提示信息）---方法的参数以及返回值类型自己定义
    3.在栈中提供pop方法，模拟弹栈，（栈空了，也要有提示信息）---方法的参数以及返回值类型自己定义
    4.编写测试程序，new栈对象，调用push pop方法来模拟压栈和弹栈动作
    5.栈的容量可以直接给定，也可以通过构造方法，动态给定
* */


/*
向栈中储存元素，使用的是一维数组模拟，存在栈中就等于存到了数组中

因为数组是我们学习java的第一个容器

为什么选择Object类型的数组？----因为这个栈中可以存储java中的任何引用数据类型的数据

new A{}的数据可以放进去，new B{}的数据也可以放进去。因为A B 都有一个超级父类，就是Object

包括String也可以存进去，因为String父类也是Object

栈帧，永远指向栈的顶部，最初的栈是空的，一个值都没有
* */
public class homeWork {
    public static void main(String[] args) {
        myStack mm=new myStack(new Object[5]);//初始化栈帧，指定栈帧长度为5

        mm.push(new String("012012"));//字符串在java中有优待，不需要new，也是一个对象，
        mm.push(new String("hahah"));
        System.out.println(mm.getObj()[1]);
        mm.pop();
        System.out.println(mm.index);
        System.out.println(mm.getObj()[mm.index]);
        mm.pop();
        mm.pop();
        System.out.println(mm.index);//

        Animal a=new Animal();
        mm.push(a);
        mm.push(a);
        mm.push(a);
        mm.push(a);
        mm.push(a);
        mm.push(a);

    }
}

class myStack{
    private Object[] obj=new Object[5];//这里注意：程序一定要私有化进行封装！养成习惯----还有这里可以进行默认赋值，
    // 也可以通过构造方法灵活赋值
//    this.obj=new Object[5];注意赋值的时候，如果不再同一行进行赋值的话，不可以这样赋值，要写到构造方法里面去赋值

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    int index=-1;
    public myStack(Object[] obj){//初始化栈的容量，采用动态初始化的方式或者静态初始化的方式
        this.obj = obj;
        System.out.println("栈长度指定成功！栈最大空间为："+this.obj.length+"   指定栈的类型："+obj.getClass());
    }
    public void push(Object object){//可以放任何类型的数，那就直接用祖宗类
        if (index == obj.length-1) {//注意这里：不是obj.length，，如果栈容量是10，那指针指到9的时候，就满了
            System.out.println("栈已满");
            return;
        }
        obj[++index]=object;//栈帧放在最后，每压栈一次，index索引就加一，指向了最新的这个值
        System.out.println("压栈成功，压入："+obj[index]+"  栈帧指向："+index+"   压入栈的类型是："+object.getClass());
//        强调一下：所有的System.out.println()执行时，如果输出的是引用的话，自动调用引用的toString方法
    }
    public void pop(){
        if (index <0) {
            System.out.println("栈已空");
            return;
        }
        obj[index--]=null;//指针指的地方赋空值；再把索引值减一
        System.out.println("弹栈成功，弹出："+(index+1)+"  栈帧指向："+index);
    }

}

class Animal{
    @Override
    public String toString() {
        System.out.println(this.getClass().toString());
        return "Animal!"+this.getClass().toString();//这里不能直接写this.getClass（）方法，
//       因为这个方法返回值类型不是 String类型
    }

}
