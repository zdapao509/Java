/*
* ����MyTime�࣬˽�л����ԣ�hour��minute��second
*
* ����Display����չʾʱ����Ϣ��
* ΪMyTime��������·�����
*   addSecond(int sec)
*   addMinute(int min)
*   addHour(int hou)
*   subSecond(int sec)
*   subMinute(int min)
*   subHour(int hou)
* �ֱ��ʱ�����ʱ����ļӼ�����
*
* */
public class HomeWork3 {
    public static void main(String[] args) {
        MyTime a=new MyTime(10,20,30);
        a.DisPlay();
        System.out.println("----------------------");
        a.subHour(15);
        a.DisPlay();
        System.out.println("----------------------");
        a.subMinute(150);
        a.DisPlay();
        System.out.println("----------------------");
        a.addHour(25);
        a.DisPlay();
        System.out.println("----------------------");
        a.addMinute(61);
        a.DisPlay();
        System.out.println("----------------------");
        a.addSecond(0);
        a.DisPlay();
        System.out.println("----------------------");
        a.subSecond(20);
        a.DisPlay();
        System.out.println("----------------------");
        a.addHour(20);
        a.DisPlay();
        System.out.println("----------------------");
        a.addMinute(58);
        a.DisPlay();
        System.out.println("----------------------");
        a.addSecond(270000);
        a.DisPlay();
        System.out.println("----------------------");
        MyTime b=new MyTime(10,20,30);
        b.DisPlay();
        System.out.println("----------------------");
        b.subMinute(40);
        b.DisPlay();
        System.out.println("----------------------");
        b.subHour(10);
        b.DisPlay();
        System.out.println("----------------------");
        b.subSecond(30);
        b.DisPlay();
        System.out.println("----------------------");
        b.addSecond(15);
        b.DisPlay();
        System.out.println("----------------------");
        b.addSecond(0);
        b.DisPlay();
        System.out.println("----------------------");
        b.addMinute(10);
        b.DisPlay();
        System.out.println("----------------------");
        b.subSecond(30);
        b.DisPlay();

    }
}

class MyTime{
    private int hour;
    private int second;
    private int minute;
    //getter��setter

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    //���췽����

    public MyTime() {
    }

    public MyTime(int hour, int second, int minute) {
        this.hour = hour;
        this.second = second;
        this.minute = minute;
    }

    //��ӡʱ����Ϣ
    public void DisPlay(){
        System.out.println("ʱ��"+hour+"\n�֣�"+minute+"\n�룺"+second);
    }

    //�޸�ʱ����Ϣ
    public void addHour(int hou){
        if ((getHour()+hou)/24<1){
                this.setHour(getHour()+hou);
        } else{
            System.out.println("���ڼ�"+(getHour()+hou)/24+"��");
            this.setHour((this.getHour()+hou)%24);
        }
    }
    public void addMinute(int min){
        if ((this.getMinute()+min)/60<1){
                setMinute(this.getMinute()+min);
        }else {
            System.out.println("Сʱ����"+(this.getMinute()+min)/60+"Сʱ");
            addHour((this.getMinute()+min)/60);//ע�⣺�����˳�����Ҫ��Ҫ�ȸ�Сʱ���ٸķ�������
                                                // �����޸�Сʱ����ķ��Ӿͱ���
            setMinute((this.getMinute()+min)%60);

        }
    }
    public void addSecond(int sec){
        if ((this.getMinute()+sec)/60<1){
            setSecond(this.getSecond()+sec);
        } else {
            System.out.println("��������"+(this.getMinute()+sec)/60+"����");
            addMinute((this.getMinute()+sec)/60);
            setSecond((this.getSecond()+sec)%60);
        }
    }
    public void subHour(int hou){
        int h=hou;
        h/=24;
        if (this.getHour()>=(hou-h*24)){
            System.out.println("���ڼ�"+h+"��");
            this.setHour(this.getHour()-(hou-h*24));
        } else if (this.getHour()<(hou-h*24)) {
            System.out.println("���ڼ�"+(h+1)+"��");
            this.setHour(24+this.getHour()-(hou-h*24));
        }else {
            System.out.println("��������");
        }
    }
    public void subMinute(int min){
        int m=min;
        m/=60;
        if((this.getMinute()-(min-m*60))>=0){
                System.out.println("Сʱ����"+m+"Сʱ");
                this.subHour(m);
                this.setMinute(this.getMinute()-(min-m*60));
        } else if ((this.getMinute()-(min-m*60)<0)) {
                System.out.println("Сʱ����"+(m+1)+"Сʱ");
                this.subHour(1+m);
                this.setMinute(this.getMinute()+60-(min-m*60));
        }else{
                System.out.println("��������");
        }

    }
    public void subSecond(int sec){
        int s=sec;
        s/=60;
        if((this.getSecond()-(sec-s*60))>=0){
                System.out.println("��������"+s+"����");
                this.subMinute(s);
                this.setSecond(this.getSecond()-(sec-s*60));
        } else if ((this.getSecond()-(sec-s*60)<0)) {
                System.out.println("��������"+(s+1)+"����");
                this.subMinute(1+s);
                this.setSecond(this.getSecond()+60-(sec-s*60));
        }else{
                System.out.println("��������");
        }
    }
}
