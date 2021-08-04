import java.util.Scanner;

class Test
{   private int x,y,z;
    public void input()
    {
        Scanner S1=new Scanner(System.in);
        System.out.println("enter 1st");
        x=S1.nextInt();
        System.out.println("enter 2nd");
        y=S1.nextInt();
    }
    public void add()
    {
        z=x+y;
    }
    public void result()
    {
        System.out.println("output is ="+z);
    }
}
/** 
 * Test1
 */
public class Test1 {

    public static void main(String[] args) {
        Test T=new Test();
        T.input();
        T.add();
        T.result();
    }
}