import java.util.Scanner;

public class ATMService {

    public void withdraw(Account acc, Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        if (amount > 0 && amount % 100 == 0) {
            if (acc.withdraw(amount)) {
                System.out.println("Withdrawal successful");
                TransactionHistory.log("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void deposit(Account acc, Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        float amount = sc.nextFloat();

        if (amount > 0 && amount % 100 == 0) {
            acc.deposit(amount);
            System.out.println("Deposit successful");
            TransactionHistory.log("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void payment(Account acc, Scanner sc) {
        System.out.print("Enter payment amount: ");
        float amount = sc.nextFloat();

        if (amount > 0 && acc.withdraw(amount)) {
            System.out.println("Payment successful");
            TransactionHistory.log("Payment: " + amount);
        } else {
            System.out.println("Payment failed");
        }
    }

    public void displayBalance(Account acc) {
        System.out.println("Current Balance: " + acc.getBalance());
        TransactionHistory.log("Balance Checked: " + acc.getBalance());
    }
}
