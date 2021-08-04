import java.util.*;
/**
 * Expo
 */
public class Expo {

    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        int a,b;
        try {
            a=objScanner.nextInt();
            b=objScanner.nextInt();
            System.out.println("starts");
            System.out.println(a/b);
            System.out.println("jay mahismati");
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            //TODO: handle exception
        }
        a=5;
        b=10;
        System.out.println(a+b);
        System.out.println("lol");
    }
}