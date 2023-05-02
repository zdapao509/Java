package ass;

import org.test01;

public class test02 extends User03{

    public static void main(String[] args) {
        test01 t=new test01();
    }

    private int id;

    public int age;
//    protected int weight;

    String name;

    public void sss(){
//        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.weight);
        System.out.println(this.name);//可以看到，同包下是可以访问父类的默认的访问权限修饰的属性的
    }
}


class User03{
    private int id;
    public int age;
    protected int weight;
    String name;

}