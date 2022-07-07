import java.util.*;


class StringBufferComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        String s1 = o1.toString();
        String s2 = o2.toString();
        
        return -s1.compareTo(s2);
    }

}
public class Collection15 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new StringBufferComparator());
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("B"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("D"));
        System.out.println(t);
    }
}
