import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Authentication auth = new Authentication();
        Account account = new Account(25000.0f);
        ATMService atm = new ATMService();

        if (!auth.verifyPin(sc)) {
            sc.close();
            return;
        }

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Payment");
            System.out.println("3. Deposit");
            System.out.println("4. Display Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    atm.withdraw(account, sc);
                    break;
                case 2:
                    atm.payment(account, sc);
                    break;
                case 3:
                    atm.deposit(account, sc);
                    break;
                case 4:
                    atm.displayBalance(account);
                    break;
                case 5:
                    System.out.println("Thank you for using ATM");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
