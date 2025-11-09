
class MultiFunctionMachine implements Printer, Scanner {
    public void connect() {
        System.out.println("Connecting MultiFunction Machine to system...");
    }

    public void details() {
        Printer.super.details();
        Scanner.super.details();
    }
}