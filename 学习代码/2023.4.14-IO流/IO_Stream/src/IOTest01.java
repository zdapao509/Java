/*
IO����ʲô��IO?

    I : Input

    o : outputͨ��IO�������Ӳ���ļ��Ķ���д


IO���ķ���?   �ж��ַ��෽ʽ

    һ�ַ�ʽ�ǰ������ķ�����з������ڴ���Ϊ��������ڴ���ȥ����������(Input)�����߽�����(Read)��

         ���ڴ��г������������(output)�����߽���д(write)��

    һ�ַ�ʽ�ǰ��ն�ȡ���ݷ�ʽ��ͬ���з���:

        �ֽ����� �е����ǰ����ֽڵķ�ʽ��ȡ���ݣ�һ�ζ�ȡ1���ֽ�byte����ͬ��һ�ζ�ȡ8��������λ�������������ܵģ�ʲô���͵��ļ������Զ�ȡ��

                ����:�ı��ļ���ͼƬ�������ļ�����Ƶ

            �����ļ�filel.txt������  �ֽ���  �Ļ�����������:

                a�й�bc����fe

                    ��һ�ζ�:1���ֽ����ö���'a'

                    �ڶ��ζ�:һ���ֽڣ����ö����С��ַ���һ��

                    �����ζ�:һ���ֽڣ����ö������С��ַ�������һ��


        �ַ������е����ǰ��� �ַ� �ķ�ʽ��ȡ���ݵģ�һ�ζ�ȡһ���ַ�����������Ϊ�˷����ȡ��ͨ�ı��ļ������ڵģ�

                ���������ܶ�ȡ: ͼƬ����������Ƶ���ļ���ֻ�ܶ�ȡ���ı��ļ�����word�ļ����޷���ȡ��

                �����ļ�file1.txt�������ַ����Ļ�����������:

                    a�й�bc����fe

                ��һ�ζ�: 'a'�ַ� (a'�ַ���windowsϵͳ��ռ��1���ֽ�)

                �ڶ��ζ�:'�С��ַ� ('��'�ַ���windowsϵͳ��ռ��2���ֽ�)��


        ��������: ���ķ���

                �������������

                �ַ������ֽ���


java��IO���Ѿ�д���ˣ���Ҫ����Java���ṩ����Щ����ÿ�������ص���ʲô��ÿ��������ĳ��÷�����ʲô

    java�����е���������java.io.*�£�

    java��Ҫ�������о�����ônew�����󣬵�����������Ǹ������Ƕ��ĸ�������д


java IO�����Ĵ���壺

    �Ĵ��������죺-------------��Ϊ������

        java.io.InputStream  �ֽ�������

        java.io.OutputStream  �ֽ������

        java.io.Reader    �ַ�������

        java.io.Writer    �ַ������


    ���е�����ʵ���ˣ�

        java.io.Closeable�ӿڣ����ǿɹرյģ�����close����������

        ���Ͼ���һ���ܵ������ڴ��Ӳ��֮���ͨ����������֮��һ��Ҫ�رա���Ȼ��ռ�úܶ���Դ��

    ���е��������ʵ���ˣ�

        java.io.Flushable�ӿڣ����ǿ�ˢ�µģ�����flush()������

        ����ϰ�ߣ���������������֮��һ��Ҫ�ǵ�flush������ˢ��һ�£�

            ���ˢ�·�����ͨ�����ܵ��е�ʣ��δ���������ǿ������꣬��չܵ���-----ˢ�µ�����

            ע�⣺���û��flush�������ܻᵼ�����ݶ�ʧ


    java��ֻҪ������stream��β�Ķ����ֽ�������Reader/Writer��β�Ķ����ַ���


java.io����Ҫ���յ�����16����

    �ļ�ר����

        java.io.FileInputStream
        java.io.FileOutputStream
        java.io.FileReader
        java.io.FileWriter

    ת���������ֽ���ת��Ϊ�ַ���

        java.io.InputStreamReader
        java.io.OutputStreamWriter

    ����ר������

        java.io.BufferedReader
        java.io.BufferedWriter
        java.io.BufferedInputStream
        java.io.BufferedOutputStream

    ����ר������

        java.io.DateInputStream
        java.io.DateOutputStream

    ��׼ר������

        java.io.PrintWriter
        java.io.PrintStream

    ר����������

        java.io.ObjectInputStream
        java.io.ObjectOutputStream

* */
public class IOTest01 {
    public static void main(String[] args) {
/*                System.out.println("-1234".matches("-?\\d+"));
                System.out.println("5678".matches("-?\\d+"));
                System.out.println("+911".matches("-?\\d+"));
                System.out.println("+911".matches("(-|\\+)?\\d+"));
                System.out.println("-81.23".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println("+81.23".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println("xx".matches("(-|\\+)?(\\d+)?.?\\d*"));
                System.out.println(".5".matches("(-|\\+)?(\\d+)*.?\\d*"));
                System.out.println(" ".matches("(-|\\+)?(\\d+)?.?\\d+"));
                System.out.println(".5".matches("(-|\\+)?(\\d+).?\\d\\d*"));
                System.out.println("55.0".matches("(-|\\+)?(\\d+)*.?\\d+"));
                */
        System.out.println("123".matches("\"^(\\-|\\+)?\\d+(\\.\\d+)?$\""));
        int a=0;
        switch (a){
            
        }
    }
}
