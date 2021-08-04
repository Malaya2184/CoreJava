/**
 * InnerInterThread
 */
class InnerInterThread extends Thread 
{
    int total=0;
    @Override
    public void run() {   //3
        synchronized(this)
        {   
            System.out.println("starts calculation");//4
            for (int i = 1; i<=100; i++) 
            {//5
                total=total+i;
            }
            System.out.println("child thread sent notification");
            this.notify();
        }
        
        
    }
    
}
public class InterThread {

    public static void main(String[] args) throws InterruptedException {
        InnerInterThread I=new InnerInterThread();
        I.start();
        //Thread.sleep(1000);
        synchronized(I) 
        {
            System.out.println("main thread call wait method");//1
            I.wait();//2
            System.out.println("got notification");//8
            System.out.println(I.total);
        }
    }
}