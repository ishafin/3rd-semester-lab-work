public class Main {
    public static void main(String[] args) {
        System.out.println("--- JavaLanguage Object ---");
        JavaLanguage java = new JavaLanguage();
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();

        System.out.println("\n--- C++ Object ---");
        Cpp cpp = new Cpp();
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.template();
        cpp.friendFunction();
    }
}
