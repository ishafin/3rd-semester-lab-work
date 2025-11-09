import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter color of the fruit: ");
        String color = sc.nextLine();

        System.out.print("Enter taste of the fruit: ");
        String taste = sc.nextLine();

        System.out.print("Enter price of the fruit: ₹");
        double price = sc.nextDouble();

        FRUIT fruit1 = new FRUIT(color, taste, price);


        System.out.println("\n--- Fruit Details ---");
        fruit1.display();

        sc.close();
    }
}

