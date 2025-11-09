
public class Main {
    public static void main(String[] args) {
        Account.aboutBank();

        Saving s = new Saving(5000);
        s.deposit(1500);
        s.withdraw(2000);

        System.out.println();

        Current c = new Current(10000);
        c.deposit(2500);
        c.withdraw(12000);
    }
}