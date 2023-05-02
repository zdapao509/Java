import java.util.Comparator;
import java.util.TreeSet;

/*
�Զ���ȽϹ����ʱ�򣬷�����ֹһ�֣�����TreeSet����TreeMap����key���ֵ�Ԫ��Ҫ���������򣬰������ַ�ʽ

    ��һ�֣����ڼ����е�Ԫ��ʵ��java.lang.Comparable�ӿ�

    �ڶ��֣�ʹ�ñȽ����ķ�ʽ���Ƚ���Comparator;   �ڹ���TreeSet���Ϻ�TreeMap���ϵ�ʱ�򣬸�����һ���Ƚ�������Comparator�ӿڵ���Ʒ���OGPԭ��


 Comparator�ӿں�Comparable�ӿ���ôѡ���أ�

    ���ȽϹ��򲻻ᷢ���ı��ʱ�򣬻��߱ȽϹ���ֻ��һ����ʱ�򣬽���Comparable�ӿڣ�ֱ��ʵ�֣��ڶ�Ӧ��Ԫ�ص�������ֱ��ʵ������compareTo����

    ���ȽϹ����кܶ��ʱ������������Ԫ�ذ��ղ�ͬ�Ĺ�����бȽϵ�ʱ�򣬿��Բ���Comparator �����ڲ������Ƶ���л�
* */
public class TreeSetTest05 {
    public static void main(String[] args) {

//        ����TreeSet���ϵ�ʱ����Ҫʹ������Ƚ���

//        TreeSet<tnt> treeSet=new TreeSet<>();//java.lang.ClassCastException   �������У�û��ͨ�����췽������һ���Ƚ�����ȥ

        TreeSet<tnt> treeSet=new TreeSet<>(new tntComparator());

        treeSet.add(new tnt(100));
        treeSet.add(new tnt(50));
        treeSet.add(new tnt(150));

        for(tnt t:treeSet){
            System.out.println(t);
            /*
            tnt: 50
            tnt: 100
            tnt: 150
            * */
        }

//        ��Ȼ��Ҳ���Բ����Լ�����Ƚ��࣬����ֱ���� �����ڲ��� �ķ���ʵ��  ����һ���Ƚ�����ȥ----------�����ڲ��࣬û�����֡�ֱ��new�ӿ�
        TreeSet<tnt> tt=new TreeSet<>(new Comparator<tnt>(){
            public int compare(tnt t1,tnt t2){
                return t1.num-t2.num;
            }
        });
        tt.add(new tnt(500));
        tt.add(new tnt(200));
        tt.add(new tnt(300));

        for(tnt t:tt){
            System.out.println(t);
            /*
            tnt: 200
            tnt: 300
            tnt: 500
            * */
        }


    }
}

class tnt{
    int num;
    public tnt(int num){
        this.num=num;
    }

    public String toString(){
        return "tnt: "+ num;
    }
}
/*
��Ҫ������дһ���Ƚ�����

    �Ƚ�ʵ�֣�java.util.Comparator�ӿڣ�Comparable ��java.lang����ģ���Comparator ��java.util���µ�
* */

class tntComparator implements Comparator<tnt> {
//    ��Ҫ�ƶ��ȽϹ���
    public int compare(tnt t1,tnt t2){
        return t1.num-t2.num;
    }
}
