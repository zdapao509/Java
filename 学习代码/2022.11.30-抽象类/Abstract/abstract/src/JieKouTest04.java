/*
�̳к�ʵ�ֶ����ڵĻ�������Ӧ����ôд��
    extends�ؼ�����ǰ�棻
    implements �ؼ����ں��棻

* */



public class JieKouTest04 {
    public static void main(String[] args) {
        //�������󣺱��濴Animal01��û������
        Flyable f=new Cat01();
        f.fly();

        Flyable ff=new Pig();
        ff.fly();

        Animal01 a=new Cat01();//���ֻ����һ�䣬�Ǿ���û������ģ����϶�̬�﷨
        //a.fly();//���Ǽ���һ��ͻᱨ����̬�ڱ���׶Σ���Ҫ��Animal01����������fly����,��Ȼ��Animal01������û�����������������---------����Animal01������Ҳ�з���fly
    }
}

//--------------------------------------

//���࣬������
class Animal01{

}

//�ɷ���Ľӿڣ���һ�Գ��
//�ܲ�εľ��ǽӿڣ�û�нӿ����޷����
//�ڴ����嵽�����ϣ�����֮���нӿڣ��ڴ������Ը�����
//�ӿ�ͨ����ȡ������Ϊ����

interface Flyable{
    void fly();
}

//���ࣺè
//Flyable��һ���ӿڣ���һ�Գ��Ľӿڣ�ͨ���ӿڲ嵽è���ϣ���è��Ŀ��Է���
class Cat01 extends Animal01 implements Flyable{
    public void fly(){
        System.out.println("һֻ��ɵ�è");
    }
}


//���ࣺ���ࡢ
//����㲻��������ɣ����Բ�ʵ�����Flyable �Ľӿڣ�
//û��ʵ������ӿڱ�ʾ��û�г��û�и�������㲻�ܷɣ�
class Snake extends Animal01{}

//���ࣺ��
//�����ɾ͸�������Ҳ����ʵ���������
class Pig extends Animal01 implements Flyable{
    public void fly(){
        System.out.println("һֱ��ɵ���");
    }
}

//���ࣺû�м̳�Animal01��Ļ���
class Fish implements Flyable{
    public void fly(){
        System.out.println("������");
    }
}

//ʵ���ϴ������м̳���������Object��
class Fish01 extends Object implements Flyable{
    public void fly(){
        System.out.println("�̳��������ڵ���");
    }

}



