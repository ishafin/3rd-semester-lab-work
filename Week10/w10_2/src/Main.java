

public class Main {
    public static void main(String[] args){
        Edible.Fruit.fruitDetails();
        Edible.vegetable.vegetableDetails();

        Edible.Fruit fruit = new Edible.Fruit();
        Edible.vegetable veg = new Edible.vegetable();

        fruit.fruitPackaging();
        veg.vegetablePackaging();

        Edible p = new Edible();
    }
}
