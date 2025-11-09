
class BuySomething implements Bike, Scooty {
    public void offer() {
        System.out.println("BuySomething Offer: Flat 10% discount on all two-wheelers!");
    }

    public void details() {
        Bike.super.details();
        Scooty.super.details();
    }
}