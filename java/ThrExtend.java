class A extends Thread
{
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("class A"+i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("exception");//TODO: handle exception
            }
            
        }
        
    }
}
class B extends Thread
{
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("class B"+i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("exception");//TODO: handle exception
            }
        }
    }
}
public class ThrExtend {

    public static void main(String[] args) {
    A T1=new A();
    B T2=new B();
    T1.start();
    T2.start();
    }
    
}