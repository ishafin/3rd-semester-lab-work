public class Main {
    public static void main(String[] args) {
        // Using all constructors
        System.out.println("\n--- Default Constructor ---");
        FRUIT f1 = new FRUIT();
        f1.display();

        System.out.println("--- One-Argument Constructor ---");
        FRUIT f2 = new FRUIT("Red");
        f2.display();

        System.out.println("--- Two-Argument Constructor ---");
        FRUIT f3 = new FRUIT("Yellow", "Sweet");
        f3.display();

        System.out.println("--- Three-Argument Constructor ---");
        FRUIT f4 = new FRUIT("Green", "Sour", 90.0);
        f4.display();
    }
}
