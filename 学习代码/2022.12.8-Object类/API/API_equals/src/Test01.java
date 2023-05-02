//String对象比较的时候必须使用equals方法：------------避免字符串不是采用赋值的方式，而是采用实例化对象的方式实现
//
// （注意：当采用赋值方式的时候，字符串类型的数据用==判断是否相等时，是不会出错的，就是比较的内容是否相等，而不是比内存地址；
// 但是，实例化就不一样了，实例化用==比较就比较的是内存地址）

//equals语法：字符串类型的数据.equals（字符串类型的数据）；

public class Test01 {
    public static void main(String[] args) {
        Student s1=new Student(123,"庞各庄大学");
        Student s2=new Student(456,"庞各庄一中");
        Student s3=new Student(456,"庞各庄一中");
        Student s4=new Student(456,new String("庞各庄一中"));

        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        System.out.println(s2.equals(s3));//true

        System.out.println(s2.equals(s4));//false---如果equals方法采用的不是equals方法判断两字符串相等而是采用==的方式的话，
        // 就会出现这种错误，实际上s2和s4是相等的，也就是内容都相同，认为应该相等，只是内存地址不同

        //改回到用equals方法判断字符串是否相等，就会出现正确结果：true


    }
}

class Student{
    int no;//学号
    String school;//学校

    public Student(){

    }

    public Student(int no,String school){
        this.no=no;
        this.school=school;
    }

    public String toString(){
        return this.no+"--学号"+this.school+"--学校";
    }

    public boolean equals(Object obj){
        if (this==null||!(obj instanceof Student)) return false;
        if (this==obj) return true;
        Student student =(Student)obj;

        return this.no==student.no && this.school.equals(student.school);//---------这里的语法是：school属于String类型，
        // 而String属于引用数据类型的数据，他是可以有自己的方法的，所以这里调用了String类下面的，equals方法。
        // equals方法的前面应该是字符串类型的数据，括号里面传得参数应该也是字符串类型的参数

//        return this.no==student.no && this.school==student.school;//这样的写法是错误的，
        // 如果是直接String赋值的方式的话，这样确实可以判断两个字符串是否相等；
        // 但是，如果字符串是通过实例的方式实现的，那这种方式判断的就是类型为String的对象的内存地址是否相等，肯定不相等，报错
        //String如果采用的是==的判断方式，如果存的是内存地址，一定报错；存的是实际的数据，不报错
    }
}
