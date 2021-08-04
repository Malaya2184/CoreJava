class Khelaw extends Thread{
    Khelaw(String name)
    {
        setName(name);
    }
    @Override
    public void run() 
    {
        try {
            for(int i=0;i<10;i++)
            {
                System.out.println(getName()+" "+"LOKO");
                Thread.yield();
            }
        } catch (Exception e) {
            
        }
    }
}
public class ThrYield {

    public static void main(String[] args) {
        Khelaw K=new Khelaw("BADA");
        K.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("chotoloko");
        }
    }
}