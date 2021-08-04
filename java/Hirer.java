import java.util.Scanner;

class one{
    Scanner objsScanner=new Scanner(System.in);
    int x,y;
    void getdata()
    {
        System.out.println("enter the value of x and y");
        x=objsScanner.nextInt();
        y=objsScanner.nextInt();
    }
    
}
/**
 * two
 */
class two extends one 
{   int addition;
    void add()
    {
        addition=x+y;
        System.out.println("the addition of two numbers ="+addition);
    }
}
/**
 * three
 */
class three extends one {
    int multiplication;
    void mul()
    {
        multiplication=x*y;
        System.out.println("multiplication of two numbers is ="+multiplication);
    }
    
}
/**
 * Hirer
 */
public class Hirer {
    public static void main(String[] args) 
    {
        two t1=new two();
        t1.getdata();
        t1.add();
        three t2=new three();
        t2.getdata();
        t2.mul();

    }

    
}