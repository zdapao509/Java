package com.bjpowernode.chapter.array;
//ģ��һ��ϵͳ�������ϵͳҪʹ�õĻ������������û���������
public class ArrayTest06 {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Ҫ����ϵͳ���������û��������룬���磺  zhangweiming 123");
            return;
        }
//        ���������ִ�е��˴��Ļ�����ʾ�����������ַ���
        String username=args[0];
        String password=args[1];
//        if(username.equals("admin")||password.equals("123")){
//        �ڽ����ַ������жϵ�ʱ�򣬾�����������ķ�ʽ��������ֿ�ָ���쳣����������ı����񣬼�ʹ�����username����password����null��Ҳ������ֿ�ָ���쳣
        if("admin".equals(username)||"123".equals(password)){
            System.out.println("������ȷ");
        }else{
            System.out.println("��֤����");
        }
    }
}
