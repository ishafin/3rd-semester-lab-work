import java.util.Scanner;

public class w3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1;
        double x2, y2;
        System.out.println("Enter x1 and y1 :");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x2 and y2 :");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("Distance between " +x1+ ", " +y1+ " and " +x2+ ", "+y2+ " is " +distance);
    }
}