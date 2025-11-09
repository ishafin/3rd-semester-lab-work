abstract class Account {

    int id;
    String accountHolderName;
    String address;


    Account(int id, String accountHolderName, String address) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }


    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}