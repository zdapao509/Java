/*
�����ڲ��ࣺ

    1.ʲô���ڲ��ࣿ

        �ڲ��ࣺ������ڲ��ֶ�����һ���µ��ࡣ����Ϊ�ڲ���

        ע�⣺�ڲ����ǿ�����public private protected Ĭ�Ϸ���Ȩ�����ε�

    2.�ڲ���ķ��ࣺ

        ��̬�ڲ��ࣺ�����ھ�̬����

        ʵ���ڲ��ࣺ������ʵ������

        �ֲ��ڲ��ࣺ�����ھֲ�����

    3.ʹ���ڲ����д�Ĵ��룬�ɶ��Բ�ܲ��þ�������

    4.�����ڲ����Ǿֲ��ڲ����һ��

        ��Ϊ�����û�����ֶ����������������ڲ���

    5.ѧϰ�����ڲ����Ƿ����Ժ�������˵Ĵ��룬�������˵��﷨

        ������ʹ�������ڲ��ࣺԭ��1.��Ϊһ����û�����֡�û�а취�ظ�ʹ�ã���2.����̫�ң��ɶ���̫��

    6.���������ˣ���ס���д������

    7.IDEA�о�������Ŀ�ݼ���alt+�س�
* */

public class NeiBuClass {

    static String country;//��̬����
    static class Inner1{//����������ڲ�����֮Ϊ�ڲ��࣬����ǰ����static���Σ����Գ�֮Ϊ����̬�ڲ��ࡱ

    }

    int age;//ʵ������
    class Inner2{//û��static���Σ����Խ�ʵ���ڲ���

    }

    public void doSome(){
        //�ֲ�����
        int i=100;
        //�ֲ��ڲ���
        class Inner3{

        }
    }

    public void doOther(){
        //doSome�����еľֲ��ڲ���Inner3����doOther�в���ʹ��
    }

    public static void main(String[] args) {
        Mymath aa=new Mymath();

        //ע�⣺����û��ʹ�������ڲ��࣬��ʾ����������еģ������ǣ�MyMathComputer
        aa.mysum(new MyMathComputer(),20,30);

        //��������Ҫ���������ڲ����ʱ��������Ľӿ�Computer��ʵ��MyMathComputer��Ͳ���д�ˣ�ת��ʹ������Ĵ��룺�﷨���£�
        aa.mysum(new Computer(){
            public int sum(int a,int b){
                return a+b;
            }
        },10,20);//�����{}����Խӿڵ�ʵ��

        /*��������е���һ����������ڲ��ഴ���Ķ���

        new Computer(){
            public int sum(int a,int b){
                return a+b;
            }
        }


        ʹ�������ڲ��࣬��ʾ�����MyMathComputerû�������ˣ�
        ����ӿڱ����Ͽ���ȥ�����ǿ���ֱ��new�ˣ�ʵ���ϲ����ǽӿڿ���ֱ��new��
        �����{}�����˶Խӿڵ�ʵ��

        ������ʹ�������ڲ��ࣺԭ����Ϊһ����û�����֡�û�а취�ظ�ʹ�ã����⣬����̫�ң��ɶ���̫��
        * */


    }
}

interface Computer{
    //���󷽷�
    int sum(int a,int b);
}

//���µ�ʵ������Ϊ��ʵ�ֽӿ��е�sum�������Ա��������������Ľӿڵ�ʱ�����õ����е�sum������
// �������ʹ�õ��������ڲ���Ļ� ���������ʵ���ࣺMyMathComputer�Ϳ���ʡ��
class MyMathComputer implements Computer{
    public int sum(int a,int b){
        return a+b;
    }
}

class Mymath {
    public void mysum(Computer a,int x,int y){
        int ret=a.sum(x,y);
        System.out.println(x+"+"+y+"="+ret);
    }

}


