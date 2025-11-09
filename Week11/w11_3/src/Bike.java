interface Bike {
    void offer();

    default void details() {
        System.out.println("Bike Details: High speed, powerful engine, suitable for long rides.");
    }
}