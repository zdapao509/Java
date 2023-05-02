//String����Ƚϵ�ʱ�����ʹ��equals������------------�����ַ������ǲ��ø�ֵ�ķ�ʽ�����ǲ���ʵ��������ķ�ʽʵ��
//
// ��ע�⣺�����ø�ֵ��ʽ��ʱ���ַ������͵�������==�ж��Ƿ����ʱ���ǲ������ģ����ǱȽϵ������Ƿ���ȣ������Ǳ��ڴ��ַ��
// ���ǣ�ʵ�����Ͳ�һ���ˣ�ʵ������==�ȽϾͱȽϵ����ڴ��ַ��

//equals�﷨���ַ������͵�����.equals���ַ������͵����ݣ���

public class Test01 {
    public static void main(String[] args) {
        Student s1=new Student(123,"�Ӹ�ׯ��ѧ");
        Student s2=new Student(456,"�Ӹ�ׯһ��");
        Student s3=new Student(456,"�Ӹ�ׯһ��");
        Student s4=new Student(456,new String("�Ӹ�ׯһ��"));

        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true

        System.out.println(s2.equals(s4));//false---���equals�������õĲ���equals�����ж����ַ�����ȶ��ǲ���==�ķ�ʽ�Ļ���
        // �ͻ�������ִ���ʵ����s2��s4����ȵģ�Ҳ�������ݶ���ͬ����ΪӦ����ȣ�ֻ���ڴ��ַ��ͬ

        //�Ļص���equals�����ж��ַ����Ƿ���ȣ��ͻ������ȷ�����true


    }
}

class Student{
    int no;//ѧ��
    String school;//ѧУ

    public Student(){

    }

    public Student(int no,String school){
        this.no=no;
        this.school=school;
    }

    public String toString(){
        return this.no+"--ѧ��"+this.school+"--ѧУ";
    }

    public boolean equals(Object obj){
        if (this==null||!(obj instanceof Student)) return false;
        if (this==obj) return true;
        Student student =(Student)obj;

        return this.no==student.no && this.school.equals(student.school);//---------������﷨�ǣ�school����String���ͣ�
        // ��String���������������͵����ݣ����ǿ������Լ��ķ����ģ��������������String������ģ�equals������
        // equals������ǰ��Ӧ�����ַ������͵����ݣ��������洫�ò���Ӧ��Ҳ���ַ������͵Ĳ���

//        return this.no==student.no && this.school==student.school;//������д���Ǵ���ģ�
        // �����ֱ��String��ֵ�ķ�ʽ�Ļ�������ȷʵ�����ж������ַ����Ƿ���ȣ�
        // ���ǣ�����ַ�����ͨ��ʵ���ķ�ʽʵ�ֵģ������ַ�ʽ�жϵľ�������ΪString�Ķ�����ڴ��ַ�Ƿ���ȣ��϶�����ȣ�����
        //String������õ���==���жϷ�ʽ�����������ڴ��ַ��һ�����������ʵ�ʵ����ݣ�������
    }
}
