class MorePriorThread extends Thread
{

    public void run() {
        for (int i=0; i<5; i ++) {
            System.out.println("more prior thread");
        }
    }
}

class LessPriorThread extends Thread 
{
 public void run() {
    for (int i=0; i<5; i ++) {
        System.out.println("less prior thread");
    }
 }
}


public class EightThreadPriority {
    public static void main(String[] args) {
        
        MorePriorThread m = new MorePriorThread();
        LessPriorThread l = new LessPriorThread();
        l.setPriority(1);
        m.setPriority(10);
        m.start();
        l.start();
    }
}
