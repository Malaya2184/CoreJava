/**
 * Demo progaram to understand wrapper class
 */
public class Demo {

    public static void main(String[] args) {
        int s=0;
        for(int n=0; n<args.length; n++)
        {
            s=s+Integer.parseInt(args[n]);
            
        }
        System.out.println(s);
    }
}