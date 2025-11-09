class Current extends Account {
    double balance;
    double maxWithdrawLimit;


    Current(int id, String accountHolderName, String address, double balance, double maxWithdrawLimit) {
        super(id, accountHolderName, address);
        this.balance = balance;
        this.maxWithdrawLimit = maxWithdrawLimit;
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited in Current Account.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    void withdraw(double amount) {
        if (amount > 0 && amount <= maxWithdrawLimit && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Current Account.");
        } else {
            System.out.println("Withdrawal denied! Exceeds limit or insufficient funds.");
        }
    }


    void display() {
        System.out.println("\n--- Current Account Details ---");
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Max Withdrawal Limit: ₹" + maxWithdrawLimit);
    }
}
