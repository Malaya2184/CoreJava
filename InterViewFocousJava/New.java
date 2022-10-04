class MyClass{
    private int x = 10;

    class MyClassChild{

        void show(){
            System.out.println(x);
        }
        
    }
   
}


public class New{
    public static void main(String[] args) {

        MyClass m = new MyClass();
        MyClass.MyClassChild c = m.new MyClassChild();
        c.show();
      
    }
}