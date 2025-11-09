

class MathOperations {


    public void minMaxAdd(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = a + b;
        System.out.println("For integers " + a + " and " + b + ":");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Addition: " + sum);
        System.out.println("------------------------------------");
    }


    public void minMaxAdd(double a, double b) {
        double min = Math.min(a, b);
        double max = Math.max(a, b);
        double sum = a + b;
        System.out.println("For real numbers " + a + " and " + b + ":");
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Addition: " + sum);
        System.out.println("------------------------------------");
    }


    public void minMaxAdd(char a, char b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = a + b;
        System.out.println("For characters '" + a + "' and '" + b + "':");
        System.out.println("Minimum: '" + (char) min + "' (ASCII: " + min + ")");
        System.out.println("Maximum: '" + (char) max + "' (ASCII: " + max + ")");
        System.out.println("Addition: " + sum + " (Sum of ASCII values)");
        System.out.println("------------------------------------");
    }

}