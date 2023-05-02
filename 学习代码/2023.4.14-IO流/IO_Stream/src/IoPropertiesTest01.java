import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
IO+Properties   联合使用：

    非常好的设计理念：

        以后经常改变的数据，可以单独写到一个文件中，使用程序动态读取

        将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，服务器也不需要重新启动。就能拿到动态的信息


Properties是一个Map集合，key和value都是String类型，想将userinfo文件中的数据加载到Properties对象当中


类似于以上机制的文件被称为配置文件。并且当配置文件中的内容格式为：

    key=value
    key:value---------但是不建议使用 ：

    的时候，我们把这种配置文件叫做属性配置文件


java规范中有要求，属性配置文件建议以.properties结尾，但是不是强制要求的，

    这种以.properties结尾的文件在java中被称为：属性配置文件

    其中Properties是专门存放属性配置文件内容中的一个类。


在属性配置文件中，#是注释

    属性配置文件中，key重复的话，value会自动覆盖

    并且在属性配置文件中最好不要出现空格


* */
public class IoPropertiesTest01 {
    public static void main(String[] args) {
//        新建一个输入流对象：
        FileReader reader=null;
        try {
            reader=new FileReader("userinfo.properties");

//            新建一个map集合：
            Properties pro=new Properties();

//            调用一个Properties对象的load方法将文件中的数据加载到Map集合中:
            pro.load(reader);//文件加载时，=左边是key  =右边是value

//          通过key来获取value
            String username=pro.getProperty("username");
            System.out.println(username);//"张三"

            String password=pro.getProperty("password");
            System.out.println(password);//123

            String zhang=pro.getProperty("zhang");
            System.out.println(zhang);//7489


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
