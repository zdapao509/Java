/*
final���εı�����������������һ�����ã�����ô��

    �ص㣺final���εı���ֻ�ܸ�ֵһ��

    ��Ȼ������Ҳ�Ǳ���

final���ε����ã�

    ������ֻ��ָ��1�����󣬲���ֻ����Զָ��ö����޷���ָ����������

    �ڸ÷���ִ�й����У�������ָ�����֮�󣬸ö��󲻻ᱻ�������������ա�ֱ����ǰ�ķ����������Ż��ͷſռ�

    ��Ȼfinal������ָ�����A�󣬲���������ָ�����B�����Ƕ���A�ڲ������ݣ��ǿ��Ա��޸ĵġ�
* */
public class FinalTest02 {
    int a;
    public static void main(String[] args) {

//        System.out.println("a:"+a);����ע�⣺��̬���������ܷ���ʵ����������Ա������ʵ������+��̬����

        Person P1=new Person(30);
        System.out.println(P1.age);

        final Person P2=new Person(40);
//        P2=new Person(35);����java: �޷�Ϊ���ձ���P2����ֵ
        //���벻����ô�䣬pҲ��һ��������ֻ������������һ����������֣�����
//        P2=null;���������nullҲ�����ٸ���P2
        P2.age=56;
        System.out.println(P2.age);
    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }
}