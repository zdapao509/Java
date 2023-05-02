import java.util.*;

/*
Collections�����ࣺ

    java.util.Collection  ���Ͻӿ�

    java.util.Collections  ���Ϲ����࣬���㼯�ϵĲ���

* */
public class CollectionsTest01 {
    public static void main(String[] args) {
//        ArrayList���ϲ����̰߳�ȫ��
        List<String> list=new ArrayList<>();

//        ����̰߳�ȫ��
        Collections.synchronizedList(list);

//        ����
        list.add("x");
        list.add("a");
        list.add("z");
        list.add("y");

        Collections.sort(list);

        for(String ele:list){
            System.out.println(ele);
            /*
            a
            x
            y
            z
            * */
        }

//        ��List�����е�Ԫ��������Ҫ��֤List�����е�Ԫ��ʵ���ˣ�Comparable�ӿ�
        List<er> li=new ArrayList<>();
        li.add(new er(19));
        li.add(new er(15));
        li.add(new er(17));
        li.add(new er(5));

        Collections.sort(li);//reason: no instance(s) of type variable(s) T exist so that er conforms to Comparable<? super T>

        for(er ele:li){
            System.out.println(ele);
            /*
             ****   5
             ****   15
             ****   17
             ****   19
             * */
        }

//        ����set������ô��������   ֱ����ArrayList��Ĺ��췽������set����ת��list����  �ٽ�������
        Set<String> tr=new HashSet<>();

        tr.add("s");
        tr.add("y");
        tr.add("a");

        List<String> o=new ArrayList<>(tr);
        Collections.sort(o);

        for(String s:o){
            System.out.println(s);
            /*
            a
            s
            y
            * */
        }

//        �����Ը�⽫list�����е�Ԫ�ؽ���ʵ��Comparable�ӿڣ�Ҳ����ͨ��

    }
}


class er implements Comparable<er>{
    int a;

    public er(int a){
        this.a=a;
    }


    public int compareTo(er e){
        return this.a-e.a;
    }


    public String toString(){
        return "   ****   "+a;
    }
}
