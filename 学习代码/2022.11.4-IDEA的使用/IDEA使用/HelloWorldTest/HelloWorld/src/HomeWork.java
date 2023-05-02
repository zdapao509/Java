/*
* 请定义一个交通工具（vehicle）类：
* 其中有属性：
*   速度speed
*   体积size
* 其中有方法：
*   移动move（）
*   设置速度setSpeed(int speed)
*   加速speedUp();
*   减速speedDown()等
*
* 最后在测试类Vehicle中实例化一个交通工具的对象，并通过方法给他初始化speed以及size值并打印出来
* 另外调用加减速的方法对速度进行修改。
* */
public class HomeWork {
    //实例变量
    private int speed;
    private int size;
    //setter和getter方法
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    //有参数构造方法
    public HomeWork(int speed, int size) {
        this.speed = speed;
        this.size = size;
        System.out.println("初始化speed:"+speed+";初始化size："+size);
    }
    //无参数构造方法
    public HomeWork() {
    }

    //加速方法
    public void speedUp(int speedup){
        System.out.println("此时速度："+(this.speed+speedup));
        setSpeed(this.speed+speedup);
        //return this.speed+speedup
        //这里的返回值是一个this.speed和speedup的和，但是这里并没有改变speed属性本身的值，要改变
        //speed的值，需要调用setSpeed函数，或者直接在这里用this.speed=this.speed+speedup;
    }


    //减速方法
    public void speedDown(int speeddown){
        System.out.println("此时速度："+(this.speed-speeddown));
        this.speed=this.getSpeed()-speeddown;
    }

    //主方法，实例化对象
    public static void main(String[] args) {
        HomeWork a=new HomeWork(100,20000);
        a.speedUp(20);
        System.out.println("当前速度："+a.getSpeed());
        a.speedDown(30);
        System.out.println("当前速度："+a.getSpeed());
        HomeWork a1=new HomeWork();
        a1.setSpeed(120);
        System.out.println("此时时速："+a1.getSpeed());
        a1.speedUp(20);
    }
}
