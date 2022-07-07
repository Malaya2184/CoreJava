
import java.util.*;
public class Collection7 {

    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();
        for (int i = 0; i < 11; i++) {
            l.add(i);
        }

        Iterator i = l.iterator();

        while (i.hasNext()) {
            

            if((Integer)i.next()%2 == 0){
                i.remove();
            }
            
        }
        System.out.println(l);
    }
}