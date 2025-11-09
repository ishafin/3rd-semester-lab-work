public class Main {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG", 1500);
        Refrigerator fridge = new Refrigerator("Samsung", 800);

        wm.turnOn();
        wm.turnOff();

        System.out.println();

        fridge.turnOn();
        fridge.turnOff();
    }
}