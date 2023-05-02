/*
��˾Ա������Ϊ�����ࣺ
    Employee������Ա���ܵĸ���
    ���ԣ�
        Ա����������Ա���������·�
    ������
        ���ݲ����·���ȷ�����ʣ������Ա�������գ���˾����⽱��100Ԫ

    SalariedEmployee:
        Employee�����࣬�ù̶����ʵ�Ա��
        ���ԣ���н

     HourlyEmployee:
        Employee�����࣬��Сʱ�ù��ʵ�Ա����ÿ�³���160Сʱ�Ĳ��ְ���1.5�����ʷ��š�
        ���ԣ�ÿСʱ�Ĺ��ʣ�ÿ�¹�����Сʱ��

     SaleEmployee:
        Employee�����࣬������Ա�������������۶������ʾ���
        ���ԣ������۶�����

     BasePlusSalesEmployee:
        SaleEmployee�����࣬�й̶��ĵ�н��������Ա������ �ɵ�н����������ɲ���
        ���ԣ���н

     ����Ҫ�󴴽�SalariedEmployee��HourlyEmployee��SaleEmployee��BasePlusSalesEmployee
     ������ĳ�������ĸ�����Ĺ���

     ע�⣺Ҫ���ÿ���඼������ȫ��װ���������˽�л����ԡ�

* */
public class HomeWork4 {
    public static void main(String[] args) {
        Employee a1=new SalariedEmployee("��ΰ",10,12,13,1000000.0);
        a1.getSalary(12,13);
        Employee a2=new HourlyEmployee("��ʹ",1998,10,12,160,1000);
        a2.getSalary(10,12);
        Employee a3=new SalesEmployee("С��",2000,10,15,194,100);
        a3.getSalary(10,15);
        Employee a4=new BasePlusSalesEmployee("���",1975,10,15,150,10000,20000);
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
                System.out.println("���յ���");
                this.monthSalary+=100;
        }
        System.out.println(getName()+month+"�·ݵĹ����ǣ�"+this.monthSalary);
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
            System.out.println("���յ���");
            this.hourSalary+=100;
        }
        System.out.println(getName()+month+"�·ݵĹ����ǣ�"+this.hourSalary);
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
            System.out.println("���յ���");
            System.out.println(getName()+month+"�·ݵĹ����ǣ�"+(this.sales*this.TiChengRate+100));
        }else{
            System.out.println(getName()+month+"�·ݵĹ����ǣ�"+(this.sales*this.TiChengRate));
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
            System.out.println("���յ���");
            System.out.println(getName()+month+"�·ݵĹ����ǣ�"+(this.DiXin+this.getSales()*this.getTiChengRate()+100));
        }else{
            System.out.println(getName()+month+"�·ݵĹ����ǣ�"+(this.DiXin+this.getSales()*this.getTiChengRate()));
        }
    }
}