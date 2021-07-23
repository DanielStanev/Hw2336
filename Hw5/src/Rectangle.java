public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
    // Data Fields
    private double width, height;

    // Constructors
    public Rectangle() { } // Default Constructor
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        setWidth(width);
        setHeight(height);
        setColor(color);
        setFilled(filled);
    }

    // Accessors
    public double getWidth()  { return width;  }
    public double getHeight() { return height; }

    // Mutators
    public void setWidth(double width)   { this.width = width;   }
    public void setHeight(double height) { this.height = height; }

    // Methods
    @Override
    public double getArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public int compareTo(Rectangle other) { return Double.compare(getArea(), other.getArea()); }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle)
            return ((Rectangle) obj).getArea() == getArea();
        return false;
    }
}
