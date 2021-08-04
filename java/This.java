/**
 * A
 */
class A{

    int x=10;
    int y=15;
    void fun1(int x,int y)
    {
        x=this.x;
        y=this.y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(x);
        System.out.println(y);
    }
}
public class This {
public static void main(String[] args) {
    new A();
    new A().fun1(1,2);
}
}