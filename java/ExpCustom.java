class TooYoungException extends RuntimeException
{
    public TooYoungException(String m)
    {
        super(m);
    }
}
class TooOldException extends RuntimeException
{
    public TooOldException(String m)
    {
        super(m);
    }
}
public class ExpCustom {
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        
            if(age>80)
        {
            throw new TooYoungException("you are so young for narriage");
        }
        else if(age<18)
        {
            throw new TooOldException(" you are too old guy");
        }
        else
        {
            System.out.println("baha habu ree pua");
        }
    }

    
}