/*
编写程序模拟用户注册：

    1.程序开始执行时，提示用户输入：用户名，密码信息

    2.输入信息之后，后台java程序模拟用户注册，

    3.注册时，用户名要求长度在6-14之间，小于或者大于都属于异常

    注意：

        完成注册的方法放到一个单独的类中，异常类自定义即可

        编写main方法，在main方法中接收用户的信息，在main方法中调用UserService类的register方法完成注册

* */

public class HomeWork {
    public static void main(String[] args) {
        String a="    张 威  明    ";
        String b="123456";
        UserService user=new UserService();
        try {
            user.register(a,b);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class UserService{
    String username,passward;
    public void register(String username,String passward) throws MyException {
        /*
        * 编程经验：引用==null 最好放在所有的判断前面
        *
        * 通常可以写成 null==引用。避免写成 引用=null，成了赋值
        * */
        if(username==null||username.trim().length()<6||username.trim().length()>14){
            throw new MyException("用户名长度超出限制");
        }
        this.username=username;
        this.passward=passward;
        System.out.println("完成注册");
    }
}