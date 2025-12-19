import java.io.FileWriter;
import java.io.IOException;

public class TransactionHistory {

    public static void log(String message) {
        try {
            FileWriter fw = new FileWriter("transactions.txt", true);
            fw.write(message + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error while saving transaction");
        }
    }
}
