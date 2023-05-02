/*
公司员工：分为若干类：
    Employee：所有员工总的父类
    属性：
        员工的姓名，员工的生日月份
    方法：
        根据参数月分来确定工资，如果该员工过生日，则公司会额外奖励100元

    SalariedEmployee:
        Employee的子类，拿固定工资的员工
        属性：月薪

     HourlyEmployee:
        Employee的子类，按小时拿工资的员工。每月超出160小时的部分按照1.5倍工资发放。
        属性：每小时的工资，每月工作的小时数

     SaleEmployee:
        Employee的子类，销售人员，工资由月销售额和提成率决定
        属性：月销售额、提成率

     BasePlusSalesEmployee:
        SaleEmployee的子类，有固定的底薪的销售人员。工资 由底薪加上销售提成部分
        属性：底薪

     根据要求创建SalariedEmployee、HourlyEmployee、SaleEmployee、BasePlusSalesEmployee
     并计算某个月这四个对象的工资

     注意：要求把每个类都做成完全封装，不允许非私有化属性。

* */
public class HomeWork4 {
    public static void main(String[] args) {
        Employee a1=new SalariedEmployee("张伟",10,12,13,1000000.0);
        a1.getSalary(12,13);
        Employee a2=new HourlyEmployee("大使",1998,10,12,160,1000);
        a2.getSalary(10,12);
        Employee a3=new SalesEmployee("小虫",2000,10,15,194,100);
        a3.getSalary(10,15);
        Employee a4=new BasePlusSalesEmployee("王淼",1975,10,15,150,10000,20000);
        a4.getSalary(10,15);
    }

}

class Employee{
    private String name;
    private int Year;
    private int Month;
    private int Day;

    public Employee() {
    }

    public Employee(String name, int year, int month, int day) {
        this.name = name;
        Year = year;
        Month = month;
        Day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }

    public void getSalary(int month,int day){

    }
}
class SalariedEmployee extends Employee{
    private double monthSalary=1000;

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int year, int month, int day, double monthSalary) {
        super(name, year, month, day);
        this.monthSalary = monthSalary;
    }

    public void getSalary(int month, int day){
        if (this.getMonth()==month && this.getDay()==day){
                System.out.println("生日当天");
                this.monthSalary+=100;
        }
        System.out.println(getName()+month+"月份的工资是："+this.monthSalary);
    }
}
class HourlyEmployee extends Employee{
    private double hour;
    private double hourSalary;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int year, int month, int day, double hour, double hourSalary) {
        super(name, year, month, day);
        this.hour = hour;
        this.hourSalary = hourSalary;
    }

    public void getSalary(int month, int day){

        if (hour<=160){
            hourSalary=hourSalary*hour;
        } else if (hour>160) {
            hourSalary=hourSalary*160+hourSalary*(hour-160)*1.5;
        }

        if (this.getMonth()==month && this.getDay()==day){
            System.out.println("生日当天");
            this.hourSalary+=100;
        }
        System.out.println(getName()+month+"月份的工资是："+this.hourSalary);
    }
}
class SalesEmployee extends Employee{
    private double sales;
    private double TiChengRate;

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getTiChengRate() {
        return TiChengRate;
    }

    public void setTiChengRate(double tiChengRate) {
        TiChengRate = tiChengRate;
    }

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int year, int month, int day, double sales, double tiChengRate) {
        super(name, year, month, day);
        this.sales = sales;
        TiChengRate = tiChengRate;
    }

    public void getSalary(int month, int day){
        if (this.getMonth()==month && this.getDay()==day){
            System.out.println("生日当天");
            System.out.println(getName()+month+"月份的工资是："+(this.sales*this.TiChengRate+100));
        }else{
            System.out.println(getName()+month+"月份的工资是："+(this.sales*this.TiChengRate));
        }
    }
}
class BasePlusSalesEmployee extends SalesEmployee{
    private double DiXin;

    public double getDiXin() {
        return DiXin;
    }

    public void setDiXin(double diXin) {
        DiXin = diXin;
    }

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(String name, int year, int month, int day, double sales, double tiChengRate, double diXin) {
        super(name, year, month, day, sales, tiChengRate);
        DiXin = diXin;
    }

    public void getSalary(int month, int day){
        if (this.getMonth()==month && this.getDay()==day){
            System.out.println("生日当天");
            System.out.println(getName()+month+"月份的工资是："+(this.DiXin+this.getSales()*this.getTiChengRate()+100));
        }else{
            System.out.println(getName()+month+"月份的工资是："+(this.DiXin+this.getSales()*this.getTiChengRate()));
        }
    }
}