class FRUIT {

    String color;
    String taste;
    double price;


    FRUIT() {
        this("Unknown", "Not defined", 0.0);
        System.out.println("Default constructor called.");
    }

    FRUIT(String color) {
        this(color, "Not defined", 0.0);
        System.out.println("One-argument constructor called.");
    }


    FRUIT(String color, String taste) {
        this(color, taste, 0.0);
        System.out.println("Two-argument constructor called.");
    }


    FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
        System.out.println("Three-argument constructor called.");
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}