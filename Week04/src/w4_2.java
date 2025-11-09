public class w4_2 {
    public static void main(String[] args) {
        int a=5, b=10, c=15;
        if (a>b) {
            if (a>c) System.out.println("Largest number is: " + a);
            else System.out.println("Largest number is :" + c);
        }
        else{
            if (b>c) System.out.println("Largest number is" +b);
            else System.out.println("Largest number is: " +c);
        }
    }
}
