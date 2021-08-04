/**
 * Expoo
 */
public class Expoo {

    public static void main(String[] args) {
        int balance = 3000;
        int withdraw=5000;
        if (withdraw>balance)
        throw new ArithmeticException("withdraw balance is more than the balance");
        balance=balance-withdraw;
        System.out.println("sucessful");
    }
}