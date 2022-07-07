/**
 * InnerInterThread
 */
class InnerInterThreadBef extends Thread 
{
    int total=0;
    @Override
    public void run() {
        for (int i = 1; i<=100; i++) {
            total=total+i;
        }
    }
    
}
public class TwelveInterThread {

    public static void main(String[] args) {
        InnerInterThreadBef I=new InnerInterThreadBef();
        I.start();
        System.out.println("value of total is : "+I.total);
    }
}