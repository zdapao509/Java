/*
ͨ���˷�����֤��String���͵ıȽϣ�������==,Ӧ����equals����

String���Ѿ���д��Object�е�equals����
* */
public class StringTest02 {
    public static void main(String[] args) {
        String a="aaa";
        //aaa �Ǵ洢�ڷ��������ַ����������еģ�����  ���  aaa  �ǲ����½��ģ���Ϊ��������Ѿ������ˣ�
        String b="aaa";
        //Ҳ����˵��ֻ�ǽ� aaa  ����������ַ����������е��ڴ��ַ����  a �� b ���������ã�
        System.out.println(a==b);//���ص��� true  ��Ϊָ��ͬһ���ڴ��ַ

        String c=new String("xyz");
        String d=new String("xyz");
        System.out.println(c==d);//���ؽ����false ��Ϊ����ʱ c �� d �����������д���Ǵ����� String�����ڶ��ڴ��еĵ�ַ��
        // ��String���������� ��  xyz ����ַ����ڷ������е��ַ����������е� �ڴ��ַ

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        System.out.println("xyz".equals(c));
        //Ϊʲô "xyz"  ����ַ������Լ�  .  �أ�
        // ��Ϊ�κ�һ���ַ�������һ��String���͵Ķ�������дһ���ַ�����ʱ��ʵ���Ͼ��Ѿ�������һ���ַ�������
        // ���������� ���������ַ����������У��������ԭString�������ṩ�ķ�������String���Ѿ��Ը���Object�е�equals������������д�����Կ��Ե���

//        �Ƚ�һ�� ���� �� �ַ��� �Ƿ���ȵ�ʱ����ý� �ַ��� д��ǰ�棻�������Ա������Ϊ�� ����Ϊ null ��ʱ��
//        ����û�д����ݣ���֪��ָ���ĸ����󣬸���֪������������ʲô����������  ��ָ���쳣

        String e=null;
        System.out.println(e.equals("xyz"));//NullPointerException---��ָ���쳣
    }
}
