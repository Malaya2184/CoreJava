/**
 * InnerInterThread
 */
class InnerInterThreadBef extends Thread 
{
    int total=0;
    @Override
    public void run() {
        synchronized(this){
            for (int i = 1; i<=100; i++) {
                total=total+i;
            }

            this.notify();
        }
    }
    
}
public class ThirteenInterThread {

    // this is working perfetly becuse generlly main thread runs first
    public static void main(String[] args) throws InterruptedException {
        InnerInterThreadBef I=new InnerInterThreadBef();
        
        I.start();
        // Thread.sleep(5000);
        
        synchronized(I){
            I.wait();
            System.out.println("value of total is : "+I.total);
        }
    }
}