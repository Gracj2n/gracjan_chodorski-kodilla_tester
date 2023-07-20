package wallet;

public class Wallet {
    private int balance;

    public Wallet() {
    }
    public void deposit(int value) {
        this.balance += value;
    }
    public int getBalance() {
        return balance;
    }
}
