class status extends Thread
{
    @Override
    public void run() {
        System.out.println("status"+" "+isAlive());
    }
}
public class ThrAliveJoine {

    public static void main(String[] args) {
        status s=new status();
        s.start();
        try {
            s.join();
        } catch (Exception e) {
            System.out.println("exp");
            //TODO: handle exception
        }
        System.out.println("status"+" "+s.isAlive());
    }
}