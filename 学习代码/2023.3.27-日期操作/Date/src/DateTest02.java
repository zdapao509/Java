/*
��ȡ��1970��1��1��00:00:00 000����ǰϵͳʱ����ܺ�����----------����ͳ�ƴ��������ʱ��


�ܽ᣺
    System���������Ժͷ�����
        System.out             out ��System�ľ�̬����
        System.out.println()         println����System��ģ���PrintStream��ķ���
        System.gc()   ���������������ջ���
        System.currentTimeMills() ��ȡ1970 1 1 ��ϵͳ��ǰʱ����ܺ�����
        System.exit(0) �˳�JVM
* */
public class DateTest02 {
    public static void main(String[] args) {
//        ��ȡ��1970��1��1��00:00:00 000����ǰϵͳʱ����ܺ�����
        long nowTimeMillis=System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1679922598917

//        ��������ͳ��һ����������ʱ���ڵ���Ŀ�귽��֮ǰ��¼һ��ʱ��
        long begin=System.currentTimeMillis();
        print();
//        ִ�з���֮���ٵ���һ�μ�¼������
        long end=System.currentTimeMillis();
        System.out.println("��ʱ��"+(end-begin));
    }

    public static void print(){
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
