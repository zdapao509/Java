/*
1.8�ֻ����������͵İ�װ�ࣺ

    ������������         ��װ����
    ------------------------------
    byte                 java.lang.Byte������Number��
    short                java.lang.Short������Number��
    int                  java.lang.Integer������Number��
    long                 java.lang.Long������Number��
    float                java.lang.Float������Number��
    double               java.lang.Double������Number��
    boolean              java.lang.Boolean������Object��
    char                 java.lang.Character������Object��

2.���ϵ�8�а�װ�࣬�ص���java.lang.IntegerΪ����ѧϰ����������

3.���ֻ������������е�6�ָ��඼��Number���������о�Number�еĹ����ķ�����
    Number���ڳ����࣬�޷�ʵ��������
    Number�����������ķ�����
    byte          byteValue() ����ָ��������Ϊֵ byte ��������漰�����ضϡ�
    abstract      double doubleValue() ����ָ�����ֵ�ֵΪ double �������漰�������롣
    abstract      float floatValue() ����ָ�����ֵ�ֵΪ float �������漰�������롣
    abstract      int intValue() ����ָ��������Ϊֵ int ��������漰�����ضϡ�
    abstract      long longValue() ����ָ�����ֵ�ֵΪ long �������漰���������ضϡ�
    short         shortValue() ����ָ��������Ϊֵ short ��������漰�����ضϡ�

    ��Щ�����ڰ�װ��������ж��� ����Щ�����Ǹ������ġ�


* */
public class IntegerTest02 {
    public static void main(String[] args) {
//        123��������������ͣ����й��췽���İ�װ�ﵽ�ˡ��������������������������͵�ת����
//        װ�䣺������������--->������������
//        ��ʵ���ϣ����ǽ�123��Ϊ���������һ����װ��Ķ��󣬰����������ڴ��ַ������һ�����ã�
//        ��������ô�������������������ͣ�Ҳ����װ�䣩
        Integer i=new Integer(123);//�����������ʱ

//        ��������������ת��Ϊ�����������ͣ�����
        float f =i.floatValue();
        System.out.println(f);//123.0

        int j=i.intValue();
        System.out.println(j);//123
    }
}
