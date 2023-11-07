package wk_9;
//Write a Java program to create a class known as "BankAccount" with methods called
//        deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
//        withdraw() method to prevent withdrawals if the account balance falls below one
//        hundred.
public class BankAccount_3 {
    public void deposit(int a){

    }
    public void withdraw (int b){

    }

    public static void main(String[] args) {
        BankAccount_3 d = new BankAccount_3();
        BankAccount_3 w = new BankAccount_3();
        d.deposit(1000  );
        w.withdraw( 20 );
    }
}
