import javafx.scene.shape.Line;

/**
 * Wrapper
 */
public class Wrapper {

    public static void main(String[] args) {
        //value_of function
        Integer i=Integer.valueOf("123");
        int j=Integer.valueOf("11",2);
        float k=Float.valueOf("11");
        double l=Double.valueOf("11.1");
        Character c=Character.valueOf('j');
        //parse function
        int a=Integer.parseInt("123");
        int b=Integer.parseInt("11",2);
        float f=Float.parseFloat("11.2");
        //xxx value
        int x=i.intValue();
        System.out.println(x);
        System.out.println(i.intValue());
        System.out.println(i.floatValue());
        System.out.println(i.doubleValue());
        System.out.println("output is"+"  "+i+"  "+j+"  "+"  "+k+"  "+l+"  "+c);
        System.out.println("optis"+"  "+a+"  "+b+"  "+f);
    }
}