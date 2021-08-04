/**
 * Expown
 */
public class Expown {
    void fun() throws ClassNotFoundException
    {
        System.out.println("starts");
        throw new ClassNotFoundException("in fun()");
    }

    public static void main(String[] args) {
        try {
            new Expown().fun();
        } 
        catch (Exception e) {
            System.out.println("class not found"+"  "+e.getMessage());//TODO: handle exception
        }
    }
}