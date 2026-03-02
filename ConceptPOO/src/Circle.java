public class Circle extends Forms {
    private static double pi = 3.14;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return pi * (this.radius * this.radius);
    }
}
