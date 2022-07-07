import java.util.*;


class MyComparator implements Comparator{

    public int compare(Object obj1, Object obj2){

        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;

        // return i1.compareTo(i2); // returns default comapre to method for acending sorting
        // return -i1.compareTo(i2); // returns -ve comapre to method for dedescending sorting
        return i2.compareTo(i1); // returns -ve comapre to method for dedescending sorting
        // return +1; // to get insertion order
        // return 0; //only 1st element will be inserted
    }

}



public class Collection13 {
    public static void main(String[] args) {

        TreeSet t = new TreeSet( new MyComparator());
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(5);

        System.out.println(t);
        
    }
}
