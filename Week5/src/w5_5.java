import java.util.Scanner;

public class w5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int n = input.nextInt();
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("Sum of digits of the number is: "+sum);
    }
}
