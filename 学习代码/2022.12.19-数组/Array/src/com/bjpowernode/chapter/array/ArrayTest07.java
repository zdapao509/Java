package com.bjpowernode.chapter.array;
//һλ��������룺�����д洢�������ǣ�������������
//����������˵��ʵ�������ܴ洢java������ڴ��ַ�������д洢��ÿ��Ԫ�������ã�
public class ArrayTest07 {
    public static void main(String[] args) {
        //
        int[] a={100,200,30};
        System.out.println(a[1]);

        int[] array={1,23,1};
        for (int i = 0; i < array.length; i++) {
           /* int temp=array[i];
            System.out.println(temp);//��Ч�������д��*/
            System.out.println(array[i]);
        }

//        ����һ��Aniaml����
        Aniaml a1=new Aniaml();
        Aniaml a2=new Aniaml();
        Aniaml[] aniamls={a1,a2};
        for (int i = 0; i < aniamls.length; i++) {
            /*Aniaml aa=aniamls[i];
            aa.move();*///Ҳ����д�����µĺϲ���ʽ��
            aniamls[i].move();
        }

//        ��̬��ʼ��һ������Ϊ2��Animal��������:
        Aniaml[] aaa=new Aniaml[2];
//        ����һ��Animal���Ͷ�����������һ��λ�ã�
        Aniaml aa1=new Aniaml();
        aaa[0]=aa1;

        Prodect b=new Prodect();
//        aaa[1]=b;����ԭ��Aniaml������ֻ�ܷ�Aniaml���͵����ã����ܷ�Prodect����

        aaa[1]=new Cat();//����Ͳ�����ԭ����Cat��Aniaml�����࣬���Կ��Դ�������е�����



//        ����һ��Aniaml���͵����飬��Cat Bird���͵�����
        Cat cat=new Cat();
        Bird bird=new Bird();
        Aniaml[] aniamls1={cat,bird};

//        Ҳ���ԣ�Aniaml[] aniamls1={new Cat(),new Bird()};---------�����д��������������ڴ��ַ

        for (int i = 0; i < aniamls1.length; i++) {
//            �������aniamls1������飬ȡ�����Ŀ�����Cat Ҳ������Bird,�����϶���һ��Aniaml
//            �������õķ����Ǹ������д��ڵķ������ǾͲ���Ҫ����ת�ͣ�ֱ�Ӹ����͵����õ��ü���
            aniamls1[i].move();
//            Ҳ����д�ɣ�
            Aniaml aaaa=aniamls1[i];
            aaaa.move();

            /*ִ�н���������͵�����ָ���������͵Ķ��󣬶�̬����
            * Cat move
                Cat move
                Bird move
                Bird move
            * */


//         ������õ��Ǹ���Aniaml��û�еķ����������������еķ����� ����Ҫ����ת��
//            aniamls1[i].catchMouse();

            if (aniamls1[i] instanceof Cat) {
                Cat cat1 =(Cat)aniamls1[i];
                cat1.catchMouse();
            }else if(aniamls1[i] instanceof Bird){
                Bird bird1=(Bird)aniamls1[i];
                bird1.Fly();
            }
        }

//        Cat[] cats={new Aniaml(),new Cat()};-------��һ����������ഴ�����������ǲ��ܷŸ������õ�
//java: �����ݵ�����: com.bjpowernode.chapter.array.Aniaml�޷�ת��Ϊcom.bjpowernode.chapter.array.Cat
    }
}

class Aniaml{
    public void move(){
        System.out.println("move execute");
    }
}
class Cat extends Aniaml{
    @Override
    public void move() {
        System.out.println("Cat move");
    }
    public void catchMouse(){
        System.out.println("Cat catchMouse");
    }
}
class Bird extends Aniaml{
    @Override
    public void move() {
        System.out.println("Bird move");
    }
    public void Fly(){
        System.out.println("Bird Fly");
    }
}
class Prodect{

}
