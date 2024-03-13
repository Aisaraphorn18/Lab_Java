package lab03_02;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        if (initialBalance <= 0.)
            throw new IllegalArgumentException("Initial balance must be positive.");
        else
            this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0.)
            throw new IllegalArgumentException("Amount must be positive.");
        else
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0. || amount > balance)
            throw new IllegalArgumentException("Amount must be positive and not exceeding balance.");
        else
            balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
