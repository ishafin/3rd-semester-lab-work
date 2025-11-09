public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(101, "Mohammad Shafin", "Delhi", 5000.0);

        // Perform deposit and withdrawal
        acc1.deposit(2000);
        acc1.withdraw(1500);


        acc1.display();


        double si = Account.calculateSimpleInterest(5000, 5, 2);
        double ci = Account.calculateCompoundInterest(5000, 5, 2);

        System.out.println("\nSimple Interest: ₹" + si);
        System.out.println("Compound Interest: ₹" + ci);
    }
}

