/*
之前讲的方法覆盖的时候，留下的问题：

    重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的异常，可以更少，可以原样抛出，也可以不抛出


总结：异常中常用的关键字：

    异常捕捉：

        try

        catch

        finally

    throws  在方法声明位置上使用，表示上报异常信息给调用者

    throw   手动抛出异常
* */

public class ExceptionTest16 {
    public static void main(String[] args) {

    }
}

class AA{
    public void doSome() throws Exception{

    }

    public void doOther(){

    }
}

class BB extends AA{

/*   public void doSome(){//可以不抛出异常

   } */

/*   public void doSome() throws NullPointerException{//可以抛出父类方法抛出异常的子类异常

    }*/

    public void doSome() throws Exception{//可以原样抛出

    }

/*    public void doOther() throws Exception{//父类不抛出异常，子类不抛出
        super.doOther();
    }*/
}
