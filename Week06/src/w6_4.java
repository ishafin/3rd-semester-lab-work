import java.util.Scanner;

public class w6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int l = input.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter the elements :");
        int max=0, min=0;
        for(int i=0;i<l;i++) {
            arr[i] = input.nextInt();
            if(i==0) {
                max = arr[i];
                min = arr[i];
            }
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum in the array is: "+max);
        System.out.println("Minimum in the array is: "+min);
    }
}
