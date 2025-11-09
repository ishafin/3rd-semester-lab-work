import java.util.Scanner;

public class w5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = input.nextInt();
        int reverse = 0;
        while(n!=0){
            reverse = reverse *10 + n%10;
            n/=10;
        }
        System.out.println("Reverse of the number is "+ reverse);
    }
}
