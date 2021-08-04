import java.io.*;
public class FileRead1 {
    public static void main(String[] args) throws IOException {
        File Fx=new File("Spider.txt");
        char [] ch= new char[(int)Fx.length()];//Fx.length type casted to int because it return long and java don't support long array of char array
        FileReader Fr=new FileReader("Spider.txt");
        Fr.read(ch);
        for(char ch1:ch)
        {
            System.out.print(ch1);
        }
        Fr.close();

    }
}