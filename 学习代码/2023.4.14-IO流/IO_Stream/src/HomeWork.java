import java.io.*;

/*
拷贝文件夹里面的所有内容到另一个文件夹下

用到：

    FileInputStream;
    FileOutputStream;
    File;

* */
public class HomeWork {
    public static void main(String[] args) {
        File f=new File("G:\\zzzzz没用\\文档");
        File out=new File("F:\\桌面\\test");
        copy(f,out);
    }

//    文件复制方法：
    public static void copy(File f, File out) {
        if (f.isFile()) {
            FileInputStream fis=null;
            FileOutputStream fos=null;
            try {
//                创建：字节输入流对象
                fis=new FileInputStream(f);//这里除了可以跟字符串的路径，还可以跟File 类型的文件

//                更新此时的目标目录：目录是目标目录和经过下采样的原目录组成的，这里的目标路径要包含文件的名字，
//                比如  xxx.pdf 要包含在目标路径里面，如果现实没有这个路径，那就直接创建该文件

//                在 Java 中，FileOutputStream 类会自动创建一个文件，但是不会自动创建文件夹。
//                如果指定的路径中包含不存在的文件夹，则会抛出 FileNotFoundException 异常。
                String s=out.getAbsolutePath().endsWith("\\") ? out.getAbsolutePath() : out.getAbsolutePath()+"\\";
                s=s+f.getAbsolutePath().substring(11);
                fos=new FileOutputStream(s);

                int readData=0;

                byte[] bytes=new byte[1024*1024];

                while ((readData = fis.read(bytes)) != -1) {
                    fos.write(bytes,0,readData);
                }

                fos.flush();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally{
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

        }else{
//            如果是一个文件夹，那就遍历文件夹下面的所有子文件，然后递归，看下面的子文件是不是文件还是文件夹
            File[] files=f.listFiles();
            for (File file:files) {
                if (file.isDirectory()) {//判断如果是文件夹，那就创建文件夹，因为拷贝的输出流是不能创建文件夹的，只能创建文件
                    String f1=file.getAbsolutePath().substring(11);//下采样，取对应位置的文件路径
                    System.out.println(f1);
                    String f2=out.getAbsolutePath().endsWith("\\") ? out.getAbsolutePath() : out.getAbsolutePath()+"\\";
                    //避免目标路径下面没有“\\”
                    String f3=f2+f1;//拼接新的路径：“\\”
                    System.out.println(f3);
                    File newOut=new File(f3);//创建新的文件，如果文件夹不存在，那就创建文件夹，而且允许多层创建
                    if (!newOut.exists()) {//创建对应文件夹
                        newOut.mkdirs();//要允许创建多重文件夹，第一个文件夹是  F:\桌面\test\文档\ES文档  此时的 文档\ES文档 都不存在，所以要多重创建
                    }
                }
                copy(file,out);//递归调用，把文件继续传下去
            }
        }
    }
}
