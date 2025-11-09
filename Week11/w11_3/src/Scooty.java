interface Scooty {
    void offer();

    default void details() {
        System.out.println("Scooty Details: Lightweight, fuel-efficient, best for short city rides.");
    }
}
