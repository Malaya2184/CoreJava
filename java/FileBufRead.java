import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufRead {
    public static void main(String[] args) throws IOException {
        FileReader F=new FileReader("Spider.txt");
        BufferedReader Br=new BufferedReader(F);
        String line=Br.readLine();
        while (line != null) {
            System.out.println(line);
            line=Br.readLine();
        }
        Br.close();
    }

}