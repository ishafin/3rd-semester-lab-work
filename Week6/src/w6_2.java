import java.util.Scanner;

public class w6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                flag = false;
                break;
            }
        if (flag) System.out.println("Number is Prime");
        else System.out.println("Number is not Prime");
    }
}
