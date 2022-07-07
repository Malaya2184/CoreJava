import java.util.*;


class HeteroGenousComparator implements Comparator{
    public int compare(Object o1, Object o2){

        String s1 = o1.toString();
        String s2 = o2.toString();

        if(s1.length() < s2.length()){
            return -1;
        }
        else if (s1 == s2) {
             return 0;            
        }
        else{
            return +1;
        }
    }
}
public class Collection16 {
    public static void main(String[] args) {

        TreeSet t = new TreeSet( new HeteroGenousComparator());

        t.add("a");
        t.add(new StringBuffer("abcd"));
        t.add("mal");

        System.out.println(t);
        
    }
}
