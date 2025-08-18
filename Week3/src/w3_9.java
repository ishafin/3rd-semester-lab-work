import java.util.Scanner;

public class w3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a and b:");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("Remainder = "+ a/b);
        System.out.println("Quotient = "+ a%b);
    }
}
