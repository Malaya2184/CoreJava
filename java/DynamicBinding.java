
public class DynamicBinding {
    public static class SuperClass{

        void print(){
            System.out.println("this is super class");
        }
    }
    public static class SubClass extends SuperClass{

        //over ridden function
        void print(){
            System.out.println("this is sub class");
        }
    }
    
    public static void main(String[] args) {
        
        SuperClass s1 = new SuperClass();
        SuperClass s2 = new SubClass();

        s1.print();
        s2.print();
    }
}