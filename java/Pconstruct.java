/**
 * Pconstruct
 */
class Rectangle{
    int x,y,result;
    Rectangle(int a, int b)
    {
        x=a;
        y=b;
    }
    public void Result()
    {
        result=x*y;
        System.out.println("result is ="+result);
    }
}
public class Pconstruct {

    public static void main(String[] args) {
        Rectangle R=new Rectangle(15, 12);
        R.Result();
        
    }
}