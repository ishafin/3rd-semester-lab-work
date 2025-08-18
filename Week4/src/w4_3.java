import java.util.Scanner;

public class w4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+ " x " +i+ " = " +n*i);
        }
    }
}