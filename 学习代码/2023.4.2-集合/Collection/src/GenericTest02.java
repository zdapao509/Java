/*
�Զ��巺�Ϳ�����

    ����

    �Զ��巺�͵�ʱ�� ��<>�е���һ����ʶ�������д��

    javaԴ�����о������ֵķ��ͱ�ʶ���ǣ�   <E>  ��  <T>  E�������element T�������Type��������ĸ
* */

public class GenericTest02<E> {
    public void doSome(E e){
        System.out.println(e);
    }

    public static void main(String[] args) {
        GenericTest02<String> a=new GenericTest02<>();//new�����ʱ��ָ���ķ�����String���͵ģ�����doSome����ֻ������ַ���
        a.doSome("ֻ�ܴ��ַ���");

        GenericTest02<Integer> b=new GenericTest02<>();
        b.doSome(123);

        MyIterator<String> c=new MyIterator<>();
        String cc=c.get();
        System.out.println(cc);//null

        MyIterator d=new MyIterator();//������Ƿ��ͣ�����Object����
        Object dd=d.get();
        System.out.println(dd);//null
    }
}

class MyIterator<T>{
    public T get(){
        return null;
    }
}
