/*
����������⣺

    ���һ���ʼǱ������࣬�������⣬���ҽ�������˽�л��������ṩ������set��get����

    ���һ���ɲ�εĽӿڣ�InsertDrawable,�ýӿ���ʲô�������ж��塣

    ���һ������ࡣʵ��InsertDrawable�ӿڣ���ʵ�ַ�����

    ���һ�������ࡣʵ��InsertDrawable�ӿڣ���ʵ�ַ�����

    ���һ����ʾ���ࡣʵ��InsertDrawable�ӿڣ���ʵ�ַ�����

    ���һ����ӡ���ࡣʵ��InsertDrawable�ӿڣ���ʵ�ַ�����


    ��"�ʼǵ�����"����һ��InsertDrawable�ӿ����ԣ������ñʼǱ����Կɲ����ꡢ���̡���ʾ������ӡ����

    ��д���Գ��򣬴�������ӿڣ���ʾ�ӿڵ����á�

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
        System.out.println("�����");
    }
}

class JianPan implements InsertDrawable{
    public void Divice(){
        System.out.println("����");
    }
}

class XianShiQi implements InsertDrawable{
    public void Divice(){
        System.out.println("��ʾ��");
    }
}

class Printer implements InsertDrawable{
    public void Divice(){
        System.out.println("��ӡ��");
    }
}
