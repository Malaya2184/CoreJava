import java.util.Scanner;

/**
 * bank (this program contain)
 * check balance
 * withdraw amount
 * deposit amount
 * must see the use of break in  case 2
 */
public class bank {
    public static void main(String[] args) {
        Scanner objScanner=new Scanner(System.in);
        int balance=20000;
        System.out.println("MENU");
        System.out.println("1:- check balance");
        System.out.println("2:- withdraw amount (please enter choice and amount )");
        System.out.println("3:- deppsit amount  (please enter choice and amount)");
        System.out.println("4:- Exit");
        System.out.println("SELECT THE APPROPIATE CHOICE");
        int ch=objScanner.nextInt();
        switch(ch)
        {
            case 1: 
            System.out.println("balance is ="+balance);
            break;

            case 2:
            System.out.println("Enter the amount to withdraw");
            int w=objScanner.nextInt();
            if(w>balance)
            {
                System.out.println("you have an insuffecient balance in your account");
                break; 
            }
            balance=balance-w;
            System.out.println("you have withdrawn sucessfully Rs"+w);
            System.out.println("Remaining balance is ="+balance);
            break;

            case 3:
            System.out.println("Enter the amount to deposit in your account");
            int d=objScanner.nextInt();
            balance=balance+d;
            System.out.println("your updated balance is ="+balance);
            break;

            case 4:
            default:break;

        }
    }

    
}