import java.util.Scanner;

public class w3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        System.out.println("Area = "+ 3.14* radius * radius);
    }
}
