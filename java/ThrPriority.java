class Pr1 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("first");
        }
        System.out.println();
    }

}
class Pr2 extends Thread
{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("second");
        }
        System.out.println();
    }

}
public class ThrPriority {

    public static void main(String[] args) {
        Pr1 P1=new Pr1();
        Pr2 P2=new Pr2();
        P1.setPriority(10);
        P1.start();
        P2.start();
    }
}