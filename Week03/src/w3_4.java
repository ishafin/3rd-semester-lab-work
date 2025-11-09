import java.util.Scanner;

public class w3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three numbers :");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        double avg = (a+b+c)/3.0;
        System.out.println("The Average is: "+avg);
    }
}
