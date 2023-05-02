/*
���������ڣ�

    Java�����е��ַ���String��û����дtoString������������û����дequals������

    �ܽ᣺

        1.String���Ѿ���д��equals�������Ƚ������ַ�������ʹ��==������ʹ��equals������equals��ͨ�õġ�

        2.String ���Ѿ���д��toString������

    ����ۣ�

        Java��ʲô���͵����ݿ���ʹ��"=="�жϣ�

            Java�л����������͵ıȽ��Ƿ���ȣ�ʹ��==

        Java��ʲô�������͵�ʹ����Ҫequals�ж�

            Java�����е�������������ͳһʹ��equals�������ж��Ƿ���ȡ�

            ���ǹ��
* */

public class Test {
    public static void main(String[] args) {

        //�󲿷�����£����������ķ�ʽ�����ַ�������
        String s1="test";
        String s2="test";
        System.out.println(s1==s2);//true����Ϊ�ֲ��������ֵ�ʱ����������ȵġ������ֲ�����֮����==�жϵ�������ֵ��ȡ�û�е���equals����
        System.out.println(s1);//test

        //ʵ���ϣ�StringҲ��һ���࣬�����ڻ����������ͣ����ԣ���ȻString��һ���࣬��ô�����ڹ��췽����
        String s3=new String("test");
        String s4=new String("test");
        System.out.println(s3==s4);//false
        //new���Σ����������ڴ��ַ��s3������ڴ��ַ��s4������ڴ��ַ��ͬ��==�жϵ��������ڴ��ַ����������
        System.out.println(s3.equals(s4));//true ��˵����equals�����Ѿ��޸������ж϶���������Ƿ���ȣ��������ж���������ڴ��ַ�Ƿ����
        System.out.println(s1.equals(s3));//true �ж����ݶ����ǵ�ַ
        System.out.println(s1==s3);//false����Ȼ������ͬ����������û�е���toString���������Ժ����Ǵ����ڴ��ַ�ģ����߲����
        System.out.println(s3);//test----------��Ȼ������ʾ��s3��ֵ��test��s1��ֵ����������ȵģ�����test��
        // ����ʵ���ϣ������s3�������������ͣ����Ե��õ�ʱ��ʵ�����ǣ�s3.toString�����������Ҳ�дtoString������ʱ��ϵͳĬ�ϵ��ã�
        // Ҳ����s3+�ڴ��ַ��ʮ�����ƣ�������������String�������Ѿ���toString������������д��
        // ���ԣ��������ڴ��ַ�������ⲻ����s1��s3������ˣ��ڴ��ַֻ��������

        //String����û����дtoString������
        String x=new String("�����ڵ�");
        //���Stringû����дtoString����������Ľ��Ӧ���ǣ�Java.lang.String@ʮ�����Ƶ��ڴ��ַ
        //�������ԣ�String���Ѿ���д��toString������
        System.out.println(x.toString());//�����ڵ�
        System.out.println(x);//�����ڵ�

    }
}
