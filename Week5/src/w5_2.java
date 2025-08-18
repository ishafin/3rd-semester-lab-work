import java.util.Scanner;

public class w5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        int sum=0;
        System.out.println("Enter the elements :");
        for(int i = 0; i< length; i++) {
            arr[i] = input.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of all elements = "+sum);
    }
}
