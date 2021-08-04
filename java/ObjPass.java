/**
 * ObjPass
 */
public class ObjPass {

    int a=5;
    void changevalue(ObjPass ob)
    {
        ob.a++;
        
    }
    public static void main(String[] args) {
        ObjPass o=new ObjPass();
        System.out.println(o.a);
        o.changevalue(o);
        System.out.println(o.a);
    }
}