/**
 * PassbyValue
 */
public class PassbyValue {
    public void pass(int num) {
        num=num*num;
        System.out.println("passed the value and the output is ="+num);
        
    }

    public static void main(String[] args) {
        int number=25;
        System.out.println("before passing the value the output is ="+number);
        PassbyValue P=new PassbyValue();
        P.pass(number);
        System.out.println("after control from function the value is ="+number);
        
    }
}