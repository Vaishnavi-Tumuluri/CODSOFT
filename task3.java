import java.util.*;

public class task3 {
    private BankAccount account;

    public task3(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        }
    }

    public void deposit(double amount) {
        account.deposit(amount);
        System.out.println("Deposit successful.");
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + account.getBalance());
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        task3 atm = new task3(account);
        Scanner input = new Scanner(System.in);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter option: ");
            int option = input.nextInt();

            if (option == 1) {
                System.out.print("Enter amount to withdraw: ");
                double amount = input.nextDouble();
                atm.withdraw(amount);
            } else if (option == 2) {
                System.out.print("Enter amount to deposit: ");
                double amount = input.nextDouble();
                atm.deposit(amount);
            } else if (option == 3) {
                atm.checkBalance();
            } else if (option == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        input.close();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}