import java.util.*;

// custor comparator in treeset
class DecendingComparator implements Comparator{

    public int compare(Object o1, Object o2){

        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;

        if (i1<i2) {
            return +1;
        } else if(i1>i2) {
            return -1;
        }
        else{
            return 0;
        }

    }
}

public class Collection12 {

    public static void main(String[] args) {
        
        // TreeSet t = new TreeSet();
        TreeSet t = new TreeSet( new DecendingComparator());
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);

        System.out.println(t);
    }
    
}
