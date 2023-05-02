import java.util.Stack;

/*
String���еĳ��÷�����


* */
public class StringTest05 {
    public static void main(String[] args) {

//        charAt(int index)  ---------���� charָ����������ֵ��
        char c="�й���".charAt(1);//�ҳ��ַ����е��±�Ϊ 1 ��λ�õ��ַ�������һ���ַ�ֵ
        System.out.println(c);//��


//        int compareTo(String anotherString); -------�Ƚ��ַ����Ĵ�С(�����ô�С�ں��ж�)������һ������ -1 0 1
//        �ȽϷ�ʽ�������ַ����ĵ�һ�����ͺ���һ���ַ����ĵ�һ�������бȽϣ��ֳܷ�ʤ���Ͳ��ٱȽ��ˣ��ֲ���������һ�����Ƚϵ�����ASCII�еĶ�Ӧ˳��
        int a="abc".compareTo("abc");
        System.out.println(a);//0

        int b="a".compareTo("b");
        System.out.println(b);//-1

        int d="b".compareTo("a");
        System.out.println(d);//1

        int e="abc".compareTo("bca");
        System.out.println(e);//-1


//        �ж�ǰ����ַ������Ƿ����������ַ�����
//        contains(CharSequence s)  ------------���ҽ������ַ�������ָ����charֵ����ʱ�ŷ���true��
        System.out.println("helloworld".contains("hell"));//true
        System.out.println("helloworld".contains("haaaal"));//false


//        �жϵ�ǰ�ַ����Ƿ���ĳ���ַ�����β
//        endsWith(String suffix);
        System.out.println("text.java".endsWith(".java"));//true
        System.out.println("text.java".endsWith(".txt"));//false
        
//        �Ƚ������ַ���������equals������equals����ֻ���ж����������Ƿ���ȣ�compareTo���������ж��Ƿ���ȣ����ҿ��ԱȽ�������Ĵ�С
//        equals��Object anObjects��
        System.out.println("abc".equals("abc"));/*true*/


//        �ж������ַ����Ƿ���ȣ����Դ�Сд��
//        equalsIgnoreCase(String anotherString)
        System.out.println("ABc".equalsIgnoreCase("abc"));//true

//        ���ַ�������ת�����ֽ����飺
//        byte[].getBytes()
        byte[] aa="abc".getBytes();
        System.out.println(aa);//[B@2d98a335------���鲻�����������Ͳ鿴
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }

//        �ж�ĳ�����ַ����ڵ�ǰ�ַ����е�һ�γ��ִ����������±꣩
//        indexOf(String str)
        System.out.println("attjavafreoghrafnkd".indexOf("java"));//3
        System.out.println("attjavafreoghrafnkd".indexOf("jave"));//-1  û��������ַ�����ʱ��ֱ�ӷ��� -1


//        �ж�ı�ַ����Ƿ�Ϊ�գ�
//        isEmpty();
        String s="a";
        String s1="";
        System.out.println(s.isEmpty());//false
        System.out.println(s1.isEmpty());//true-------ע�⣺������ʱ���ǿյģ����ǡ� �����ǿյģ����ո�Ҳ���ǿ�


//        ����ַ������ȣ�
//        length();
//        ע�⣺�����⣺
//        �ж����鳤�Ⱥ��ж��ַ������Ȳ�һ��-------�ж����鳤��length�����ԣ��ж��ַ������ȵ�length��length()����

