 class BankAccount_12 {

        private String accountNumber;
        private double balance;
        public String getAccountNumber() {
            return accountNumber;
        }
        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }

    }
 public class Main {
     public static void main(String[] args) {

         BankAccount_12 account = new BankAccount_12();

         account.setAccountNumber("TSB-8972");
         account.setBalance(2718.65);

         String accountNumber = account.getAccountNumber();
         double balance = account.getBalance();


         System.out.println("Account Number: " + accountNumber);
         System.out.println("Balance: " + balance);
     }
 }

