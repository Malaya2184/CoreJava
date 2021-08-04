import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrintWriter {
public static void main(String[] args) throws IOException {
    FileWriter Fm=new FileWriter("Spider.txt",true);
    PrintWriter Pw=new PrintWriter(Fm);
    Pw.write(100);
    Pw.println(100);
    Pw.println(true);
    Pw.println("jay mahismati");
    Pw.println("a");
    Pw.flush();
    Pw.close();
    
    
}
}