class Saving implements Account {
    double balance;

    Saving(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Saving Account: Deposited ₹" + amount + ". New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Saving Account: Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Saving Account: Insufficient balance!");
        }
    }

    public void takeLoan(double amount) {
        System.out.println("Saving Account: Loan of ₹" + amount + " approved at 8% interest rate.");
    }
}