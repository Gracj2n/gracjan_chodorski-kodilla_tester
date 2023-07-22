package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }
    public void deposit(int value) {
        this.balance += value;
    }
    public void debit(int value) {
        this.balance -= value;
    }
    public int getBalance() {
        return balance;
    }
}
