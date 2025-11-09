import java.util.Scanner;

public class w4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println("Result : "+ sum);
    }
}
