import java.util.Stack;

/*
String类中的常用方法：


* */
public class StringTest05 {
    public static void main(String[] args) {

//        charAt(int index)  ---------返回 char指定索引处的值。
        char c="中国人".charAt(1);//找出字符串中的下标为 1 的位置的字符，返回一个字符值
        System.out.println(c);//国


//        int compareTo(String anotherString); -------比较字符串的大小(不能用大小于号判断)：返回一个整数 -1 0 1
//        比较方式，拿着字符串的第一个数和后面一个字符串的第一个数进行比较，能分出胜负就不再比较了，分不出，比下一个。比较的是在ASCII中的对应顺序
        int a="abc".compareTo("abc");
        System.out.println(a);//0

        int b="a".compareTo("b");
        System.out.println(b);//-1

        int d="b".compareTo("a");
        System.out.println(d);//1

        int e="abc".compareTo("bca");
        System.out.println(e);//-1


//        判断前面的字符串中是否包含后面的字符串：
//        contains(CharSequence s)  ------------当且仅当此字符串包含指定的char值序列时才返回true。
        System.out.println("helloworld".contains("hell"));//true
        System.out.println("helloworld".contains("haaaal"));//false


//        判断当前字符串是否以某个字符串结尾
//        endsWith(String suffix);
        System.out.println("text.java".endsWith(".java"));//true
        System.out.println("text.java".endsWith(".txt"));//false
        
//        比较两个字符串必须用equals方法：equals方法只能判断两个数组是否相等，compareTo方法不仅判断是否相等，而且可以比较两数组的大小
//        equals（Object anObjects）
        System.out.println("abc".equals("abc"));/*true*/


//        判断两个字符串是否相等，忽略大小写：
//        equalsIgnoreCase(String anotherString)
        System.out.println("ABc".equalsIgnoreCase("abc"));//true

//        将字符串对象转换成字节数组：
//        byte[].getBytes()
        byte[] aa="abc".getBytes();
        System.out.println(aa);//[B@2d98a335------数组不能这样遍历和查看
        for (int i = 0; i < aa.length; i++) {
            System.out.println(aa[i]);
        }

//        判断某个子字符串在当前字符串中第一次出现处的索引（下标）
//        indexOf(String str)
        System.out.println("attjavafreoghrafnkd".indexOf("java"));//3
        System.out.println("attjavafreoghrafnkd".indexOf("jave"));//-1  没有这个子字符串的时候，直接返回 -1


//        判断谋字符串是否为空：
//        isEmpty();
        String s="a";
        String s1="";
        System.out.println(s.isEmpty());//false
        System.out.println(s1.isEmpty());//true-------注意：“”的时候是空的，但是“ ”不是空的，，空格也不是空


//        求解字符串长度：
//        length();
//        注意：面试题：
//        判断数组长度和判断字符串长度不一样-------判断数组长的length是属性，判断字符串长度的length是length()方法

        System.out.println("".length());//0
        System.out.println("abc".length());//3
        System.out.println("张威明".length());//3


//      判断某个子字符串在当前字符串中最后一次出现的索引（下标）
//        lastIndexOf(String str)---------返回一个int类型
        System.out.println("abcdjavaejava".lastIndexOf("java"));//9
        System.out.println("abcdjavaejava".lastIndexOf("a"));//12


//       用新的字符串替换旧的字符串，返回一个新的字符串
//        replace(char oldChar,char newChar)
        char cha='a';
        char cha1='b';
        System.out.println("aaaa".replace(cha,cha1));//bbbb


//        用新的字符串替换旧的字符串，返回一个新的字符串
//        replace(CharSequence target,CharSquence replacement)-------------CharSequence也代表的是一个字符串，是一个接口，被字符串String实现
        String newString="aaaabbbbcccc".replace("aaa","hhh");
        System.out.println(newString);//hhhabbbbcccc
        String newString1="hhhhiiiiidddd====".replace("=","+");
        System.out.println(newString1);//hhhhiiiiidddd++++


//      拆分字符串：
//        split(String regex)-----返回以String数组
        String[] spl="1998-10-24".split("-");//-----以 - 分隔符进行拆分
        for (int i = 0; i < spl.length; i++) {
            System.out.println(spl[i]);
        }


//        判断某个字符串是否以谋字符串开始：
//        startsWith(String prefix)
        System.out.println("addidojdof".startsWith("add"));//true
        System.out.println("addidojdof".startsWith("dd",1));//true------如果当前数组从下标为1来算，dd是不是第一个字符

//        截取字符串：取指定索引后面的所有值
//        substring(int beginIndex)
        System.out.println("abudhaifdjava".substring(9));//java

//        截取字符串。取指定范围的值
//        substring(int beginIndex,int endIndex)------只取beginIndex对应位置的数，右边的endIndex是不包含的。左闭右开--和上面的方法重载
        System.out.println("aaabbbccc".substring(2,5));//abb


//        将字符串转化为char数组：
//        toCharArray()
        char[] chars="张威明 z w m".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println("-----------------"+new String(chars));//-----------------张威明 z w m

//        可以通过下面的额方式将上面生成的字符存在栈集合中
        Stack<Character> stack=new Stack<>();
        stack.size();

//        转换为小写：
//        toLowerCase()
        System.out.println("AbCA".toLowerCase());//abca


//        转换为大写：
//        toUpperCase()
        System.out.println("abc".toUpperCase());//ABC


//        取出字符串前后的空白：
//        trim()
        System.out.println("   张   威明    ".trim());//张   威明         只取出前后两边的，不去除中间的


//        String中只有一个静态方法，不需要new对象,直接通过类名来调用--------valueOf：将 非字符串 转换为 字符串
        String ss=String.valueOf(true);//true--不再是布尔类型，而是字符类型
        String s2=String.valueOf(100);//100---不再是整数类型，而是字符串类型
        String s3=String.valueOf(3.15);//3.15---不再是浮点型，是字符串类型
        System.out.println(ss);
        System.out.println(s2);
        System.out.println(s3);

        String s4=String.valueOf(new Customer());//这个静态valueOf方法，参数是一个对象的时候，会自动调用引用的toString方法。
        System.out.println(s4);//Customer@27d6c5e0------在子类没有重写toString方法时
        //重写toString方法------重写之后

//        其实就是：
        Object obj=new Customer();
        String s5=String.valueOf(obj);
        System.out.println(s5);//重写toString方法

//        通过源代码分析，为什么输出一个引用的时候，会自动调用toString方法？
//        这是因为，System.out.println() 执行时：println 方法调用了 valueOf 方法，而 valueOf 方法又调用了 toString 方法。
        System.out.println(new Customer());//println调用了valueOf方法，然后 valueOf 方法又调用了 toString方法。

    }
}

class Customer{

    @Override
    public String toString() {
        return "重写toString方法";
    }
}