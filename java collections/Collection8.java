import java.util.*;

public class Collection8 {
    public static void main(String[] args) {
        
        LinkedList l  = new LinkedList();

        for (int i = 0; i < 11; i++) {
            
            l.add(i);
        }
        ListIterator ltr = l.listIterator();

        while (ltr.hasNext()) {
            
            if ((Integer)ltr.next() == 10) {

                ltr.set(15);
                
            }
        }
        System.out.println(l);
    }
}
