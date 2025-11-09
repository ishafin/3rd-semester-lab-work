class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! You tried to withdraw ₹" + amount + " but only ₹" + balance + " available.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining balance: ₹" + balance);
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
    }
}
