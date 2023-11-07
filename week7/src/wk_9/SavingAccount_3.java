package wk_9;

public class SavingAccount_3 extends BankAccount_3 {

    public void withdraw (int b) {
        if (b < 100) {
            System.out.println( "Can not withdrawals" );
        }
        else{
            System.out.println("withdrawals");
        }
    }

    public static void main(String[] args) {
        SavingAccount_3 m = new SavingAccount_3();
        m.withdraw( 150 );

    }

}
