public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of Square: " + s.area(5));
        System.out.println("Area of Rectangle: " + s.area(6, 4));
        System.out.println("Area of Circle: " + s.area(3.5));
    }
}
