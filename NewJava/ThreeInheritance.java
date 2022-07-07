class A{
    int x,y;
    public void getdata(int a,int b)
    {
        x=a;
        y=b;
    }
}
class B extends A
{
    void add()
    {
        System.out.println(String.format("addition is = %d" , (x+y)));
    }
}
class C extends B
{
    void mul()
    {
        System.out.println(String.format("multiplication is= %d ", (x*y)));

    }
}
/**
 * Inh
 */
public class ThreeInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.getdata(5, 6);
        c.add();
        c.mul();
    }
    
}