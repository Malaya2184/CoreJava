class Parentt{
    String msg;
    Parentt(String msg){
        this.msg = msg;
    }
}

class Childd extends Parentt{
    
    Childd(String msg) {

        // here the msg passed from child class to parent class constructor
        super(msg);
    }

    void print(){
        System.out.println(super.msg);
    }

}


public class SuperUnderstand {
    public static void main(String[] args) {

        Childd ch = new Childd("this msg is passed from child to parent");
        ch.print();

        
    }
}
