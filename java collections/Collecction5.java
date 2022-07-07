import java.util.*;;

public class Collecction5 {
    public static void main(String[] args) {
        
        Stack s = new Stack();

        System.out.println(s.size());
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s.peek());
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));

    }
}
