

class A{
    String f1()
    {
        return("class a");
    }
}
class B extends A{
    String f1()
    {
        System.out.println(super.f1());;
        return("class b");
        
    }
}
public class SecondSuperKey {
    
    public static void main(String[] args) {
       System.out.println(new B().f1());;
    }
}
