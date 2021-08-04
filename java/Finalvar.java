    //Java program to demonstrate different 
// ways of initializing a final variable 
public class Finalvar {
    // a final variable 
    // direct initialize 
    final int A = 5; 
    
    // a blank final variable 
    final int B;
    // instance initializer block for  
    // initializing B 
    { 
        B=25; 
    }  
    
    // another blank final variable 
    final int  C;
    // constructor for initializing C 
    // Note that if there are more than one 
    // constructor, you must initialize C 
    // in them also 
    public Finalvar()  
    { 
        C=-1; 
    }
    // a final static variable PI 
    // direct initialize 
    static final double PI = 3.141592653589793; 
    // a  blank final static  variable 
    static final double D;
    // static initializer block for  
    // initializing D 
    static{
        D = 2.3; 
    }
    void display()
    {
        System.out.println(A+"   "+B+"   "+C+"   "+PI+"   "+D);
    }
public static void main(String[] args) {
    Finalvar F=new Finalvar();
    F.display();
}
}