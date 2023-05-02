import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String a="A man, a plan, a canal: Panama";
        char[] str1=a.toCharArray();
        String aa=new String(str1);
        System.out.println(str1);
        

    }
    public static boolean isPalindrome(String s) {
        StringBuffer str=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                str.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(str);
        StringBuffer res=new StringBuffer(str).reverse();
        System.out.println(res);
        return res.toString().equals(str.toString());
//        return res.equals(str);
    }
}


