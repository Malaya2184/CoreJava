interface Inf
{
    void f1();
}
/**
 * inf1
 */
interface Inf1 {
    void f2();
    
}
/**
 * Exmp
 */
class hols implements Inf,Inf1 {
    public void f1() {
        System.out.println("implements inf1");
    }
    public void f2() {
        System.out.println("implements inf2");
    }
    
}
/**
 * Exmp
 */
public class Exmp {

    public static void main(String[] args) {
        hols E=new hols();
        E.f1();
        E.f2();
    }
}