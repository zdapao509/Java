package com.bjpowernode.chapter.array;
//模拟一个系统：假设该系统要使用的话，必须输入用户名和密码
public class ArrayTest06 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("要是用系统，请输入用户名和密码，例如：  zhangweiming 123");
            return;
        }
//        如果程序能执行到此处的话，表示输入了两个字符串
        String username=args[0];
        String password=args[1];
//        if(username.equals("admin")||password.equals("123")){
//        在进行字符串的判断的时候，尽量采用下面的方式：避免出现空指针异常；采用下面的编码风格，即使后面的username或者password都是null，也不会出现空指针异常
        if("admin".equals(username)||"123".equals(password)){
            System.out.println("密码正确");
        }else{
            System.out.println("验证错误");
        }
    }
}
