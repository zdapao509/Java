/*
JDK5.0�������ԣ���ǿforѭ��  ���߽�foreach

��ǿforѭ����ȱ��:

    û���±ꣻ����Ҫʹ���±��λ�ã�������ʹ����ǿforѭ��

* */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest01 {
    public static void main(String[] args) {
        int[] arr={10,23,56,4685,45,131};
//        �������飺
        for(int i:arr){
            System.out.println(i);
        }

        List<String> a=new ArrayList<>();
        a.add("123");
        a.add("��");
        a.add("weimign");

//        ��һ�ֱ�����ʽ����������
        Iterator<String> s=a.iterator();
        while(s.hasNext()){
            String aa=s.next();
            System.out.println(aa);
        }

//        �ڶ��ֵ�����ʽ��ֱ��get����
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

//        �����ַ�������ǿforѭ��
        for(String s1:a){
            System.out.println(s1);
        }
    }
}
