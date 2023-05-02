/*
����Object���е�equals����
    1.equals������Դ�룺Object������Ĭ��ʵ��
        public boolean equals(Object obj) {
                return (this == obj);----------------------�����this�ǵ�ǰ������ڴ��ַ
            }

            System.out.println(a1.equals(a2));

            ���ֱ�ӵ��ø��������Object��������ôthis����ľ��ǣ�a1�д洢�Ķ��ڴ��ַthis=a1

            obj����ľ��ǣ�a2�еĶ��ڴ��ַ��obj=a2

            �����ڴ��ַһ����ͬ�����Կ϶���false����ʵ�ʵ�����Ҫ�Ľ���෴���Ƚ϶����ʱ������һ�㶼�ǱȽ����ݣ������Ƚ��ڴ��ַ

    2.SUN��˾��Ƶ�equals������Ŀ���ǣ�

        �Ժ�ı�̵�ʱ�򣬶�Ҫͨ��equals�������ж��������Ƿ���ȡ�
        equals�������ж��������Ƿ���ȵġ�

    3.������Ҫ�о�һ�£�Object��������Ĭ�ϵ�equals�����������ã�������
        ��Object���е�equals�������У�Ĭ�ϲ��õ���==�������ж�����java�����Ƿ���ȣ���==�жϵ�������java������ڴ��ַ��
        ����Ӧ���жϵ��ǣ�����java����������Ƿ���ȣ��������������equals���������ã���Ҫ��������дequals������

    4.�ж�����java�����Ƿ���ȣ�����ʹ��==����Ϊ==�Ƚϵ�������������ڴ��ַ�Ƿ����


* */

public class Equals {
    public static void main(String[] args) {
        //�ж�������������������==�жϾ���
        int a=100;
        int b=100;
        //���==���ж�a�б���������Ƿ��b�б�����������
        System.out.println(a==b);

        //�ж�����java�����Ƿ���ȣ�����ֱ��ʹ��==�ж���
        MyTime a1=new MyTime(1998,10,24);

        MyTime a2=new MyTime(1998,10,24);

        MyTime a3=new MyTime(1997,10,24);

        MyTime a4=null;

        //����һ�£��Ƚ����������Ƿ���ȣ��ܲ���ʹ��==��ʽ
        //ע�⣺�����==�жϵ���a1��a2���������б�����ڴ��ַ�Ƿ����
        System.out.println(a1==a2);//false

        System.out.println(a1.equals(a2));//true

        System.out.println(a1.equals(a3));//false

        System.out.println(a1.equals(a4));//false----������̣��ǿ���ִ�еģ����ǣ��������һ�����⣬���Ч�ʱȽϵͣ�null�Ͳ���Ҫ�����ж���
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


    //��дObject���equals������
    //��ô��д������ճ������ͬ�ķ���ֵ���ͣ���ͬ�ķ���������ͬ����ʽ�����б�
/*
    public boolean equals(Object obj) {//�����õ��˶�̬���ɸ����͵�Object������objָ�������͵Ķ��������͵Ķ�����Ҫ�Լ�ָ��
                                                    // --Object���������࣬��������ĸ���

        //ע�⣺���ﲻ��ֱ��дthis.year==obj.year;��Ϊ�Ƕ�̬��obj��Object���͵����ã�
        // ��Ȼ����������year�����ԣ����Ǳ���׶Σ�ֻ���ڸ��������ң�����������û��year�����Ե�----------���Ƕ�̬�Ļ���

        if (obj instanceof MyTime){
            MyTime aa=(MyTime)obj;
            return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//����������ȵ�ʱ�������������
            //����Ϊʲô�Ѿ��ж�Ϊ��MyTime���ʱ��Ҫ����ǿ������ת������ת�ͣ�
            //������Ϊ����ʹ�Ѿ��������жϣ����������ǲ���ʶobj.year����Ϊobj������û��year����
        }else{
            return false;//���Obj����MyTime�඼���ǵĻ�����˵������������϶������
        }

    }
*/
    //���ﻹ��һ��Ҫע��ĵ㣺����ķ������������ڵ�Object�࣬������Ϊ�˷��㣬
    // ����ʽ�����б�ĳ�MyTime myTime��������ʽ����Ϊ�����Ͳ����ɷ���������



    //�������·���
/*    public boolean equals(Object obj) {
        if (obj ==null){//���obj�ǿգ�ֱ�ӷ���false
            return false;
        }
        if (!(obj instanceof MyTime)){//���obj����MyTime�ֱ࣬�ӷ���false
            return false;
        }
        if(this==obj){//���this��obj������ڴ��ַ��ȣ�û��Ҫ�Ƚϣ�ֱ�ӷ���true���ڴ��ַ��ͬ��ʱ��ָ����ڴ��еĶ���϶���ͬһ��
            return true;
        }

        //�������ִ�е��˴�����˵����  ˵��obj����null��obj��MyTime����
        MyTime aa=(MyTime)obj;
        return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//����������ȵ�ʱ�������������
    }
*/


    //�������پ���
    public boolean equals(Object obj) {
        if (obj ==null||!(obj instanceof MyTime)){//���obj�ǿգ������obj����MyTime��,ֱ�ӷ���false
            return false;
        }

        if(this==obj){//���this��obj������ڴ��ַ��ȣ�û��Ҫ�Ƚϣ�ֱ�ӷ���true���ڴ��ַ��ͬ��ʱ��ָ����ڴ��еĶ���϶���ͬһ��
            return true;
        }
        //�������ִ�е��˴�����˵����  ˵��obj����null��obj��MyTime����
        MyTime aa=(MyTime)obj;
        return (this.year == aa.year&&this.month==aa.month&&this.day==aa.day);//����������ȵ�ʱ�������������
    }

}
