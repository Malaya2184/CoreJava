import java.io.Serializable;
import java.util.*;

public class Colection2 {
    public static void main(String[] args) {

        ArrayList l1 = new ArrayList();

        LinkedList l2 = new LinkedList();
        l2.add(5);

        // only array list and the vector implemenrs random acess npt by the linkedlist
        System.out.println(l1 instanceof Serializable);
        System.out.println(l1 instanceof Cloneable);
        System.out.println(l1 instanceof RandomAccess);


        System.out.println(l2 instanceof Serializable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l2 instanceof RandomAccess);
        System.out.println(l2);
        System.out.println(l2.getClass());

        
    }
    
}
