/*
�������������java������Ŀ����Ȼreturn���ִ�У������������100������101
* */
public class ExceptionTest13 {
    public static void main(String[] args) {
        System.out.println(m());//������ǣ�100 ������101
    }
/*
java�﷨����

    �������еĴ���������϶���ִ�У�����ִ�У�

    return�﷨һ��ִ�У������������������
* */
    public static int m(){
        int i=100;
        try{
//            ��δ��������int i=100���档�������ս��һ���ǵ���100.
            return i;
        }finally {
            i++;
        }
    }
}


/*
����������

    public static int m(){
        int i=100;
        int j=i;
        i++;
        return j;
    }
* */