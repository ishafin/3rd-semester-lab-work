interface Account {
    void deposit(double amount);
    void withdraw(double amount);

    static void aboutBank() {
        System.out.println("Welcome to ABC Bank — Your Trusted Financial Partner.");
    }

    default void takeLoan(double amount) {
        System.out.println("Loan feature is not available for this account type.");
    }
}