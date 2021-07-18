/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Rectangle Class for
 exercise 1.

 *************************************/

public class Rectangle {
    double width = 1, height = 1;

    // default constructor
    Rectangle() {}

    // width-height constructor
    Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    // returns area of rectangle
    double getArea() {
        return width * height;
    }

    // returns perimeter of rectangle
    double getPerimeter() {
        return (2 * width) + (2 * height);
    }
}
