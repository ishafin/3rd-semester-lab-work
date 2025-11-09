class Saving extends Account {
    double balance;
    double minBalance;

    Saving(int id, String accountHolderName, String address, double balance, double minBalance) {
        super(id, accountHolderName, address);
        this.balance = balance;
        this.minBalance = minBalance;
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited in Savings Account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minBalance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Withdrawal denied! Minimum balance requirement not met.");
        }
    }


    void display() {
        System.out.println("\n--- Savings Account Details ---");
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Minimum Balance: ₹" + minBalance);
    }
}