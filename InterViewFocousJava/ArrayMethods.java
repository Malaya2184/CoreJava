import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,32,54,22,66};
        String strArr[] ={"malaya", "kumar", "Swain"}; 
        System.out.println(arr.length);
        System.out.println("-------------------------");
        Collections.reverse(Arrays.asList(strArr));
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
