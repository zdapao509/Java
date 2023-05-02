package com.bjpowernode.chapter.array;
/**
 * дһ����Army������һ�¾��ӣ����������һ������Weapon����w(�����洢������ӵ�е����е�����)
 * ���໹�ṩһ�����췽�����ڹ��췽����ͨ����һ��int���͵Ĳ������޶���������ӵ�е��������������������һ��С����ʼ������w
 *
 * ���໹�ṩһ������addWeapon(Weapon wa),��ʾ�Ѳ���wa��������������뵽����w�У�
 *
 * ��������л���������������attackAll()������w�е���������������
 *
 * �Լ�moveAll����������w�е����п��ƶ������ƶ�
 *
 * дһ��������ȥ��������ĳ���
 *
 * ��ʾ��
 *      Weapon��һ�����࣬Ӧ���кܶ�������
 *
 *      ���������Ӧ����һЩ�ǿ��ƶ��ģ���һЩ�ǿɹ�����
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
        System.out.println("�����ʼ���ɹ��������������������"+this.maxSize);
    }

    public void addWeapon(Weapon weapon) throws MyException{
        if(count==this.maxSize-1){
            throw new MyException("��������");
        }
        wea[++count]=weapon;
        System.out.println("��ӳɹ�,��ʱcount="+count);
    }

    public void atackAll(){
        if (count == -1) {
            System.out.println("����Ϊ�գ��ɹ���+���ƶ���Ϊ��");
        }

        int atackNum=0;

        for (int i = 0; i <=count; i++) {
            if(wea[i] instanceof atackAvailable){
                System.out.println(wea[i]);
                atackNum++;
            }
        }

        if (atackNum == 0) {
            System.out.println("û�п��ƶ�������");
        }else{
            System.out.println("�������ɹ�����������Ϊ��"+atackNum);
        }
    }

    public void moveAll(){
        if (count == -1) {
            System.out.println("����Ϊ�գ��ɹ���+���ƶ���Ϊ��");
        }
        int moveNum=0;

        for (int i = 0; i <=count; i++) {
            if(wea[i] instanceof moveAvailable){
                System.out.println(wea[i]);
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

class Weapon{

}

class moveAvailable extends Weapon{
    public String toString(){
        return "�ƶ�1��";
    }
}

class atackAvailable extends Weapon{
    public String toString(){
        return "����һ��";
    }
}
