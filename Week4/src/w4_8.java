import java.util.Scanner;

public class w4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 2; i<=n; i+=2) {
            sum += i;
        }
        System.out.println("Result : "+ sum);
    }
}
