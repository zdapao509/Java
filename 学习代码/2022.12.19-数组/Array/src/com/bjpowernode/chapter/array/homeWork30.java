package com.bjpowernode.chapter.array;
/**
 * 写一个类Army，代表一致军队，这个类中有一个属性Weapon数组w(用来存储军队所拥有的所有的武器)
 * 该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量，并用这一大小来初始化数组w
 *
 * 该类还提供一个方法addWeapon(Weapon wa),表示把参数wa所代表的武器加入到数组w中，
 *
 * 在这个类中还定义两个方法，attackAll()让数组w中的所有武器攻击。
 *
 * 以及moveAll（）让数组w中的所有可移动武器移动
 *
 * 写一个主方法去测试上面的程序
 *
 * 提示：
 *      Weapon是一个父类，应该有很多子武器
 *
 *      这个子武器应该有一些是可移动的，有一些是可攻击的
 *
 */
public class homeWork30 {
    public static void main(String[] args) {
        Army army=new Army(5);
        army.atackAll();
        army.moveAll();

        moveAvailable a=new moveAvailable();
        moveAvailable b=new moveAvailable();
        moveAvailable c=new moveAvailable();
        moveAvailable d=new moveAvailable();
        moveAvailable e=new moveAvailable();
        moveAvailable f=new moveAvailable();

        atackAvailable g=new atackAvailable();
        atackAvailable h=new atackAvailable();
        atackAvailable i=new atackAvailable();

        try {
            army.addWeapon(a);
            army.addWeapon(b);
            army.addWeapon(c);
            army.addWeapon(g);
            army.addWeapon(h);
            army.addWeapon(i);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        army.atackAll();
        army.moveAll();
    }
}

class Army{
    private Weapon[] wea;
    private int maxSize;

    private int count=-1;
    public Army(){}
    public Army(int maxSize){
        this.maxSize=maxSize;
        this.wea=new Weapon[this.maxSize];
        System.out.println("数组初始化成功，最大允许武器数量："+this.maxSize);
    }

    public void addWeapon(Weapon weapon) throws MyException{
        if(count==this.maxSize-1){
            throw new MyException("数组已满");
        }
        wea[++count]=weapon;
        System.out.println("添加成功,此时count="+count);
    }

    public void atackAll(){
        if (count == -1) {
            System.out.println("武器为空，可攻击+可移动都为空");
        }

        int atackNum=0;

        for (int i = 0; i <=count; i++) {
            if(wea[i] instanceof atackAvailable){
                System.out.println(wea[i]);
                atackNum++;
            }
        }

        if (atackNum == 0) {
            System.out.println("没有可移动的武器");
        }else{
            System.out.println("结束，可攻击武器数量为："+atackNum);
        }
    }

    public void moveAll(){
        if (count == -1) {
            System.out.println("武器为空，可攻击+可移动都为空");
        }
        int moveNum=0;

        for (int i = 0; i <=count; i++) {
            if(wea[i] instanceof moveAvailable){
                System.out.println(wea[i]);
                moveNum++;
            }
        }

        if (moveNum == 0) {
            System.out.println("没有可移动的武器");
        }else{
            System.out.println("结束，可移动武器数量："+moveNum);
        }
    }
}

class Weapon{

}

class moveAvailable extends Weapon{
    public String toString(){
        return "移动1次";
    }
}

class atackAvailable extends Weapon{
    public String toString(){
        return "攻击一次";
    }
}
