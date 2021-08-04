class Sleep extends Thread
{
    public void run() 
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("sleep thread");
            try 
            {
                Thread.sleep(3000);
            } catch (Exception e) 
            {
                System.out.println("Exception");
                //TODO: handle exception
            }
        }
    }
}
/**
 * ThrStop
 */
public class ThrStop {

    public static void main(String[] args) {
        Sleep S=new Sleep();
        S.start();
        System.out.println("main Thread");
        S.stop();
    }
}