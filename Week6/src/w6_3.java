import java.util.Scanner;

public class w6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        for(int i = 0; i< length; i++) arr[i] = input.nextInt();
        System.out.println("Current Array :");
        for(int i = 0; i< length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        int temp = arr[length - 1];
        arr[length - 1] = arr[0];
        arr[0] = temp;
        System.out.println("After swapping the array is :");
        for(int i = 0; i< length; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
