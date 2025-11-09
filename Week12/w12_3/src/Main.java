public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.deposit(2000);
            account.withdraw(8000);
            account.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}