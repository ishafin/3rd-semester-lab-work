import java.util.Scanner;

public class w5_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = input.nextInt();
        double sum=0;
        for(int i=1; i<=n; i++) {
            sum+=1.0/i;
        }
        System.out.println("The sum of the series is: "+sum);
    }
}
