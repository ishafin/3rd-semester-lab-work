class w12_1 {

    static void riskyOperation(int number) {
        if (number == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        } else {
            int result = 100 / number;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {25, 10, 5, 0, 2};

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Processing number: " + numbers[i]);
                riskyOperation(numbers[i]);
            } catch (ArithmeticException e) {
                System.out.println("Exception Caught: " + e.getMessage());
            }
            System.out.println("---------------------------");
        }

        System.out.println("Program executed successfully without crashing.");
    }
}
