import java.util.*;

class MyStringComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;

        return -s1.compareTo(s2); //to  make treee reverse compare
    }
    
}

public class Collection14 {
    public static void main(String[] args) {
        
        TreeSet t = new TreeSet(new MyStringComparator());
        t.add("malaya");
        t.add("pralaya");
        t.add("zalaya");
        System.out.println(t);
    }
}
