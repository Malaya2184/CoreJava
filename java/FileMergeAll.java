import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeAll {
public static void main(String[] args) throws IOException {
    PrintWriter Pw=new PrintWriter("Output.txt");
    File F=new File("C:\\Users\\hp\\Desktop\\java\\Merge");
    String [] Str=F.list();
    for (String str1 : Str) {
        File F1=new File(F, str1);  
        BufferedReader Br=new BufferedReader(new FileReader(F1));
        String line=Br.readLine();
        while (line!=null) {
            Pw.println(line);
            line=Br.readLine();
        }
    }
    Pw.flush();
    Pw.close();
}
}