import java.util.Scanner;

public class w4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter char :");
        char c = input.nextLine().charAt(0);
        c = Character.toUpperCase(c);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            System.out.println("Vowel");
        } else if (Character.isDigit(c)) {
            System.out.println("It's an integer");
        }
        else
            System.out.println("Consonant");
    }
}
