class Account {
    // Data members
    int id;
    String accountHolderName;
    String address;
    double balance;


    Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }


    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }


    static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * (Math.pow((1 + rate / 100), time)) - principal;
    }


    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account ID: " + id);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: ₹" + balance);
    }
}