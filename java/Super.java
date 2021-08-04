class A{
    void f1()
    {
        System.out.println("class a");
    }
}
class B extends A{
    void f1()
    {
        System.out.println("class b");
        super.f1();
    }
}
/**
 * Super
 */
public class Super {

    public static void main(String[] args) {
        new B().f1();
    }
}