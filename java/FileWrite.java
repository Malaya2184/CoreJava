import java.io.*;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        FileWriter Fw=new FileWriter("Spider.txt",true);
        Fw.write(100);
        Fw.write("o nothing \n just watch me");
        Fw.write("\n");
        char [] ch={'S','P','I','D','E','R'};
        Fw.write(ch);
        Fw.write("\n");
        Fw.flush();
        Fw.close();




    }
}