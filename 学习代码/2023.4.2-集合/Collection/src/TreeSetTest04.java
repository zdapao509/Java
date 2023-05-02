/*
�Լ�ָ���������

    ���磺��������Ƚϣ����������ͬ�����������Ƚ�
* */

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        Set<Test> test=new TreeSet<>();
        test.add(new Test(15,"zwei"));
        test.add(new Test(16,"aaa"));
        test.add(new Test(15,"aweo"));
        test.add(new Test(0,"xioazi"));

        Iterator<Test> it=test.iterator();
        while(it.hasNext()){
            Test t=it.next();
            System.out.println(t);
        }
    }
}

class Test implements Comparable<Test>{
    int age;
    String name;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return this.name + "  :  " + this.age;
    }
/*
CompareTo�����ķ���ֵ���ͺ���Ҫ��

    ����=0 ������ͬ��value�Ḳ�ǣ�

    ���ء�0  �������������������

    ����>0  �������������������
* */
    public int compareTo(Test t) {
        if(this.age==t.age){
            return this.name.compareTo(t.name);
        }else{
            return this.age-t.age;
        }
    }
}