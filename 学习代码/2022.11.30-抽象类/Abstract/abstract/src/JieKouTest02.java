/*
�ӿڵĻ����﷨��

    1.�����֮������̳У���ͽӿ�֮����� ʵ�֣�

      ����룺��Ȼ�ɽ���ʵ�֡������ǡ��̳С�

      �̳�ʹ�õ���extends��ʵ��ʹ�õ��ǣ�implements�ؼ�����ɣ�

    2.�ص㣺��һ���ǳ������ ʵ�� �ӿڵĻ������뽫�ӿ��е����еĳ��󷽷���ʵ�֣����ǡ���д��
* */

public class JieKouTest02 {
    public static void main(String[] args) {
//        new Mymath();//java: Mymath�ǳ����; �޷�ʵ����

        Mymath mm=new MymathImpl();//�����͵�����ָ�������͵Ķ���

        int a=mm.sum(10,20);//���ýӿ�����ķ���������ӿڱ��
        System.out.println(a);
        int b=mm.sub(93,80);
        System.out.println(b);
    }
}

//����ĳ����࣬��ȫ����ģ������ӿ�
interface Mymath{

    double pi=3.1415926;//����һ��������ǰ���Զ��ӣ�public static final-----------�������븳ֵ

    int sum(int a,int b);//���󷽷�

    int sub(int a,int b);//���󷽷�


}

//��д����һ���ࣨ�������һ�����ǳ��󡱵��ࣩ
//����������������ģ�

/*
class MymathImpl implements Mymath{//java: MymathImpl���ǳ����, ����δ����Mymath�еĳ��󷽷�sub(int,int)
}
*/

//������
class MymathImpl implements Mymath{
    //���ǡ���д��ʵ��  �ӿ��еķ���
    public int sum(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }

    //ע�⣬����ʡ��public;------֪ʶ�㣺����̳и����ʱ�򣬷���Ȩ��ֻ�ܸ��ߣ����ܸ��ͣ����︸��ķ���Ȩ���Ѿ���public����ߵģ�����������ֻ��Ҳ��public
    /*int sub(int a,int b){//java: MymathImpl�е�sub(int,int)�޷�ʵ��Mymath�е�sub(int,int)
                            //���ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
        return a-b;
    }*/

    public MymathImpl() {
    }
}