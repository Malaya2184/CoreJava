public class PassbyReference {
    public void displayArray(int[] values)
    {
        System.out.println("Inside displayArray method first element is  = "+values[0]);
        values[0] = values[0]+125;
        System.out.println("Inside displayArray method first element is  = "+values[0]);
    }
    public static void main(String[] args) {
    int[] value = {125,635};
    System.out.println("before displayArray methodfirst element of value array = "+value[0]);
    PassbyReference P=new PassbyReference();
    P.displayArray(value);
    System.out.println("after displayArray methodfirst element of value array = "+value[0]);
    }
}
