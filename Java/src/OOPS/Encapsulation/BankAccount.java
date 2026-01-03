package OOPS.Encapsulation;

public class BankAccount {
    // private data (hidden)
    private double balance;

    // public method to read data
    public double getBalance() {
        return balance;
    }

    // public method to modify data safely
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