        System.out.println("".length());//0
        System.out.println("abc".length());//3
        System.out.println("������".length());//3


//      �ж�ĳ�����ַ����ڵ�ǰ�ַ��������һ�γ��ֵ��������±꣩
//        lastIndexOf(String str)---------����һ��int����
        System.out.println("abcdjavaejava".lastIndexOf("java"));//9
        System.out.println("abcdjavaejava".lastIndexOf("a"));//12


//       ���µ��ַ����滻�ɵ��ַ���������һ���µ��ַ���
//        replace(char oldChar,char newChar)
        char cha='a';
        char cha1='b';
        System.out.println("aaaa".replace(cha,cha1));//bbbb


//        ���µ��ַ����滻�ɵ��ַ���������һ���µ��ַ���
//        replace(CharSequence target,CharSquence replacement)-------------CharSequenceҲ�������һ���ַ�������һ���ӿڣ����ַ���Stringʵ��
        String newString="aaaabbbbcccc".replace("aaa","hhh");
        System.out.println(newString);//hhhabbbbcccc
        String newString1="hhhhiiiiidddd====".replace("=","+");
        System.out.println(newString1);//hhhhiiiiidddd++++


//      ����ַ�����
//        split(String regex)-----������String����
        String[] spl="1998-10-24".split("-");//-----�� - �ָ������в��
        for (int i = 0; i < spl.length; i++) {
            System.out.println(spl[i]);
        }


//        �ж�ĳ���ַ����Ƿ���ı�ַ�����ʼ��
//        startsWith(String prefix)
        System.out.println("addidojdof".startsWith("add"));//true
        System.out.println("addidojdof".startsWith("dd",1));//true------�����ǰ������±�Ϊ1���㣬dd�ǲ��ǵ�һ���ַ�

//        ��ȡ�ַ�����ȡָ���������������ֵ
//        substring(int beginIndex)
        System.out.println("abudhaifdjava".substring(9));//java

//        ��ȡ�ַ�����ȡָ����Χ��ֵ
//        substring(int beginIndex,int endIndex)------ֻȡbeginIndex��Ӧλ�õ������ұߵ�endIndex�ǲ������ġ�����ҿ�--������ķ�������
        System.out.println("aaabbbccc".substring(2,5));//abb


//        ���ַ���ת��Ϊchar���飺
//        toCharArray()
        char[] chars="������ z w m".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("-----------------"+new String(chars));//-----------------������ z w m

//        ����ͨ������Ķʽ���������ɵ��ַ�����ջ������
        Stack<Character> stack=new Stack<>();
        stack.size();

//        ת��ΪСд��
//        toLowerCase()
        System.out.println("AbCA".toLowerCase());//abca


//        ת��Ϊ��д��
//        toUpperCase()
        System.out.println("abc".toUpperCase());//ABC


//        ȡ���ַ���ǰ��Ŀհף�
//        trim()
        System.out.println("   ��   ����    ".trim());//��   ����         ֻȡ��ǰ�����ߵģ���ȥ���м��


//        String��ֻ��һ����̬����������Ҫnew����,ֱ��ͨ������������--------valueOf���� ���ַ��� ת��Ϊ �ַ���
        String ss=String.valueOf(true);//true--�����ǲ������ͣ������ַ�����
        String s2=String.valueOf(100);//100---�������������ͣ������ַ�������
        String s3=String.valueOf(3.15);//3.15---�����Ǹ����ͣ����ַ�������
        System.out.println(ss);
        System.out.println(s2);
        System.out.println(s3);

        String s4=String.valueOf(new Customer());//�����̬valueOf������������һ�������ʱ�򣬻��Զ��������õ�toString������
        System.out.println(s4);//Customer@27d6c5e0------������û����дtoString����ʱ
        //��дtoString����------��д֮��

//        ��ʵ���ǣ�
        Object obj=new Customer();
        String s5=String.valueOf(obj);
        System.out.println(s5);//��дtoString����

//        ͨ��Դ���������Ϊʲô���һ�����õ�ʱ�򣬻��Զ�����toString������
//        ������Ϊ��System.out.println() ִ��ʱ��println ���������� valueOf �������� valueOf �����ֵ����� toString ������
        System.out.println(new Customer());//println������valueOf������Ȼ�� valueOf �����ֵ����� toString������

    }
}

class Customer{

    @Override
    public String toString() {
        return "��дtoString����";
    }
}