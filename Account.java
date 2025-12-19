public class Account {
    private float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public boolean withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
