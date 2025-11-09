import java.util.Scanner;

public class w3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius : ");
        double temperature = input.nextDouble();
        System.out.println("Fahrenheit = " + (temperature *9/5.0+32));
    }
}
