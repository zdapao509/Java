package com.bjpowernode.chapter.array;
/**
 * 作业30的目的是锻炼接口的使用过程，这里重写一次
 *
 * 当转换成接口的时候，接口的抽象方法的实现是对应的Weapon1类里面的子类中重写的此接口的方法
 *
 * 同时：类在进行强制类型转换的过程中，如果是类转换成了接口类型，那么类和接口之间不需要存在继承关系，也可以转换。java中允许这样写
 */

public class homeWork40 {
    public static void main(String[] args) {
        Army1 army1=new Army1(3);
        try {
            army1.atackAll();
            army1.moveAll();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        GaoShePao gao=new GaoShePao();
        WuZiFighter wuzi=new WuZiFighter();
        Tank tank=new Tank();
        Tank tank2=new Tank();

        try {
            army1.addWeapon(gao);
            army1.addWeapon(wuzi);
            army1.addWeapon(tank);
            army1.addWeapon(tank2);
        } catch (MyException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            army1.atackAll();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            army1.moveAll();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

class Army1{
    private Weapon1[] weapon1;
    private int maxSize;
    private int count=-1;
    public Army1(){}
    public Army1(int maxSize){
        this.maxSize=maxSize;
        weapon1=new Weapon1[this.maxSize];
        System.out.println("初始化成功，武器最大数量："+this.maxSize);
    }

    public void addWeapon(Weapon1 weapon) throws MyException{
        if(count==this.maxSize-1){
            throw new MyException("数组已满");
        }
        weapon1[++count]=weapon;
        System.out.println("添加成功,此时count="+count);
    }

    public void atackAll() throws MyException {
        if (count == -1) {
            throw new MyException("武器为空，可攻击为空");
        }

        int atackNum=0;

        for (int i = 0; i <=count; i++) {
            if(weapon1[i] instanceof atackAvailable1){
                //这里发现：当转换成接口的时候，接口的抽象方法的实现是对应的Weapon1类里面的子类中重写的此接口的方法
                atackAvailable1 aa=(atackAvailable1)weapon1[i];
                aa.atackAll();
                atackNum++;
            }
        }

        if (atackNum == 0) {
            System.out.println("没有可攻击的武器");
        }else{
            System.out.println("结束，可攻击武器数量为："+atackNum);
        }
    }

    public void moveAll() throws MyException {
        if (count == -1) {
            throw new MyException("武器为空，可移动为空");
        }
        int moveNum=0;

        for (int i = 0; i <=count; i++) {
            if(weapon1[i] instanceof moveAvailable1){
                moveAvailable1 bb=(moveAvailable1)weapon1[i];
                bb.moveAll();
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

class Weapon1{
}

interface moveAvailable1{
    void moveAll();
}

interface atackAvailable1{
    void atackAll();
}

class Tank extends Weapon1 implements moveAvailable1,atackAvailable1{
    public void moveAll(){
        System.out.println("坦克移动");
    }
    public void atackAll(){
        System.out.println("坦克攻击");
    }
}

class WuZiFighter extends Weapon1 implements moveAvailable1{

    @Override
    public void moveAll() {
        System.out.println("物资运输机起飞");
    }
}

class GaoShePao extends Weapon1 implements atackAvailable1{

    @Override
    public void atackAll() {
        System.out.println("高射炮打击");
    }
}