/*
�����Զ����������˵��TreeSet����������?

    ���³����ж���Person������˵���޷�������Ϊû��ָ��Person����֮��ıȽϹ�������˭��˭С��û��˵������˲��ܽ��бȽ�

���³��򱨴�

    Exception in thread "main" java.lang.ClassCastException: class Person cannot be cast to class java.lang.

    Comparable (Person is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')

������������ԭ���ǣ�Person û��ʵ��java.util.Comparable ��
* */

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1=new Person(10);
        Person p2=new Person(50);
        Person p3=new Person(20);
        Person p4=new Person(25);

//        ����TreeSet���ϣ�
        TreeSet<Person> person=new TreeSet<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);

//        ����
        for(Person p:person){
            System.out.println(p);
        }
    }
}

/*
class Person{
    int a;
    public Person(int a){
        this.a=a;
    }
}*/


class Person implements Comparable<Person>{
    int a;
    public Person(int a){
        this.a=a;
    }

//    ʵ�ֱȽϽӿڵ�ʱ����Ҫʵ�ָýӿ��еĳ��󷽷����������������ָ���ȽϵĹ���ģ�����ʲô���бȽ�
//    k.compareTo(t.kay)
//    ���Ų���k �ͼ����е�ÿһ�� k ���бȽϣ�����ֵ������ >0  ,=0  ,<0
//    �ȽϹ����ƶ�֮�󣬿��԰��������������Ҳ���԰���������н���
    public int compareTo(Person c){
        //��ʱthis ���ǵ�ǰ ���� ���ڴ��ַ���������TreeSet�����ʱ�򣬾���p1
        //����� c ����Ҫ�ԱȵĶ�����ڴ��ַ ��Ҳ���� p2��
//        p1 �� p2  ���бȽϵ�ʱ�򣬾���this��c ���бȽ�

        return this.a-c.a;//�������ַ�ʽ���бȽϣ����ظ�ֵ����ǰ��ֵ�Ⱥ����ֵС����ǰֵ���䣬�����ֵ���ɱ����ں��棬���������������ֵС���ǾͰѴ��ֵ�ŵ����棬�������
//        return c.a-this.a;
    }


//    ��д����toString������
    public String toString(){
        return "this.a="+a;
    }
}
