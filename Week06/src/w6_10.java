import java.util.Scanner;

public class w6_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        for(int i=0;i<length;i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Current Array :");
        for(int i=0;i<length;i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        for (int i=0;i<length/2;i++){
            int temp = arr[i];
            arr[i] = arr[length-1-i];
            arr[length-1-i] = temp;
        }
        System.out.println("Reversed Array :");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}
