import java.io.FileReader;
import java.io.IOException;

public class FileRead {
public static void main(String[] args) throws IOException {
    FileReader Fr=new FileReader("Spider.txt");
    int i=Fr.read();
    while (i != -1) {
        System.out.print((char)i);
        i=Fr.read();
    }
    Fr.close();
    
}
}