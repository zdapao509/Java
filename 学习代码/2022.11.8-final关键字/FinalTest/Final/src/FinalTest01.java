/*final�ؼ��֣�
		1.final��java�����е�һ���ؼ���

		2.final��ʾ���յģ����ɱ��

		3.final�������α����Լ�������������ȡ�

		*4.final���εı�����

			final���εľֲ�������һ������ֵ���������¸�ֵ��

			final���εı���ֻ�ܸ�һ��ֵ��


		*5.final���εķ�����

			final���εķ����޷������ǣ�����д

		*6.final���ε��ࣿ

				final���ε����޷��̳�

		7.final���Ʋ����ܲ��ܵ��õ����⡣final�ܵ���ɶ��

				final���εı�ʾ���ģ����ܱ�ģ����ܸĵġ�

		*/

public class FinalTest01 {
    public static void main(String[] args) {
        System.out.println(123);

        int a=100;
        a=200;

        final int b=200;
//        b=300;//����java: �޷�Ϊ���ձ���b����ֵ

        final int c;
        c=500;
//        c=200;  ����java: �����ѷ������c
    }
}


//final class A{
//
//}
//
//class B extends A{
//
//}


//class MyString extends String{
////java: �޷�������java.lang.String���м̳�
//}

class C
{
    public void ABC(){
        System.out.println("C�еķ���");//final public void ABC()     java: D�е�ABC()�޷�����C�е�ABC()   �����ǵķ���Ϊfinal
    }

}

class D extends C{
    public void ABC(){
        System.out.println("D�еķ���");
    }
    public void doOther(){}

    public static void main(String[] args) {
        C c=new D();
//        c.doOther();  ��䱨���ˣ���Ϊ�����������ˣ���������Ϊc��C�࣬C����û��doOther����
//        ����:   ���� doOther()
//        λ��: ����ΪC�ı��� c
        if (c instanceof D){//���Cָ��Ķ���ȷʵ��һ��D���ͣ�name�Ϳ��Խ�������ת��
            D d1=(D)c;
            d1.doOther();
        }
    }
}