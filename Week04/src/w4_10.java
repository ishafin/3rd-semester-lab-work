import java.util.Scanner;

public class w4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = input.nextInt();
        System.out.println("The factors are: ");
        for(int i=1; i<=n; i++) if(n%i == 0) {
            System.out.println(i);
        }
    }
}
