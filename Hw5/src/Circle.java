public class Circle extends GeometricObject implements Comparable<Circle> {
    // Data field
    private double radius;

    // Constructors
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

    // Methods
    public double getDiameter() { return 2 * radius; }

    @Override
    public double getArea() { return Math.pow(radius, 2) * Math.PI; }

    @Override
    public double getPerimeter() { return getDiameter() * Math.PI; }

    @Override
    public int compareTo(Circle other) { return Double.compare(radius, other.radius); }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle)
            return ((Circle) obj).radius == radius;
        return false;
    }


}
