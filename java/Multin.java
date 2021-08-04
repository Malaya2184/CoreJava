class student
{
    int x,y;
    void getmarks(int a, int b)
    {   x=a;
        y=b;
    }
}
class total extends student
{   int tot;
    void tota()
    {
        tot=x+y;
        System.out.println("tot ="+tot);
    }
}
/**
 * Multin
 */
public class Multin {

    public static void main(String[] args) {
        total t=new total();
        t.getmarks(10, 15);
        t.tota();
    }
}