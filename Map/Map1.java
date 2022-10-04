
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        HashMap h1 = new HashMap();
        h.put("name", "malaya");
        h1.put("age", 25);
        System.err.println(h.get("name"));
        Set entryset = h.entrySet();
        System.err.println(entryset); // return entry set
        
    }
}
