class Display
{   
    
    synchronized public void wish(String name) {
        for(int i=0;i<10;i++)
    {   
        System.out.print("GOOD MORNING");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("exception");
            //TODO: handle exception
        }
        System.out.println(name);
    }
    }
    
}
class MyThread extends Thread
{   
    Display D;
    String name;
    MyThread(Display D,String name)
    {
        this.D=D;
        this.name=name;
    }
    @Override
    public void run() {
        D.wish(name);
    }
}
public class SyncDemo {

    public static void main(String[] args) {
        Display D=new Display();
        //Display D1=new Display(); //try this by commenting
        MyThread M=new MyThread(D,"Spider");
        MyThread M1=new MyThread(D, "Malaya"); //commenting this
        //MyThread M1=new MyThread(D1, "Malaya");  //try this
        M.start();
        M1.start();
    }
}