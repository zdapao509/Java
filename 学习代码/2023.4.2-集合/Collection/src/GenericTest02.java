/*
自定义泛型可以吗？

    可以

    自定义泛型的时候 ，<>中的是一个标识符，随便写。

    java源代码中经常出现的泛型标识符是：   <E>  和  <T>  E代表的是element T代表的是Type单词首字母
* */

public class GenericTest02<E> {
    public void doSome(E e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        GenericTest02<String> a=new GenericTest02<>();//new对象的时候指定的泛型是String类型的，所以doSome方法只能添加字符串
        a.doSome("只能存字符串");

        GenericTest02<Integer> b=new GenericTest02<>();
        b.doSome(123);

        MyIterator<String> c=new MyIterator<>();
        String cc=c.get();
        System.out.println(cc);//null

        MyIterator d=new MyIterator();//如果不是泛型：就是Object类型
        Object dd=d.get();
        System.out.println(dd);//null
    }
}

class MyIterator<T>{
    public T get(){
        return null;
    }
}
