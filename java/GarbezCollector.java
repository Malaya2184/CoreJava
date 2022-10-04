class Abc{
    Abc(){
        System.out.println("class abc created");
    }

    public String toString(){
        return "Abc class";
    }

    public void finalize(){
        System.out.println("class Abc destroyed");
    }
}

public class GarbezCollector {

    public static void main(String[] args) {
        
        // Abc  abc = new Abc();
        // Abc abc2 = new Abc();
        
        // abc = abc2;
        // System.gc();


        // if there is no object reference then after the reation and method execution the object will immidiately destroyed
        new Abc();
        System.gc();

        

    }
    
}
