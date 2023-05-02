/*
开放型设计题：

    设计一个笔记本电脑类，属性随意，并且进行属性私有化，对外提供公开的set和get方法

    设计一个可插拔的接口，InsertDrawable,该接口有什么方法自行定义。

    设计一个鼠标类。实现InsertDrawable接口，并实现方法，

    设计一个键盘类。实现InsertDrawable接口，并实现方法，

    设计一个显示器类。实现InsertDrawable接口，并实现方法，

    设计一个打印机类。实现InsertDrawable接口，并实现方法，


    在"笔记电脑类"中有一个InsertDrawable接口属性，可以让笔记本电脑可插拔鼠标、键盘、显示器、打印机等

    编写测试程序，创建多个接口，演示接口的作用。

    * */

public class Homework {
    public static void main(String[] args) {
        Desktop desktop=new Desktop(new JianPan());
        desktop.getInsert().Divice();
        InsertDrawable aa=new Mouse();
        Desktop bb=new Desktop();
        bb.setInsert(aa);
        bb.getInsert().Divice();
    }
}

class Desktop{
    private InsertDrawable insert;
    public void setInsert(InsertDrawable insert){
        this.insert=insert;
    }
    public InsertDrawable getInsert(){
        return insert;
    }
    public Desktop(){}

    public Desktop(InsertDrawable insert){
        this.insert=insert;
    }
}

interface InsertDrawable{
    void Divice();
}

class Mouse implements InsertDrawable{
    public void Divice(){
        System.out.println("鼠标类");
    }
}

class JianPan implements InsertDrawable{
    public void Divice(){
        System.out.println("键盘");
    }
}

class XianShiQi implements InsertDrawable{
    public void Divice(){
        System.out.println("显示器");
    }
}

class Printer implements InsertDrawable{
    public void Divice(){
        System.out.println("打印机");
    }
}
