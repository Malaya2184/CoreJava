class NewThread extends  Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
       for (int i = 0; i<5;i++){
        System.out.println("child thread");
        try {
            if(i == 2){
                System.out.println("thread yelded");
                Thread.yield();
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("exception caught in thread");
        }
        
       }
    }
}
class NewThread2 extends  Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
       for (int i = 0; i<5;i++){
        System.out.println("child thread 2");
        
        
       }
    }
}

public class NineThreadYield {
    public static void main(String[] args) {
        NewThread n = new NewThread();
        NewThread2 n2 = new NewThread2();
        n.start();
        n2.start();
        for (int i = 0; i< 5; i++) {
            System.out.println("main thread");
        }
    }
}
