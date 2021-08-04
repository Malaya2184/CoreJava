import java.lang.Thread;
/**
 * InnerThr
  */
class InnerThr extends Thread {
    public void run() {
        //System.out.println("thread");
        //System.out.println(getName()+"  "+getId()+"  "+getClass()+"  "
        //+getPriority()+"  "+getClass()+"  "+getState()+"  "+getThreadGroup());
        System.out.println(getPriority());
    }
    
}
/**
 * Thr
 */
public class Thr {
    public static void main(String[] args) {
        InnerThr T=new InnerThr();
        T.start();
        T.setPriority(10);
    }
    
}