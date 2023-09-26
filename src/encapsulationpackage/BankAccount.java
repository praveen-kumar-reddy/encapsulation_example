package encapsulationpackage;

public class BankAccount {
    private static int totalAccounts = 0;

    private int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        accountNumber = ++totalAccounts;  // Increment account number and set it for this account
        balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000.0);
        BankAccount account2 = new BankAccount(500.0);

        System.out.println("Account 1 - Account Number: " + account1.getAccountNumber() + ", Balance: $" + account1.getBalance());
        System.out.println("Account 2 - Account Number: " + account2.getAccountNumber() + ", Balance: $" + account2.getBalance());

        account1.deposit(500.0);
        account2.withdraw(200.0);

        System.out.println("Updated balances after transactions:");
        System.out.println("Account 1 - Balance: $" + account1.getBalance());
        System.out.println("Account 2 - Balance: $" + account2.getBalance());

        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
