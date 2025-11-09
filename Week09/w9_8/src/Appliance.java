abstract class Appliance {
    String brand;
    int power; // power in watts

    // Constructor
    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    // Abstract methods
    abstract void turnOn();
    abstract void turnOff();
}