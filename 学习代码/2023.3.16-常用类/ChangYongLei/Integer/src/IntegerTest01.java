/*
1.java��8�ֻ����������Ͷ�Ӧ8�ְ�װ���ͣ�8�а�װ������������������
2.˼����
    Ϊʲô�ṩ8�ְ�װ�ࣿ
    ��Ϊ8�ֻ����������Ͳ����ã�����SUN��˾���ṩ��8�ְ�װ����

* */
public class IntegerTest01 {
    public static void main(String[] args) {
        //��û��������������Ҫ����doSome ����ʱ����һ�����ֽ�ȥ
//        �����������ڻ����������ͣ���doSome���������������ǣ�������������---Object
//        �ɼ�doSome�����޷����ܻ����������͵����֡�������ô�죿------���Դ�һ�����ֶ�Ӧ�İ�װ���ȥ

//        ��100������־�����װ���еĹ��췽������װ�ɶ���
        Package myInt=new Package(200);
        doSome(myInt);
    }
    public static void doSome(Object obj) {
        System.out.println(obj);
    }
}

class Package{//ģ���װ��
    private int i;
    public Package(){}
    public Package(int i){
        this.i=i;
    }

    @Override
    public String toString() {
        return String.valueOf(this.i);//��̬������ͨ�������
        // -----�����ַ���ת��Ϊ�ַ���������Ĳ����Ͳ��������ˣ��ǻ�����������

        //��println������������Ϊһ��Package���͵����õ�ʱ�򣬻��Զ�����valueOf������������������������ʱ--�����Ǹ����ã���
        // valueOf�����ֻ���ø����õ�toString������Ȼ��toString��������valueOf�����������ǻ����������ͣ���
        // ֱ��ת���ɶ�Ӧ���ַ������Ͳ����ء����շ��ظ����õ�int���͵�����ת�����ַ������͵�����
    }
}