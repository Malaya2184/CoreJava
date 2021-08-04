/**
 * PassbyReff
 */
public class PassbyReff {
    int length=100;

    public void Modify(PassbyReff R2) 
    {   
        System.out.println("inside the modify method before modification the value of length is ="+R2.length);
        R2.length=250;

        System.out.println("inside the modify method the value of length ="+R2.length);
    }
    
    public static void main(String[] args) {
        PassbyReff R1=new PassbyReff();
        System.out.println("before passing the object to the method length is ="+R1.length);
        R1.Modify(R1);
        System.out.println("after the execution of modify method the value of length outside the modify method is = "+R1.length);
    }
}