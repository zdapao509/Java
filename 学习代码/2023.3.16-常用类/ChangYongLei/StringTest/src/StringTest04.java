/*
����String���еĹ��췽��

���õĹ��췽����

            String a="aaa";

            String s=new String("aa");

            String a=new String(char����);

            String a=new String(char���飬����Ԫ���±����ʼλ�ã�����);

            String a=new String(byte����);

            String a=new String(byte���飬����Ԫ���±����ʼλ�ã�����);
* */
public class StringTest04 {
    public static void main(String[] args) {
        String s1="aaa";//������򵥵�һ���ַ�����������
        System.out.println(s1);//����Ӧ����������ڴ��ַ�����ǣ����һ�����õ�ʱ�򣬻��Զ��������õ�toString������
        // ����֤����String���Ѿ���д��toString����


//        ֻ���ճ��õĹ��췽��
        byte[] bytes={97,98,99,100,127};
        String a=new String(bytes);//����ʱ���ֽ������Ȱ���ASCII��ת��Ϊ�ַ���Ȼ�󴴽��ַ�����������ַ��������أ�����ڶ��ڴ����洴���ַ�������
        System.out.println(a);//abcd


//        String���ֽ����飬����Ԫ���±����ʼλ�ã����ȣ�-----String(byte[] bytes, int offset, int length)
        String b=new String(bytes,1,2);
        System.out.println(b);//bc-���ֽ�������ָ��λ�õ�Ԫ��ת��Ϊ�ַ���

//        ��char�����е�ȫ��ת��Ϊ�ַ���
        char[] c= {'��','��','��','��','��'};
        String cc=new String(c);
        System.out.println(cc);//�����й���

//        ��char�����е�һ����ת��Ϊ�ַ���
        String ccc=new String(c,2,3);
        System.out.println(ccc);//�й���
    }
}

