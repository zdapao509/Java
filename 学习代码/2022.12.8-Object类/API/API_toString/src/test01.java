/*
����Object���е�toString��������
    1.Դ���볤ʲô����

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());//�����getclass��ȡ���������ڴ��ַ��
    }
    Դ������toString()������Ĭ��ʵ���ǣ�
        ����@������ڴ��ַת��Ϊʮ�����Ƶ���ʽ

    2.SUN��˾���toString����������Ŀ����ʲô��

        toString����������������ʲô��

            toString�������������Ŀ���ǣ�

            ͨ����������������Խ�һ����java������ת���ɡ��ַ������͡�

    3.��ʵSUN��˾����java���Ե�ʱ�򣬽������е����඼��дtoString����������toString��������Ӧ����һ�����ģ���ʵ�ķ����Ķ��ġ�

* */

public class test01 {
    public static void main(String[] args) {
        MyTime myTime=new MyTime(1998,10,24);
        //һ�����ڶ���ת�����ַ�������ʽ�Ļ�����ϣ���������Ǿ����������Ϣ��
        String a=myTime.toString();

        //MyTime����дtoString��������֮ǰ
//        System.out.println(a);//MyTime@16b98e56

        //MyTime����дtoString��������֮��
        System.out.println(a);//1998��10��24��

        System.out.println(myTime.toString());//1998��10��24��

        //���Ϊ���õ�ʱ��Ĭ�ϵ��õ���toString��������
        System.out.println(myTime);//1998��10��24��
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime(){

    }

    public MyTime(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public String toString(){
        return this.year+"��"+this.month+"��"+this.day+"��";
    }
}
