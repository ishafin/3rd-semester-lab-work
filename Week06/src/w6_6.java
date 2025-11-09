import java.util.Scanner;

public class w6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements :");
        for(int i = 0; i< length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target :");
        int x = input.nextInt();
        boolean flag = false;
        int i;
        for(i=0; i< length; i++) {
            if (x == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Found at index "+i);
        else System.out.println("Not found");
    }
}
