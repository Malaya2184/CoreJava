import java.util.*;

public class Collection9 {
    public static void main(String[] args) {
        HashSet h = new HashSet();

        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("A")); // simply return false
        System.out.println(h.getClass().getName());
        System.out.println(h); // insertion order not preserved




        LinkedHashSet lh = new LinkedHashSet();

        lh.add("A");
        lh.add("B");
        lh.add("C");
        lh.add("D");
        lh.add("Z");
        lh.add(null);
        lh.add(10);
        System.out.println(lh.add("A")); // simply return false
        System.out.println(lh.getClass().getName());
        System.out.println(lh); // insertion order not preserved
    }
}
