/*
ö�٣�һöһö�����оٳ������Ž���ʹ��ö������
ö�ٱ���֮��Ҳ����class�ļ�
ö��Ҳ��һ��������������
ö���е�ÿһ��ֵ���Կ����ǳ���

ö��������ô����ģ�
    enum ö��������{
        ö��ֵ1��ö��ֵ2
    }

һ�������ķ��ؽ��ֻ���������������ʹ�ò������ͣ�

    ���������������ö�٣����磺��ɫ���ļ������ڡ�����

* */

public class EnumTest02 {
    public static void main(String[] args) {
        Result r=divide(10,0);
        System.out.println(r==Result.SUCCESS?"����ɹ�":"����ʧ��");
    }
    public static Result divide(int a,int b){//���ַ����ȽϺ�������ֻ�����������ʵ�������У����ֵĲ�ֻ���������������ʹ���ܵ�����-----��������ö��
        try{
            int c=a/b;
            return Result.SUCCESS;
        }catch(Exception e){
            return Result.FAIL;
        }
    }
}

enum Result {
//    SUCCESS ��ö��Result�е�һ��ֵ
//    FAIL ��ö��Result�е�һ��ֵ
//    ö���е�ÿһ��ֵ�����Կ����ǡ�������
    SUCCESS,FAIL
}