package wk_9;
//Write a Java program to create a base class BankAccount with methods deposit() and
//        withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//        withdraw() method in each subclass to impose different withdrawal limits and fees.
public class BankAccount_10 {
    private String accountNumber;
    private double balance;

    public BankAccount_10 (String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println( "Insufficient balance" );
        }
    }

    public double getBalance() {
        return balance;
    }
}
