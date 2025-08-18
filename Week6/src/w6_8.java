import java.util.Scanner;

public class w6_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        int max =0;
        for(int i = 0; i< length; i++) {
            arr[i] = input.nextInt();
            if(arr[i] > arr[max]) max = i;
        }
        int a2 =arr[0];
        for(int i = 0; i< length; i++) {
            if(i == max) continue;
            if(arr[i] > a2) a2 = arr[i];
        }
        System.out.println("2nd Largest element of the array is: "+ a2);
    }
}
