interface Printer {
    void connect();

    default void details() {
        System.out.println("Printer Details: Prints high-quality documents at 1200 DPI.");
    }
}