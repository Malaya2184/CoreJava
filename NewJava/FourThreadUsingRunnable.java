
class Welcome implements Runnable{
    public void run() {
        System.out.println("this is welcome method" );
    } 
    
    void log(){
        System.out.println("this is not thread inside wecome");
    }
}
class GoodBye implements Runnable{
    public void run(){
        System.out.println("this is good buy method");
    }
}


public class FourThreadUsingRunnable {

    public static void main(String[] args) {
        Welcome w = new Welcome();
        GoodBye g = new GoodBye();
        w.log();

        Thread welcome = new Thread(w);
        Thread goodBye = new Thread(g);

        welcome.start();
        goodBye.start();
    }
    
}
