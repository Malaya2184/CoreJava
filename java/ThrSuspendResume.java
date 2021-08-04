class Kashaww extends Thread
{
    public void run() {
        for(int i=0;i<5999;i++)
        {
            System.out.println(i);
        }
    }
}
public class ThrSuspendResume {

    public static void main(String[] args) {
        Kashaww K=new Kashaww();
        System.out.println("start");
        K.start();
        try {
            Thread.sleep(400);//when main thread got chance slept lng400
        } catch (Exception e) {
            System.out.println("exception");
            
        }
        K.suspend();
        try {
            Thread.sleep(5000);//when main thread got chance slept 5sec , got chance bcz K is on waiting
        } catch (Exception e) {
            System.out.println("exception");
        }
        K.resume();
        

    }
}

/**TODO: T0 compile this program cmd= javac -Xlint:deprecation Filename.java
 * 
 * TODO: try this program by commenting D.resume
 * you wil see after running the thread the thread will suspend
 * but it will not resume due to the absence of resume
 * to exit from the suspended program press "ctrl+C"
 */