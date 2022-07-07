
class Welcome extends Thread{
    public void run() {
        System.out.println("this is welcome thread");
    }
}

public class FiveThreadUsingThread {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        w.start();
    }
}
