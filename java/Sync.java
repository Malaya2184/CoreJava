class Message{
    synchronized
    public void Method(String name) {
        for(int i=0;i<10;i++)
        {
            System.out.print("Message Sending to :");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Exception");
                //TODO: handle exception
            }
            System.out.println(name);
        }
    }
}
class InnerSync extends Thread {
    Message M;
    String name;
    InnerSync(Message M,String name)
    {
        this.M=M;
        this.name=name;
    }
    @Override
    public void run() {
        M.Method(name);
    }

}
public class Sync {

    public static void main(String[] args) {
        Message M=new Message();
        InnerSync I=new InnerSync(M, "Malaya");
        InnerSync I1=new InnerSync(M, "Spider");
        I.start();
        I1.start();
    }
}