/************************************

 Author:         Daniel Stanev
 Course:         CS 2336.0w3
 Date:           8 Jul 2021
 Assignment:     Homework #04 Exercise #01
 Version:        Java SE 11 (LTS)

 Description: Test program for Rectangle
 Class.

 *************************************/

public class Hw4_Ex1 {
    public static void main(String[] x) {
        // creates two new Rectangles
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // output for rectangle 1
        System.out.print("Rectangle 1:\n");
        System.out.printf("\tWidth:     %f\n", r1.width);
        System.out.printf("\tHeight:    %f\n", r1.height);
        System.out.printf("\tArea:      %f\n", r1.getArea());
        System.out.printf("\tPerimeter: %f\n\n", r1.getPerimeter());

        // output for rectangle 2
        System.out.print("Rectangle 2:\n");
        System.out.printf("\tWidth:     %f\n", r2.width);
        System.out.printf("\tHeight:    %f\n", r2.height);
        System.out.printf("\tArea:      %f\n", r2.getArea());
        System.out.printf("\tPerimeter: %f\n\n", r2.getPerimeter());

    }
}
