public class Main {
    public static void main(String[] args) {

        Saving s1 = new Saving(101, "Mohammad Shafin", "Delhi", 10000, 2000);
        s1.deposit(3000);
        s1.withdraw(9500);
        s1.display();


        Current c1 = new Current(102, "Ayaan Khan", "Mumbai", 20000, 10000);
        c1.deposit(5000);
        c1.withdraw(12000);
        c1.display();
    }
}