public class Main {
    public static void main(String[] args) {

        FRUIT apple = new FRUIT("Red", "Sweet", 120.0);
        FRUIT mango = new FRUIT("Yellow", "Very Sweet", 150.0);
        FRUIT orange = new FRUIT("Orange", "Sour", 80.0);


        apple.display();
        mango.display();
        orange.display();
    }
}
