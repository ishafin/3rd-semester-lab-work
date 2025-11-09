import java.util.Scanner;

public class w3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length, breadth;
        System.out.println("Enter length and breadth :");
        length = input.nextDouble();
        breadth = input.nextDouble();
        System.out.println("The area = " + length * breadth);
    }
}
