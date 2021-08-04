/**
 * Abstract1
 */
public class Abstract1 {
    static int length=100;
    static void modf()
    {
        length=length+length;
        System.out.println(length);
        
    }

    public static void main(String[] args) {
        Abstract1 A=new Abstract1();
        A.modf();
        Abstract1 B=new Abstract1();
        B.modf();
        Abstract1.modf();
        Abstract1.modf();
        Abstract1.modf();

    }
}