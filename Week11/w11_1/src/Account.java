interface Account {
    void deposit(double amount);
    void withdraw(double amount);

    static void aboutBank() {
        System.out.println("Welcome to ABC Bank — Your Trusted Financial Partner.");
    }
}