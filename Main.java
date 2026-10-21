
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        System.out.println(
            "Opening balance: Rs. " + account.getBalance()
        );

        account.deposit(500);
        System.out.println(
            "After deposit: Rs. " + account.getBalance()
        );

        try {
            account.withdraw(300);
            System.out.println(
                "After withdrawal: Rs. "
                + account.getBalance()
            );
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(2000);
        } catch (InsufficientFundsException e) {
            System.out.println(
                "Withdrawal rejected: " + e.getMessage()
            );
        }

        System.out.println(
            "\nFinal balance: Rs. " + account.getBalance()
        );

        account.printTransactions();
    }
}
