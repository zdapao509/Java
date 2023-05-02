import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
1.��Map�����д��ȡʱ�����ȵ���key��hashCode������Ȼ���ٵ���equals������

    equals�������ܵ��ã�Ҳ���ܲ����ã�

    ��put<K,V>������  ʲôʱ��equals����������ã�

        K.hashCode()�������ع�ϣֵ����ϣֵ������ϣ�㷨ת���������±ꡣ�����±�λ���������null��equals��������ִ�С�

    ��get<K>������ʲôʱ��equals������ã�

        K.hashCode()�������ع�ϣֵ����ϣֵ������ϣ�㷨ת���������±ꡣ�����±�λ���������null��equals��������ִ�С�


2.ע�⣺���һ�����equals������д�ˣ���ôhashCode()����������д������equals�������������true��hashCode������������ֵ����һ����Ҳ���Բ�һ����ֻ�ǽ�����ϣ�㷨֮���һ���ˣ���

    equals��������true��ʾ����������ͬ����ͬһ�����������ϱȽϣ���ô����ͬһ�����������ϵĽڵ���˵�����ǵĹ�ϣֵ������ͬ�ģ�����hashCode()�����ķ���ֵҲӦ����ͬ

3.ע�⣺hashCode������equals��������ͬʱ����

4.����HashMap����key���ֵģ��Լ�����HashSet�����е�Ԫ�أ���Ҫͬʱ��дhashCode������equals����

5.���ڹ�ϣ�����ݽṹ��˵��

    ���a b �Ĺ�ϣֵ��ͬ��������һ������һ����������

    �������߲���ͬ��ʱ�����ڹ�ϣ�㷨ִ�н���֮��ת���������±������ͬ����ʱ�ᷢ�� ��ϣ��ײ  --------Ҳ����������ϣֵ����ȵ�key�����Է���ͬһ������������

* */
public class HashMapTest02 {
    public static void main(String[] args) {
        Students s1=new Students("zhangsan",1);
        Students s2=new Students("zhangsan",2);

//        ��дequals����֮ǰ��
//        System.out.println(s1.equals(s2));//�Ƚϵ����ڴ��ַ�������

//        ��дequals����֮��
        System.out.println(s1.equals(s2));//�Ƚϵ�����������,���-------����equals�����Ѿ�����true�ˣ�����s1 s2����ͬ�ģ�
        // ������HashSet�����зŵ�ʱ��ֻ�ܷ�һ������Ϊset�������򲻿��ظ�

//        û����дhashCode����֮ǰ��
        System.out.println("s1��hashCode="+s1.hashCode());//381259350
        System.out.println("s2��hashCode="+s2.hashCode());//284720968

//        û����дhashCodeʱ�������������ӵ�HashSet�����еĻ�����ʹ��ͬһ������Ҳ���ǻᶼ��ӽ�ȥ����Ϊhashֵ������±��ǲ���ȵ�
        Set<Students> set=new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());//2------������ͬ��Ԫ�ض���ӽ�ȥ��

        // ----------��дhashCode֮������ͱ����1��Ҳ��������name��ȵĶ�����Ϊ��ͬһ����������ֻ���һ��


    }
}

class Students{
    private String name;
    private int no;
    public Students(){}
    public Students(String name,int no){
        this.name=name;
        this.no=no;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setNo(int no){
        this.no=no;
    }
    public int getNo(){
        return no;
    }


//    ��дequals����
    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Students)) return false;
        if(obj==this) return true;
        Students stu=(Students) obj;
//        return this.name.equals(stu.name);
        return Objects.equals(name,stu.name);
    }


//    ��дhashCode������
    public int hashCode(){
        return Objects.hash(name);
    }
}
