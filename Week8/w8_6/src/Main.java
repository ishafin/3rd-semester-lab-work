public class Main {
    public static void main(String[] args) {
        CAR c1 = new CAR();
        CAR c2 = new CAR("Honda City");
        CAR c3 = new CAR("Tesla Model 3", "White");

        c1.setDetails(800000);
        c2.setDetails(1200000);
        c3.setDetails(3500000);

        c1.display();
        c2.display();
        c3.display();
    }
}
