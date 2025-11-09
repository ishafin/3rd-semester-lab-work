public class Main {
    public static void main(String[] args) {
        // Using default constructor
        FRUIT f1 = new FRUIT();

        // Using one-argument constructor
        FRUIT f2 = new FRUIT("Red");

        // Using two-argument constructor
        FRUIT f3 = new FRUIT("Yellow", "Sweet");

        // Using three-argument constructor
        FRUIT f4 = new FRUIT("Green", "Sour", 90.0);

        // Displaying all fruits
        System.out.println("--- Default Constructor ---");
        f1.display();

        System.out.println("--- One-Argument Constructor ---");
        f2.display();

        System.out.println("--- Two-Argument Constructor ---");
        f3.display();

        System.out.println("--- Three-Argument Constructor ---");
        f4.display();
    }
}
