import java.util.Scanner;

public class w4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = input.nextInt();
        while(n>10){
            n/=2;
            System.out.println(n);
        }
    }
}
