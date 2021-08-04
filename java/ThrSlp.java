/**
 * ThrSlp
 */
public class ThrSlp {

    public static void main(String[] args) {
        System.out.println("running.......");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception");//TODO: handle exception
        }
        System.out.println("wakedup....");
    }
}