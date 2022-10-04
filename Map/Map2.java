import java.util.*;

public class Map2 {
public static void main(String[] args) {
    
    HashMap h = new HashMap();
    h.put(1,"malaya");
    h.put(2,"malaya");
    h.put(3,"malaya");
    h.put(4,"malaya");
    h.put(5,"malaya");

    Set s = h.entrySet();
    System.out.println(s);
    Iterator i = s.iterator();
    while (i.hasNext()){
       Map.Entry me = (Map.Entry)i.next();
       System.out.println(me.getKey());

       if (me.getKey().equals(1)) {
        System.out.println("entered");
             me.setValue(1000);
       }
    }
    System.out.println(h);
}    
}
