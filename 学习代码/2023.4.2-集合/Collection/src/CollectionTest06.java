/*
����contains����

     ���ڼ����е�����Ҫ��дequals����
* */


import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest06 {
    public static void main(String[] args) {
//        �������϶���
        Collection e=new ArrayList();
//        �����û�����
        User a1=new User("jack");
        User a2=new User("jack");

        e.add(a1);
//        �ж�e���Ƿ����a2��
        System.out.println(e.contains(a2));//true

        //��������User�಻��дequals����������ͻ���false��
        // ԭ���ַ���������д��equals�������Ƚϵ����ַ���������������ö��󣬲�û����дequals������
        // ���ԣ���contains��������equals������ʱ�򣬵�����Object��equals�������Ƚϵ��������ڴ��ַ

        e.remove(a2);
        System.out.println(e.size());//0----------����remove����������equals���������ԣ�ɾ��a2��ͬ��ɾ��a1��----User�е�equals�����Ѿ�����д��


//        ��д֮��Ϊtrue


        Integer a3=new Integer(10);
        Integer a4=new Integer(10);

        e.add(a3);
        System.out.println(e.contains(a4));//true       ע�⣺��װ������д��equals����



//        ����һ�����϶���
        Collection x=new ArrayList();
//        �����ַ�������
        String s1=new String("hello");
        x.add(s1);
//        �����ַ�������
        String s2=new String("hello");
        x.remove(s2);//ע�⣺�����remove�����ײ������equals������Ŀ���ǲ������Ƚ϶�����ڴ��ַ�����Ǳ������ʵ��ֵ�ǲ�����ȡ�
        // �����s2��s1��ָ���ַ����������е�ͬһ����ַ�ģ�����s2����s1������ɾ��s2����ɾ��s1��
        System.out.println(x.size());//0
    }
}

class User{
    private String name;
    public User(){}
    public User(String name){
        this.name=name;
    }

//    �мǣ����뼯���еĶ���һ��Ҫ��дequals������---------���ϱȽϵ�ʱ��ͻ����equals����

    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof User)) return false;
        if(obj==this) return true;
        User a=(User)obj;
        return a.name.equals(this.name);
    }
}
