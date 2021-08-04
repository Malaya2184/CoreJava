class Spidy extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("spidy");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("exception");
                //TODO: handle exception
            }
            
        }
    }
}
public class ThrJoin {

    public static void main(String[] args) {
        Spidy S=new Spidy();
        S.start();
        try {
            S.join(); //TODO: SEE THE OUTPUT BY COMMENTING THIS
        } catch (Exception e) {
            System.out.println("Interrupted Exception");
            //TODO: handle exception
        }
        for (int i = 0; i < 10; i++) {
            System.err.println("main Thread");
        }
    }
}