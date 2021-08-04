class Jay extends Thread{
    Jay(String name)
    {
        setName(name);
    }
    public void run() {
        try {
            for(int i=0;i<10;i++)
        {   Thread.sleep(2000);
            System.out.println(getName()+"  "+i);
        }
        } catch (Exception e) {
            System.out.println("exception on jay");
            //TODO: handle exception
        }
    }
}
class Mahismati extends Thread{
    Mahismati(String name)
    {
        setName(name);
    }
    public void run() {
        try {
            for(int i=0;i<10;i++)
            {   Thread.sleep(2000);
                System.out.println(getName()+"  "+i);
            }
        } catch (Exception e) {
            System.out.println("exception on mahismati");
            //TODO: handle exception
        }
        
    }
}
public class ThrAliveJoin {
    public static void main(String[] args) {
        Jay j=new Jay("Jay");
        Mahismati m=new Mahismati("Mahismati");
        j.start();
        try {
            if (j.isAlive()) {
                j.join();//called by mahismati that i can wait for u you can complete your execution
            }
        } catch (Exception e) {
            System.out.println("xxx");
        }
        m.start();
    }
}