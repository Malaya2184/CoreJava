import java.io.File;

/**
 * f.exists();
 * f.createNewFile();
 * f.mkDir();
 * boolean
 */
public class FileMethod {
public static void main(String[] args) throws InterruptedException {
    int i=0;
    File Fx=new File("C:\\Users\\hp\\Desktop\\java");
    String [] S=Fx.list();
    for(String S1:S)
    {
        File Fs=new File(Fx, S1);
        if(Fs.isFile()){
            i++;
        System.out.println("file:-"+i+" "+S1);
        
        }
        
        
        //Thread.sleep(100);
    }
}
}