package records;
class Account {

 int accountNumber;
 String accountHolderName;
 double balance;
 String accountType;

 Account(int accountNumber, String accountHolderName,
         double balance, String accountType) {

     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = balance;
     this.accountType = accountType;
 }

 void deposit(double amount) {
     balance = balance + amount;
     System.out.println("Deposited: " + amount);
 }

 void withdraw(double amount) {

     if (amount <= balance) {
         balance = balance - amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 void transfer(Account anotherAccount, double amount) {

     if (amount <= balance) {
         balance = balance - amount;
         anotherAccount.balance = anotherAccount.balance + amount;

         System.out.println("Transferred: " + amount);
     } else {
         System.out.println("Insufficient balance for transfer.");
     }
 }

 void displayAccountDetails() {

     System.out.println("\n--- Account Details ---");
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Holder Name    : " + accountHolderName);
     System.out.println("Account Type   : " + accountType);
     System.out.println("Balance        : " + balance);
 }
}

class SavingsAccount extends Account {

 double interestRate;
 SavingsAccount(int accountNumber, String accountHolderName,
                double balance, double interestRate) {

     super(accountNumber, accountHolderName, balance, "Savings");
     this.interestRate = interestRate;
 }

 void calculateInterest() {

     double interest = balance * interestRate / 100;

     balance = balance + interest;

     System.out.println("Interest Added: " + interest);
 }
}

class CurrentAccount extends Account {

 double overdraftLimit;

 CurrentAccount(int accountNumber, String accountHolderName,
                double balance, double overdraftLimit) {

     super(accountNumber, accountHolderName, balance, "Current");
     this.overdraftLimit = overdraftLimit;
 }
 
 void withdraw(double amount) {

     if (amount <= balance + overdraftLimit) {
         balance = balance - amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Withdrawal exceeds overdraft limit.");
     }
 }
}
public class BankSystem {

 public static void main(String[] args) {

     SavingsAccount savings =
             new SavingsAccount(101, "Ravi", 10000, 5);
     CurrentAccount current =
             new CurrentAccount(102, "Arun", 5000, 3000);

     System.out.println("BEFORE TRANSACTIONS");
     savings.displayAccountDetails();
     current.displayAccountDetails();
     System.out.println("\n--- Deposit ---");
     savings.deposit(2000);
     System.out.println("\n--- Savings Withdrawal ---");
     savings.withdraw(3000);
     System.out.println("\n--- Interest Calculation ---");
     savings.calculateInterest();
     System.out.println("\n--- Current Withdrawal ---");
     current.withdraw(7000);
     System.out.println("\n--- Fund Transfer ---");
     savings.transfer(current, 2000);
     System.out.println("\nAFTER TRANSACTIONS");

     savings.displayAccountDetails();
     current.displayAccountDetails();
 }
}




