public class Circle extends GeometricObject {
    private double radius;

    public Circle() { }
    public Circle(double radius) {
        setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled) {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    // Accessor
    public double getRadius(double radius) { return radius; }

    // Mutator
    public void setRadius(double radius) { this.radius = radius; }
}
