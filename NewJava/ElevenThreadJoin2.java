class MarriageFixing extends Thread{
    public void run() {
    
        for(int i= 0; i< 5; i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            System.out.println("marraige fixing");
        }
    }
}

// weading has to wait for he marriage fixing
class Weading extends Thread{

public void run() {
    
    
    for(int i= 0; i< 5; i++){
        System.out.println("weading");
    }
}
}



public class ElevenThreadJoin2 {
    public static void main(String[] args) {
        
        MarriageFixing m = new MarriageFixing();
        Weading w  = new Weading();
        
        
        
        m.start();
        try {
            // here min method stops exe
            System.out.println(" main method break in try");
            m.join();
        } catch (Exception e) {
            //TODO: handle exception
        }
        System.out.println("  main method start after try");
        w.start();
        

    }
}