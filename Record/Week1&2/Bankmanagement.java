import java.util.Scanner;

class Account {
    int accountNumber;
    double balance;
    String accountType;

    Account(int accountNumber, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance && amount>0) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance && amount>0) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;
            System.out.println("Amount transferred successfully.");
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }

    void displayBalance() {
        System.out.println("Account type:"+ accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance :"+balance);
    }
}


class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance, "Savings");
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest added: " + interest);
        System.out.println("New balance: " + balance);
    }
}


class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit) && amount>0){
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}


public class Bankmanagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount savings =
                new SavingsAccount(101, 10000, 5);

        CurrentAccount current =
                new CurrentAccount(102, 5000, 2000);
            System.out.println(" BANK MENU ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Savings Account Balance");
            System.out.println("5. Calculate Savings Interest");
            System.out.println("6. Current Account Balance");
            System.out.println("7. Exit");

        while (true) {

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    System.out.print("Choose account: ");
                    int depositAccount = sc.nextInt();

                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();

                    if (depositAccount == 1) {
                        savings.deposit(depositAmount);
                    } else if (depositAccount == 2) {
                        current.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account.");
                    }
                    break;


                case 2:
                    System.out.println("1. Savings Account");
                    System.out.println("2. Current Account");
                    System.out.print("Choose account: ");
                    int withdrawAccount = sc.nextInt();

                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAccount == 1) {
                        savings.withdraw(withdrawAmount);
                    } else if (withdrawAccount == 2) {
                        current.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account.");
                    }
                    break;


                case 3:
                    System.out.println("1. Savings ->Current");
                    System.out.println("2. Current -> Savings");
                    System.out.print("Choose transfer: ");
                    int transferChoice = sc.nextInt();


                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    if (transferChoice == 1) {
                        savings.transfer(current, amount);
                    } else if (transferChoice == 2) {
                        current.transfer(savings,amount);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;


                case 4:
                    System.out.println(" Savings Account ");
                    savings.displayBalance();
                    break;


                case 5:
                    savings.calculateInterest();
                    break;


                case 6:
                    System.out.println("\n--- Current Account ---");
                    current.displayBalance();
                    break;


                case 7:
                    sc.close();
                    return;


                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}