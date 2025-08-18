import java.util.Scanner;

public class w5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = input.nextInt();
        int factorial = 1;
        for(int i=2; i<=n; i++) {
            factorial *=i;
        }
        System.out.println("The factorial of the number is: " + factorial);
    }
}