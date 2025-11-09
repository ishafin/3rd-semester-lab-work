import java.util.Scanner;

public class w5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        int max=0;
        for(int i = 0; i< length; i++) {
            arr[i] = input.nextInt();
            if(i==0) max = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Largest element = "+max);
    }
}
