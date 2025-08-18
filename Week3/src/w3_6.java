public class w3_6 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a = " +a+ " and b = " +b );
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Now, a = " +a+ " and b = " +b );
    }
}
