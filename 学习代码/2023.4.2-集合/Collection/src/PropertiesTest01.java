/*
Properties ������������ط�����

    Properties��һ��Map���ϣ��̳�Hashtable��Properties��key��value����String���ͣ�

    Properties ����Ϊ���������

    Properties ���̰߳�ȫ��
* */

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
//        ����һ��Properties����
        Properties pro=new Properties();

//        Ҫ����Properties�Ĵ�ȡ����
//        pro.put("a","hahah");�������ԣ�������Ҳ��
        pro.setProperty("a","haha");
        pro.setProperty("b","niganma");
        pro.setProperty("c","aiyou");
        pro.setProperty("d","quququ");

//        ͨ��key��ȡvalue
//        System.out.println(pro.get("a"));�������ԣ�����ȡҲ��
        String a=pro.getProperty("a");
        String b=pro.getProperty("b");
        String c=pro.getProperty("c");
        String d=pro.getProperty("d");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
