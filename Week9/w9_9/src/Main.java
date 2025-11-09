public class Main {
    public static void main(String[] args) {
        int num1 = 12, num2 = 18;

        // Calling static methods without creating an object
        int gcd = MathOperations.findGCD(num1, num2);
        int lcm = MathOperations.findLCM(num1, num2);

        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
