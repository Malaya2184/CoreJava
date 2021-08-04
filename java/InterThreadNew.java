class F extends Thread
{
    @Override
    public void run() {
        synchronized(this)
        {
            try {
                this.wait();

                System.out.print("k");
            } catch (Exception e) {
                System.out.println("exp");
                //TODO: handle exception
            }
        }
    }
}
class U extends Thread
{
    F objF;
    U(F objF)
    {
        this.objF=objF;
    }
    @Override
    public void run() {
        synchronized(this)
        { 
            try {
                this.wait(100);
                System.out.print("c");
        } catch (Exception e) {
            System.out.println("exp");//TODO: handle exception
        }
        synchronized(objF)
        {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            objF.notify();
        }
        }
    }
}
class Ck extends Thread
{ U objU;
    Ck (U objU)
    {
        this.objU=objU;
    }
    @Override
    public void run() {
        synchronized(objU)
        {
            System.out.print("fu");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("exp");
                //TODO: handle exception
            }
            objU.notify();
        }
    }


}
public class InterThreadNew {
public static void main(String[] args) {
    F objF=new F();
    U objU=new U(objF);
    Ck objC=new Ck(objU);
    objF.start();
    objU.start();
    objC.start();
}
}