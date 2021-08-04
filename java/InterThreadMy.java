
class Spider1 extends Thread { 
    public void run() 
        { 
            synchronized(this) 
            { 
                System.out.println 
                (Thread.currentThread().getName() + "...starts"); 
                try { 
                    System.out.println(Thread.currentThread().getName()+"...goes for waiting state");
                    this.wait(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
                System.out.println 
                (Thread.currentThread().getName() + "Received notification"); 
            } 
        } 
    } 
class Spider2 extends Thread { 
        Spider1 S1; 
        Spider2(Spider1 S1) 
        { 
            this.S1 = S1; 
        } 
    public void run() 
        { 
            synchronized(this.S1) 
            { 
                System.out.println 
                (Thread.currentThread().getName() + "...starts"); 
                try {
                    System.out.println(Thread.currentThread().getName()+"...goes for waiting state");
                    this.S1.wait(); 
                } 
                catch (InterruptedException e) { 
                    e.printStackTrace(); 
                } 
                System.out.println 
                (Thread.currentThread().getName() + "...Received notification"); 
            } 
        } 
    } 
class Spider3 extends Thread { 
        Spider1 S1; 
        Spider3(Spider1 S1) 
        { 
            this.S1 = S1; 
        } 
    public void run() 
        { 
            synchronized(this.S1) 
            { 
                System.out.println 
                (Thread.currentThread().getName() + "...starts"); 
                this.S1.notify(); 
                System.out.println 
                (Thread.currentThread().getName() + "...send notification "); 
            } 
        } 
    } 
public class InterThreadMy { 
    public static void main(String[] args) throws InterruptedException 
        { 
            Spider1 S1 = new Spider1(); 
            Spider2 S2 = new Spider2(S1); 
            Spider3 S3 = new Spider3(S1); 
            Thread t1 = new Thread(S1, "Spider-1"); 
            Thread t2 = new Thread(S2, "Spider-2"); 
            Thread t3 = new Thread(S3, "Spider-3"); 
            t1.start(); 
            t2.start();
            Thread.sleep(10);
            t3.start(); 
        } 
    }