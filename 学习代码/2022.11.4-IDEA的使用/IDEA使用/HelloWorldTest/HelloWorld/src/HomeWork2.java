/*
* ��ʾ�˵�����������
* ����һ��Person�࣬������˽�л�����name��age
* ���췽����ʼ��name��age
* ���巽����ʾ���������
* main����ʵ����һ�£���ʾ��Ϣ
* */
public class HomeWork2 {
    public static void main(String[] args) {
        Person a=new Person("������",18);
        a.Display();
        Person b=new Person();
        b.Display();
    }
}

class Person{
    private String name;
    private int age;
    //setter getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //���췽��

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //��ʾ����
    public void Display(){
        System.out.println("������"+name+"\n���䣺"+age);//����ע�⡣���з���\n������/n����ֻ��д���ַ����Ҫ��""��Χ
    }
}
