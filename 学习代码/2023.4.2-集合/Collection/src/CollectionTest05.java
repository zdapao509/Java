/*
���룺
    Collection���ϵ�contains����:    boolean contains(Object o)

    �жϼ������Ƿ����ĳ������ o ��

        �������������true

    contains�����������жϼ������Ƿ��а���ĳ��Ԫ�صķ������ײ���������ô�жϼ������Ƿ����ĳ��Ԫ���أ�

        ������equals���������бȶԡ�����true�ͱ�ʾ�������Ԫ��
* */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        Collection a = new ArrayList();

        String s1 = new String("abc");
        String s2 = new String("def");

        a.add(s1);
        a.add(s2);

        System.out.println(a.contains("abc"));//true

        String s3="abc";
        System.out.println(a.contains(s3));//true------------
        // ����ע�⣺���ϵ�contains�����ǱȽ����յ��ַ����ǲ�����ȣ����ǱȽϵ��ڴ��ַ����Ϊ���������equals����

        String s4=new String("abc");
        System.out.println(a.contains(s4));//true


    }
}