import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeAlt {
public static void main(String[] args) throws IOException {
    PrintWriter Pw=new PrintWriter("File4.txt");
    BufferedReader Br1=new BufferedReader(new FileReader("File1.txt"));
    BufferedReader Br2=new BufferedReader(new FileReader("File2.txt"));
    String line1=Br1.readLine();
    String line2=Br2.readLine();
    while ((line1 != null) || (line2 !=  null)) {
        if (line1 != null) {
            Pw.println(line1);
            line1=Br1.readLine();
        }
        if (line2 != null) {
            Pw.println(line2);
            line2=Br2.readLine();
        }
        
    }
    Pw.close();
    Pw.close();
}
}