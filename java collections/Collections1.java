import java.util.*;
public class Collections1 {

    public static void main(String[] args) throws NullPointerException{

        ArrayList l = new ArrayList();
        l.add('A');
        l.add(55);
        l.add(null);

        System.out.println(l);
        System.out.println(l.remove(0));
        System.out.println(l);
    }
  

}
