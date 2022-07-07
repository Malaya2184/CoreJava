import java.util.*;

public class Collecction3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("malaya");
        l.add(5);
        l.add(6);
        l.set(0, "spider");
        System.out.println(l);
        System.out.println(l.get(2));
        System.out.println(l.get(l.size()/2));
    }
}
