/**
 * Jumping1
 */
public class Jumping1 {

    public static void main(String[] args) {
        int i=1;
        for(i=1;i<20;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}