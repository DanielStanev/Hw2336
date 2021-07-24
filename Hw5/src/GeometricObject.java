/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           24 Jul 2021
 Assignment:     Homework #05 Exercise #03 #04
 Version:        Java SE 11 (LTS)

 Description: GeometricObject in listing
 13.2. Extended by the Circle and Rectangle
 classes.

 *************************************/

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

    // Accessors
    public String getColor()  { return color;  }
    public boolean isFilled() { return filled; }
    public java.util.Date getDateCreated() { return dateCreated; }

    // Mutators
    public void setColor(String color)    { this.color = color;   }
    public void setFilled(boolean filled) { this.filled = filled; }

    // Methods
    @Override
    public String toString() { return "Created on: " + dateCreated + "\n Color:" + color + " and filled: " + filled; }
    public abstract double getArea();
    public abstract double getPerimeter();
}
