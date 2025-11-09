import java.util.Scanner;

public class w5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        for(int i = 0; i< length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array : ");
        for(int i = 0; i< length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
