class Displayy
{
    public synchronized void DisplayN() 
    {
            for(int i=0;i<10;i++)
        {
            System.out.print(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("exception in N block");
                //TODO: handle exception
            }
        }
    }
    public synchronized void DisplayC() {
        for(int i=65;i<75;i++)
    {
        System.out.print((char)i);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("exception in N block");
            //TODO: handle exception
        }
    }
    }
}
class MyThread1 extends Thread
{
    Displayy D;
    MyThread1(Displayy D)
    {
        this.D=D;
    }
    @Override
    public void run() {
        D.DisplayN();
    }
}
class MyThread2 extends Thread
{
    Displayy D;
    MyThread2(Displayy D)
    {
        this.D=D;
    }
    @Override
    public void run() {
        D.DisplayC();
    }
}
public class SyncThread {
    public static void main(String[] args) {
        Displayy D=new Displayy();
        MyThread1 M1=new MyThread1(D);
        MyThread2 M2=new MyThread2(D);
        M1.start();
        M2.start();
    }
    
}