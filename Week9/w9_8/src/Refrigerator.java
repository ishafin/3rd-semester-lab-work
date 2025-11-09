class Refrigerator extends Appliance {


    Refrigerator(String brand, int power) {
        super(brand, power);
    }

    void turnOn() {
        System.out.println(brand + " Refrigerator is now ON. Cooling started. Power: " + power + "W");
    }

    void turnOff() {
        System.out.println(brand + " Refrigerator is now OFF.");
    }
}