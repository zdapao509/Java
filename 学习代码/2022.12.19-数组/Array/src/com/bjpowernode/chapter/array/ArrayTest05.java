package com.bjpowernode.chapter.array;
/*
* 1.main��������ġ�String[] args����ʲô��˼��
*
*       ����һ�£�˭�������main������JVM��
*       JVM����main������ʱ����Զ���һ��String�������
*
* java����DOS�����ʱ�򣺿��Դ�RUN�����ҵ�EditConfiguration,������һ��Program arguments����һ�²����ͺ�
* */
public class ArrayTest05 {

//   �����������Ա����д������JVM������ã�JVM���õ�ʱ��һ���ᴫһ��String�������

    public static void main(String[] args) {

//JVMĬ�ϴ��ݹ������������ĳ�����:Ĭ��Ϊ0
//        ͨ�����Եó���args����null��----------args��һ�������������ͣ�Ҳ����˵����һ�����ô�����ڴ��ַ�����args==null,�ͻ���ֿ�ָ���쳣������
//        ���ﲢû�г��ֿ�ָ���쳣���ͱ���args����ֵ�ģ�JVM�Ǹ������˵�ַ��

        System.out.println("JVM����������String������������������ĳ����ǣ�"+args.length);


//        �������ʲôʱ���������ֵ�أ�
//        ��ʵ��������������û��ģ��û������ڿ���̨�����������������Զ���ת��Ϊ����String[] args��
//        �������������г���java ArrayTest05 abc def xyz
//        ��ô���ʱ��JVM���Զ�����abc def xyz��ͨ���ո�ķ�ʽ���з��룬�������֮���Զ��ŵ���String[] args��������
//        ����main�����е�String[] args ������Ҫ�����������û�����Ĳ�����
//        ��abc def xyzת�����ַ������飺{��abc��,"def","xyz"}
//        �������飺
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }




//        �������д���˵����������󴴽��ˣ�����������û���κζ���
        String[] a=new String[0];//java: ȱ������ά------�������������ʲô������Ļ����ͻ���������
        String[] aa={};
        printLength(aa);



    }
    public static void printLength(String[] args){
        System.out.println(args.length);
    }
}
