import java.io.*;
public class FileBufWrite {
public static void main(String[] args) throws IOException {
    FileWriter FR=new FileWriter("Spider.txt",true);
    BufferedWriter Br=new BufferedWriter(FR);
    Br.write(100);
    Br.newLine();
    char [] ch={'a','b','c'};
    Br.write(ch);
    Br.newLine();
    Br.write("Spider");
    Br.newLine();
    Br.write("Jay Mahismati");
    Br.newLine();
    Br.flush();
    Br.close();

}
}