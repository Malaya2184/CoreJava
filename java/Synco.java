class InnerSynco extends Thread
{
        InnerSynco I;
        String name;
        InnerSynco(InnerSynco I, String name)
        {
            this.I=I;
            this.name=name;
        }
    synchronized public void Meth(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Wake up");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("Exception");
            }
            System.out.println(name);
        }
    }
    @Override
    public void run() {
    I.Meth(name);
    }
    
}
public class Synco {
public static void main(String[] args) {
    //how to define the main method here ?????
}
    
}