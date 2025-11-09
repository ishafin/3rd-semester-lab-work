public class Main {
    public static void main(String[] args) {
        JavaLanguage java = new JavaLanguage();

        System.out.println("--- Object-Oriented Concepts in Java ---");
        java.abstraction();
        java.polymorphism();
        java.inheritance();

        System.out.println("\n--- Java-Specific Concepts ---");
        java.persistence();
        java.interfaces();
    }
}
