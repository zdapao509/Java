/*
子类能否继承父类的私有属性？

		子类不能继承父类的私有属性，但是如果子类中公有的方法影响到了父类私有属性，

		那么私有属性是能够被子类使用的。

		也就是说：私有化的属性，如果父类留下了set和get方法，子类就可以通过调用set来修改父类的私有化属性
		通过get来读取父类的私有化属性
*/

public class Test02{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setPrivateName("dog set animal 的 私有属性");
        System.out.println(dog.getPrivateName());

    }
}

//父类
class Animal{
    //父类私有属性
    private String privateName = "私有名字";
	//get 和 set方法
    public String getPrivateName() {
        return privateName;
    }
    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }
}
//子类
class Dog extends Animal{
    public Dog() {
    }
}

