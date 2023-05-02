import java.io.*;

/*
���л��ͷ����л���

    ���л���Serialize  java����洢���ļ��У���java�����״̬���������Ĺ���

    �����л���DeSerialize  ��Ӳ���ϵ��������»ָ����ڴ浱�У��ָ���java����


ע�⣺java.io.NotSerializableException: Student  �����Ķ���֧�����л�


�������л��ͷ����л���ʱ�������ʵ��Serializable�ӿ�


ע�⣺ͨ��Դ���뷢�֣�Serializableֻ��һ����־�ӿ�

            public interface Serializable {
            }

        ����ӿ���ʲô��û�У���ô����������ʲô��

        �𵽱�ʶ�����ã���־�����ã�java��������������ʵ��������ӿڣ����ܻ��������������Ĵ���

        Serializable�����־�ӿ��Ǹ�java������ο��ģ�java�������������ӿ�֮�󣬻�Ϊ�����Զ�����һ�����л��汾��


java�������ֽӿڣ���ͨ�ӿ�+��־�ӿڣ�û�з�����



���л��汾����ʲô�ã�

    �����һ����Ķ���������л�����ObjectOutputStream���ж�������л������������ķ����롣

    ֮���Ҷ�ԭʼ��������޸ģ�Ȼ���ټ��Է�����Ļ���Դ����Ķ��ˣ���Ҫ���±��룬����֮��������ȫ�µ��ֽ����ļ���

    ����class�ļ��ٴ����е�ʱ��java��������ɵ����л��汾��Ҳ�ᷢ����Ӧ�ĸı䣩���ͻ�����Ҳ�����Ĵ���

    java.io.InvalidClassException: Student;
        local class incompatible:
            stream classdesc serialVersionUID = 6845409090868647, ----���޸�֮��
            local class serialVersionUID = -5792170941352848116----���޸�֮ǰ��������л��Ľ��


     ������Ϊ��java���������Serializable�ӿ�֮�󣬻��Զ�����һ�����л��汾��

     ���û���ֶ���������л��汾��д�����Ļ���java������ͻ��Զ�����һ�����л��汾��

     ���齫���л��汾���ֶ�д�������������Լ����ɡ�


java�����в���ʲô����������������ģ�

        ��һ������ͨ���������жԱȣ�������һ�����϶�����һ����

        �ڶ����������һ��������ô�����������  �����л��汾�Ž�������

        ��������˶�д��ͬ����һ���࣬��������������ڲ�ȷʵ��Щ��ͬ�����ʱ�����л��汾�ž��������ˣ�

        ����java�������˵��java������ǿ���������������ģ���Ϊ�������඼ʵ����Serializable�ӿڣ�

        ����Ĭ�ϵ����л��汾�ţ�����Ų�һ�����������ֿ��ˣ������Զ��������л��汾�ŵĺô���


�Զ��������л��汾�ŵĻ�����

    һ���������ɣ����ܽ��к������޸ġ�

    ֻҪһ�޸ģ���Ȼ�����±��룬��ʱ������ȫ�µ����л��汾�ţ��������汾���ǲ�һ���ģ����ԣ�java�������Ϊ����һ��ȫ�µ��࣬�����Ͳ����ˡ�

    ���Խ����Լ���дһ�����л��汾�ţ����������޸�Ҳ���Ǳ���Ϊ��ͬһ���࣬���ܽ��з�����


���ս��ۣ�

    ����һ����ʵ����Serializable�ӿڣ�����������ṩһ���̶���������л��汾�ţ�

    �������Ժ�����༴ʹ�����޸��ˣ����ǰ汾�Ų��䣬java���������Ϊ��ͬһ����

* */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
//        ��������
        Student s=new Student("����",25);


        ObjectOutputStream oos=null;
        try {
//        ���л�
            oos=new ObjectOutputStream(new FileOutputStream("ObjectOutputStreamTest01"));

//            ���л�����
            oos.writeObject(s);

//            ˢ��
            oos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

class Student implements Serializable {//java���������Serializable�ӿ�֮�󣬻�Ϊ�����Զ�����һ�����л��汾�š�

//    �ֶ�������л��汾�ţ�----һ���Լ���д
//    private static final long serialVersionUID=1L;//java�����ʶ��һ�����ʱ����ͨ��������Ȼ��ͨ�����кŽ��жԱ��ǲ���һ����

//    IDEA�����Զ��������л��汾�ţ�
    @Serial
    private static final long serialVersionUID = -5792170941352848116L;//����ȫ��Ψһ��

    // û���ֶ�д������java�������Ĭ���ṩ������л��汾��
    private String name;
    private int age;

//    �������һ���µ����Խ������൱���޸���ԭ�����ࣺ
    int no;

    public Student(){}
    public Student(String name,int age) {
        this.age=age;
        this.name=name;
//        this.name="****";----��������к�֮�󣬾���������������޸ģ������ܽ��з�����
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age) {
        this.age=age;
    }

    public String toString(){
        return this.name+":"+this.age;
    }
}