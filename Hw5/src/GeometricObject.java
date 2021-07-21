public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // Constructors
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        setColor(color);
        setFilled(filled);
    }

    // Acccessors
    public String getColor()  { return color;  }
    public boolean isFilled() { return filled; }
    public java.util.Date getDateCreated() { return dateCreated; }

    // Mutators
    public void setColor(String color)    { this.color = color;   }
    public void setFilled(boolean filled) { this.filled = filled; }

    // Methods
    @Override
    public String toString() {
        return "Created on: " + dateCreated + "\n Color:" + color + " and filled: " + filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
