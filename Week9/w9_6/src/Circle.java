class Circle extends Shape {
    double radius;


    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}