/*
Ƶ���Ľ����ַ�����ƴ����ʲô���⣺
    ��Ϊjava�е��ַ����ǲ��ɱ�ģ�ÿһ��ƴ�Ӷ�������µ��ַ�����
    ��ռ�ô����ķ������ڴ档
    String s="abc";
    s+="hello";
    �������������Ѿ��ڷ������е��ַ������������洴����3������
    "abc"
    "hello"
    "abchello"


    ����Ժ�Ҫ���д������ַ�����ƴ�ӹ���������ʹ��JDK���Դ��ģ�

        java.lang.StringBuffer
        java.lang.StringBuilder


StringBuffer�ײ�ʵ������һ��byte[]���飻
    ��StringBuffer�з��ַ�����ʵ�����Ƿŵ�byte���鵱���ˣ�
    StringBuffer�ĳ�ʼ��������16

����Ż�StringBuffer�����ܣ�
    �ڴ���StringBuffer��ʱ�򣬾����ܶ�һ����ʼ��������-------------���ݴ���Խ�٣�Ч��Խ��
    ��ü��ٵײ���������ݴ�����Ԥ����һ�£���һ����һЩ�ĳ�ʼ��������

String�����ַ��������StringBuffer��������ʱ���ײ�ͬ��������һ��byte���飬���������ǣ�

        String�е������Ǳ�final������: private final byte[] value;��StringΪʲô���ɱ�����ɣ����鱻final���Σ�

        ��StringBuffer�е�������û�б����ε�: byte[] value;



        StringBuffer�������������һ������-->����һ�������������˵�ʱ�򣬾ͻᴴ��һ���µĳ��ȵ��������

        ��ԭ�ȵ������е�������������Ȼ��ָ��ָ���µ��������Ȼ��ԭ����ͻᱻ��������������,�ﵽ�����ڴ�ռ�õ�Ŀ�ġ�

        ��String�е��ַ����Ͳ�����������Ϊ�����ڴ��ַһ��ȷ���Ͳ��ܱ��޸ģ���final�����ˡ�


 StringBuilder��ͬ����������ַ���ƴ��
    ��StringBuffer�����𣬣�
    StringBuffer�еķ������У�synchronized�ؼ������Σ���ʾ��StringBuffer�ڶ��̻߳����������ǰ�ȫ�ġ�
    StringBuilder�еķ�����û��synchronized�ؼ������Σ���ʾStringBuilder�ڶ��̻߳����������ǲ���ȫ��

    StringBuilder�Ƿ��̰߳�ȫ�ġ�
    StringBuffer���̰߳�ȫ�ġ�


�����⣺String�ǲ��ɱ�ģ�Ϊ����

        �ҿ���Դ���룬String������һ��byte[] ���飬���byte���鱻final�����ˡ�
        ��Ϊ����һ���������Ȳ��ɱ䣬���ұ�final���ε�����һ��ָ��ĳ������֮�󣬲�������ָ��������������String�ǲ��ɱ��
        ��abc���޷�ת���ɡ�abcd��

        StringBuffer��StringBuilderΪʲô�ǿɱ�ġ���

        StringBuffer��StringBuilder�ڲ�ʵ������һ��byte[]���飬�������û�б�final���Σ�
        StringBuffer��StringBuilder�ĳ�ʼ������Ӧ����16�����ڴ�����֮�󣬻�������ݣ�
        �ײ����������Ŀ���������System.arraycopy()�������ݵģ�
        ����StringBuffer��StringBuilder�ʺ������ַ�����Ƶ��ƴ�Ӳ���

* */
public class StringBufferTest01 {
    public static void main(String[] args) {
        /*String a="";
        for (int i = 0; i < 100; i++) {
            a+=i;
            System.out.println(a);
        }*/

//        ����һ����ʼ������Ϊ16��byte[]���飬�ַ�������������
        StringBuffer str=new StringBuffer();

//        ƴ���ַ�����ͳһ��append��������
        str.append("��");
        str.append("01");
        str.append(0);
        str.append(100L);
        System.out.println(str);

//        ָ����ʼ��������StringBuffer����
        StringBuffer STR=new StringBuffer(100);
        STR.append(10);
        STR.append("zhang ");
        System.out.println(STR);

//        ����StringBuilder����
        StringBuilder aa=new StringBuilder();
        aa.append("abc");
        aa.append("123");
        System.out.println(aa);

//        �ַ����Ĳ��ɱ���ָ��abc�����ɱ�ɡ�abcd��������ָ�����s���ܱ�
        String s="abc";
        s="abcd";//�����sֻ�Ǵ��ַ����ڷ������е��ַ���������������ڴ��ַ������û�б�final���Σ����Կ��Բ�����
    }
}
