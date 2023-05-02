package com.bjpowernode.chapter.array;
//一位数组的深入：数组中存储的类型是：引用数据类型
//对于数组来说：实际上智能存储java对象的内存地址，数组中存储的每个元素是引用；
public class ArrayTest07 {
    public static void main(String[] args) {
        //
        int[] a={100,200,30};
        System.out.println(a[1]);

        int[] array={1,23,1};
        for (int i = 0; i < array.length; i++) {
           /* int temp=array[i];
            System.out.println(temp);//等效于下面的写法*/
            System.out.println(array[i]);
        }

//        创建一个Aniaml对象
        Aniaml a1=new Aniaml();
        Aniaml a2=new Aniaml();
        Aniaml[] aniamls={a1,a2};
        for (int i = 0; i < aniamls.length; i++) {
            /*Aniaml aa=aniamls[i];
            aa.move();*///也可以写成以下的合并形式：
            aniamls[i].move();
        }

//        动态初始化一个长度为2的Animal类型数组:
        Aniaml[] aaa=new Aniaml[2];
//        创建一个Animal类型对象放在数组第一个位置：
        Aniaml aa1=new Aniaml();
        aaa[0]=aa1;

        Prodect b=new Prodect();
//        aaa[1]=b;报错原因：Aniaml数组中只能放Aniaml类型的引用，不能放Prodect类型

        aaa[1]=new Cat();//这里就不报错：原因是Cat是Aniaml的子类，所以可以存放子类中的数据



//        创建一个Aniaml类型的数组，存Cat Bird类型的引用
        Cat cat=new Cat();
        Bird bird=new Bird();
        Aniaml[] aniamls1={cat,bird};

//        也可以：Aniaml[] aniamls1={new Cat(),new Bird()};---------数组中存的是两个对象的内存地址

        for (int i = 0; i < aniamls1.length; i++) {
//            这里遍历aniamls1这个数组，取出来的可能是Cat 也可能是Bird,不过肯定是一个Aniaml
//            若果调用的方法是父类型中存在的方法，那就不需要向下转型，直接父类型的引用调用即可
            aniamls1[i].move();
//            也可以写成：
            Aniaml aaaa=aniamls1[i];
            aaaa.move();

            /*执行结果：父类型的引用指向了子类型的对象，多态机制
            * Cat move
                Cat move
                Bird move
                Bird move
            * */


//         如果调用的是父类Aniaml中没有的方法，子类型中特有的方法， 就需要向下转型
//            aniamls1[i].catchMouse();

            if (aniamls1[i] instanceof Cat) {
                Cat cat1 =(Cat)aniamls1[i];
                cat1.catchMouse();
            }else if(aniamls1[i] instanceof Bird){
                Bird bird1=(Bird)aniamls1[i];
                bird1.Fly();
            }
        }

//        Cat[] cats={new Aniaml(),new Cat()};-------这一句表明，子类创建的数组中是不能放父类引用的
//java: 不兼容的类型: com.bjpowernode.chapter.array.Aniaml无法转换为com.bjpowernode.chapter.array.Cat
    }
}

class Aniaml{
    public void move(){
        System.out.println("move execute");
    }
}
class Cat extends Aniaml{
    @Override
    public void move() {
        System.out.println("Cat move");
    }
    public void catchMouse(){
        System.out.println("Cat catchMouse");
    }
}
class Bird extends Aniaml{
    @Override
    public void move() {
        System.out.println("Bird move");
    }
    public void Fly(){
        System.out.println("Bird Fly");
    }
}
class Prodect{

}
