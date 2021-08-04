
class Abba {
    void input(int a)
    {
        System.out.println("present in class A");
    }
}
class Bbba extends Abba {
    void input(int a,int b)
    {
        System.out.println("present in class B");
        super.input(15);
    }
    
}
/**
 * MoverloadInheritance
 */
public class MoverloadInheritance {

    public static void main(String[] args) {
        Bbba b=new Bbba();
        b.input(10);
        b.input(10,15);
    }
}