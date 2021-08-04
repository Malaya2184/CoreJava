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
    int add()
    {
        System.out.print("addition is =");
        return (x+y);
    }
}
class C extends B
{
    int mul()
    {
        System.out.print("multiplication is =");
        return (x*y);
    }
}
/**
 * Inh
 */
public class Inh {
    public static void main(String[] args) {
        int sum, mul;
    C obj=new C();
    obj.getdata(10, 15);
    sum=obj.add();
    System.out.println(sum);
    mul=obj.mul();
    System.out.print(mul);
    }
    
}