/*
hashCode������

    ��Object�е�hashCode������ԭ�룺

        public native int hashCode();

        ����������ǳ��󷽷�������native�ؼ��֣��ײ��ǵ��õ�C++���򣻷���ֵ��int����

     hashCode�������ص��ǣ���ϣ��

        ʵ���Ͼ���һ��Java������ڴ��ַ��������ϣ�㷨���ó�һ��ֵ������hashCode����������ִ�н�����Ե�ͬ������һ��Java������ڴ��ַ
* */

public class hashcode {
    public static void main(String[] args) {
        Object obj=new Object();
        int hashCode01=obj.hashCode();
        System.out.println(hashCode01);//764977973

        //�����ڴ��ַ������ϣ�㷨ת����һ�����֣����Ե�ͬ�����ڴ��ַ

        MyClass a=new MyClass();
        int hashCode02=a.hashCode();
        System.out.println(hashCode02);//2129789493

    }
}

class MyClass{

}
