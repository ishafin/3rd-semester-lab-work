class CAR {
    String model;
    String color;
    double price;

    CAR() {
        this("Unknown", "Not specified", 0.0);
    }

    CAR(String model) {
        this(model, "Not specified", 0.0);
    }

    CAR(String model, String color) {
        this(model, color, 0.0);
    }

    CAR(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void setDetails(double price) {
        this.price = price;
    }

    String getModel() {
        return model;
    }

    String getColor() {
        return color;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: ₹" + price);
        System.out.println("---------------------------");
    }
}