/*
* ģ��򵥼�������
* ����Number���ࣻ�����������������ݳ�Աn1��n2Ӧ����Ϊ˽��
* ��д���췽������n1��n2��ʼֵ
* ��Ϊ�������addition������subtration()��multiplication������division�����ȹ���ʵ��������
* �ֱ��������Աִ�мӼ��˳�������
* */
public class HomeWork1 {
    public static void main(String[] args) {
        Number a=new Number(0,2);
        System.out.println(a.addition());
        System.out.println(a.subtration());
        a.multiplication();
        a.division();
        System.out.println(47/24);
    }
}

class Number{
    //˽�л�����
    private int n1;
    private int n2;
    //���췽��
    public Number() {
    }
    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    //setter��getter

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    //�ӷ�
    public int addition(){
        return n1+n2;
    }
    //����
    public int subtration(){
        return n1-n2;
    }
    //�˷�
    public void multiplication(){
        System.out.println(this.getN1()+"*"+this.getN2()+"="+(getN1()*getN2()));
    }
    //����
    public void division(){
        if(n2==0){
            System.out.println("��������Ϊ0");
            return;
        }
        System.out.println(this.getN1()+"/"+this.getN2()+"="+((double)getN1()/(double)getN2()));
    }
}

