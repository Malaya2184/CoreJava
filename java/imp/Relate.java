/**
 * Relate
 */
public class Relate {

    public static void main(String[] args) {
        Relate1 R=new Relate1();
        R.print ();
        R.printsum();
        /**this line will not print in the terminal
        because in that return value will store in int but there is no print message
        so if we need to print the value the we have to call this inside the system.out.println(here);*/
        System.out.println(R.printsum());
    }
}