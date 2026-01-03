package OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.deposit(1000);
        acc.withdraw(300);

        System.out.println(acc.getBalance()); // 700
    }
}
