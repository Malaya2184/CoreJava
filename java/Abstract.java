/**
 * Abstract
 */
/**
 * InnerAbstract
 */
abstract class InnerAbstract {
    int a=15;
    int b=10;
    abstract void sum();
}
/**
 * InnerAbstract_1
 */
class InnerAbstract_1 extends InnerAbstract {

    
    void sum()
    {
        System.out.println(""+(a+b));
    }
}

public class Abstract {

    public static void main(String[] args) {
        InnerAbstract I= new InnerAbstract_1();
        I.sum();
        
    }
}