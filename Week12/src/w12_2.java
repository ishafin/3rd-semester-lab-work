import java.io.IOException;

class w12_2 {

    static void function3() throws IOException {
        throw new IOException("File not found in function3");
    }

    static void function2() throws IOException {
        function3();
    }

    static void function1() {
        try {
            function2();
        } catch (IOException e) {
            System.out.println("Exception handled in function1: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        function1();
    }
}
