import java.sql.SQLOutput;
/*
* ����ö����Switch����е�ʹ��
* */
public class EnumTest03 {
    public static void main(String[] args) {
        switch(SEASON.SPRING) {
            case SUMMER:
                System.out.println("����");
            case AUTUMN:
                System.out.println("����");
            case WINTER:
                System.out.println("����");
            case SPRING:
                System.out.println("����");
        }

    }
}
enum SEASON{
    SUMMER,WINTER,AUTUMN,SPRING
}