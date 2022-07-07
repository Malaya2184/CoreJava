
public class Expooo {
    public static void main(String[] args) {
        int balance = 3000;
        int withdraw=5000;
        try {
            if (withdraw>balance)
                throw new Exception("withdraw balance is more than the balance");
        balance=balance-withdraw;
        System.out.println("sucessful");
        } 
        catch (Throwable e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }
        
        System.out.println("continue......");
    }

}