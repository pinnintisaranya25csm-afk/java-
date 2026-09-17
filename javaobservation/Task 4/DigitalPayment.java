package records;
import java.util.Scanner;

interface PaymentService {
 void pay(String upiId, double amount)
         throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;

 void checkBalance();
}
class InsufficientBalanceException extends Exception {
 InsufficientBalanceException(String message) {
     super(message);
 }
}
class InvalidUPIException extends Exception {
 InvalidUPIException(String message) {
     super(message);
 }
}
class InvalidAmountException extends Exception {
 InvalidAmountException(String message) {
     super(message);
 }
}
class Wallet {
 private String name;
 private String mobile;
 private String upiId;
 private double balance;

 Wallet(String name, String mobile, String upiId, double balance) {
     this.name = name;
     this.mobile = mobile;
     this.upiId = upiId;
     this.balance = balance;
 }

 void addMoney(double amount) {
     balance = balance + amount;
     System.out.println("Money added successfully.");
 }

 double getBalance() {
     return balance;
 }

 String getUpiId() {
     return upiId;
 }

 void reduceBalance(double amount) {
     balance = balance - amount;
 }

 void displayWalletDetails() {
     System.out.println("\n--- Wallet Details ---");
     System.out.println("Name    : " + name);
     System.out.println("Mobile  : " + mobile);
     System.out.println("UPI ID  : " + upiId);
     System.out.println("Balance : " + balance);
 }
}
class UPIPayment implements PaymentService {

 private Wallet wallet;

 UPIPayment(Wallet wallet) {
     this.wallet = wallet;
 }

 public void pay(String upiId, double amount)
         throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {
     if (!upiId.contains("@")) {
         throw new InvalidUPIException("Invalid UPI ID.");
     }
     if (amount <= 0) {
         throw new InvalidAmountException("Amount must be greater than zero.");
     }
     if (amount > wallet.getBalance()) {
         throw new InsufficientBalanceException("Insufficient balance.");
     }
     wallet.reduceBalance(amount);

     System.out.println("Payment successful.");
     System.out.println("Amount Paid : " + amount);
     System.out.println("Paid To     : " + upiId);
 }

 public void checkBalance() {
     System.out.println("Current Balance : " + wallet.getBalance());
 }
}
public class DigitalPayment {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Mobile Number: ");
     String mobile = sc.nextLine();

     System.out.print("Enter UPI ID: ");
     String myUpi = sc.nextLine();

     System.out.print("Enter Initial Balance: ");
     double balance = sc.nextDouble();

     Wallet wallet = new Wallet(name, mobile, myUpi, balance);

     UPIPayment payment = new UPIPayment(wallet);

     System.out.print("Enter amount to add: ");
     double addAmount = sc.nextDouble();
     wallet.addMoney(addAmount);

     sc.nextLine();

     System.out.print("Enter Receiver UPI ID: ");
     String receiverUpi = sc.nextLine();

     System.out.print("Enter Payment Amount: ");
     double amount = sc.nextDouble();

     try {
         payment.pay(receiverUpi, amount);
     }
     catch (InvalidUPIException e) {
         System.out.println("Error: " + e.getMessage());
     }
     catch (InvalidAmountException e) {
         System.out.println("Error: " + e.getMessage());
     }
     catch (InsufficientBalanceException e) {
         System.out.println("Error: " + e.getMessage());
     }
     finally {
         System.out.println("Transaction process completed.");
     }

     payment.checkBalance();
     wallet.displayWalletDetails();

     sc.close();
 }
}


