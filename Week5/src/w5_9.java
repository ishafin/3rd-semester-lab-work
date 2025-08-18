import java.util.Scanner;

public class w5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int n = input.nextInt();
        int copy = n;
        int reverse = 0;
        while(copy !=0){
            reverse = reverse *10 + copy %10;
            copy /=10;
        }
        if(reverse == n) System.out.println("Number is a Palindrome");
        else System.out.println("Number is not Palindrome");
    }
}
