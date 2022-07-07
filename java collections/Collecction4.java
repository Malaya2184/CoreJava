import java.util.*;;

public class Collecction4 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10,5);

        System.out.println("vector v initial capasity "+ v.capacity());
        System.out.println("vector v1 initial capasity "+ v1.capacity());

        for (int i = 0; i < 10; i++) {
            
            v.addElement(i);
            v1.addElement(i);
        }

        System.out.println(v);
        System.out.println(v1);
        v.addElement("xxx");
        v1.addElement("xxx");
        System.out.println(v);
        System.out.println(v1);
        System.out.println("after 11th element"+ v.capacity());
        System.out.println("after 11th element"+ v1.capacity());

    }
}
