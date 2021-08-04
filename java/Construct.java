/**
 * Construct //it is an example of default constructor
 */
class Demmo{
    int a,b;
    Demmo()
    {
        System.out.println("deafult constructor");
        a=5;
        b=10;
    }
    public void addnumbers()
    {
        System.out.println("a+b ="+(a+b));
    }
}
public class Construct {
    public static void main(String[] args) {
        Demmo D1=new Demmo();
        D1.addnumbers();
    }
    
}