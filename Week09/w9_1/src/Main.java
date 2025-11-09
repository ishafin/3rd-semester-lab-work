public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus();
        System.out.println("---- Bus Details ----");
        bus.cost();
        bus.display();

        System.out.println();

        Train train = new Train();
        System.out.println("---- Train Details ----");
        train.cost();
        train.display();
    }
}