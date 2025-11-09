class FRUIT {
    // Data members
    String color;
    String taste;
    double price;


    FRUIT() {
        color = "Unknown";
        taste = "Not defined";
        price = 0.0;
    }


    FRUIT(String color) {
        this.color = color;
        this.taste = "Not defined";
        this.price = 0.0;
    }

    FRUIT(String color, String taste) {
        this.color = color;
        this.taste = taste;
        this.price = 0.0;
    }

    FRUIT(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}