/**
 * Bitwise
 */
public class Bitwise {

    public static void main(String[] args) {
        int a=15;
        int b=5;
         /**
          a         =  0000 1111 i.e=15
          b         =  0000 0101 i.e=5
          and       =  0000 0101 i.e 5
          or        =  0000 1111 i.e 15
          xor       =  0000 1010 i.e 10
          leftshift =  0111 1000 i.e 120
          rightshift=  0000 0001 i.e=1
          */
        int and=a&b;
        int or=a|b;
        int xor=a^b;
        int leftshift_a=a<<3;
        int rightshift_a=a>>3;
        System.out.println("and ="+and);
        System.out.println("or ="+or);
        System.out.println("xor ="+xor);
        System.out.println("leftshift of a of 3 bit ="+leftshift_a);
        System.out.println("rightshift of a of 3 bit ="+rightshift_a);
    }
}