interface Scanner {
    void connect();

    default void details() {
        System.out.println("Scanner Details: Scans documents up to 600 DPI resolution.");
    }
}