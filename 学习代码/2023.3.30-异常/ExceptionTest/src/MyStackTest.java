/*
���������е���ҵ����������е�push������pop�����е����Լ�д���쳣MyException��


��д����ʹ��һά���飬ģ��ջ�����ݽṹ��
Ҫ��
    1.���ջ���Դ洢java���κ��������͵����ݡ�
    2.��ջ���ṩpush������ģ��ѹջ����ջ���ˣ�Ҫ����ʾ��Ϣ��---�����Ĳ����Լ�����ֵ�����Լ�����
    3.��ջ���ṩpop������ģ�ⵯջ����ջ���ˣ�ҲҪ����ʾ��Ϣ��---�����Ĳ����Լ�����ֵ�����Լ�����
    4.��д���Գ���newջ���󣬵���push pop������ģ��ѹջ�͵�ջ����
    5.ջ����������ֱ�Ӹ�����Ҳ����ͨ�����췽������̬����
* */


/*
��ջ�д���Ԫ�أ�ʹ�õ���һά����ģ�⣬����ջ�о͵��ڴ浽��������

��Ϊ����������ѧϰjava�ĵ�һ������

Ϊʲôѡ��Object���͵����飿----��Ϊ���ջ�п��Դ洢java�е��κ������������͵�����

new A{}�����ݿ��ԷŽ�ȥ��new B{}������Ҳ���ԷŽ�ȥ����ΪA B ����һ���������࣬����Object

����StringҲ���Դ��ȥ����ΪString����Ҳ��Object

ջ֡����Զָ��ջ�Ķ����������ջ�ǿյģ�һ��ֵ��û��
* */
public class MyStackTest {
    public static void main(String[] args) {
        myStack mm=new myStack(new Object[5]);//��ʼ��ջ֡��ָ��ջ֡����Ϊ5

        Animal a=new Animal();
        try {
            mm.push(a);
            mm.push(a);
            mm.push(a);
            mm.push(a);
            mm.push(a);
            mm.push(a);
        }catch(MyException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            mm.pop();
            mm.pop();
            mm.pop();
            mm.pop();
            mm.pop();
            mm.pop();

        }catch(MyException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class myStack{
    private Object[] obj=new Object[5];//����ע�⣺����һ��Ҫ˽�л����з�װ������ϰ��----����������Խ���Ĭ�ϸ�ֵ��
    // Ҳ����ͨ�����췽����ֵ
//    this.obj=new Object[5];ע�⸳ֵ��ʱ���������ͬһ�н��и�ֵ�Ļ���������������ֵ��Ҫд�����췽������ȥ��ֵ

    public Object[] getObj() {
        return obj;
    }

    public void setObj(Object[] obj) {
        this.obj = obj;
    }

    int index=-1;
    public myStack(Object[] obj){//��ʼ��ջ�����������ö�̬��ʼ���ķ�ʽ���߾�̬��ʼ���ķ�ʽ
        this.obj = obj;
        System.out.println("ջ����ָ���ɹ���ջ���ռ�Ϊ��"+this.obj.length+"   ָ��ջ�����ͣ�"+obj.getClass());
    }
    public void push(Object object) throws MyException {//���Է��κ����͵������Ǿ�ֱ����������
        if (index == obj.length-1) {//ע���������obj.length�������ջ������10����ָ��ָ��9��ʱ�򣬾�����
//            System.out.println("ջ����");
//            return;
            throw new MyException("ջ�������޷�ѹջ");
        }
        obj[++index]=object;//ջ֡�������ÿѹջһ�Σ�index�����ͼ�һ��ָ�������µ����ֵ
        System.out.println("ѹջ�ɹ���ѹ�룺"+obj[index]+"  ջָ֡��"+index+"   ѹ��ջ�������ǣ�"+object.getClass());
//        ǿ��һ�£����е�System.out.println()ִ��ʱ���������������õĻ����Զ��������õ�toString����
    }
    public void pop() throws MyException {
        if (index <0) {
//            System.out.println("ջ�ѿ�");
//            return;
            throw new MyException("ջ�ѿգ��޷���ջ");
        }
        obj[index--]=null;//ָ��ָ�ĵط�����ֵ���ٰ�����ֵ��һ
        System.out.println("��ջ�ɹ���������"+(index+1)+"  ջָ֡��"+index);
    }

}

class Animal{
    @Override
    public String toString() {
//        System.out.println(this.getClass().toString());
        return "Animal!"+this.getClass().toString();//���ﲻ��ֱ��дthis.getClass����������
//       ��Ϊ�����������ֵ���Ͳ��� String����
    }

}
