/**
 * Jumping
 */
public class Jumping 
{
    public static void main(String args[]) 
    {
        int i,j;
       loop1:for(i=0; i<5; i++) //here loop1 is for label i.e labeled loop
        {
            if(i>3)
                {
                    break;
                }
            for(j=0; j<=5; j++)
            {   
                System.out.print("* "); //here you have to write print insteed of println so that to print in one line
                if(j==i)
                {
                    System.out.println();//to make a new line to print next step
                    continue loop1;
                }
            }
        }
    }
}