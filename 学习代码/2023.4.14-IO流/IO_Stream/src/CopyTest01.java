import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
使用FileInputStream + FileOutputStream 完成文件的拷贝

    拷贝的过程：一边读，一边写

    使用以上的字节流拷贝文件，文件类型随意，没有限制，什么样的文件都能拷贝

* */
public class CopyTest01 {

    public static void main(String[] args) {

        FileInputStream fis=null;

        FileOutputStream fos=null;

        try {
//            创建输入流对象
            fis=new FileInputStream("H:\\视频+S54+表情辅助型脑控假手+西安交通大学.mp4");

//            创建输出流对象
            fos=new FileOutputStream("测试视频.mp4");

//            开始复制：一边读，一边写
            int readData=0;

            byte[] bytes=new byte[1024*1024];//每次读1M的数据；1024是1k。

            while ((readData = fis.read(bytes)) != -1) {//读取的数据，暂时存在内存中，以数组 bytes的形式存，readData统计了最多要读取到的数据

                fos.write(bytes,0,readData);//从bytes数组往文件里面写，读取多少就写多少

            }

//            写完之后，一定记得：输出流： 刷新
            fos.flush();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }finally {//这里要注意：关闭流的时候 ，要分别try catch 不能统一进行catch，这是因为如果其中一个流的关闭出现了问题，
            // 后面的流就不能再执行，直接catch了，不利于流的关闭

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
