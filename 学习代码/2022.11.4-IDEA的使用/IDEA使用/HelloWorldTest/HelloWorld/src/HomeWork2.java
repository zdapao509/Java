/*
* 显示人的姓名和年龄
* 定义一个Person类，有两个私有化属性name和age
* 构造方法初始化name和age
* 定义方法显示年龄和名字
* main方法实例化一下，显示信息
* */
public class HomeWork2 {
    public static void main(String[] args) {
        Person a=new Person("张威明",18);
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

    //构造方法

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //显示程序
    public void Display(){
        System.out.println("姓名："+name+"\n年龄："+age);//这里注意。换行符是\n，不是/n；且只能写在字符串里，要有""包围
    }
}
