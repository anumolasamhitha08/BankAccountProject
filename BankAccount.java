
import java.util.ArrayList;
import java.util.List;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;
    private final List<String> transactions = new ArrayList<>();

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative."
            );
        }

        balance = initialBalance;
        transactions.add(
            "Account opened with balance: Rs. " + balance
        );
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }

        balance += amount;
        transactions.add("Deposited: Rs. " + amount);
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            transactions.add(
                "Failed withdrawal: Rs. " + amount
            );
            throw new InsufficientFundsException(
                "Insufficient funds! Available balance: Rs. "
                + balance
            );
        }

        balance -= amount;
        transactions.add("Withdrawn: Rs. " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        System.out.println("\nTransaction History:");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
