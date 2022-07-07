
class ChildThread extends Thread{

    public void run() {
        for ( int i =1 ; i <=5; i++) {
            try {
                if ( i == 2){
    
                    Thread.sleep(5000);
                }

            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("exce[tion found");
            }
            System.out.println("thread running");
        }
    }
}

public class SevenThreadSleep {
    public static void main(String[] args) {

        ChildThread ch = new ChildThread();
        ch.start();
        
    }
}
