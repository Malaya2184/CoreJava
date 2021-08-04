class Demo {
    int x,y,z;
    public void sum(int n1,int n2)
    {   x=n1;
        y=n2;
        z=x+y;
    }
    public void printdata()
    {
        System.out.println(z);
    }
}
    /**
     * Test
     */
    public class Test {
    
        public static void main(String[] args) {
            Demo T1=new Demo();
            Demo T2=new Demo();
            T1.sum(10,15);
            T1.printdata();
            T2.sum(5,3);
            T2.printdata();
        }
    }
    
