import ass.test02;
//import org.User01;
import org.test01;

public class FangWenQuanXian extends test02 {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------
        //������δ���˵����private���ε����ԣ�ֻ����ͬ���з��ʣ�����ͬ�࣬���ܷ���    ��public��protected��Ĭ�����ε����Գ���ͬ�಻������Ȼ���Ե���
        User user =new User();
        //System.out.println(user.id);//����java: id �� User ���� private ���ʿ���---------ֻ���ڱ����б�����
        System.out.println(user.age);
        System.out.println(user.weight);
        System.out.println(user.name);


//---------------------------------------------------------------------------------------------------------
// ���³���˵�������ʿ���Ȩ�����ε��ࣺĬ�ϵ����ε��ࣨ��ǰ��ʲôҲû�У����ڲ�ͬ�������ǲ��ܽ���ʵ������;
// ֻ��public���ε��࣬�ڲ�ͬ�İ�������ܽ���ʵ��������;
// �������ԣ������ǲ�ͬ����������࣬Ҳ���ܷ�����protected���εĸ���--------------ע�⣺protected��private����������

//        User01 user01=new User01();//����java: org.User01��org�в��ǹ�����; �޷����ⲿ������ж�����з��ʣ�
//        ��Ϊ��org�������User01�಻�ǹ����ģ���������ᱬ���ִ���
//        System.out.println(user01.age);
//        System.out.println(user01.weight);
//        System.out.println(user01.name);


        test02 test002=new test02();
        System.out.println(test002.age);
//        System.out.println(test002.weight);//���ﲻ�ܷ��ʵ�ԭ�򣬲�������Ϊ���಻�ܷ��ʸ�����protected���ε����ԣ�
//        ����Ϊ����������û�аѸ��࿴�ɸ��࣬�Ը��������ʵ�������Ѹ��࿴����������

//        System.out.println(test002.name);//java: name��ass.test02�в��ǹ�����; �޷����ⲿ������ж�����з���

//----------------------------------------------------------------------------------------------------------
//������δ����ʾ��ͬ�����棬�������FangWenQuanXian�̳��˸���test02�Ļ������ڸ�����protected���ε����ԣ������ǿ��Խ��з��ʵ�
        //��Ĭ�����η� ���ε����Գ���ͬһ���������������඼û�а취����

        FangWenQuanXian aaa=new FangWenQuanXian();
//        System.out.println(aaa.name);//java: name��ass.test02�в��ǹ�����; �޷����ⲿ������ж�����з���
        System.out.println(aaa.weight);

//---------------------------------------------------------------------------------------------------------
//������δ���˵����public���ε����ԣ����˱��࣬����ͬ����������λ�ã������Լ������ʡ�
// ��protected��Ĭ�����ε����ԣ�����ͬ����������λ�þͲ��ܷ���
        //Ҳ���ǲ�ͬ�����棬protected\Ĭ�����η� ���ε������ǲ��ܱ����ʵ�
        test01 test001=new test01();
        System.out.println(test001.age);//����ִ�У���public���ε��ǹ����ģ������ﶼ�ܷ���
//        System.out.println(test001.weight);//�����ԣ�protected�����ﲻ�У�java: weight �� org.test01 ���� protected ���ʿ���
        //System.out.println(test001.name);//�����ԣ���Ĭ�ϡ�������Ҳ����
    }
//---------------------------------------------------------------------------------------------------------
    //������δ���˵�����������ͬһ�������棬protected���ε���������������Ȼ���Է��ʣ�����Ĭ�ϵ����ε������������оͲ��ܷ���
    //              ------------�������һ��������Ļ���protected���ε�����ֻ������ȥʹ��
    // ���ң�public���ε������������п��Է��ʣ�private���ε�������������Ҳ���ܷ���

    //�����棺test01��org�����棻FangWenQuanXian��src���棬���߲���һ�������棬����FangWenQuanXian��test01������
    public void shopping(){
        //System.out.println(this.id);//����:java: id �� org.test01 ���� private ���ʿ���
        System.out.println(this.age);
        System.out.println(this.weight);
//        System.out.println(this.name);//����//java: name��org.test01�в��ǹ�����; �޷����ⲿ������ж�����з���
    }

}

class User{
    private int id;
    public int age;
    protected int weight;
    String name;

    //���������÷���Ȩ�޽�������
    public void m1(){}
    protected void m2(){}
    private void m3(){}
    void m4(){}

    //��̬���������÷���Ȩ�޽�������
    public static void m5(){}
    protected static void m6(){}
    private static void m7(){}
    static void m8(){}

}
