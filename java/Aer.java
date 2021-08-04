import java.util.Scanner;
/**
 * Aer
 */
public class Aer {

    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter three numbers");
        a=objScanner.nextInt();
        b=objScanner.nextInt();
        c=objScanner.nextInt();
        int avg=a+b+c;
        avg=avg/3;
        System.out.println("avg is"+avg);
    }
}
