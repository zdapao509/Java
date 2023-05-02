package com.bjpowernode.chapter.array;
/**
 * ��ҵ30��Ŀ���Ƕ����ӿڵ�ʹ�ù��̣�������дһ��
 *
 * ��ת���ɽӿڵ�ʱ�򣬽ӿڵĳ��󷽷���ʵ���Ƕ�Ӧ��Weapon1���������������д�Ĵ˽ӿڵķ���
 *
 * ͬʱ�����ڽ���ǿ������ת���Ĺ����У��������ת�����˽ӿ����ͣ���ô��ͽӿ�֮�䲻��Ҫ���ڼ̳й�ϵ��Ҳ����ת����java����������д
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
        System.out.println("��ʼ���ɹ����������������"+this.maxSize);
    }

    public void addWeapon(Weapon1 weapon) throws MyException{
        if(count==this.maxSize-1){
            throw new MyException("��������");
        }
        weapon1[++count]=weapon;
        System.out.println("��ӳɹ�,��ʱcount="+count);
    }

    public void atackAll() throws MyException {
        if (count == -1) {
            throw new MyException("����Ϊ�գ��ɹ���Ϊ��");
        }

        int atackNum=0;

        for (int i = 0; i <=count; i++) {
            if(weapon1[i] instanceof atackAvailable1){
                //���﷢�֣���ת���ɽӿڵ�ʱ�򣬽ӿڵĳ��󷽷���ʵ���Ƕ�Ӧ��Weapon1���������������д�Ĵ˽ӿڵķ���
                atackAvailable1 aa=(atackAvailable1)weapon1[i];
                aa.atackAll();
                atackNum++;
            }
        }

        if (atackNum == 0) {
            System.out.println("û�пɹ���������");
        }else{
            System.out.println("�������ɹ�����������Ϊ��"+atackNum);
        }
    }

    public void moveAll() throws MyException {
        if (count == -1) {
            throw new MyException("����Ϊ�գ����ƶ�Ϊ��");
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
            System.out.println("û�п��ƶ�������");
        }else{
            System.out.println("���������ƶ�����������"+moveNum);
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
        System.out.println("̹���ƶ�");
    }
    public void atackAll(){
        System.out.println("̹�˹���");
    }
}

class WuZiFighter extends Weapon1 implements moveAvailable1{

    @Override
    public void moveAll() {
        System.out.println("������������");
    }
}

class GaoShePao extends Weapon1 implements atackAvailable1{

    @Override
    public void atackAll() {
        System.out.println("�����ڴ��");
    }
}