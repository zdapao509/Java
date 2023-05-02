/*
���ͻ��ƣ�JDK5.0��������

���������﷨���ƣ�ֻ�ڳ������׶������ã�ֻ�Ǹ��������ο��ġ����н׶η���û��


ʹ�÷��͵ĺô���

    �����д洢��Ԫ������ͳһ��

    �Ӽ�����ȡ������Ԫ�������Ƿ��͵�ָ�����ͣ�����Ҫ���д���������ת��

���͵�ȱ����ʲô��

    ���¼����д洢��Ԫ��ȱ��������

    �����ҵ���У�������Ԫ�ص����ͻ���ͳһ�ģ��������ַ������Ա�������Ͽ�


* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
//        ������÷��ͻ��ƴ��ڵ����⣺
        List list1=new ArrayList();
        list1.add(new Animal());
        list1.add(new Cat());
        list1.add(new Bird());

//        ���ü����е�AnimalԪ�ص�move������
        Iterator it=list1.iterator();
        while(it.hasNext()){
            Object obj=it.next();//ע�⣺it.next��û��ʹ�÷��ͻ��Ƶ�ʱ��ֻ�ܷ���Object����
//            obj.move();-----Cannot resolve method 'move' in 'Object'---Object����û��move����
            if(obj instanceof Animal){
                Animal a=(Animal) obj;   //����ת��
                a.move();
            }
        }

        List<Animal> list2=new ArrayList<Animal>();
//        list2.add("123");���÷�ʡ����֮�󣬲������򼯺�������������͵�Ԫ��
//        List<Cat> list2=new ArrayList<Cat>();---------ֻ�и����͵ķ��Ͳ��ܷ����࣬�����Ͳ��ܷŸ���
        list2.add(new Animal());
        list2.add(new Cat());
        list2.add(new Bird());

        Iterator<Animal> it1=list2.iterator();//����ע�⣺��������������Aniaml���ͣ��������<Animal>�������Animal a = it1.next();�ͻᱨ����Ϊ�����Ľ������Ҫ��Object

        while(it1.hasNext()){
            Animal a = it1.next();
            a.move();
        }


//        JDK8.0֮��������ԣ�
        List<Animal> list3=new ArrayList<>();//�ڶ���<>���ž����������������������Ҫ��д
        list3.add(new Animal());
        list3.add(new Cat());
        list3.add(new Bird());

        Iterator<Animal> it4=list3.iterator();

        while(it4.hasNext()){
            Animal a=it4.next();
            a.move();
        }


//
        List<String> list5=new ArrayList<>();
        list5.add("01234567");
        list5.add("*-*++564");
        Iterator<String> it5=list5.iterator();
        while(it5.hasNext()){
            String a=it5.next();
            String newString=a.substring(3);
            System.out.println(newString);

        }
    }
}

class Animal{
    public void move(){
        System.out.println("�������ƶ�");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("èצ����");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("���");
    }
}
