class Spider1 extends Thread {

    public void run(){
        Thread.currentThread().setName("spider 1");
        System.out.println(Thread.currentThread().getName() + "thread started");

        synchronized(this){
            try {
                System.out.println(Thread.currentThread().getName() + "thread goes to waiting");
                this.wait();
                System.out.println(Thread.currentThread().getName() + "thread receives notification from spider 3");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }

}

class Spider2 extends Thread{

    Spider1 s1;
    Spider2(Spider1 s1){
        this.s1 = s1;
    }
    public void run(){
        Thread.currentThread().setName("spider 2");
        System.out.println(Thread.currentThread().getName() + "thread started");
        
        synchronized(s1){
            try {
                System.out.println(Thread.currentThread().getName() + "thread goes to waiting");
                s1.wait();
                System.out.println(Thread.currentThread().getName() + "thread receives notification from spider 3");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}

class Spider3 extends Thread{

    Spider1 s1;
    Spider3(Spider1 s1){
        this.s1 = s1;
    }
    public void run(){
        Thread.currentThread().setName("spider 3");
        System.out.println(Thread.currentThread().getName() + "thread started");
        
        synchronized(s1){
            s1.notifyAll();
            System.out.println(Thread.currentThread().getName() + "thread notification send");
        }

    }
}


public class FourteenNotifyall {
    public static void main(String[] args) throws InterruptedException {

        Spider1 s1 = new Spider1();
        Spider2 s2 = new Spider2(s1);
        Spider3 s3 = new Spider3(s1);

        System.out.println(Thread.currentThread().getName() + "starts");
        Thread t1 = new Thread(s1, "Spider-1"); 
        Thread t2 = new Thread(s2, "Spider-2"); 
        Thread t3 = new Thread(s3, "Spider-3"); 
        t1.start(); 
        t2.start();
        Thread.sleep(10);
        t3.start(); 
        
    }
}
