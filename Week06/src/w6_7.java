public class w6_7 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 100 are:");

        for (int n = 2; n <= 100; n++) {
            boolean flag = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(n + " ");
            }
        }
    }
}
