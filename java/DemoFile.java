import java.io.File;
import java.io.IOException;

/**
 * DemoFile
 */
public class DemoFile {

    public static void main(String[] args) throws IOException {
        File F=new File("new.txt");
        System.out.println(F.exists());
        //if (!F.exists()) 
        F.createNewFile();
        System.out.println(F.exists());
        File F1=new File("new");
        System.out.println(F1.exists());
        F1.mkdir();
        System.out.println(F1.exists());
        File F2=new File("xxx");
        F2.mkdir();
        File F3=new File("xxx", "xxx.txt");
        F3.createNewFile();
        File F4=new File("C:\\Users\\hp\\Desktop\\java\\xxx", "xnxx.txt");
        F4.createNewFile();
        System.out.println(F4.createNewFile());
        System.out.println(F4.isFile());
        System.out.println(F4.isDirectory());
    }
}