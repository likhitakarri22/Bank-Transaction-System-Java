import java.util.Scanner;

public class Authentication {
    private final int PIN = 1245;

    public boolean verifyPin(Scanner sc) {
        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int inputPin = sc.nextInt();

            if (inputPin == PIN) {
                return true;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");
            }
        }

        System.out.println("Card Blocked");
        return false;
    }
}
