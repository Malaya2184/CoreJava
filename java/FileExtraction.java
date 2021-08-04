import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtraction {

    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("Extract.txt");
        BufferedReader bw1=new BufferedReader(new FileReader("Old.txt"));
        String line=bw1.readLine();
        while (line!=null) {
            boolean avail=false;
            BufferedReader bw2=new BufferedReader(new FileReader("Except.txt"));
            String target=bw2.readLine();
            while (target!=null) {
                if (line.equals(target)) {
                    avail=true;
                    break;
                }
                target=bw2.readLine();
            }
            if (avail==false) {
                pw.println(line);
            }
            line=bw1.readLine();
        }
        pw.flush();
    }
}