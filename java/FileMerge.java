import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {
public static void main(String[] args) throws IOException {
    FileReader Fr=new FileReader("File1.txt");
    PrintWriter Pw=new PrintWriter("File3.txt");
    BufferedReader Br=new BufferedReader(Fr);
    String line=Br.readLine();
    while (line != null) {
        Pw.println(line);
        line=Br.readLine();
    }
    Br=new BufferedReader(new FileReader("File2.txt"));
    line=Br.readLine();
    while (line != null) {
        Pw.println(line);
        line=Br.readLine();
    }
    Pw.flush();
    Pw.close();

}
}