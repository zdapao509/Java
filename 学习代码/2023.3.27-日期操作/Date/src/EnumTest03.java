import java.sql.SQLOutput;
/*
* 测试枚举在Switch语句中的使用
* */
public class EnumTest03 {
    public static void main(String[] args) {
        switch(SEASON.SPRING) {
            case SUMMER:
                System.out.println("夏天");
            case AUTUMN:
                System.out.println("秋天");
            case WINTER:
                System.out.println("冬天");
            case SPRING:
                System.out.println("春天");
        }

    }
}
enum SEASON{
    SUMMER,WINTER,AUTUMN,SPRING
}